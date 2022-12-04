package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Smart Battery Status 
 */
@MavlinkMessageInfo(
        id = 12000,
        crc = 244,
        description = "Smart Battery Status"
)
public final class FlyhawkSmartBatteryStatus {
    private final int id;

    private final int temperature;

    private final int overallVoltage;

    private final short[] voltages;

    private final int current1;

    private final int current2;

    private final int capacityRemaining;

    private final int isShuttingDown;

    private final int isOn;

    private final int unk1;

    private final int unk2;

    private final int unk3;

    private final int unk4;

    private final int unk5;

    private FlyhawkSmartBatteryStatus(int id, int temperature, int overallVoltage, short[] voltages,
            int current1, int current2, int capacityRemaining, int isShuttingDown, int isOn,
            int unk1, int unk2, int unk3, int unk4, int unk5) {
        this.id = id;
        this.temperature = temperature;
        this.overallVoltage = overallVoltage;
        this.voltages = voltages;
        this.current1 = current1;
        this.current2 = current2;
        this.capacityRemaining = capacityRemaining;
        this.isShuttingDown = isShuttingDown;
        this.isOn = isOn;
        this.unk1 = unk1;
        this.unk2 = unk2;
        this.unk3 = unk3;
        this.unk4 = unk4;
        this.unk5 = unk5;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlyhawkSmartBatteryStatus msg) {
        return builder()
                .id(msg.id)
                .temperature(msg.temperature)
                .overallVoltage(msg.overallVoltage)
                .voltages(msg.voltages)
                .current1(msg.current1)
                .current2(msg.current2)
                .capacityRemaining(msg.capacityRemaining)
                .isShuttingDown(msg.isShuttingDown)
                .isOn(msg.isOn)
                .unk1(msg.unk1)
                .unk2(msg.unk2)
                .unk3(msg.unk3)
                .unk4(msg.unk4)
                .unk5(msg.unk5);
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
    public final short[] voltages() {
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

    /**
     * Unknown field 1 
     */
    @MavlinkFieldInfo(
            position = 11,
            unitSize = 1,
            extension = true,
            description = "Unknown field 1"
    )
    public final int unk1() {
        return this.unk1;
    }

    /**
     * Unknown field 2 
     */
    @MavlinkFieldInfo(
            position = 12,
            unitSize = 1,
            extension = true,
            description = "Unknown field 2"
    )
    public final int unk2() {
        return this.unk2;
    }

    /**
     * Unknown field 3 
     */
    @MavlinkFieldInfo(
            position = 13,
            unitSize = 2,
            extension = true,
            description = "Unknown field 3"
    )
    public final int unk3() {
        return this.unk3;
    }

    /**
     * Unknown field 4 
     */
    @MavlinkFieldInfo(
            position = 14,
            unitSize = 1,
            extension = true,
            description = "Unknown field 4"
    )
    public final int unk4() {
        return this.unk4;
    }

    /**
     * Unknown field 5 
     */
    @MavlinkFieldInfo(
            position = 15,
            unitSize = 1,
            extension = true,
            description = "Unknown field 5"
    )
    public final int unk5() {
        return this.unk5;
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
        if (!Objects.deepEquals(unk1, other.unk1)) return false;
        if (!Objects.deepEquals(unk2, other.unk2)) return false;
        if (!Objects.deepEquals(unk3, other.unk3)) return false;
        if (!Objects.deepEquals(unk4, other.unk4)) return false;
        if (!Objects.deepEquals(unk5, other.unk5)) return false;
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
        result = 31 * result + Objects.hashCode(unk1);
        result = 31 * result + Objects.hashCode(unk2);
        result = 31 * result + Objects.hashCode(unk3);
        result = 31 * result + Objects.hashCode(unk4);
        result = 31 * result + Objects.hashCode(unk5);
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
                 + ", isOn=" + isOn
                 + ", unk1=" + unk1
                 + ", unk2=" + unk2
                 + ", unk3=" + unk3
                 + ", unk4=" + unk4
                 + ", unk5=" + unk5 + "}";
    }

    public static final class Builder {
        private int id;

        private int temperature;

        private int overallVoltage;

        private short[] voltages;

        private int current1;

        private int current2;

        private int capacityRemaining;

        private int isShuttingDown;

        private int isOn;

        private int unk1;

        private int unk2;

        private int unk3;

        private int unk4;

        private int unk5;

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
        public final Builder voltages(short[] voltages) {
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

        /**
         * Unknown field 1 
         */
        @MavlinkFieldInfo(
                position = 11,
                unitSize = 1,
                extension = true,
                description = "Unknown field 1"
        )
        public final Builder unk1(int unk1) {
            this.unk1 = unk1;
            return this;
        }

        /**
         * Unknown field 2 
         */
        @MavlinkFieldInfo(
                position = 12,
                unitSize = 1,
                extension = true,
                description = "Unknown field 2"
        )
        public final Builder unk2(int unk2) {
            this.unk2 = unk2;
            return this;
        }

        /**
         * Unknown field 3 
         */
        @MavlinkFieldInfo(
                position = 13,
                unitSize = 2,
                extension = true,
                description = "Unknown field 3"
        )
        public final Builder unk3(int unk3) {
            this.unk3 = unk3;
            return this;
        }

        /**
         * Unknown field 4 
         */
        @MavlinkFieldInfo(
                position = 14,
                unitSize = 1,
                extension = true,
                description = "Unknown field 4"
        )
        public final Builder unk4(int unk4) {
            this.unk4 = unk4;
            return this;
        }

        /**
         * Unknown field 5 
         */
        @MavlinkFieldInfo(
                position = 15,
                unitSize = 1,
                extension = true,
                description = "Unknown field 5"
        )
        public final Builder unk5(int unk5) {
            this.unk5 = unk5;
            return this;
        }

        public final FlyhawkSmartBatteryStatus build() {
            return new FlyhawkSmartBatteryStatus(id, temperature, overallVoltage, voltages, current1, current2, capacityRemaining, isShuttingDown, isOn, unk1, unk2, unk3, unk4, unk5);
        }
    }
}
