package paul.boatsandships.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import paul.boatsandships.handlers.RegistryHandler;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		RegistryHandler.Common();
	}
	public void Init(FMLInitializationEvent event) {
		
	}
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
