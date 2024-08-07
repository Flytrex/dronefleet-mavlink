package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import io.dronefleet.mavlink.util.EnumValue;
import java.lang.Enum;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collection;
import java.util.Objects;

/**
 * The general system state. If the system is following the MAVLink standard, the system state is 
 * mainly defined by three orthogonal states/modes: The system mode, which is either LOCKED 
 * (motors shut down and locked), MANUAL (system under RC control), GUIDED (system with 
 * autonomous position control, position setpoint controlled manually) or AUTO (system guided 
 * by path/waypoint planner). The NAV_MODE defined the current flight state: LIFTOFF (often an 
 * open-loop maneuver), LANDING, WAYPOINTS or VECTOR. This represents the internal navigation 
 * state machine. The system status shows whether the system is currently active or not and if an 
 * emergency occurred. During the CRITICAL and EMERGENCY states the MAV is still considered to be 
 * active, but should start emergency procedures autonomously. After a failure occurred it 
 * should first move from active to critical to allow manual intervention and then move to 
 * emergency after a certain timeout. 
 */
@MavlinkMessageInfo(
        id = 1,
        crc = 124,
        description = "The general system state. If the system is following the MAVLink standard, the system state is mainly defined by three orthogonal states/modes: The system mode, which is either LOCKED (motors shut down and locked), MANUAL (system under RC control), GUIDED (system with autonomous position control, position setpoint controlled manually) or AUTO (system guided by path/waypoint planner). The NAV_MODE defined the current flight state: LIFTOFF (often an open-loop maneuver), LANDING, WAYPOINTS or VECTOR. This represents the internal navigation state machine. The system status shows whether the system is currently active or not and if an emergency occurred. During the CRITICAL and EMERGENCY states the MAV is still considered to be active, but should start emergency procedures autonomously. After a failure occurred it should first move from active to critical to allow manual intervention and then move to emergency after a certain timeout."
)
public final class SysStatus {
    private final EnumValue<MavSysStatusSensor> onboardControlSensorsPresent;

    private final EnumValue<MavSysStatusSensor> onboardControlSensorsEnabled;

    private final EnumValue<MavSysStatusSensor> onboardControlSensorsHealth;

    private final int load;

    private final int voltageBattery;

    private final int currentBattery;

    private final int batteryRemaining;

    private final int dropRateComm;

    private final int errorsComm;

    private final int errorsCount1;

    private final int errorsCount2;

    private final int errorsCount3;

    private final int errorsCount4;

    private final int failsafe;

    private final EnumValue<MavSysStatusSensorExtension> onboardControlSensorsExtensionPresent;

    private final EnumValue<MavSysStatusSensorExtension> onboardControlSensorsExtensionEnabled;

    private final EnumValue<MavSysStatusSensorExtension> onboardControlSensorsExtensionHealth;

