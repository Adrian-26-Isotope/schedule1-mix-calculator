package sched1;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Product {

    private final int basePrice;
    private final Set<Effect> effects = new LinkedHashSet<>();
    private final List<Ingredient> ingredients = new LinkedList<>();


    public Product() {
        this(0);
    }


    public Product(final int price) {
        this.basePrice = price;
    }


    public Product(final Effect initialEffect) {
        this(initialEffect, 0);
    }


    public Product(final Effect initialEffect, final int price) {
        this(price);
        this.effects.add(initialEffect);
    }


    private Product(final int price, final Set<Effect> effects, final List<Ingredient> ingredients) {
        this.basePrice = price;
        this.effects.addAll(effects);
        this.ingredients.addAll(ingredients);
    }


    public void mixIngredient(final Ingredient ingredient) {
        List<Mix> applicableMixes = Mixes.getMixes().stream().filter(mix -> mix.ingredient() == ingredient)
                .filter(mix -> (mix.replaced() == Effect.NO_EFFECT) || this.effects.contains(mix.replaced())).toList();

        if (applicableMixes.isEmpty()) {
            throw new RuntimeException("no matching mix found. invalid config data?");
        }

        for (Mix applicableMix : applicableMixes) {
            this.effects.remove(applicableMix.replaced());
            this.effects.add(applicableMix.resultingEffect());
        }
        this.ingredients.add(ingredient);
    }


    public double getMultiplier() {
        return 1 + this.effects.stream().map(Effect::getMultiplier).reduce(0.0, Double::sum);
    }


    public int getPrice() {
        return (int) (this.basePrice * getMultiplier());
    }


    public int getCost() {
        return this.ingredients.stream().map(Ingredient::getCost).reduce(0, Integer::sum);
    }


    public Set<Effect> getEffects() {
        return Collections.unmodifiableSet(this.effects);
    }


    public List<Ingredient> getIngredients() {
        return Collections.unmodifiableList(this.ingredients);
    }


    public Product duplicate() {
        return new Product(this.basePrice, this.effects, this.ingredients);
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("##################################################################################\n");
        sb.append("multiplier: " + getMultiplier() + "\n");
        sb.append("price: " + getPrice() + "\n");
        sb.append("cost: " + getCost() + "\n");
        sb.append("profit: " + (getPrice() - getCost()) + "\n");
        sb.append("effects: " + this.effects + "\n");
        sb.append("ingredients:" + this.ingredients + "\n");
        sb.append("##################################################################################\n");
        return sb.toString();
    }


}
