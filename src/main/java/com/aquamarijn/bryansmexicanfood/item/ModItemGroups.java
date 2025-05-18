package com.aquamarijn.bryansmexicanfood.item;

import com.aquamarijn.bryansmexicanfood.BryansMexicanFood;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

//Making an item group for the creative mode tab
public class ModItemGroups {

    public static final ItemGroup BRYANS_MEXICAN_FOOD_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BryansMexicanFood.MOD_ID, "bryans_mexican_food"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.CALIFORNIA_BURRITO))
                    .displayName(Text.translatable("itemgroup.bryansmexicanfood.bryans_mexican_food"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.CALIFORNIA_BURRITO);
                        entries.add(ModItems.SAUCED_CALIFORNIA_BURRITO);
                    }).build());


    public static void registerItemGroups() {
        BryansMexicanFood.LOGGER.info("Registering Item Group for " + BryansMexicanFood.MOD_ID);
    }
}
