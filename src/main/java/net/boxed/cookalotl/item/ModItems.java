package net.boxed.cookalotl.item;

import net.boxed.cookalotl.CookAlotl;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RAW_AXOLOTL = registerItem("raw_axolotl", new Item(new FabricItemSettings().food(ModFoodComponents.RAW_AXOLOTL)));
    public static final Item COOKED_AXOLOTL = registerItem("cooked_axolotl", new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_AXOLOTL)));
private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries ) {

    entries.add(RAW_AXOLOTL);
    entries.add(COOKED_AXOLOTL);
}

private static Item registerItem(String name, Item item){
    return Registry.register(Registries.ITEM, new Identifier(CookAlotl.MOD_ID, name), item);
}


    public static void registerModItem() {
        CookAlotl.LOGGER.info("Registering Mod Items for" + CookAlotl.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToIngredientItemGroup);
    }
}
