package paul.boatsandships.proxy;

import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import paul.boatsandships.handlers.RegistryHandler;

public class ClientProxy extends CommonProxy{
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
	}
	public void Init(FMLInitializationEvent event) {
		super.Init(event);
		RegistryHandler.Client();
	}
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
}
