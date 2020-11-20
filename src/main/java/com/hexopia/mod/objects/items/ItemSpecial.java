package com.hexopia.mod.objects.items;

import com.hexopia.mod.Main;
import com.hexopia.mod.init.ItemInit;
import com.hexopia.mod.util.interfaces.IHasModel;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent.WorldTickEvent;

public class ItemSpecial extends Item implements IHasModel
{

	private EntityPlayer player;
	private World world;

	public ItemSpecial(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setDamage(1, 5);
		setMaxDamage(15);
		setMaxStackSize(1);
		setCreativeTab(Main.TUTO_TAB);
		ItemInit.ITEMS.add(this);
	}

	private void setDamage(int i, int damage) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerModels() 
	{
		Main.proxy.registerItemRenderer(this, 0);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) 
	{
		if(!worldIn.isRemote)
		{
			playerIn.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 200, 1));
			return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, playerIn.getHeldItem(handIn));
		}
		else
		{
			return new ActionResult<ItemStack>(EnumActionResult.PASS, playerIn.getHeldItem(handIn));
		}
	}


}