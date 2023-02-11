package com.xzavier0722.mc.plugin.slimefuncomplib.event.cargo;

import com.xzavier0722.mc.plugin.slimefuncomplib.event.CancellableEvent;
import org.bukkit.block.Block;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.Inventory;

import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;

public abstract class CargoOperationEvent extends CancellableEvent {
    private static final HandlerList handlers = new HandlerList();
    private final Block node;
    private final Block target;
    private final Inventory inv;


    /**
     * @param node: cargo node
     * @param target: target container
     * @param inv: target inventory
     */
    @ParametersAreNonnullByDefault
    public CargoOperationEvent(Block node, Block target, Inventory inv) {
        this.node = node;
        this.target = target;
        this.inv = inv;
    }

    @Nonnull
    public Block getNode() {
        return node;
    }

    @Nonnull
    public Inventory getInv() {
        return inv;
    }

    @Nonnull
    public Block getTarget() {
        return target;
    }

    @Nonnull
    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    @Nonnull
    public HandlerList getHandlers() {
        return handlers;
    }

}
