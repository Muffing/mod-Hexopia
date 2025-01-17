package com.hexopia.mod.init;

import java.util.ArrayList;
import java.util.List;

import com.hexopia.mod.objects.blocks.BlockBasic;
import com.hexopia.mod.objects.blocks.BlockBasic1;
import com.hexopia.mod.objects.blocks.BlockFluid;
import com.hexopia.mod.objects.blocks.BlockOreMod;
import com.hexopia.mod.objects.blocks.BlockOreMod2;
import com.hexopia.mod.objects.blocks.BlockOreMod3;
import com.hexopia.mod.objects.blocks.BlockOreMod4;
import com.hexopia.mod.objects.blocks.BlockSpecial;
import com.hexopia.mod.objects.blocks.CaveBlock;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockInit 
{
	public static List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block XURANIUM_BLOCK = new BlockBasic("xuranium_block", Material.ROCK);
	public static final Block TNT_BLOCK_SPECIAL = new BlockSpecial("tnt_block_special", Material.TNT);
    public static final Block CAVE_BLOCK = new CaveBlock("cave_block", Material.ROCK);
	public static final Block ETIX_BLOCK = new BlockBasic1("etix_block", Material.ROCK);

	//Ores
	public static final Block ORE_XURANIUM = new BlockOreMod("ore_xuranium", Material.ROCK);
	public static final Block ORE_PIKARIUM = new BlockOreMod2("ore_pikarium", Material.ROCK);
	public static final Block ORE_DIARIUM = new BlockOreMod3("ore_diarium", Material.ROCK);
	public static final Block ORE_ETIX = new BlockOreMod4("ore_etix", Material.ROCK);
	
  public static final Block OIL = new BlockFluid("oil", FluidInit.OIL, Material.WATER);
    
}
