package sched1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MixCalculator {

    /**
     * 1st arg: number of iterations<br>
     * 2nd arg: inital price<br>
     * 3rd arg: inital effect<br>
     */
    public static void main(final String[] args) {
        if (args.length == 0) {
            return;
        }

        int mixingIterations = Integer.parseInt(args[0]);
        int initialPrice = 0;
        Effect startingEffect = null;

        if (args.length > 1) {
            initialPrice = Integer.parseInt(args[1]);
        }
        if (args.length > 2) {
            startingEffect = Effect.valueOf(args[2]);
        }

        Product ogProduct;
        if (startingEffect != null) {
            ogProduct = new Product(startingEffect, initialPrice);
        }
        else {
            ogProduct = new Product(initialPrice);
        }
        List<Product> allProductCombinations = new ArrayList<>();
        allProductCombinations.add(ogProduct);
        for (int iteration = 1; iteration <= mixingIterations; iteration++) {
            List<Product> outputProducts = new ArrayList<>();
            for (Product product : allProductCombinations) {
                outputProducts.addAll(addIngredient(product));
            }
            allProductCombinations = outputProducts;
        }

        printResult(allProductCombinations, initialPrice);
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

    private static void printResult(final List<Product> allProductCombinations, final int initalPrice) {
        Optional<Product> maxMultiplier =
                allProductCombinations.stream().max(Comparator.comparing(Product::getMultiplier));
        System.out.println("\nHIGHEST MULTIPLIER");
        System.out.println(maxMultiplier.get());

        if (initalPrice != 0) {
            Optional<Product> maxProfit = allProductCombinations.stream()
                    .max(Comparator.comparing(product -> product.getPrice() - product.getCost()));
            System.out.println("\nHIGHEST PROFIT");
            System.out.println(maxProfit.get());
        }
    }

}
