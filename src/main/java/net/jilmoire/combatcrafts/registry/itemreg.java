package net.jilmoire.combatcrafts.registry;

import net.jilmoire.combatcrafts.CombatCrafts;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class itemreg {
    ///Logger for item registry.
    public static void itemlogger() {
        CombatCrafts.LOGGER.info("Registering Items for " + CombatCrafts.MOD_ID);
    }
    ///Method for registering items.
    public static <I extends Item> I registerItem(String name, I item) {
        return Registry.register(Registries.ITEM, CombatCrafts.id(name), item);
    }
    ///Items will call the method and be added in the game.
    ///Blades recipe & item
    public static final Item IRON_BLADE= (registerItem("sword_blade", new Item(new Item.Settings())));
    public static final Item GOLD_BLADE= (registerItem("g_sword_blade", new Item(new Item.Settings())));
    public static final Item DIAMOND_BLADE= (registerItem("d_sword_blade", new Item(new Item.Settings())));

    ///Hilt Recipe & item
    public static final Item HILT = (registerItem("sword_hilt", new Item(new Item.Settings())));
    public static final Item GUARD = (registerItem("sword_guard", new Item(new Item.Settings())));
    public static final Item GRIP = (registerItem("sword_grip", new Item(new Item.Settings())));
    public static final Item POMMEL = (registerItem("sword_pommel", new Item(new Item.Settings())));

    ///Loads the entire script.
    public static void itemload(){}
}