    private SysStatus(EnumValue<MavSysStatusSensor> onboardControlSensorsPresent,
            EnumValue<MavSysStatusSensor> onboardControlSensorsEnabled,
            EnumValue<MavSysStatusSensor> onboardControlSensorsHealth, int load, int voltageBattery,
            int currentBattery, int batteryRemaining, int dropRateComm, int errorsComm,
            int errorsCount1, int errorsCount2, int errorsCount3, int errorsCount4, int failsafe,
            EnumValue<MavSysStatusSensorExtension> onboardControlSensorsExtensionPresent,
            EnumValue<MavSysStatusSensorExtension> onboardControlSensorsExtensionEnabled,
            EnumValue<MavSysStatusSensorExtension> onboardControlSensorsExtensionHealth) {
        this.onboardControlSensorsPresent = onboardControlSensorsPresent;
        this.onboardControlSensorsEnabled = onboardControlSensorsEnabled;
        this.onboardControlSensorsHealth = onboardControlSensorsHealth;
        this.load = load;
        this.voltageBattery = voltageBattery;
        this.currentBattery = currentBattery;
        this.batteryRemaining = batteryRemaining;
        this.dropRateComm = dropRateComm;
        this.errorsComm = errorsComm;
        this.errorsCount1 = errorsCount1;
        this.errorsCount2 = errorsCount2;
        this.errorsCount3 = errorsCount3;
        this.errorsCount4 = errorsCount4;
        this.failsafe = failsafe;
        this.onboardControlSensorsExtensionPresent = onboardControlSensorsExtensionPresent;
        this.onboardControlSensorsExtensionEnabled = onboardControlSensorsExtensionEnabled;
        this.onboardControlSensorsExtensionHealth = onboardControlSensorsExtensionHealth;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SysStatus msg) {
        return builder()
                .onboardControlSensorsPresent(msg.onboardControlSensorsPresent)
                .onboardControlSensorsEnabled(msg.onboardControlSensorsEnabled)
                .onboardControlSensorsHealth(msg.onboardControlSensorsHealth)
                .load(msg.load)
                .voltageBattery(msg.voltageBattery)
                .currentBattery(msg.currentBattery)
                .batteryRemaining(msg.batteryRemaining)
                .dropRateComm(msg.dropRateComm)
                .errorsComm(msg.errorsComm)
                .errorsCount1(msg.errorsCount1)
                .errorsCount2(msg.errorsCount2)
                .errorsCount3(msg.errorsCount3)
                .errorsCount4(msg.errorsCount4)
                .failsafe(msg.failsafe)
                .onboardControlSensorsExtensionPresent(msg.onboardControlSensorsExtensionPresent)
                .onboardControlSensorsExtensionEnabled(msg.onboardControlSensorsExtensionEnabled)
                .onboardControlSensorsExtensionHealth(msg.onboardControlSensorsExtensionHealth);
    }

    /**
     * Bitmap showing which onboard controllers and sensors are present. Value of 0: not present. 
     * Value of 1: present. 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 4,
            enumType = MavSysStatusSensor.class,
            description = "Bitmap showing which onboard controllers and sensors are present. Value of 0: not present. Value of 1: present."
    )
    public final EnumValue<MavSysStatusSensor> onboardControlSensorsPresent() {
        return this.onboardControlSensorsPresent;
    }

    /**
     * Bitmap showing which onboard controllers and sensors are enabled: Value of 0: not enabled. 
     * Value of 1: enabled. 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 4,
            enumType = MavSysStatusSensor.class,
            description = "Bitmap showing which onboard controllers and sensors are enabled:  Value of 0: not enabled. Value of 1: enabled."
    )
    public final EnumValue<MavSysStatusSensor> onboardControlSensorsEnabled() {
        return this.onboardControlSensorsEnabled;
    }

    /**
     * Bitmap showing which onboard controllers and sensors have an error (or are operational). 
     * Value of 0: error. Value of 1: healthy. 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 4,
            enumType = MavSysStatusSensor.class,
            description = "Bitmap showing which onboard controllers and sensors have an error (or are operational). Value of 0: error. Value of 1: healthy."
    )
    public final EnumValue<MavSysStatusSensor> onboardControlSensorsHealth() {
        return this.onboardControlSensorsHealth;
    }

    /**
     * Maximum usage in percent of the mainloop time. Values: [0-1000] - should always be below 1000 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 2,
            description = "Maximum usage in percent of the mainloop time. Values: [0-1000] - should always be below 1000"
    )
    public final int load() {
        return this.load;
    }

    /**
     * Battery voltage, UINT16_MAX: Voltage not sent by autopilot 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 2,
            description = "Battery voltage, UINT16_MAX: Voltage not sent by autopilot"
    )
    public final int voltageBattery() {
        return this.voltageBattery;
    }

    /**
     * Battery current, -1: Current not sent by autopilot 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 2,
            signed = true,
            description = "Battery current, -1: Current not sent by autopilot"
    )
    public final int currentBattery() {
        return this.currentBattery;
    }

    /**
     * Battery energy remaining, -1: Battery remaining energy not sent by autopilot 
     */
    @MavlinkFieldInfo(
            position = 7,
            unitSize = 1,
            signed = true,
            description = "Battery energy remaining, -1: Battery remaining energy not sent by autopilot"
    )
    public final int batteryRemaining() {
        return this.batteryRemaining;
    }

