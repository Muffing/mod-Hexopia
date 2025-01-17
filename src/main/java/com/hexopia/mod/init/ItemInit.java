package com.hexopia.mod.init;

import java.util.ArrayList;
import java.util.List;

import com.hexopia.mod.objects.items.ItemBase;
import com.hexopia.mod.objects.items.ItemPikariumFood;
import com.hexopia.mod.objects.items.ItemSpecial;
import com.hexopia.mod.objects.items.ItemXuraniumFood;
import com.hexopia.mod.objects.items.armor.ArmorMod;
import com.hexopia.mod.objects.items.armor.ArmorMod2;
import com.hexopia.mod.objects.items.armor.ArmorMod3;
import com.hexopia.mod.objects.items.armor.ArmorMod4;
import com.hexopia.mod.objects.items.tools.ItemAdminMod;
import com.hexopia.mod.objects.items.tools.ItemAxeMod2;
import com.hexopia.mod.objects.items.tools.ItemAxeMod3;
import com.hexopia.mod.objects.items.tools.ItemAxeMod4;

import com.hexopia.mod.objects.items.tools.ItemGlaiveMod;
import com.hexopia.mod.objects.items.tools.ItemHammer;
import com.hexopia.mod.objects.items.tools.ItemHammer2;
import com.hexopia.mod.objects.items.tools.ItemHammer3;
import com.hexopia.mod.objects.items.tools.ItemHammer4;
import com.hexopia.mod.objects.items.tools.ItemHoueMod2;
import com.hexopia.mod.objects.items.tools.ItemKatanaMod;
import com.hexopia.mod.objects.items.tools.ItemPickaxeMod2;
import com.hexopia.mod.objects.items.tools.ItemPickaxeMod3;
import com.hexopia.mod.objects.items.tools.ItemPickaxeMod4;
import com.hexopia.mod.objects.items.tools.ItemShovelMod2;
import com.hexopia.mod.objects.items.tools.ItemShovelMod3;
import com.hexopia.mod.objects.items.tools.ItemShovelMod4;
import com.hexopia.mod.objects.items.tools.ItemSwordMod2;
import com.hexopia.mod.objects.items.tools.ItemSwordMod3;
import com.hexopia.mod.objects.items.tools.ItemSwordMod4;
import com.hexopia.mod.util.Reference;

