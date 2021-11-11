package com.silverwolfs.silverwolfscurrency.init;

import com.silverwolfs.silverwolfscurrency.SilverwolfsCurrency;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, SilverwolfsCurrency.MOD_ID);

    public static void init(IEventBus modBus) {
        ITEMS.register(modBus);
    }
    public static final RegistryObject<Item> PENNY = ITEMS.register("penny", () -> new Item(new Item.Properties().group(SilverwolfsCurrency.SilverwolfsCurrencyItemGroup.instance)));
    public static final RegistryObject<Item> NICKEL = ITEMS.register("nickel", () -> new Item(new Item.Properties().group(SilverwolfsCurrency.SilverwolfsCurrencyItemGroup.instance)));
    public static final RegistryObject<Item> DIME = ITEMS.register("dime", () -> new Item(new Item.Properties().group(SilverwolfsCurrency.SilverwolfsCurrencyItemGroup.instance)));
    public static final RegistryObject<Item> QUARTER = ITEMS.register("quarter", () -> new Item(new Item.Properties().group(SilverwolfsCurrency.SilverwolfsCurrencyItemGroup.instance)));

    public static final RegistryObject<Item> DOLLAR_BILL = ITEMS.register("dollar_bill", () -> new Item(new Item.Properties().group(SilverwolfsCurrency.SilverwolfsCurrencyItemGroup.instance)));
    public static final RegistryObject<Item> FIVE_DOLLAR_BILL = ITEMS.register("five_dollar_bill", () -> new Item(new Item.Properties().group(SilverwolfsCurrency.SilverwolfsCurrencyItemGroup.instance)));
    public static final RegistryObject<Item> TEN_DOLLAR_BILL = ITEMS.register("ten_dollar_bill", () -> new Item(new Item.Properties().group(SilverwolfsCurrency.SilverwolfsCurrencyItemGroup.instance)));
    public static final RegistryObject<Item> TWENTY_DOLLAR_BILL = ITEMS.register("twenty_dollar_bill", () -> new Item(new Item.Properties().group(SilverwolfsCurrency.SilverwolfsCurrencyItemGroup.instance)));
    public static final RegistryObject<Item> HUNDRED_DOLLAR_BILL = ITEMS.register("hundred_dollar_bill", () -> new Item(new Item.Properties().group(SilverwolfsCurrency.SilverwolfsCurrencyItemGroup.instance)));

}