    /**
     * Communication drop rate, (UART, I2C, SPI, CAN), dropped packets on all links (packets that 
     * were corrupted on reception on the MAV) 
     */
    @MavlinkFieldInfo(
            position = 8,
            unitSize = 2,
            description = "Communication drop rate, (UART, I2C, SPI, CAN), dropped packets on all links (packets that were corrupted on reception on the MAV)"
    )
    public final int dropRateComm() {
        return this.dropRateComm;
    }

    /**
     * Communication errors (UART, I2C, SPI, CAN), dropped packets on all links (packets that were 
     * corrupted on reception on the MAV) 
     */
    @MavlinkFieldInfo(
            position = 9,
            unitSize = 2,
            description = "Communication errors (UART, I2C, SPI, CAN), dropped packets on all links (packets that were corrupted on reception on the MAV)"
    )
    public final int errorsComm() {
        return this.errorsComm;
    }

    /**
     * Autopilot-specific errors 
     */
    @MavlinkFieldInfo(
            position = 10,
            unitSize = 2,
            description = "Autopilot-specific errors"
    )
    public final int errorsCount1() {
        return this.errorsCount1;
    }

    /**
     * Autopilot-specific errors 
     */
    @MavlinkFieldInfo(
            position = 11,
            unitSize = 2,
            description = "Autopilot-specific errors"
    )
    public final int errorsCount2() {
        return this.errorsCount2;
    }

    /**
     * Autopilot-specific errors 
     */
    @MavlinkFieldInfo(
            position = 12,
            unitSize = 2,
            description = "Autopilot-specific errors"
    )
    public final int errorsCount3() {
        return this.errorsCount3;
    }

    /**
     * Autopilot-specific errors 
     */
    @MavlinkFieldInfo(
            position = 13,
            unitSize = 2,
            description = "Autopilot-specific errors"
    )
    public final int errorsCount4() {
        return this.errorsCount4;
    }

    /**
     * failsafe (each bit represents a failsafe where 0=ok, 1=failsafe active (bit0:RC, bit1:batt, 
     * bit2:GCS, bit3:EKF, bit4:terrain, bit5:adsb) 
     */
    @MavlinkFieldInfo(
            position = 15,
            unitSize = 1,
            extension = true,
            description = "failsafe (each bit represents a failsafe where 0=ok, 1=failsafe active (bit0:RC, bit1:batt, bit2:GCS, bit3:EKF, bit4:terrain, bit5:adsb)"
    )
    public final int failsafe() {
        return this.failsafe;
    }

    /**
     * Bitmap showing which onboard controllers and sensors are present. Value of 0: not present. 
     * Value of 1: present. 
     */
    @MavlinkFieldInfo(
            position = 16,
            unitSize = 2,
            enumType = MavSysStatusSensorExtension.class,
            extension = true,
            description = "Bitmap showing which onboard controllers and sensors are present. Value of 0: not present. Value of 1: present."
    )
    public final EnumValue<MavSysStatusSensorExtension> onboardControlSensorsExtensionPresent() {
        return this.onboardControlSensorsExtensionPresent;
    }

    /**
     * Bitmap showing which onboard controllers and sensors are enabled: Value of 0: not enabled. 
     * Value of 1: enabled. 
     */
    @MavlinkFieldInfo(
            position = 17,
            unitSize = 2,
            enumType = MavSysStatusSensorExtension.class,
            extension = true,
            description = "Bitmap showing which onboard controllers and sensors are enabled:  Value of 0: not enabled. Value of 1: enabled."
    )
    public final EnumValue<MavSysStatusSensorExtension> onboardControlSensorsExtensionEnabled() {
        return this.onboardControlSensorsExtensionEnabled;
    }