import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class ItemInit 
{
	public static List<Item> ITEMS = new ArrayList<Item>();
	
	
	//ToolsMaterials
	public static final ToolMaterial HAMMER_XURANIUM1 = EnumHelper.addToolMaterial("xuranium tool", 5, 2500, 2.0f, 4.0f, 18);
	public static final ToolMaterial HAMMER_PIKARIUM1 = EnumHelper.addToolMaterial("pikarium tool", 5, 2800, 2.5f, 4.0f, 18);
	public static final ToolMaterial HAMMER_DIARIUM1 = EnumHelper.addToolMaterial("diarium tool", 5, 3000, 3.0f, 4.0f, 18);
	public static final ToolMaterial HAMMER_ETIX1 = EnumHelper.addToolMaterial("etix tool", 5, 3000, 3.5f, 4.0f, 18);
	
	public static final ToolMaterial TOOL_XURANIUM = EnumHelper.addToolMaterial("xuranium tool", 5, 2500, 10.0f, 4.0f, 18);
    public static final ToolMaterial TOOL2_XURANIUM = EnumHelper.addToolMaterial("xuranium2 tool2", 5, 2500, 10.0f, 4.0f, 18);
    
    public static final ToolMaterial TOOL1_PIKARIUM = EnumHelper.addToolMaterial("pikarium1 tool", 5, 2800, 15.0f, 4.0f, 18);
    public static final ToolMaterial TOOL2_PIKARIUM = EnumHelper.addToolMaterial("pikarium2 tool2", 5, 2800, 15.0f, 8.0f, 18);
    
    public static final ToolMaterial TOOL1_DIARIUM = EnumHelper.addToolMaterial("pikarium1 tool", 5, 3200, 20.0f, 4.0f, 18);
    public static final ToolMaterial TOOL2_DIARIUM = EnumHelper.addToolMaterial("pikarium2 tool2", 5, 3200, 20.0f, 10.0f, 18);
    
    public static final ToolMaterial TOOL1_ETIX = EnumHelper.addToolMaterial("etix1 tool", 5, 3400, 25.0f, 4.0f, 18);
    public static final ToolMaterial TOOL2_ETIX = EnumHelper.addToolMaterial("etix2 tool2", 5, 3400, 25.0f, 12.0f, 18);
    
    
    public static final ToolMaterial KATANA = EnumHelper.addToolMaterial("katana", 8, 800, 20.0f, 4.0f, 500);
    public static final ToolMaterial GLAIVE = EnumHelper.addToolMaterial("katana", 8, 1600, 20.0f, 0.5f, 500);
    public static final ToolMaterial TOOL_ADMIN = EnumHelper.addToolMaterial("admin", 10000000, 1000000, 20.0f, 100000.0f, 500);
    

	//0 = bois
    //1 = or & pierre
    //2 = fer
    //3 = diams
    //4 etc
    
	public static final ToolMaterial ARC = EnumHelper.addToolMaterial("arc tool", 5, 2500, 10.0f, 4.0f, 18);

    
    
    //AmorMaterials
    public static final ArmorMaterial ARMOR_XURANIUM = EnumHelper.addArmorMaterial("armor xuranium", Reference.MODID + ":hexopiamod", 75, new int [] {5, 7, 6, 5}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.0f);
    public static final ArmorMaterial ARMOR_PIKARIUM = EnumHelper.addArmorMaterial("armor pikarium", Reference.MODID + ":hexopiamod2", 75, new int [] {6, 8, 7, 6}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 4.0f);
    public static final ArmorMaterial ARMOR_DIARIUM = EnumHelper.addArmorMaterial("armor diarium", Reference.MODID + ":hexopiamod3", 75, new int [] {7, 9, 8, 7}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 6.0f);
    public static final ArmorMaterial ARMOR_ETIX = EnumHelper.addArmorMaterial("armor etix", Reference.MODID + ":hexopiamod4", 75, new int [] {8, 10, 9, 8}, 18, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 8.0f);
    
	//Materiaux
	public static final Item XURANIUM = new ItemBase("xuranium");
	public static final Item PIKARIUM = new ItemBase("pikarium");
	public static final Item DIARIUM = new ItemBase("diarium");
	public static final Item ETIX = new ItemBase("etix");
	
	//Tools XURANIUM
	public static final Item XURANIUM_PICKAXE = new ItemPickaxeMod2("xuranium_pickaxe", TOOL2_XURANIUM);
	public static final Item XURANIUM_SHOVEL = new ItemShovelMod2("xuranium_shovel", TOOL2_XURANIUM);
	public static final Item XURANIUM_SWORD = new ItemSwordMod2("xuranium_sword", TOOL_XURANIUM);
	public static final Item XURANIUM_AXE = new ItemAxeMod2("xuranium_axe", TOOL_XURANIUM);
	public static final Item XURANIUM_HOUE = new ItemHoueMod2("xuranium_houe", TOOL2_XURANIUM);
	
	//HAMMER
    public static final Item HAMMER_XURANIUM = new ItemHammer("hammer_xuranium", HAMMER_XURANIUM1);
    public static final Item HAMMER_PIKARIUM = new ItemHammer2("hammer_pikarium", HAMMER_PIKARIUM1);
    public static final Item HAMMER_DIARIUM = new ItemHammer3("hammer_diarium", HAMMER_DIARIUM1);
    public static final Item HAMMER_ETIX = new ItemHammer4("hammer_etix", HAMMER_ETIX1);
    
    //ARME SPECIAL
	public static final Item KATANA1 = new ItemKatanaMod("katana", KATANA);
	public static final Item GLAIVE1 = new ItemGlaiveMod("glaive", GLAIVE);
	
	//Tools PIKARIUM
	public static final Item PIKARIUM_PICKAXE = new ItemPickaxeMod3("pikarium_pickaxe", TOOL1_PIKARIUM);
	public static final Item PIKARIUM_SHOVEL = new ItemShovelMod3("pikarium_shovel", TOOL1_PIKARIUM);
	public static final Item PIKARIUM_SWORD = new ItemSwordMod3("pikarium_sword", TOOL2_PIKARIUM);
	public static final Item PIKARIUM_AXE = new ItemAxeMod3("pikarium_axe", TOOL2_PIKARIUM);
	
	//Tools DIARIUM
	public static final Item DIARIUM_PICKAXE = new ItemPickaxeMod2("diarium_pickaxe", TOOL1_DIARIUM);
	public static final Item DIARIUM_SHOVEL = new ItemShovelMod2("diarium_shovel", TOOL1_DIARIUM);
	public static final Item DIARIUM_SWORD = new ItemSwordMod2("diarium_sword", TOOL2_DIARIUM);
	public static final Item DIARIUM_AXE = new ItemAxeMod2("diarium_axe", TOOL2_DIARIUM);
	
	//Tools Etix
	public static final Item ETIX_PICKAXE = new ItemPickaxeMod4("etix_pickaxe", TOOL1_ETIX);
	public static final Item ETIX_SHOVEL = new ItemShovelMod4("etix_shovel", TOOL1_ETIX);
	public static final Item ETIX_SWORD = new ItemSwordMod4("etix_sword", TOOL2_ETIX);
	public static final Item ETIX_AXE = new ItemAxeMod4("etix_axe", TOOL2_ETIX);
	
	//SPECIALS
	public static final Item HEAL_STICK = new ItemSpecial("heal_stick");

	
	//Armors XURANIUM
	public static final Item XURANIUM_HELMET = new ArmorMod("xuranium_helmet", ARMOR_XURANIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item XURANIUM_CHESPLATE = new ArmorMod("xuranium_chesplate", ARMOR_XURANIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item XURANIUM_LEGGINGS = new ArmorMod("xuranium_leggins", ARMOR_XURANIUM, 1, EntityEquipmentSlot.LEGS);
	public static final Item XURANIUM_BOOTS = new ArmorMod("xuranium_boots", ARMOR_XURANIUM, 1, EntityEquipmentSlot.FEET);
	
	//Armors PIKARIUM
	public static final Item PIKARIUM_HELMET = new ArmorMod2("pikarium_helmet", ARMOR_PIKARIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item PIKARIUM_CHESPLATE = new ArmorMod2("pikarium_chesplate", ARMOR_PIKARIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item PIKARIUM_LEGGINGS = new ArmorMod2("pikarium_leggins", ARMOR_PIKARIUM, 1, EntityEquipmentSlot.LEGS);
	public static final Item PIKARIUM_BOOTS = new ArmorMod2("pikarium_boots", ARMOR_PIKARIUM, 1, EntityEquipmentSlot.FEET);
	
	//Armors DIARIUM
	public static final Item DIARIUM_HELMET = new ArmorMod3("diarium_helmet", ARMOR_DIARIUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item DIARIUM_CHESPLATE = new ArmorMod3("diarium_chesplate", ARMOR_DIARIUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item DIARIUM_LEGGINGS = new ArmorMod3("diarium_leggins", ARMOR_DIARIUM, 1, EntityEquipmentSlot.LEGS);
	public static final Item DIARIUM_BOOTS = new ArmorMod3("diarium_boots", ARMOR_DIARIUM, 1, EntityEquipmentSlot.FEET);

	//Armors DIARIUM
	public static final Item ETIX_HELMET = new ArmorMod4("etix_helmet", ARMOR_ETIX, 1, EntityEquipmentSlot.HEAD);
	public static final Item ETIX_CHESPLATE = new ArmorMod4("etix_chesplate", ARMOR_ETIX, 1, EntityEquipmentSlot.CHEST);
	public static final Item ETIX_LEGGINGS = new ArmorMod4("etix_leggins", ARMOR_ETIX, 1, EntityEquipmentSlot.LEGS);
	public static final Item ETIX_BOOTS = new ArmorMod4("etix_boots", ARMOR_ETIX, 1, EntityEquipmentSlot.FEET);
	
	//ADMIN
	public static final Item ADMIN = new ItemAdminMod("admin", TOOL_ADMIN);
	
	//Food
    public static final Item XURANIUM_F0OD = new ItemXuraniumFood("xuranium_apple", 8, true);
    public static final Item PIKARIUM_F0OD = new ItemPikariumFood("pikarium_apple", 8, true);

}
