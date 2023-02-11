package com.xzavier0722.mc.plugin.slimefuncomplib.event.cargo;

import org.bukkit.block.Block;
import org.bukkit.inventory.Inventory;

public class CargoInsertEvent extends CargoOperationEvent {
    /**
     * @param node   : cargo node
     * @param target : target container
     * @param inv    : target inventory
     */
    public CargoInsertEvent(Block node, Block target, Inventory inv) {
        super(node, target, inv);
    }

}
