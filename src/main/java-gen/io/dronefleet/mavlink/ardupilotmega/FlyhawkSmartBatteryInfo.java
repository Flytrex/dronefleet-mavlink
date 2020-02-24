package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Smart Battery Info 
 */
@MavlinkMessageInfo(
        id = 199,
        crc = 19,
        description = "Smart Battery Info"
)
public final class FlyhawkSmartBatteryInfo {
    private final int id;

    private final int capacityFullSpecification;

    private final int capacityFull;

    private final int cycleCount;

    private final String serialNumber;

    private final String deviceName;

    private final String firmwareId;

    private final int lifetime;

    private final int madeYear;

    private FlyhawkSmartBatteryInfo(int id, int capacityFullSpecification, int capacityFull,
            int cycleCount, String serialNumber, String deviceName, String firmwareId, int lifetime,
            int madeYear) {
        this.id = id;
        this.capacityFullSpecification = capacityFullSpecification;
        this.capacityFull = capacityFull;
        this.cycleCount = cycleCount;
        this.serialNumber = serialNumber;
        this.deviceName = deviceName;
        this.firmwareId = firmwareId;
        this.lifetime = lifetime;
        this.madeYear = madeYear;
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
     * Capacity when full according to manufacturer, -1: field not provided. 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 2,
            description = "Capacity when full according to manufacturer, -1: field not provided."
    )
    public final int capacityFullSpecification() {
        return this.capacityFullSpecification;
    }

    /**
     * Capacity when full (accounting for battery degradation), -1: field not provided. 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 2,
            description = "Capacity when full (accounting for battery degradation), -1: field not provided."
    )
    public final int capacityFull() {
        return this.capacityFull;
    }

    /**
     * Charge/discharge cycle count. -1: field not provided. 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 2,
            description = "Charge/discharge cycle count. -1: field not provided."
    )
    public final int cycleCount() {
        return this.cycleCount;
    }

    /**
     * Serial number 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 1,
            arraySize = 14,
            description = "Serial number"
    )
    public final String serialNumber() {
        return this.serialNumber;
    }

    /**
     * Static device name. Encode as manufacturer and product names separated using an underscore. 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 1,
            arraySize = 50,
            description = "Static device name. Encode as manufacturer and product names separated using an underscore."
    )
    public final String deviceName() {
        return this.deviceName;
    }

    /**
     * Firmware ID 
     */
    @MavlinkFieldInfo(
            position = 7,
            unitSize = 1,
            arraySize = 15,
            description = "Firmware ID"
    )
    public final String firmwareId() {
        return this.firmwareId;
    }

    /**
     * Lifetime. Values: [0-100], -1: field not provided. 
     */
    @MavlinkFieldInfo(
            position = 8,
            unitSize = 1,
            description = "Lifetime. Values: [0-100], -1: field not provided."
    )
    public final int lifetime() {
        return this.lifetime;
    }

    /**
     * Made year 
     */
    @MavlinkFieldInfo(
            position = 9,
            unitSize = 2,
            description = "Made year"
    )
    public final int madeYear() {
        return this.madeYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        FlyhawkSmartBatteryInfo other = (FlyhawkSmartBatteryInfo)o;
        if (!Objects.deepEquals(id, other.id)) return false;
        if (!Objects.deepEquals(capacityFullSpecification, other.capacityFullSpecification)) return false;
        if (!Objects.deepEquals(capacityFull, other.capacityFull)) return false;
        if (!Objects.deepEquals(cycleCount, other.cycleCount)) return false;
        if (!Objects.deepEquals(serialNumber, other.serialNumber)) return false;
        if (!Objects.deepEquals(deviceName, other.deviceName)) return false;
        if (!Objects.deepEquals(firmwareId, other.firmwareId)) return false;
        if (!Objects.deepEquals(lifetime, other.lifetime)) return false;
        if (!Objects.deepEquals(madeYear, other.madeYear)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(id);
        result = 31 * result + Objects.hashCode(capacityFullSpecification);
        result = 31 * result + Objects.hashCode(capacityFull);
        result = 31 * result + Objects.hashCode(cycleCount);
        result = 31 * result + Objects.hashCode(serialNumber);
        result = 31 * result + Objects.hashCode(deviceName);
        result = 31 * result + Objects.hashCode(firmwareId);
        result = 31 * result + Objects.hashCode(lifetime);
        result = 31 * result + Objects.hashCode(madeYear);
        return result;
    }

    @Override
    public String toString() {
        return "FlyhawkSmartBatteryInfo{id=" + id
                 + ", capacityFullSpecification=" + capacityFullSpecification
                 + ", capacityFull=" + capacityFull
                 + ", cycleCount=" + cycleCount
                 + ", serialNumber=" + serialNumber
                 + ", deviceName=" + deviceName
                 + ", firmwareId=" + firmwareId
                 + ", lifetime=" + lifetime
                 + ", madeYear=" + madeYear + "}";
    }

    public static final class Builder {
        private int id;

        private int capacityFullSpecification;

        private int capacityFull;

        private int cycleCount;

        private String serialNumber;

        private String deviceName;

        private String firmwareId;

        private int lifetime;

        private int madeYear;

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
         * Capacity when full according to manufacturer, -1: field not provided. 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 2,
                description = "Capacity when full according to manufacturer, -1: field not provided."
        )
        public final Builder capacityFullSpecification(int capacityFullSpecification) {
            this.capacityFullSpecification = capacityFullSpecification;
            return this;
        }

        /**
         * Capacity when full (accounting for battery degradation), -1: field not provided. 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 2,
                description = "Capacity when full (accounting for battery degradation), -1: field not provided."
        )
        public final Builder capacityFull(int capacityFull) {
            this.capacityFull = capacityFull;
            return this;
        }

        /**
         * Charge/discharge cycle count. -1: field not provided. 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 2,
                description = "Charge/discharge cycle count. -1: field not provided."
        )
        public final Builder cycleCount(int cycleCount) {
            this.cycleCount = cycleCount;
            return this;
        }

        /**
         * Serial number 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 1,
                arraySize = 14,
                description = "Serial number"
        )
        public final Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        /**
         * Static device name. Encode as manufacturer and product names separated using an underscore. 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 1,
                arraySize = 50,
                description = "Static device name. Encode as manufacturer and product names separated using an underscore."
        )
        public final Builder deviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }

        /**
         * Firmware ID 
         */
        @MavlinkFieldInfo(
                position = 7,
                unitSize = 1,
                arraySize = 15,
                description = "Firmware ID"
        )
        public final Builder firmwareId(String firmwareId) {
            this.firmwareId = firmwareId;
            return this;
        }

        /**
         * Lifetime. Values: [0-100], -1: field not provided. 
         */
        @MavlinkFieldInfo(
                position = 8,
                unitSize = 1,
                description = "Lifetime. Values: [0-100], -1: field not provided."
        )
        public final Builder lifetime(int lifetime) {
            this.lifetime = lifetime;
            return this;
        }

        /**
         * Made year 
         */
        @MavlinkFieldInfo(
                position = 9,
                unitSize = 2,
                description = "Made year"
        )
        public final Builder madeYear(int madeYear) {
            this.madeYear = madeYear;
            return this;
        }

        public final FlyhawkSmartBatteryInfo build() {
            return new FlyhawkSmartBatteryInfo(id, capacityFullSpecification, capacityFull, cycleCount, serialNumber, deviceName, firmwareId, lifetime, madeYear);
        }
    }
}
