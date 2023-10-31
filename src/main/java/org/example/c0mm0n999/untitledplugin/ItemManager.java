package org.example.c0mm0n999.untitledplugin;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.*;
import org.bukkit.inventory.meta.ItemMeta;

public class ItemManager {

    public static ItemStack HardenedDiamond;

    public static ItemStack HardenedDiamondPickaxe;
    public static ItemStack HardenedDiamondAxe;
    public static ItemStack HardenedDiamondShovel;
    public static ItemStack HardenedDiamondHoe;
    public static ItemStack HardenedDiamondSword;
    public static void init(){
        createHardenedDiamond();
        createHardenedDiamondPickaxe();
        createHardenedDiamondAxe();
        createHardenedDiamondShovel();
        createHardenedDiamondSword();
        createHardenedDiamondHoe();
    }

    public static void createHardenedDiamond(){
        ItemStack item = new ItemStack(Material.DIAMOND, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Hardened Diamond");
        meta.addEnchant(Enchantment.DURABILITY, 1 ,false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        HardenedDiamond = item;

        ShapelessRecipe shapelessRecipe = new ShapelessRecipe(NamespacedKey.minecraft("hardened_diamond"),item);
        shapelessRecipe.addIngredient(Material.DIAMOND);
        shapelessRecipe.addIngredient(Material.OBSIDIAN);
        Bukkit.getServer().addRecipe(shapelessRecipe);
    }
    public static void createHardenedDiamondPickaxe(){
        ItemStack item = new ItemStack(Material.DIAMOND_PICKAXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Hardened Diamond Pickaxe");
        meta.addEnchant(Enchantment.DURABILITY, 3 , false);
        item.setItemMeta(meta);
        HardenedDiamondPickaxe = item;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("hardened_diamond_pickaxe"),item);
        recipe.shape("DDD"," S "," S ");
        recipe.setIngredient('D', new RecipeChoice.ExactChoice(HardenedDiamond));
        recipe.setIngredient('S',Material.STICK);
        Bukkit.getServer().addRecipe(recipe);
    }
    public static void createHardenedDiamondAxe(){
        ItemStack item = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Hardened Diamond Axe");
        meta.addEnchant(Enchantment.DURABILITY, 3 , false);
        item.setItemMeta(meta);
        HardenedDiamondAxe = item;
        ShapedRecipe recipe2 = new ShapedRecipe(NamespacedKey.minecraft("hardened_diamond_axe"),item);
        recipe2.shape("DD ","DS "," S ");
        recipe2.setIngredient('D', new RecipeChoice.ExactChoice(HardenedDiamond));
        recipe2.setIngredient('S',Material.STICK);
        Bukkit.getServer().addRecipe(recipe2);
    }
    public static void createHardenedDiamondShovel(){
        ItemStack item = new ItemStack(Material.DIAMOND_SHOVEL, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Hardened Diamond Shovel");
        meta.addEnchant(Enchantment.DURABILITY, 3 , false);
        item.setItemMeta(meta);
        HardenedDiamondShovel = item;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("hardened_diamond_shovel"),item);
        recipe.shape(" D "," S "," S ");
        recipe.setIngredient('D', new RecipeChoice.ExactChoice(HardenedDiamond));
        recipe.setIngredient('S',Material.STICK);
        Bukkit.getServer().addRecipe(recipe);
    }
    public static void createHardenedDiamondHoe(){
        ItemStack item = new ItemStack(Material.DIAMOND_HOE, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Hardened Diamond Hoe");
        meta.addEnchant(Enchantment.DURABILITY, 3 , false);
        item.setItemMeta(meta);
        HardenedDiamondHoe= item;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("hardened_diamond_hoe"),item);
        recipe.shape("DD "," S "," S ");
        recipe.setIngredient('D', new RecipeChoice.ExactChoice(HardenedDiamond));
        recipe.setIngredient('S',Material.STICK);
        Bukkit.getServer().addRecipe(recipe);
    }
    public static void createHardenedDiamondSword(){
        ItemStack item = new ItemStack(Material.DIAMOND_SWORD, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§6Hardened Diamond Sword");
        meta.addEnchant(Enchantment.DURABILITY, 3 , false);
        item.setItemMeta(meta);
        HardenedDiamondSword = item;

        ShapedRecipe recipe = new ShapedRecipe(NamespacedKey.minecraft("hardened_diamond_sword"),item);
        recipe.shape(" D "," D "," S ");
        recipe.setIngredient('D', new RecipeChoice.ExactChoice(HardenedDiamond));
        recipe.setIngredient('S',Material.STICK);
        Bukkit.getServer().addRecipe(recipe);
    }

}
