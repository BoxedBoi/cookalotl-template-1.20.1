package net.boxed.cookalotl;

import net.boxed.cookalotl.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CookAlotl implements ModInitializer {
	public static final String MOD_ID = "cookalotl";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		ModItems.registerModItem();
		LOGGER.info("Yum yum axolotls!");
	}
}