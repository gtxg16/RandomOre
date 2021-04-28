package com.yowshee.orechanger;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class LapisBlockBreak implements Listener {
    @EventHandler
    public void onPlayerBreakBlock(BlockBreakEvent event) {
        Block blockBroken = event.getBlock();

        if (blockBroken.getType() == Material.LAPIS_ORE)
        { event.setCancelled(true);

            blockBroken.setType(Material.AIR);
            ItemStack emerald = new ItemStack(Material.EMERALD);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), emerald);

        }

    }
}
