package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Smart Battery Status 
 */
@MavlinkMessageInfo(
        id = 198,
        crc = 244,
        description = "Smart Battery Status"
)
public final class FlyhawkSmartBatteryStatus {
    private final int id;

    private final int temperature;

    private final int overallVoltage;

    private final List<Integer> voltages;

    private final int current1;

    private final int current2;

    private final int capacityRemaining;

    private final int isShuttingDown;

    private final int isOn;

    private FlyhawkSmartBatteryStatus(int id, int temperature, int overallVoltage,
            List<Integer> voltages, int current1, int current2, int capacityRemaining,
            int isShuttingDown, int isOn) {
        this.id = id;
        this.temperature = temperature;
        this.overallVoltage = overallVoltage;
        this.voltages = voltages;
        this.current1 = current1;
        this.current2 = current2;
        this.capacityRemaining = capacityRemaining;
        this.isShuttingDown = isShuttingDown;
        this.isOn = isOn;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Battery ID 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 1,
            description = "Battery ID"
    )
    public final int id() {
        return this.id;
    }

    /**
     * Temperature of the battery. UINT16_MAX for unknown temperature. 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 2,
            description = "Temperature of the battery. UINT16_MAX for unknown temperature."
    )
    public final int temperature() {
        return this.temperature;
    }

    /**
     * Overall battery voltage. 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 2,
            description = "Overall battery voltage."
    )
    public final int overallVoltage() {
        return this.overallVoltage;
    }

    /**
     * Individual cell voltages. Index values above the valid cell count for this battery should have 
     * the UINT16_MAX value. 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 2,
            arraySize = 6,
            description = "Individual cell voltages. Index values above the valid cell count for this battery should have the UINT16_MAX value."
    )
    public final List<Integer> voltages() {
        return this.voltages;
    }

    /**
     * Battery current (through all cells/loads). Positive if discharging, negative if charging. 
     * INT32_MAX: field not provided. 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 4,
            signed = true,
            description = "Battery current (through all cells/loads). Positive if discharging, negative if charging. INT32_MAX: field not provided."
    )
    public final int current1() {
        return this.current1;
    }

    /**
     * Battery current (through all cells/loads). Positive if discharging, negative if charging. 
     * INT32_MAX: field not provided. 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 4,
            signed = true,
            description = "Battery current (through all cells/loads). Positive if discharging, negative if charging. INT32_MAX: field not provided."
    )
    public final int current2() {
        return this.current2;
    }

    /**
     * Remaining battery energy. Values: [0-100], -1: autopilot does not estimate the remaining 
     * battery. 
     */
    @MavlinkFieldInfo(
            position = 7,
            unitSize = 1,
            signed = true,
            description = "Remaining battery energy. Values: [0-100], -1: autopilot does not estimate the remaining battery."
    )
    public final int capacityRemaining() {
        return this.capacityRemaining;
    }

    /**
     * Boolean indicating if the battery is currently in shutting down mode. 
     */
    @MavlinkFieldInfo(
            position = 8,
            unitSize = 1,
            signed = true,
            description = "Boolean indicating if the battery is currently in shutting down mode."
    )
    public final int isShuttingDown() {
        return this.isShuttingDown;
    }

