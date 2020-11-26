package com.hexopia.mod.util.handlers;

import com.hexopia.mod.init.BlockInit;
import com.hexopia.mod.init.ItemInit;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipesHandler 
{
	public static void registerRecipes()
	{
		GameRegistry.addSmelting(BlockInit.ORE_XURANIUM, new ItemStack(ItemInit.XURANIUM, 1), 5.0f);
		GameRegistry.addSmelting(BlockInit.ORE_DIARIUM, new ItemStack(ItemInit.DIARIUM, 1), 5.0f);
	}
}