    /**
     * Bitmap showing which onboard controllers and sensors have an error (or are operational). 
     * Value of 0: error. Value of 1: healthy. 
     */
    @MavlinkFieldInfo(
            position = 18,
            unitSize = 2,
            enumType = MavSysStatusSensorExtension.class,
            extension = true,
            description = "Bitmap showing which onboard controllers and sensors have an error (or are operational). Value of 0: error. Value of 1: healthy."
    )
    public final EnumValue<MavSysStatusSensorExtension> onboardControlSensorsExtensionHealth() {
        return this.onboardControlSensorsExtensionHealth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        SysStatus other = (SysStatus)o;
        if (!Objects.deepEquals(onboardControlSensorsPresent, other.onboardControlSensorsPresent)) return false;
        if (!Objects.deepEquals(onboardControlSensorsEnabled, other.onboardControlSensorsEnabled)) return false;
        if (!Objects.deepEquals(onboardControlSensorsHealth, other.onboardControlSensorsHealth)) return false;
        if (!Objects.deepEquals(load, other.load)) return false;
        if (!Objects.deepEquals(voltageBattery, other.voltageBattery)) return false;
        if (!Objects.deepEquals(currentBattery, other.currentBattery)) return false;
        if (!Objects.deepEquals(batteryRemaining, other.batteryRemaining)) return false;
        if (!Objects.deepEquals(dropRateComm, other.dropRateComm)) return false;
        if (!Objects.deepEquals(errorsComm, other.errorsComm)) return false;
        if (!Objects.deepEquals(errorsCount1, other.errorsCount1)) return false;
        if (!Objects.deepEquals(errorsCount2, other.errorsCount2)) return false;
        if (!Objects.deepEquals(errorsCount3, other.errorsCount3)) return false;
        if (!Objects.deepEquals(errorsCount4, other.errorsCount4)) return false;
        if (!Objects.deepEquals(failsafe, other.failsafe)) return false;
        if (!Objects.deepEquals(onboardControlSensorsExtensionPresent, other.onboardControlSensorsExtensionPresent)) return false;
        if (!Objects.deepEquals(onboardControlSensorsExtensionEnabled, other.onboardControlSensorsExtensionEnabled)) return false;
        if (!Objects.deepEquals(onboardControlSensorsExtensionHealth, other.onboardControlSensorsExtensionHealth)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(onboardControlSensorsPresent);
        result = 31 * result + Objects.hashCode(onboardControlSensorsEnabled);
        result = 31 * result + Objects.hashCode(onboardControlSensorsHealth);
        result = 31 * result + Objects.hashCode(load);
        result = 31 * result + Objects.hashCode(voltageBattery);
        result = 31 * result + Objects.hashCode(currentBattery);
        result = 31 * result + Objects.hashCode(batteryRemaining);
        result = 31 * result + Objects.hashCode(dropRateComm);
        result = 31 * result + Objects.hashCode(errorsComm);
        result = 31 * result + Objects.hashCode(errorsCount1);
        result = 31 * result + Objects.hashCode(errorsCount2);
        result = 31 * result + Objects.hashCode(errorsCount3);
        result = 31 * result + Objects.hashCode(errorsCount4);
        result = 31 * result + Objects.hashCode(failsafe);
        result = 31 * result + Objects.hashCode(onboardControlSensorsExtensionPresent);
        result = 31 * result + Objects.hashCode(onboardControlSensorsExtensionEnabled);
        result = 31 * result + Objects.hashCode(onboardControlSensorsExtensionHealth);
        return result;
    }

    @Override
    public String toString() {
        return "SysStatus{onboardControlSensorsPresent=" + onboardControlSensorsPresent
                 + ", onboardControlSensorsEnabled=" + onboardControlSensorsEnabled
                 + ", onboardControlSensorsHealth=" + onboardControlSensorsHealth
                 + ", load=" + load
                 + ", voltageBattery=" + voltageBattery
                 + ", currentBattery=" + currentBattery
                 + ", batteryRemaining=" + batteryRemaining
                 + ", dropRateComm=" + dropRateComm
                 + ", errorsComm=" + errorsComm
                 + ", errorsCount1=" + errorsCount1
                 + ", errorsCount2=" + errorsCount2
                 + ", errorsCount3=" + errorsCount3
                 + ", errorsCount4=" + errorsCount4
                 + ", failsafe=" + failsafe
                 + ", onboardControlSensorsExtensionPresent=" + onboardControlSensorsExtensionPresent
                 + ", onboardControlSensorsExtensionEnabled=" + onboardControlSensorsExtensionEnabled
                 + ", onboardControlSensorsExtensionHealth=" + onboardControlSensorsExtensionHealth + "}";
    }

    public static final class Builder {
        private EnumValue<MavSysStatusSensor> onboardControlSensorsPresent;

        private EnumValue<MavSysStatusSensor> onboardControlSensorsEnabled;

        private EnumValue<MavSysStatusSensor> onboardControlSensorsHealth;

        private int load;

        private int voltageBattery;

        private int currentBattery;

        private int batteryRemaining;

        private int dropRateComm;

        private int errorsComm;

        private int errorsCount1;

        private int errorsCount2;

        private int errorsCount3;

        private int errorsCount4;

        private int failsafe;

        private EnumValue<MavSysStatusSensorExtension> onboardControlSensorsExtensionPresent;

        private EnumValue<MavSysStatusSensorExtension> onboardControlSensorsExtensionEnabled;

        private EnumValue<MavSysStatusSensorExtension> onboardControlSensorsExtensionHealth;

        /**
         * Bitmap showing which onboard controllers and sensors are present. Value of 0: not present. 
         * Value of 1: present. 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 4,
                enumType = MavSysStatusSensor.class,
                description = "Bitmap showing which onboard controllers and sensors are present. Value of 0: not present. Value of 1: present."
        )
        public final Builder onboardControlSensorsPresent(
                EnumValue<MavSysStatusSensor> onboardControlSensorsPresent) {
            this.onboardControlSensorsPresent = onboardControlSensorsPresent;
            return this;
        }

        /**
         * Bitmap showing which onboard controllers and sensors are present. Value of 0: not present. 
         * Value of 1: present. 
         */
        public final Builder onboardControlSensorsPresent(MavSysStatusSensor entry) {
            return onboardControlSensorsPresent(EnumValue.of(entry));
        }

        /**
         * Bitmap showing which onboard controllers and sensors are present. Value of 0: not present. 
         * Value of 1: present. 
         */
        public final Builder onboardControlSensorsPresent(Enum... flags) {
            return onboardControlSensorsPresent(EnumValue.create(flags));
        }

        /**
         * Bitmap showing which onboard controllers and sensors are present. Value of 0: not present. 
         * Value of 1: present. 
         */
        public final Builder onboardControlSensorsPresent(Collection<Enum> flags) {
            return onboardControlSensorsPresent(EnumValue.create(flags));
        }

        /**
         * Bitmap showing which onboard controllers and sensors are enabled: Value of 0: not enabled. 
         * Value of 1: enabled. 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 4,
                enumType = MavSysStatusSensor.class,
                description = "Bitmap showing which onboard controllers and sensors are enabled:  Value of 0: not enabled. Value of 1: enabled."
        )
        public final Builder onboardControlSensorsEnabled(
                EnumValue<MavSysStatusSensor> onboardControlSensorsEnabled) {
            this.onboardControlSensorsEnabled = onboardControlSensorsEnabled;
            return this;
        }

        /**
         * Bitmap showing which onboard controllers and sensors are enabled: Value of 0: not enabled. 
         * Value of 1: enabled. 
         */
        public final Builder onboardControlSensorsEnabled(MavSysStatusSensor entry) {
            return onboardControlSensorsEnabled(EnumValue.of(entry));
        }

        /**
         * Bitmap showing which onboard controllers and sensors are enabled: Value of 0: not enabled. 
         * Value of 1: enabled. 
         */
        public final Builder onboardControlSensorsEnabled(Enum... flags) {
            return onboardControlSensorsEnabled(EnumValue.create(flags));
        }

        /**
         * Bitmap showing which onboard controllers and sensors are enabled: Value of 0: not enabled. 
         * Value of 1: enabled. 
         */
        public final Builder onboardControlSensorsEnabled(Collection<Enum> flags) {
            return onboardControlSensorsEnabled(EnumValue.create(flags));
        }

        /**
         * Bitmap showing which onboard controllers and sensors have an error (or are operational). 
         * Value of 0: error. Value of 1: healthy. 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 4,
                enumType = MavSysStatusSensor.class,
                description = "Bitmap showing which onboard controllers and sensors have an error (or are operational). Value of 0: error. Value of 1: healthy."
        )
        public final Builder onboardControlSensorsHealth(
                EnumValue<MavSysStatusSensor> onboardControlSensorsHealth) {
            this.onboardControlSensorsHealth = onboardControlSensorsHealth;
            return this;
        }

        /**
         * Bitmap showing which onboard controllers and sensors have an error (or are operational). 
         * Value of 0: error. Value of 1: healthy. 
         */
        public final Builder onboardControlSensorsHealth(MavSysStatusSensor entry) {
            return onboardControlSensorsHealth(EnumValue.of(entry));
        }

        /**
         * Bitmap showing which onboard controllers and sensors have an error (or are operational). 
         * Value of 0: error. Value of 1: healthy. 
         */
        public final Builder onboardControlSensorsHealth(Enum... flags) {
            return onboardControlSensorsHealth(EnumValue.create(flags));
        }

        /**
         * Bitmap showing which onboard controllers and sensors have an error (or are operational). 
         * Value of 0: error. Value of 1: healthy. 
         */
        public final Builder onboardControlSensorsHealth(Collection<Enum> flags) {
            return onboardControlSensorsHealth(EnumValue.create(flags));
        }

        /**
         * Maximum usage in percent of the mainloop time. Values: [0-1000] - should always be below 1000 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 2,
                description = "Maximum usage in percent of the mainloop time. Values: [0-1000] - should always be below 1000"
        )
        public final Builder load(int load) {
            this.load = load;
            return this;
        }

        /**
         * Battery voltage, UINT16_MAX: Voltage not sent by autopilot 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 2,
                description = "Battery voltage, UINT16_MAX: Voltage not sent by autopilot"
        )
        public final Builder voltageBattery(int voltageBattery) {
            this.voltageBattery = voltageBattery;
            return this;
        }

        /**
         * Battery current, -1: Current not sent by autopilot 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 2,
                signed = true,
                description = "Battery current, -1: Current not sent by autopilot"
        )
        public final Builder currentBattery(int currentBattery) {
            this.currentBattery = currentBattery;
            return this;
        }

        /**
         * Battery energy remaining, -1: Battery remaining energy not sent by autopilot 
         */
        @MavlinkFieldInfo(
                position = 7,
                unitSize = 1,
                signed = true,
                description = "Battery energy remaining, -1: Battery remaining energy not sent by autopilot"
        )
        public final Builder batteryRemaining(int batteryRemaining) {
            this.batteryRemaining = batteryRemaining;
            return this;
        }

        /**
         * Communication drop rate, (UART, I2C, SPI, CAN), dropped packets on all links (packets that 
         * were corrupted on reception on the MAV) 
         */
        @MavlinkFieldInfo(
                position = 8,
                unitSize = 2,
                description = "Communication drop rate, (UART, I2C, SPI, CAN), dropped packets on all links (packets that were corrupted on reception on the MAV)"
        )
        public final Builder dropRateComm(int dropRateComm) {
            this.dropRateComm = dropRateComm;
            return this;
        }

        /**
         * Communication errors (UART, I2C, SPI, CAN), dropped packets on all links (packets that were 
         * corrupted on reception on the MAV) 
         */
        @MavlinkFieldInfo(
                position = 9,
                unitSize = 2,
                description = "Communication errors (UART, I2C, SPI, CAN), dropped packets on all links (packets that were corrupted on reception on the MAV)"
        )
        public final Builder errorsComm(int errorsComm) {
            this.errorsComm = errorsComm;
            return this;
        }

        /**
         * Autopilot-specific errors 
         */
        @MavlinkFieldInfo(
                position = 10,
                unitSize = 2,
                description = "Autopilot-specific errors"
        )
        public final Builder errorsCount1(int errorsCount1) {
            this.errorsCount1 = errorsCount1;
            return this;
        }

        /**
         * Autopilot-specific errors 
         */
        @MavlinkFieldInfo(
                position = 11,
                unitSize = 2,
                description = "Autopilot-specific errors"
        )
        public final Builder errorsCount2(int errorsCount2) {
            this.errorsCount2 = errorsCount2;
            return this;
        }

        /**
         * Autopilot-specific errors 
         */
        @MavlinkFieldInfo(
                position = 12,
                unitSize = 2,
                description = "Autopilot-specific errors"
        )
        public final Builder errorsCount3(int errorsCount3) {
            this.errorsCount3 = errorsCount3;
            return this;
        }

        /**
         * Autopilot-specific errors 
         */
        @MavlinkFieldInfo(
                position = 13,
                unitSize = 2,
                description = "Autopilot-specific errors"
        )
        public final Builder errorsCount4(int errorsCount4) {
            this.errorsCount4 = errorsCount4;
            return this;
        }

        /**
         * failsafe (each bit represents a failsafe where 0=ok, 1=failsafe active (bit0:RC, bit1:batt, 
         * bit2:GCS, bit3:EKF, bit4:terrain, bit5:adsb) 
         */
        @MavlinkFieldInfo(
                position = 15,
                unitSize = 1,
                extension = true,
                description = "failsafe (each bit represents a failsafe where 0=ok, 1=failsafe active (bit0:RC, bit1:batt, bit2:GCS, bit3:EKF, bit4:terrain, bit5:adsb)"
        )
        public final Builder failsafe(int failsafe) {
            this.failsafe = failsafe;
            return this;
        }

        /**
         * Bitmap showing which onboard controllers and sensors are present. Value of 0: not present. 
         * Value of 1: present. 
         */
        @MavlinkFieldInfo(
                position = 16,
                unitSize = 2,
                enumType = MavSysStatusSensorExtension.class,
                extension = true,
                description = "Bitmap showing which onboard controllers and sensors are present. Value of 0: not present. Value of 1: present."
        )
        public final Builder onboardControlSensorsExtensionPresent(
                EnumValue<MavSysStatusSensorExtension> onboardControlSensorsExtensionPresent) {
            this.onboardControlSensorsExtensionPresent = onboardControlSensorsExtensionPresent;
            return this;
        }

        /**
         * Bitmap showing which onboard controllers and sensors are present. Value of 0: not present. 
         * Value of 1: present. 
         */
        public final Builder onboardControlSensorsExtensionPresent(
                MavSysStatusSensorExtension entry) {
            return onboardControlSensorsExtensionPresent(EnumValue.of(entry));
        }

        /**
         * Bitmap showing which onboard controllers and sensors are present. Value of 0: not present. 
         * Value of 1: present. 
         */
        public final Builder onboardControlSensorsExtensionPresent(Enum... flags) {
            return onboardControlSensorsExtensionPresent(EnumValue.create(flags));
        }

        /**
         * Bitmap showing which onboard controllers and sensors are present. Value of 0: not present. 
         * Value of 1: present. 
         */
        public final Builder onboardControlSensorsExtensionPresent(Collection<Enum> flags) {
            return onboardControlSensorsExtensionPresent(EnumValue.create(flags));
        }

        /**
         * Bitmap showing which onboard controllers and sensors are enabled: Value of 0: not enabled. 
         * Value of 1: enabled. 
         */
        @MavlinkFieldInfo(
                position = 17,
                unitSize = 2,
                enumType = MavSysStatusSensorExtension.class,
                extension = true,
                description = "Bitmap showing which onboard controllers and sensors are enabled:  Value of 0: not enabled. Value of 1: enabled."
        )
        public final Builder onboardControlSensorsExtensionEnabled(
                EnumValue<MavSysStatusSensorExtension> onboardControlSensorsExtensionEnabled) {
            this.onboardControlSensorsExtensionEnabled = onboardControlSensorsExtensionEnabled;
            return this;
        }

        /**
         * Bitmap showing which onboard controllers and sensors are enabled: Value of 0: not enabled. 
         * Value of 1: enabled. 
         */
        public final Builder onboardControlSensorsExtensionEnabled(
                MavSysStatusSensorExtension entry) {
            return onboardControlSensorsExtensionEnabled(EnumValue.of(entry));
        }

        /**
         * Bitmap showing which onboard controllers and sensors are enabled: Value of 0: not enabled. 
         * Value of 1: enabled. 
         */
        public final Builder onboardControlSensorsExtensionEnabled(Enum... flags) {
            return onboardControlSensorsExtensionEnabled(EnumValue.create(flags));
        }

        /**
         * Bitmap showing which onboard controllers and sensors are enabled: Value of 0: not enabled. 
         * Value of 1: enabled. 
         */
        public final Builder onboardControlSensorsExtensionEnabled(Collection<Enum> flags) {
            return onboardControlSensorsExtensionEnabled(EnumValue.create(flags));
        }

        /**
         * Bitmap showing which onboard controllers and sensors have an error (or are operational). 
         * Value of 0: error. Value of 1: healthy. 
         */
        @MavlinkFieldInfo(
                position = 18,
                unitSize = 2,
                enumType = MavSysStatusSensorExtension.class,
                extension = true,
                description = "Bitmap showing which onboard controllers and sensors have an error (or are operational). Value of 0: error. Value of 1: healthy."
        )
        public final Builder onboardControlSensorsExtensionHealth(
                EnumValue<MavSysStatusSensorExtension> onboardControlSensorsExtensionHealth) {
            this.onboardControlSensorsExtensionHealth = onboardControlSensorsExtensionHealth;
            return this;
        }

        /**
         * Bitmap showing which onboard controllers and sensors have an error (or are operational). 
         * Value of 0: error. Value of 1: healthy. 
         */
        public final Builder onboardControlSensorsExtensionHealth(
                MavSysStatusSensorExtension entry) {
            return onboardControlSensorsExtensionHealth(EnumValue.of(entry));
        }

        /**
         * Bitmap showing which onboard controllers and sensors have an error (or are operational). 
         * Value of 0: error. Value of 1: healthy. 
         */
        public final Builder onboardControlSensorsExtensionHealth(Enum... flags) {
            return onboardControlSensorsExtensionHealth(EnumValue.create(flags));
        }

        /**
         * Bitmap showing which onboard controllers and sensors have an error (or are operational). 
         * Value of 0: error. Value of 1: healthy. 
         */
        public final Builder onboardControlSensorsExtensionHealth(Collection<Enum> flags) {
            return onboardControlSensorsExtensionHealth(EnumValue.create(flags));
        }

        public final SysStatus build() {
            return new SysStatus(onboardControlSensorsPresent, onboardControlSensorsEnabled, onboardControlSensorsHealth, load, voltageBattery, currentBattery, batteryRemaining, dropRateComm, errorsComm, errorsCount1, errorsCount2, errorsCount3, errorsCount4, failsafe, onboardControlSensorsExtensionPresent, onboardControlSensorsExtensionEnabled, onboardControlSensorsExtensionHealth);
        }
    }
}
