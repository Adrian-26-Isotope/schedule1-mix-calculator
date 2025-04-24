package sched1;


public record Mix(Effect resultingEffect, Ingredient ingredient, Effect replaced) {


    public Mix(final Effect resultingEffect, final Ingredient ingredient) {
        this(resultingEffect, ingredient, Effect.NO_EFFECT);
    }

}
