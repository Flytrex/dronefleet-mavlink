package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import io.dronefleet.mavlink.util.EnumValue;
import java.lang.Deprecated;
import java.lang.Enum;
import java.lang.Float;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/**
 * Message reporting the status of a gimbal device. This message should be broadcasted by a gimbal 
 * device component. The angles encoded in the quaternion are relative to absolute North if the 
 * flag GIMBAL_DEVICE_FLAGS_YAW_LOCK is set (roll: positive is rolling to the right, pitch: 
 * positive is pitching up, yaw is turn to the right) or relative to the vehicle heading if the flag 
 * is not set. This message should be broadcast at a low regular rate (e.g. 10Hz). 
 * @deprecated This message is a work in progress. It may be modified in a non backward-compatible 
 * way in a future release without any warning. This version of the message may not even work with 
 * autopilots that support this message due to discrepancies between dialect versions. Unless 
 * you completely understand the risks of doing so, don't use it. 
 */
@MavlinkMessageInfo(
        id = 285,
        crc = 137,
        description = "Message reporting the status of a gimbal device. This message should be broadcasted by a gimbal device component. The angles encoded in the quaternion are relative to absolute North if the flag GIMBAL_DEVICE_FLAGS_YAW_LOCK is set (roll: positive is rolling to the right, pitch: positive is pitching up, yaw is turn to the right) or relative to the vehicle heading if the flag is not set. This message should be broadcast at a low regular rate (e.g. 10Hz).",
        workInProgress = true
)
@Deprecated
public final class GimbalDeviceAttitudeStatus {
    private final int targetSystem;

    private final int targetComponent;

    private final long timeBootMs;

    private final EnumValue<GimbalDeviceFlags> flags;

    private final List<Float> q;

    private final float angularVelocityX;

    private final float angularVelocityY;

    private final float angularVelocityZ;

    private final EnumValue<GimbalDeviceErrorFlags> failureFlags;

