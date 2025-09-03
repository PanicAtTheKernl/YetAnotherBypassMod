package kernlpanic.yetanotherbypassmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomServerAccessMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("yetanotherbypassmod");

	@Override
	public void onInitialize() {
		LOGGER.info("Yet Another Bypass Mod initialized.");
		LOGGER.info("- Server filter override is active (client-side only).");
	}
}