    /**
     * Boolean indicating if the battery is currently on. 
     */
    @MavlinkFieldInfo(
            position = 9,
            unitSize = 1,
            signed = true,
            description = "Boolean indicating if the battery is currently on."
    )
    public final int isOn() {
        return this.isOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        FlyhawkSmartBatteryStatus other = (FlyhawkSmartBatteryStatus)o;
        if (!Objects.deepEquals(id, other.id)) return false;
        if (!Objects.deepEquals(temperature, other.temperature)) return false;
        if (!Objects.deepEquals(overallVoltage, other.overallVoltage)) return false;
        if (!Objects.deepEquals(voltages, other.voltages)) return false;
        if (!Objects.deepEquals(current1, other.current1)) return false;
        if (!Objects.deepEquals(current2, other.current2)) return false;
        if (!Objects.deepEquals(capacityRemaining, other.capacityRemaining)) return false;
        if (!Objects.deepEquals(isShuttingDown, other.isShuttingDown)) return false;
        if (!Objects.deepEquals(isOn, other.isOn)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(id);
        result = 31 * result + Objects.hashCode(temperature);
        result = 31 * result + Objects.hashCode(overallVoltage);
        result = 31 * result + Objects.hashCode(voltages);
        result = 31 * result + Objects.hashCode(current1);
        result = 31 * result + Objects.hashCode(current2);
        result = 31 * result + Objects.hashCode(capacityRemaining);
        result = 31 * result + Objects.hashCode(isShuttingDown);
        result = 31 * result + Objects.hashCode(isOn);
        return result;
    }

    @Override
    public String toString() {
        return "FlyhawkSmartBatteryStatus{id=" + id
                 + ", temperature=" + temperature
                 + ", overallVoltage=" + overallVoltage
                 + ", voltages=" + voltages
                 + ", current1=" + current1
                 + ", current2=" + current2
                 + ", capacityRemaining=" + capacityRemaining
                 + ", isShuttingDown=" + isShuttingDown
                 + ", isOn=" + isOn + "}";
    }

    public static final class Builder {
        private int id;

        private int temperature;

        private int overallVoltage;

        private List<Integer> voltages;

        private int current1;

        private int current2;

        private int capacityRemaining;

        private int isShuttingDown;

        private int isOn;

        /**
         * Battery ID 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 1,
                description = "Battery ID"
        )
        public final Builder id(int id) {
            this.id = id;
            return this;
        }

        /**
         * Temperature of the battery. UINT16_MAX for unknown temperature. 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 2,
                description = "Temperature of the battery. UINT16_MAX for unknown temperature."
        )
        public final Builder temperature(int temperature) {
            this.temperature = temperature;
            return this;
        }

        /**
         * Overall battery voltage. 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 2,
                description = "Overall battery voltage."
        )
        public final Builder overallVoltage(int overallVoltage) {
            this.overallVoltage = overallVoltage;
            return this;
        }

        /**
         * Individual cell voltages. Index values above the valid cell count for this battery should have 
         * the UINT16_MAX value. 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 2,
                arraySize = 6,
                description = "Individual cell voltages. Index values above the valid cell count for this battery should have the UINT16_MAX value."
        )
        public final Builder voltages(List<Integer> voltages) {
            this.voltages = voltages;
            return this;
        }

        /**
         * Battery current (through all cells/loads). Positive if discharging, negative if charging. 
         * INT32_MAX: field not provided. 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 4,
                signed = true,
                description = "Battery current (through all cells/loads). Positive if discharging, negative if charging. INT32_MAX: field not provided."
        )
        public final Builder current1(int current1) {
            this.current1 = current1;
            return this;
        }

        /**
         * Battery current (through all cells/loads). Positive if discharging, negative if charging. 
         * INT32_MAX: field not provided. 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 4,
                signed = true,
                description = "Battery current (through all cells/loads). Positive if discharging, negative if charging. INT32_MAX: field not provided."
        )
        public final Builder current2(int current2) {
            this.current2 = current2;
            return this;
        }

        /**
         * Remaining battery energy. Values: [0-100], -1: autopilot does not estimate the remaining 
         * battery. 
         */
        @MavlinkFieldInfo(
                position = 7,
                unitSize = 1,
                signed = true,
                description = "Remaining battery energy. Values: [0-100], -1: autopilot does not estimate the remaining battery."
        )
        public final Builder capacityRemaining(int capacityRemaining) {
            this.capacityRemaining = capacityRemaining;
            return this;
        }

        /**
         * Boolean indicating if the battery is currently in shutting down mode. 
         */
        @MavlinkFieldInfo(
                position = 8,
                unitSize = 1,
                signed = true,
                description = "Boolean indicating if the battery is currently in shutting down mode."
        )
        public final Builder isShuttingDown(int isShuttingDown) {
            this.isShuttingDown = isShuttingDown;
            return this;
        }

        /**
         * Boolean indicating if the battery is currently on. 
         */
        @MavlinkFieldInfo(
                position = 9,
                unitSize = 1,
                signed = true,
                description = "Boolean indicating if the battery is currently on."
        )
        public final Builder isOn(int isOn) {
            this.isOn = isOn;
            return this;
        }

        public final FlyhawkSmartBatteryStatus build() {
            return new FlyhawkSmartBatteryStatus(id, temperature, overallVoltage, voltages, current1, current2, capacityRemaining, isShuttingDown, isOn);
        }
    }
}
