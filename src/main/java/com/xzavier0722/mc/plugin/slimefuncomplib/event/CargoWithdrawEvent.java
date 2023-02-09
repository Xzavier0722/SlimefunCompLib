package com.xzavier0722.mc.plugin.slimefuncomplib.event;

import org.bukkit.block.Block;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.Inventory;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

public class CargoWithdrawEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();
    private boolean cancelled;
    private final Block node;
    private final Block target;
    private final Inventory inv;


    /**
     * @param node: cargo node
     * @param target: target container
     * @param inv: target inventory
     */
    @ParametersAreNonnullByDefault
    public CargoWithdrawEvent(Block node, Block target, Inventory inv) {
        this.node = node;
        this.target = target;
        this.inv = inv;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @Override
    @Nonnull
    public HandlerList getHandlers() {
        return handlers;
    }

    public Block getNode() {
        return node;
    }

    public Inventory getInv() {
        return inv;
    }

    public Block getTarget() {
        return target;
    }
}