    private GimbalDeviceAttitudeStatus(int targetSystem, int targetComponent, long timeBootMs,
            EnumValue<GimbalDeviceFlags> flags, List<Float> q, float angularVelocityX,
            float angularVelocityY, float angularVelocityZ,
            EnumValue<GimbalDeviceErrorFlags> failureFlags) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.timeBootMs = timeBootMs;
        this.flags = flags;
        this.q = q;
        this.angularVelocityX = angularVelocityX;
        this.angularVelocityY = angularVelocityY;
        this.angularVelocityZ = angularVelocityZ;
        this.failureFlags = failureFlags;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GimbalDeviceAttitudeStatus msg) {
        return builder()
                .targetSystem(msg.targetSystem)
                .targetComponent(msg.targetComponent)
                .timeBootMs(msg.timeBootMs)
                .flags(msg.flags)
                .q(msg.q)
                .angularVelocityX(msg.angularVelocityX)
                .angularVelocityY(msg.angularVelocityY)
                .angularVelocityZ(msg.angularVelocityZ)
                .failureFlags(msg.failureFlags);
    }

    /**
     * System ID 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 1,
            description = "System ID"
    )
    public final int targetSystem() {
        return this.targetSystem;
    }

    /**
     * Component ID 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 1,
            description = "Component ID"
    )
    public final int targetComponent() {
        return this.targetComponent;
    }

    /**
     * Timestamp (time since system boot). 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 4,
            description = "Timestamp (time since system boot)."
    )
    public final long timeBootMs() {
        return this.timeBootMs;
    }

    /**
     * Current gimbal flags set. 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 2,
            enumType = GimbalDeviceFlags.class,
            description = "Current gimbal flags set."
    )
    public final EnumValue<GimbalDeviceFlags> flags() {
        return this.flags;
    }

    /**
     * Quaternion components, w, x, y, z (1 0 0 0 is the null-rotation, the frame is depends on whether 
     * the flag GIMBAL_DEVICE_FLAGS_YAW_LOCK is set) 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 4,
            arraySize = 4,
            description = "Quaternion components, w, x, y, z (1 0 0 0 is the null-rotation, the frame is depends on whether the flag GIMBAL_DEVICE_FLAGS_YAW_LOCK is set)"
    )
    public final List<Float> q() {
        return this.q;
    }

    /**
     * X component of angular velocity (NaN if unknown) 
     */
    @MavlinkFieldInfo(
            position = 7,
            unitSize = 4,
            description = "X component of angular velocity (NaN if unknown)"
    )
    public final float angularVelocityX() {
        return this.angularVelocityX;
    }

    /**
     * Y component of angular velocity (NaN if unknown) 
     */
    @MavlinkFieldInfo(
            position = 8,
            unitSize = 4,
            description = "Y component of angular velocity (NaN if unknown)"
    )
    public final float angularVelocityY() {
        return this.angularVelocityY;
    }

    /**
     * Z component of angular velocity (NaN if unknown) 
     */
    @MavlinkFieldInfo(
            position = 9,
            unitSize = 4,
            description = "Z component of angular velocity (NaN if unknown)"
    )
    public final float angularVelocityZ() {
        return this.angularVelocityZ;
    }

    /**
     * Failure flags (0 for no failure) 
     */
    @MavlinkFieldInfo(
            position = 10,
            unitSize = 4,
            enumType = GimbalDeviceErrorFlags.class,
            description = "Failure flags (0 for no failure)"
    )
    public final EnumValue<GimbalDeviceErrorFlags> failureFlags() {
        return this.failureFlags;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        GimbalDeviceAttitudeStatus other = (GimbalDeviceAttitudeStatus)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(timeBootMs, other.timeBootMs)) return false;
        if (!Objects.deepEquals(flags, other.flags)) return false;
        if (!Objects.deepEquals(q, other.q)) return false;
        if (!Objects.deepEquals(angularVelocityX, other.angularVelocityX)) return false;
        if (!Objects.deepEquals(angularVelocityY, other.angularVelocityY)) return false;
        if (!Objects.deepEquals(angularVelocityZ, other.angularVelocityZ)) return false;
        if (!Objects.deepEquals(failureFlags, other.failureFlags)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(timeBootMs);
        result = 31 * result + Objects.hashCode(flags);
        result = 31 * result + Objects.hashCode(q);
        result = 31 * result + Objects.hashCode(angularVelocityX);
        result = 31 * result + Objects.hashCode(angularVelocityY);
        result = 31 * result + Objects.hashCode(angularVelocityZ);
        result = 31 * result + Objects.hashCode(failureFlags);
        return result;
    }

    @Override
    public String toString() {
        return "GimbalDeviceAttitudeStatus{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", timeBootMs=" + timeBootMs
                 + ", flags=" + flags
                 + ", q=" + q
                 + ", angularVelocityX=" + angularVelocityX
                 + ", angularVelocityY=" + angularVelocityY
                 + ", angularVelocityZ=" + angularVelocityZ
                 + ", failureFlags=" + failureFlags + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private long timeBootMs;

        private EnumValue<GimbalDeviceFlags> flags;

        private List<Float> q;

        private float angularVelocityX;

        private float angularVelocityY;

        private float angularVelocityZ;

        private EnumValue<GimbalDeviceErrorFlags> failureFlags;

        /**
         * System ID 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 1,
                description = "System ID"
        )
        public final Builder targetSystem(int targetSystem) {
            this.targetSystem = targetSystem;
            return this;
        }

        /**
         * Component ID 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 1,
                description = "Component ID"
        )
        public final Builder targetComponent(int targetComponent) {
            this.targetComponent = targetComponent;
            return this;
        }

        /**
         * Timestamp (time since system boot). 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 4,
                description = "Timestamp (time since system boot)."
        )
        public final Builder timeBootMs(long timeBootMs) {
            this.timeBootMs = timeBootMs;
            return this;
        }

        /**
         * Current gimbal flags set. 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 2,
                enumType = GimbalDeviceFlags.class,
                description = "Current gimbal flags set."
        )
        public final Builder flags(EnumValue<GimbalDeviceFlags> flags) {
            this.flags = flags;
            return this;
        }

        /**
         * Current gimbal flags set. 
         */
        public final Builder flags(GimbalDeviceFlags entry) {
            return flags(EnumValue.of(entry));
        }

        /**
         * Current gimbal flags set. 
         */
        public final Builder flags(Enum... flags) {
            return flags(EnumValue.create(flags));
        }

        /**
         * Current gimbal flags set. 
         */
        public final Builder flags(Collection<Enum> flags) {
            return flags(EnumValue.create(flags));
        }

        /**
         * Quaternion components, w, x, y, z (1 0 0 0 is the null-rotation, the frame is depends on whether 
         * the flag GIMBAL_DEVICE_FLAGS_YAW_LOCK is set) 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 4,
                arraySize = 4,
                description = "Quaternion components, w, x, y, z (1 0 0 0 is the null-rotation, the frame is depends on whether the flag GIMBAL_DEVICE_FLAGS_YAW_LOCK is set)"
        )
        public final Builder q(List<Float> q) {
            this.q = q;
            return this;
        }

        /**
         * X component of angular velocity (NaN if unknown) 
         */
        @MavlinkFieldInfo(
                position = 7,
                unitSize = 4,
                description = "X component of angular velocity (NaN if unknown)"
        )
        public final Builder angularVelocityX(float angularVelocityX) {
            this.angularVelocityX = angularVelocityX;
            return this;
        }

        /**
         * Y component of angular velocity (NaN if unknown) 
         */
        @MavlinkFieldInfo(
                position = 8,
                unitSize = 4,
                description = "Y component of angular velocity (NaN if unknown)"
        )
        public final Builder angularVelocityY(float angularVelocityY) {
            this.angularVelocityY = angularVelocityY;
            return this;
        }

        /**
         * Z component of angular velocity (NaN if unknown) 
         */
        @MavlinkFieldInfo(
                position = 9,
                unitSize = 4,
                description = "Z component of angular velocity (NaN if unknown)"
        )
        public final Builder angularVelocityZ(float angularVelocityZ) {
            this.angularVelocityZ = angularVelocityZ;
            return this;
        }

        /**
         * Failure flags (0 for no failure) 
         */
        @MavlinkFieldInfo(
                position = 10,
                unitSize = 4,
                enumType = GimbalDeviceErrorFlags.class,
                description = "Failure flags (0 for no failure)"
        )
        public final Builder failureFlags(EnumValue<GimbalDeviceErrorFlags> failureFlags) {
            this.failureFlags = failureFlags;
            return this;
        }

        /**
         * Failure flags (0 for no failure) 
         */
        public final Builder failureFlags(GimbalDeviceErrorFlags entry) {
            return failureFlags(EnumValue.of(entry));
        }

        /**
         * Failure flags (0 for no failure) 
         */
        public final Builder failureFlags(Enum... flags) {
            return failureFlags(EnumValue.create(flags));
        }

        /**
         * Failure flags (0 for no failure) 
         */
        public final Builder failureFlags(Collection<Enum> flags) {
            return failureFlags(EnumValue.create(flags));
        }

        public final GimbalDeviceAttitudeStatus build() {
            return new GimbalDeviceAttitudeStatus(targetSystem, targetComponent, timeBootMs, flags, q, angularVelocityX, angularVelocityY, angularVelocityZ, failureFlags);
        }
    }
}
