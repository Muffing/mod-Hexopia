package com.hexopia.mod.objects.blocks;

import java.util.ArrayList;
import java.util.List;

import com.hexopia.mod.Main;
import com.hexopia.mod.init.BlockInit;
import com.hexopia.mod.init.ItemInit;
import com.hexopia.mod.util.interfaces.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockOreMod2 extends Block implements IHasModel
{
	
	public BlockOreMod2(String name, Material material) 
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.TUTO_TAB);
		setHardness(8.0F);
		String toolClass = null;
		setHarvestLevel("pickaxe, hammer", 4);
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(name));
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0);
	}
	
	@Override
	public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {

		List<ItemStack> list = new ArrayList<ItemStack>();
		list.add(new ItemStack(ItemInit.PIKARIUM));
		return list;
	}
}
