package com.hexopia.mod.objects.items;

import com.hexopia.mod.Main;
import com.hexopia.mod.init.ItemInit;
import com.hexopia.mod.util.interfaces.IHasModel;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ItemPikariumFood extends ItemFood implements IHasModel
{
    public ItemPikariumFood(String name, int amount, boolean isWolfFood)
    {
        super(amount, isWolfFood);
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(Main.TUTO_TAB);
        setAlwaysEdible();
        ItemInit.ITEMS.add(this);
    }
    
    @Override
    public void registerModels()
    {
        Main.proxy.registerItemRenderer(this, 0);
    }
    
    @Override
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player)
    {
        if(!world.isRemote)
        {
            player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 100, 2));
            player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION, 2400, 2));
            player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 2400, 1));
           
        }

        super.onFoodEaten(stack, world, player);
    }
}
