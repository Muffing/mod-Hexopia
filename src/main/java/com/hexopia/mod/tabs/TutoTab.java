package com.hexopia.mod.tabs;

import com.hexopia.mod.init.ItemInit;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class TutoTab extends CreativeTabs
{

    public TutoTab(String label)
    {
        super(label);
        this.setBackgroundImageName(label + ".png");
    }
    
    @Override
    public ItemStack getTabIconItem()
    {
        return new ItemStack(ItemInit.XURANIUM_HELMET);
    }

}