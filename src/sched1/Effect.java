package sched1;


public enum Effect {

                    NO_EFFECT(0),
                    ANTI_GRAVITY(0.54),
                    ATHLETIC(0.32),
                    BALDING(0.30),
                    BRIGHT_EYED(0.40),
                    CALMING(0.10),
                    CALORIE_DENSE(0.28),
                    CYCLOPEAN(0.56),
                    DISORIENTING(0.00),
                    ELECTRIFYING(0.50),
                    ENERGIZING(0.22),
                    EUPHORIC(0.18),
                    EXPLOSIVE(0.00),
                    FOCUSED(0.16),
                    FOGGY(0.36),
                    GINGERITIS(0.20),
                    GLOWING(0.48),
                    JENNERISING(0.42),
                    LAXATIVE(0.00),
                    LETHAL(0.00),
                    LONG_FACED(0.52),
                    MUNCHIES(0.12),
                    PARANOIA(0.00),
                    REFRESHING(0.14),
                    SCHIZOPHRENIC(0.00),
                    SEDATING(0.26),
                    SEIZURE_INDUCING(0.00),
                    SHRINKING(0.60),
                    SLIPPERY(0.34),
                    SMELLY(0.00),
                    SNEAKY(0.24),
                    SPICY(0.38),
                    THOUGHT_PROVOKING(0.44),
                    TOXIC(0.00),
                    TROPIC_THUNDER(0.46),
                    ZOMBIFYING(0.58);

    private final double multiplier;

    Effect(final double multiplier) {
        this.multiplier = multiplier;
    }

    public double getMultiplier() {
        return this.multiplier;
    }

}
