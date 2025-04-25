package sched1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Mixes {

    private final List<Mix> mixes = new ArrayList<>();

    private static Mixes instance = null;


    public static List<Mix> getMixes() {
        if (instance == null) {
            instance = new Mixes();
        }
        return Collections.unmodifiableList(instance.mixes);
    }

    private Mixes() {
        this.mixes.add(new Mix(Effect.ANTI_GRAVITY, Ingredient.BANANA, Effect.SMELLY));
        this.mixes.add(new Mix(Effect.ANTI_GRAVITY, Ingredient.PARACETAMOL, Effect.MUNCHIES));
        this.mixes.add(new Mix(Effect.ANTI_GRAVITY, Ingredient.MOUTH_WASH, Effect.CALMING));
        this.mixes.add(new Mix(Effect.ANTI_GRAVITY, Ingredient.MOTOR_OIL, Effect.PARANOIA));

        this.mixes.add(new Mix(Effect.ATHLETIC, Ingredient.ENERGY_DRINK));
        this.mixes.add(new Mix(Effect.ATHLETIC, Ingredient.CUKE, Effect.MUNCHIES));
        this.mixes.add(new Mix(Effect.ATHLETIC, Ingredient.PARACETAMOL, Effect.ELECTRIFYING));

        this.mixes.add(new Mix(Effect.BALDING, Ingredient.MOUTH_WASH));
        this.mixes.add(new Mix(Effect.BALDING, Ingredient.PARACETAMOL, Effect.PARANOIA));
        this.mixes.add(new Mix(Effect.BALDING, Ingredient.ENERGY_DRINK, Effect.SCHIZOPHRENIC));
        this.mixes.add(new Mix(Effect.BALDING, Ingredient.IODINE, Effect.CALMING));

        this.mixes.add(new Mix(Effect.BRIGHT_EYED, Ingredient.BATTERY));
        this.mixes.add(new Mix(Effect.BRIGHT_EYED, Ingredient.PARACETAMOL, Effect.SPICY));
        this.mixes.add(new Mix(Effect.BRIGHT_EYED, Ingredient.VIAGOR, Effect.EUPHORIC));
        this.mixes.add(new Mix(Effect.BRIGHT_EYED, Ingredient.FLU_MEDICINE, Effect.CALMING));
        this.mixes.add(new Mix(Effect.BRIGHT_EYED, Ingredient.CHILI, Effect.SNEAKY));

        this.mixes.add(new Mix(Effect.CALMING, Ingredient.PARACETAMOL, Effect.FOGGY));
        this.mixes.add(new Mix(Effect.CALMING, Ingredient.DONUT, Effect.MUNCHIES));
        this.mixes.add(new Mix(Effect.CALMING, Ingredient.VIAGOR, Effect.LAXATIVE));
        this.mixes.add(new Mix(Effect.CALMING, Ingredient.FLU_MEDICINE, Effect.FOCUSED));
        this.mixes.add(new Mix(Effect.CALMING, Ingredient.GASOLINE, Effect.PARANOIA));
        this.mixes.add(new Mix(Effect.CALMING, Ingredient.MEGA_BEAN, Effect.SNEAKY));
        this.mixes.add(new Mix(Effect.CALMING, Ingredient.HORSE_SEMEN, Effect.ANTI_GRAVITY));

        this.mixes.add(new Mix(Effect.CALORIE_DENSE, Ingredient.DONUT));
        this.mixes.add(new Mix(Effect.CALORIE_DENSE, Ingredient.BATTERY, Effect.LAXATIVE));

        this.mixes.add(new Mix(Effect.CYCLOPEAN, Ingredient.CUKE, Effect.FOGGY));
        this.mixes.add(new Mix(Effect.CYCLOPEAN, Ingredient.MEGA_BEAN, Effect.ENERGIZING));

        this.mixes.add(new Mix(Effect.DISORIENTING, Ingredient.GASOLINE, Effect.ELECTRIFYING));
        this.mixes.add(new Mix(Effect.DISORIENTING, Ingredient.MEGA_BEAN, Effect.FOCUSED));
        this.mixes.add(new Mix(Effect.DISORIENTING, Ingredient.ENERGY_DRINK, Effect.GLOWING));

        this.mixes.add(new Mix(Effect.ELECTRIFYING, Ingredient.MEGA_BEAN, Effect.SHRINKING));
        this.mixes.add(new Mix(Effect.ELECTRIFYING, Ingredient.ENERGY_DRINK, Effect.DISORIENTING));
        this.mixes.add(new Mix(Effect.ELECTRIFYING, Ingredient.ADDY, Effect.LONG_FACED));
        this.mixes.add(new Mix(Effect.ELECTRIFYING, Ingredient.HORSE_SEMEN, Effect.THOUGHT_PROVOKING));

        this.mixes.add(new Mix(Effect.ENERGIZING, Ingredient.CUKE));
        this.mixes.add(new Mix(Effect.ENERGIZING, Ingredient.BANANA, Effect.CYCLOPEAN));
        this.mixes.add(new Mix(Effect.ENERGIZING, Ingredient.DONUT, Effect.SHRINKING));
        this.mixes.add(new Mix(Effect.ENERGIZING, Ingredient.MEGA_BEAN, Effect.THOUGHT_PROVOKING));
        this.mixes.add(new Mix(Effect.ENERGIZING, Ingredient.ENERGY_DRINK, Effect.EUPHORIC));
        this.mixes.add(new Mix(Effect.ENERGIZING, Ingredient.ADDY, Effect.FOGGY));

        this.mixes.add(new Mix(Effect.EUPHORIC, Ingredient.CUKE, Effect.TOXIC));
        this.mixes.add(new Mix(Effect.EUPHORIC, Ingredient.DONUT, Effect.FOCUSED));
        this.mixes.add(new Mix(Effect.EUPHORIC, Ingredient.FLU_MEDICINE, Effect.LAXATIVE));
        this.mixes.add(new Mix(Effect.EUPHORIC, Ingredient.GASOLINE, Effect.ENERGIZING));
        this.mixes.add(new Mix(Effect.EUPHORIC, Ingredient.ENERGY_DRINK, Effect.SPICY));
        this.mixes.add(new Mix(Effect.EUPHORIC, Ingredient.CHILI, Effect.ATHLETIC));
        this.mixes.add(new Mix(Effect.EUPHORIC, Ingredient.BATTERY, Effect.ELECTRIFYING));
        this.mixes.add(new Mix(Effect.EUPHORIC, Ingredient.ADDY, Effect.EXPLOSIVE));

        this.mixes.add(new Mix(Effect.EXPLOSIVE, Ingredient.DONUT, Effect.CALORIE_DENSE));

        this.mixes.add(new Mix(Effect.FOCUSED, Ingredient.BANANA, Effect.DISORIENTING));
        this.mixes.add(new Mix(Effect.FOCUSED, Ingredient.GASOLINE, Effect.SHRINKING));
        this.mixes.add(new Mix(Effect.FOCUSED, Ingredient.MEGA_BEAN, Effect.SEIZURE_INDUCING));

        this.mixes.add(new Mix(Effect.FOGGY, Ingredient.MEGA_BEAN));
        this.mixes.add(new Mix(Effect.FOGGY, Ingredient.FLU_MEDICINE, Effect.CYCLOPEAN));
        this.mixes.add(new Mix(Effect.FOGGY, Ingredient.GASOLINE, Effect.LAXATIVE));

        this.mixes.add(new Mix(Effect.GINGERITIS, Ingredient.BANANA));
        this.mixes.add(new Mix(Effect.GINGERITIS, Ingredient.DONUT, Effect.JENNERISING));
        this.mixes.add(new Mix(Effect.GINGERITIS, Ingredient.PARACETAMOL, Effect.FOCUSED));
        this.mixes.add(new Mix(Effect.GINGERITIS, Ingredient.FLU_MEDICINE, Effect.THOUGHT_PROVOKING));
        this.mixes.add(new Mix(Effect.GINGERITIS, Ingredient.IODINE, Effect.CALORIE_DENSE));
        this.mixes.add(new Mix(Effect.GINGERITIS, Ingredient.ADDY, Effect.SEDATING));
        this.mixes.add(new Mix(Effect.GINGERITIS, Ingredient.VIAGOR, Effect.SHRINKING));

        this.mixes.add(new Mix(Effect.GLOWING, Ingredient.GASOLINE, Effect.DISORIENTING));
        this.mixes.add(new Mix(Effect.GLOWING, Ingredient.MEGA_BEAN, Effect.CALMING));
        this.mixes.add(new Mix(Effect.GLOWING, Ingredient.BATTERY, Effect.CYCLOPEAN));

        this.mixes.add(new Mix(Effect.JENNERISING, Ingredient.IODINE));
        this.mixes.add(new Mix(Effect.JENNERISING, Ingredient.BANANA, Effect.PARANOIA));
        this.mixes.add(new Mix(Effect.JENNERISING, Ingredient.MOUTH_WASH, Effect.FOCUSED));

        this.mixes.add(new Mix(Effect.LAXATIVE, Ingredient.CUKE, Effect.EUPHORIC));
        this.mixes.add(new Mix(Effect.LAXATIVE, Ingredient.ENERGY_DRINK, Effect.FOGGY));
        this.mixes.add(new Mix(Effect.LAXATIVE, Ingredient.MEGA_BEAN, Effect.ATHLETIC));

        this.mixes.add(new Mix(Effect.LONG_FACED, Ingredient.HORSE_SEMEN));
        this.mixes.add(new Mix(Effect.LONG_FACED, Ingredient.CHILI, Effect.LAXATIVE));

        this.mixes.add(new Mix(Effect.MUNCHIES, Ingredient.CUKE, Effect.SLIPPERY));
        this.mixes.add(new Mix(Effect.MUNCHIES, Ingredient.FLU_MEDICINE, Effect.ATHLETIC));
        this.mixes.add(new Mix(Effect.MUNCHIES, Ingredient.ENERGY_DRINK, Effect.SEDATING));
        this.mixes.add(new Mix(Effect.MUNCHIES, Ingredient.MOTOR_OIL, Effect.ENERGIZING));
        this.mixes.add(new Mix(Effect.MUNCHIES, Ingredient.BATTERY, Effect.SHRINKING));

        this.mixes.add(new Mix(Effect.PARANOIA, Ingredient.CUKE, Effect.SNEAKY));
        this.mixes.add(new Mix(Effect.PARANOIA, Ingredient.PARACETAMOL, Effect.ENERGIZING));
        this.mixes.add(new Mix(Effect.PARANOIA, Ingredient.FLU_MEDICINE, Effect.SHRINKING));
        this.mixes.add(new Mix(Effect.PARANOIA, Ingredient.MEGA_BEAN, Effect.JENNERISING));
        this.mixes.add(new Mix(Effect.PARANOIA, Ingredient.IODINE, Effect.FOGGY));

        this.mixes.add(new Mix(Effect.REFRESHING, Ingredient.BANANA, Effect.LONG_FACED));
        this.mixes.add(new Mix(Effect.REFRESHING, Ingredient.CHILI, Effect.SHRINKING));
        this.mixes.add(new Mix(Effect.REFRESHING, Ingredient.ADDY, Effect.GLOWING));
        this.mixes.add(new Mix(Effect.REFRESHING, Ingredient.HORSE_SEMEN, Effect.GINGERITIS));

        this.mixes.add(new Mix(Effect.SCHIZOPHRENIC, Ingredient.MOTOR_OIL, Effect.MUNCHIES));

        this.mixes.add(new Mix(Effect.SEDATING, Ingredient.FLU_MEDICINE));
        this.mixes.add(new Mix(Effect.SEDATING, Ingredient.MOUTH_WASH, Effect.EXPLOSIVE));
        this.mixes.add(new Mix(Effect.SEDATING, Ingredient.GASOLINE, Effect.MUNCHIES));
        this.mixes.add(new Mix(Effect.SEDATING, Ingredient.MOTOR_OIL, Effect.EUPHORIC));

        this.mixes.add(new Mix(Effect.SEIZURE_INDUCING, Ingredient.BANANA, Effect.FOCUSED));
        this.mixes.add(new Mix(Effect.SEIZURE_INDUCING, Ingredient.IODINE, Effect.EUPHORIC));

        this.mixes.add(new Mix(Effect.SHRINKING, Ingredient.ENERGY_DRINK, Effect.FOCUSED));

        this.mixes.add(new Mix(Effect.SLIPPERY, Ingredient.MOTOR_OIL));
        this.mixes.add(new Mix(Effect.SLIPPERY, Ingredient.PARACETAMOL, Effect.CALMING));
        this.mixes.add(new Mix(Effect.SLIPPERY, Ingredient.DONUT, Effect.ANTI_GRAVITY));
        this.mixes.add(new Mix(Effect.SLIPPERY, Ingredient.FLU_MEDICINE, Effect.MUNCHIES));

        this.mixes.add(new Mix(Effect.SMELLY, Ingredient.BANANA, Effect.TOXIC));
        this.mixes.add(new Mix(Effect.SMELLY, Ingredient.GASOLINE, Effect.GINGERITIS));

        this.mixes.add(new Mix(Effect.SNEAKY, Ingredient.PARACETAMOL));
        this.mixes.add(new Mix(Effect.SNEAKY, Ingredient.BANANA, Effect.CALMING));
        this.mixes.add(new Mix(Effect.SNEAKY, Ingredient.DONUT, Effect.BALDING));
        this.mixes.add(new Mix(Effect.SNEAKY, Ingredient.VIAGOR, Effect.ATHLETIC));
        this.mixes.add(new Mix(Effect.SNEAKY, Ingredient.MOUTH_WASH, Effect.CALORIE_DENSE));
        this.mixes.add(new Mix(Effect.SNEAKY, Ingredient.GASOLINE, Effect.JENNERISING));
        this.mixes.add(new Mix(Effect.SNEAKY, Ingredient.ENERGY_DRINK, Effect.TROPIC_THUNDER));
        this.mixes.add(new Mix(Effect.SNEAKY, Ingredient.IODINE, Effect.TOXIC));

        this.mixes.add(new Mix(Effect.SPICY, Ingredient.CHILI));
        this.mixes.add(new Mix(Effect.SPICY, Ingredient.GASOLINE, Effect.EUPHORIC));

        this.mixes.add(new Mix(Effect.THOUGHT_PROVOKING, Ingredient.ADDY));
        this.mixes.add(new Mix(Effect.THOUGHT_PROVOKING, Ingredient.CUKE, Effect.GINGERITIS));
        this.mixes.add(new Mix(Effect.THOUGHT_PROVOKING, Ingredient.BANANA, Effect.ENERGIZING));
        this.mixes.add(new Mix(Effect.THOUGHT_PROVOKING, Ingredient.IODINE, Effect.REFRESHING));

        this.mixes.add(new Mix(Effect.TOXIC, Ingredient.GASOLINE));
        this.mixes.add(new Mix(Effect.TOXIC, Ingredient.PARACETAMOL, Effect.GLOWING));
        this.mixes.add(new Mix(Effect.TOXIC, Ingredient.VIAGOR, Effect.DISORIENTING));
        this.mixes.add(new Mix(Effect.TOXIC, Ingredient.CHILI, Effect.MUNCHIES));
        this.mixes.add(new Mix(Effect.TOXIC, Ingredient.MEGA_BEAN, Effect.SLIPPERY));
        this.mixes.add(new Mix(Effect.TOXIC, Ingredient.MOTOR_OIL, Effect.FOGGY));
        this.mixes.add(new Mix(Effect.TOXIC, Ingredient.FLU_MEDICINE, Effect.EUPHORIC));

        this.mixes.add(new Mix(Effect.TROPIC_THUNDER, Ingredient.VIAGOR));
        this.mixes.add(new Mix(Effect.TROPIC_THUNDER, Ingredient.PARACETAMOL, Effect.TOXIC));
        this.mixes.add(new Mix(Effect.TROPIC_THUNDER, Ingredient.GASOLINE, Effect.SNEAKY));
        this.mixes.add(new Mix(Effect.TROPIC_THUNDER, Ingredient.CHILI, Effect.ANTI_GRAVITY));
        this.mixes.add(new Mix(Effect.TROPIC_THUNDER, Ingredient.BATTERY, Effect.ANTI_GRAVITY));

        this.mixes.add(new Mix(Effect.ZOMBIFYING, Ingredient.BATTERY, Effect.EUPHORIC));
    }


}
