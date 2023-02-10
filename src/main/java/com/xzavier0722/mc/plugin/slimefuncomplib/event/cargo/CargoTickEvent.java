package com.xzavier0722.mc.plugin.slimefuncomplib.event.cargo;

import com.xzavier0722.mc.plugin.slimefuncomplib.event.CancellableEvent;
import org.bukkit.Location;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class CargoTickEvent extends CancellableEvent {
    private final Map<Location, Integer> inputs;
    private final Map<Integer, List<Location>> outputs;
    private String hologramMsg;

    /**
     * @param inputs: input nodes with frequency
     * @param outputs: frequency with output nodes
     */
    @ParametersAreNonnullByDefault
    public CargoTickEvent(Map<Location, Integer> inputs, Map<Integer, List<Location>> outputs) {
        this.inputs = inputs;
        this.outputs = outputs;
    }

    @Nonnull
    public Map<Location, Integer> getInputs() {
        return inputs;
    }

    @Nonnull
    public Map<Integer, List<Location>> getOutputs() {
        return outputs;
    }

    @Nonnull
    public Optional<String> getHologramMsg() {
        return Optional.ofNullable(hologramMsg);
    }

    /**
     * Set hologram message for cargo manager in this tick.
     * Message will be displayed in this tick only.
     * The original message will be overridden.
     * Color code is supported with character '&';
     *
     * @param msg: will be displayed. Null if keep the default message of the cargo manager.
     */
    public void setHologramMsg(@Nullable String msg) {
        this.hologramMsg = msg;
    }
}
