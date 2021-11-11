package com.silverwolfs.silverwolfscurrency;

import com.silverwolfs.silverwolfscurrency.init.ItemInit;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod.EventBusSubscriber(modid = SilverwolfsCurrency.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@Mod("silverwolfscurrency")
public class SilverwolfsCurrency {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "silverwolfscurrency";
    public static SilverwolfsCurrency instance;

    public SilverwolfsCurrency() {
        final IEventBus modEventbus = FMLJavaModLoadingContext.get().getModEventBus();
        ItemInit.init(modEventbus);

        instance = this;
        MinecraftForge.EVENT_BUS.register(this);
    }

    //creative tabs
    public static class SilverwolfsCurrencyItemGroup extends ItemGroup {
        public static final SilverwolfsCurrencyItemGroup instance = new SilverwolfsCurrencyItemGroup(ItemGroup.GROUPS.length, "creativetab");

        private SilverwolfsCurrencyItemGroup(int index, String label) {
            super(index, label);
        }

        @Override
        public ItemStack createIcon() {
            return new ItemStack(Blocks.CHAIN);
        }

        @Override
        public boolean hasSearchBar() {
            return true;
        }

    }
}
