package net.boxed.cookalotl.item;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {

    public static final FoodComponent RAW_AXOLOTL = new FoodComponent.Builder().hunger(2).saturationModifier(0.25f).build();
    public static final FoodComponent COOKED_AXOLOTL = new FoodComponent.Builder().hunger(7).saturationModifier(0.8f).build();
}
