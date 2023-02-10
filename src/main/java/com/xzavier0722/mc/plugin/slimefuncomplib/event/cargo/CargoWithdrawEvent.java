package com.xzavier0722.mc.plugin.slimefuncomplib.event.cargo;

import org.bukkit.block.Block;
import org.bukkit.inventory.Inventory;

public class CargoWithdrawEvent extends CargoOperationEvent {

    /**
     * @param node   : cargo node
     * @param target : target container
     * @param inv    : target inventory
     */
    public CargoWithdrawEvent(Block node, Block target, Inventory inv) {
        super(node, target, inv);
    }
}
