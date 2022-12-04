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
        id = 12001,
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

    private final int infoUnk1;

    private final int infoUnk2;

    private final int infoUnk3;

    private final long infoSerial;

    private final byte[] infoUnk4;

    private final byte[] infoUnk5;

    private final int versionUnk1;

    private final byte[] versionUnk2;

    private FlyhawkSmartBatteryInfo(int id, int capacityFullSpecification, int capacityFull,
            int cycleCount, String serialNumber, String deviceName, String firmwareId, int lifetime,
            int madeYear, int infoUnk1, int infoUnk2, int infoUnk3, long infoSerial,
            byte[] infoUnk4, byte[] infoUnk5, int versionUnk1, byte[] versionUnk2) {
        this.id = id;
        this.capacityFullSpecification = capacityFullSpecification;
        this.capacityFull = capacityFull;
        this.cycleCount = cycleCount;
        this.serialNumber = serialNumber;
        this.deviceName = deviceName;
        this.firmwareId = firmwareId;
        this.lifetime = lifetime;
        this.madeYear = madeYear;
        this.infoUnk1 = infoUnk1;
        this.infoUnk2 = infoUnk2;
        this.infoUnk3 = infoUnk3;
        this.infoSerial = infoSerial;
        this.infoUnk4 = infoUnk4;
        this.infoUnk5 = infoUnk5;
        this.versionUnk1 = versionUnk1;
        this.versionUnk2 = versionUnk2;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlyhawkSmartBatteryInfo msg) {
        return builder()
                .id(msg.id)
                .capacityFullSpecification(msg.capacityFullSpecification)
                .capacityFull(msg.capacityFull)
                .cycleCount(msg.cycleCount)
                .serialNumber(msg.serialNumber)
                .deviceName(msg.deviceName)
                .firmwareId(msg.firmwareId)
                .lifetime(msg.lifetime)
                .madeYear(msg.madeYear)
                .infoUnk1(msg.infoUnk1)
                .infoUnk2(msg.infoUnk2)
                .infoUnk3(msg.infoUnk3)
                .infoSerial(msg.infoSerial)
                .infoUnk4(msg.infoUnk4)
                .infoUnk5(msg.infoUnk5)
                .versionUnk1(msg.versionUnk1)
                .versionUnk2(msg.versionUnk2);
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
     *  
     */
    @MavlinkFieldInfo(
            position = 9,
            unitSize = 2
    )
    public final int madeYear() {
        return this.madeYear;
    }

    /**
     * Unknown field 1 in info message 
     */
    @MavlinkFieldInfo(
            position = 11,
            unitSize = 1,
            extension = true,
            description = "Unknown field 1 in info message"
    )
    public final int infoUnk1() {
        return this.infoUnk1;
    }

    /**
     * Unknown field 2 in info message 
     */
    @MavlinkFieldInfo(
            position = 12,
            unitSize = 2,
            extension = true,
            description = "Unknown field 2 in info message"
    )
    public final int infoUnk2() {
        return this.infoUnk2;
    }

    /**
     * Unknown field 3 in info message 
     */
    @MavlinkFieldInfo(
            position = 13,
            unitSize = 2,
            extension = true,
            description = "Unknown field 3 in info message"
    )
    public final int infoUnk3() {
        return this.infoUnk3;
    }

    /**
     * Serial in info message 
     */
    @MavlinkFieldInfo(
            position = 14,
            unitSize = 4,
            extension = true,
            description = "Serial in info message"
    )
    public final long infoSerial() {
        return this.infoSerial;
    }

    /**
     * Unknown field 4 in info message 
     */
    @MavlinkFieldInfo(
            position = 15,
            unitSize = 1,
            arraySize = 8,
            extension = true,
            description = "Unknown field 4 in info message"
    )
    public final byte[] infoUnk4() {
        return this.infoUnk4;
    }

    /**
     * Unknown field 5 in info message 
     */
    @MavlinkFieldInfo(
            position = 16,
            unitSize = 1,
            arraySize = 5,
            extension = true,
            description = "Unknown field 5 in info message"
    )
    public final byte[] infoUnk5() {
        return this.infoUnk5;
    }

    /**
     * Unknown field 1 in version message 
     */
    @MavlinkFieldInfo(
            position = 17,
            unitSize = 2,
            extension = true,
            description = "Unknown field 1 in version message"
    )
    public final int versionUnk1() {
        return this.versionUnk1;
    }

    /**
     * Unknown field 2 in version message 
     */
    @MavlinkFieldInfo(
            position = 18,
            unitSize = 1,
            arraySize = 6,
            extension = true,
            description = "Unknown field 2 in version message"
    )
    public final byte[] versionUnk2() {
        return this.versionUnk2;
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
        if (!Objects.deepEquals(infoUnk1, other.infoUnk1)) return false;
        if (!Objects.deepEquals(infoUnk2, other.infoUnk2)) return false;
        if (!Objects.deepEquals(infoUnk3, other.infoUnk3)) return false;
        if (!Objects.deepEquals(infoSerial, other.infoSerial)) return false;
        if (!Objects.deepEquals(infoUnk4, other.infoUnk4)) return false;
        if (!Objects.deepEquals(infoUnk5, other.infoUnk5)) return false;
        if (!Objects.deepEquals(versionUnk1, other.versionUnk1)) return false;
        if (!Objects.deepEquals(versionUnk2, other.versionUnk2)) return false;
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
        result = 31 * result + Objects.hashCode(infoUnk1);
        result = 31 * result + Objects.hashCode(infoUnk2);
        result = 31 * result + Objects.hashCode(infoUnk3);
        result = 31 * result + Objects.hashCode(infoSerial);
        result = 31 * result + Objects.hashCode(infoUnk4);
        result = 31 * result + Objects.hashCode(infoUnk5);
        result = 31 * result + Objects.hashCode(versionUnk1);
        result = 31 * result + Objects.hashCode(versionUnk2);
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
                 + ", madeYear=" + madeYear
                 + ", infoUnk1=" + infoUnk1
                 + ", infoUnk2=" + infoUnk2
                 + ", infoUnk3=" + infoUnk3
                 + ", infoSerial=" + infoSerial
                 + ", infoUnk4=" + infoUnk4
                 + ", infoUnk5=" + infoUnk5
                 + ", versionUnk1=" + versionUnk1
                 + ", versionUnk2=" + versionUnk2 + "}";
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

        private int infoUnk1;

        private int infoUnk2;

        private int infoUnk3;

        private long infoSerial;

        private byte[] infoUnk4;

        private byte[] infoUnk5;

        private int versionUnk1;

        private byte[] versionUnk2;

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
         *  
         */
        @MavlinkFieldInfo(
                position = 9,
                unitSize = 2
        )
        public final Builder madeYear(int madeYear) {
            this.madeYear = madeYear;
            return this;
        }

        /**
         * Unknown field 1 in info message 
         */
        @MavlinkFieldInfo(
                position = 11,
                unitSize = 1,
                extension = true,
                description = "Unknown field 1 in info message"
        )
        public final Builder infoUnk1(int infoUnk1) {
            this.infoUnk1 = infoUnk1;
            return this;
        }

        /**
         * Unknown field 2 in info message 
         */
        @MavlinkFieldInfo(
                position = 12,
                unitSize = 2,
                extension = true,
                description = "Unknown field 2 in info message"
        )
        public final Builder infoUnk2(int infoUnk2) {
            this.infoUnk2 = infoUnk2;
            return this;
        }

        /**
         * Unknown field 3 in info message 
         */
        @MavlinkFieldInfo(
                position = 13,
                unitSize = 2,
                extension = true,
                description = "Unknown field 3 in info message"
        )
        public final Builder infoUnk3(int infoUnk3) {
            this.infoUnk3 = infoUnk3;
            return this;
        }

        /**
         * Serial in info message 
         */
        @MavlinkFieldInfo(
                position = 14,
                unitSize = 4,
                extension = true,
                description = "Serial in info message"
        )
        public final Builder infoSerial(long infoSerial) {
            this.infoSerial = infoSerial;
            return this;
        }

        /**
         * Unknown field 4 in info message 
         */
        @MavlinkFieldInfo(
                position = 15,
                unitSize = 1,
                arraySize = 8,
                extension = true,
                description = "Unknown field 4 in info message"
        )
        public final Builder infoUnk4(byte[] infoUnk4) {
            this.infoUnk4 = infoUnk4;
            return this;
        }

        /**
         * Unknown field 5 in info message 
         */
        @MavlinkFieldInfo(
                position = 16,
                unitSize = 1,
                arraySize = 5,
                extension = true,
                description = "Unknown field 5 in info message"
        )
        public final Builder infoUnk5(byte[] infoUnk5) {
            this.infoUnk5 = infoUnk5;
            return this;
        }

        /**
         * Unknown field 1 in version message 
         */
        @MavlinkFieldInfo(
                position = 17,
                unitSize = 2,
                extension = true,
                description = "Unknown field 1 in version message"
        )
        public final Builder versionUnk1(int versionUnk1) {
            this.versionUnk1 = versionUnk1;
            return this;
        }

        /**
         * Unknown field 2 in version message 
         */
        @MavlinkFieldInfo(
                position = 18,
                unitSize = 1,
                arraySize = 6,
                extension = true,
                description = "Unknown field 2 in version message"
        )
        public final Builder versionUnk2(byte[] versionUnk2) {
            this.versionUnk2 = versionUnk2;
            return this;
        }

        public final FlyhawkSmartBatteryInfo build() {
            return new FlyhawkSmartBatteryInfo(id, capacityFullSpecification, capacityFull, cycleCount, serialNumber, deviceName, firmwareId, lifetime, madeYear, infoUnk1, infoUnk2, infoUnk3, infoSerial, infoUnk4, infoUnk5, versionUnk1, versionUnk2);
        }
    }
}
