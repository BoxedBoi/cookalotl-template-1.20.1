package net.boxed.cookalotl.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
private static final Identifier AXOLOTL_ID = new Identifier("minecraft", "entities/axolotl");


    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, identifier, builder, lootTableSource) -> {
if (AXOLOTL_ID.equals(identifier)){
    LootPool.Builder poolBuilder = LootPool.builder()
            .rolls(ConstantLootNumberProvider.create(1))
            .conditionally(RandomChanceLootCondition.builder(1f)
                    .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

   
    tableBuilder.pool(poolBuilder.build());
}


        });
    }
}
