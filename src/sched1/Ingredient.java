package sched1;


public enum Ingredient {

                        CUKE(2),
                        BANANA(2),
                        PARACETAMOL(3),
                        DONUT(3),
                        VIAGOR(4),
                        MOUTH_WASH(4),
                        FLU_MEDICINE(5),
                        GASOLINE(5),
                        ENERGY_DRINK(6),
                        MOTOR_OIL(6),
                        MEGA_BEAN(7),
                        CHILI(7),
                        BATTERY(8),
                        IODINE(8),
                        ADDY(9),
                        HORSE_SEMEN(9);

    private final int cost;

    Ingredient(final int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return this.cost;
    }
}
