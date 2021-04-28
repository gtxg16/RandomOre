package com.yowshee.orechanger;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;

public class EmeraldBlockBreak implements Listener {
    @EventHandler
    public void onPlayerBreakBlock(BlockBreakEvent event) {
        Block blockBroken = event.getBlock();

        if (blockBroken.getType() == Material.EMERALD_ORE)
        { event.setCancelled(true);

            blockBroken.setType(Material.AIR);
            ItemStack lapis_lazuli = new ItemStack(Material.LAPIS_LAZULI);
            blockBroken.getWorld().dropItemNaturally(blockBroken.getLocation(), lapis_lazuli);

        }

    }
}
