package com.yowshee.randomore;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class BlockBreak {
    private final List<Material> broken = Arrays.asList( Material.DIAMOND_ORE, Material.IRON_ORE, Material.EMERALD_ORE, Material.GOLD_ORE, Material.LAPIS_ORE, Material.REDSTONE_ORE );
    private final List<Material> rewards = Arrays.asList(Material.values());
    @EventHandler
    public void onPlayerBreakBlock(BlockBreakEvent event) {

        Block blockBroken = event.getBlock();
        Material material = blockBroken.getType();

        if (broken.contains(material)) {

            event.setCancelled(true);

            blockBroken.setType(Material.AIR);
            ItemStack itemDrop = new ItemStack(rewards.get(ThreadLocalRandom.current().nextInt(0, rewards.size()-1)));
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), itemDrop);
        }
    }
}