package sched1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;

public class IngredientsCalculator {
    // TODO multithreading
    // TODO timeout handling for impossible combinations


    /**
     * @param args effects the end product shall have.
     */
    public static void main(final String[] args) {
        if (args.length == 0) {
            return;
        }

        Effect startingEffect = extractEffect(args[0]);

        Set<Effect> desiredEffects = new HashSet<>();
        for (int i = 1; i < args.length; i++) {
            desiredEffects.add(extractEffect(args[i]));
        }
        desiredEffects.remove(Effect.NO_EFFECT);

        Product ogProduct;
        if (startingEffect != Effect.NO_EFFECT) {
            ogProduct = new Product(startingEffect);
        }
        else {
            ogProduct = new Product();
        }
        List<Product> allProductCombinations = new ArrayList<>();
        allProductCombinations.add(ogProduct);
        Predicate<Product> filter = product -> product.getEffects().containsAll(desiredEffects);
        boolean ongoing = true;
        while (ongoing) {
            List<Product> outputProducts = new ArrayList<>();
            for (Product product : allProductCombinations) {
                Collection<Product> newProducts = addIngredient(product);
                if (newProducts.stream().anyMatch(filter)) {
                    ongoing = false;
                }
                outputProducts.addAll(newProducts);
            }
            allProductCombinations = outputProducts;
        }

        List<Product> result = allProductCombinations.stream().filter(filter).toList();

        printResult(result);
    }


    private static Effect extractEffect(final String effect) {
        try {
            return Effect.valueOf(effect.toUpperCase());
        }
        catch (IllegalArgumentException e) {
            System.err.println("unknown effect: " + effect);
            return Effect.NO_EFFECT;
        }
    }


    private static Collection<Product> addIngredient(final Product inproduct) {
        List<Product> result = new ArrayList<>();
        for (Ingredient ingredient : Ingredient.values()) {
            Product outProduct = inproduct.duplicate();
            outProduct.mixIngredient(ingredient);
            result.add(outProduct);
        }
        return result;
    }


    private static void printResult(final List<Product> allProductCombinations) {
        Optional<Product> maxMultiplier =
                allProductCombinations.stream().max(Comparator.comparing(Product::getMultiplier));
        System.out.println("\nHIGHEST MULTIPLIER");
        System.out.println(maxMultiplier.get());

        Optional<Product> minCost = allProductCombinations.stream().min(Comparator.comparing(Product::getCost));
        System.out.println("\nLOWEST COST");
        System.out.println(minCost.get());
    }

}
