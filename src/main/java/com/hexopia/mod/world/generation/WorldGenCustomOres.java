package com.hexopia.mod.world.generation;

import java.util.Random;

import com.hexopia.mod.init.BlockInit;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class WorldGenCustomOres implements IWorldGenerator
{
	
	private WorldGenerator ore_xuranium;
	private WorldGenerator ore_pikarium;
	private WorldGenMinable ore_diarium;
	private WorldGenMinable ore_etix;
	
	
	public WorldGenCustomOres() 
	{
		ore_xuranium = new WorldGenMinable(BlockInit.ORE_XURANIUM.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		ore_pikarium = new WorldGenMinable(BlockInit.ORE_PIKARIUM.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		ore_diarium = new WorldGenMinable(BlockInit.ORE_DIARIUM.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		ore_etix = new WorldGenMinable(BlockInit.ORE_ETIX.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,
			IChunkProvider chunkProvider) 
	{
		switch (world.provider.getDimension()) 
		{
		case 0:
			runGenerator(ore_xuranium, world, random, chunkX, chunkZ, 20, 2, 15);
			runGenerator(ore_pikarium, world, random, chunkX, chunkZ, 15, 2, 9);
			runGenerator(ore_diarium, world, random, chunkX, chunkZ, 10, 6, 15);
			runGenerator(ore_etix, world, random, chunkX, chunkZ, 5, 2, 8);
			break;
		}
		
	}
	

	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight)
	{
		if(minHeight > maxHeight || minHeight < 0 || maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
		
		int heightDiff = maxHeight - minHeight + 1;
		
		for(int i = 0; i < chance; i++)
		{
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x, y, z));
		}
	}

}
