package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import io.dronefleet.mavlink.util.EnumValue;
import java.lang.Enum;
import java.lang.Float;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.math.BigInteger;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/**
 * Low level message containing autopilot state relevant for a gimbal device. This message is to 
 * be sent from the gimbal manager to the gimbal device component. The data of this message server 
 * for the gimbal's estimator corrections in particular horizon compensation, as well as the 
 * autopilot's control intention e.g. feed forward angular control in z-axis. 
 */
@MavlinkMessageInfo(
        id = 286,
        crc = 210,
        description = "Low level message containing autopilot state relevant for a gimbal device. This message is to be sent from the gimbal manager to the gimbal device component. The data of this message server for the gimbal's estimator corrections in particular horizon compensation, as well as the autopilot's control intention e.g. feed forward angular control in z-axis."
)
public final class AutopilotStateForGimbalDevice {
    private final int targetSystem;

    private final int targetComponent;

    private final BigInteger timeBootUs;

    private final List<Float> q;

    private final long qEstimatedDelayUs;

    private final float vx;

    private final float vy;

    private final float vz;

    private final long vEstimatedDelayUs;

    private final float feedForwardAngularVelocityZ;

    private final EnumValue<EstimatorStatusFlags> estimatorStatus;

    private final EnumValue<MavLandedState> landedState;

    private AutopilotStateForGimbalDevice(int targetSystem, int targetComponent,
            BigInteger timeBootUs, List<Float> q, long qEstimatedDelayUs, float vx, float vy,
            float vz, long vEstimatedDelayUs, float feedForwardAngularVelocityZ,
            EnumValue<EstimatorStatusFlags> estimatorStatus,
            EnumValue<MavLandedState> landedState) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.timeBootUs = timeBootUs;
        this.q = q;
        this.qEstimatedDelayUs = qEstimatedDelayUs;
        this.vx = vx;
        this.vy = vy;
        this.vz = vz;
        this.vEstimatedDelayUs = vEstimatedDelayUs;
        this.feedForwardAngularVelocityZ = feedForwardAngularVelocityZ;
        this.estimatorStatus = estimatorStatus;
        this.landedState = landedState;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutopilotStateForGimbalDevice msg) {
        return builder()
                .targetSystem(msg.targetSystem)
                .targetComponent(msg.targetComponent)
                .timeBootUs(msg.timeBootUs)
                .q(msg.q)
                .qEstimatedDelayUs(msg.qEstimatedDelayUs)
                .vx(msg.vx)
                .vy(msg.vy)
                .vz(msg.vz)
                .vEstimatedDelayUs(msg.vEstimatedDelayUs)
                .feedForwardAngularVelocityZ(msg.feedForwardAngularVelocityZ)
                .estimatorStatus(msg.estimatorStatus)
                .landedState(msg.landedState);
    }

    /**
     * System ID 
     */
    @MavlinkFieldInfo(
            position = 1,
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
            position = 2,
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
            position = 3,
            unitSize = 8,
            description = "Timestamp (time since system boot)."
    )
    public final BigInteger timeBootUs() {
        return this.timeBootUs;
    }

    /**
     * Quaternion components of autopilot attitude: w, x, y, z (1 0 0 0 is the null-rotation, Hamilton 
     * convention). 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 4,
            arraySize = 4,
            description = "Quaternion components of autopilot attitude: w, x, y, z (1 0 0 0 is the null-rotation, Hamilton convention)."
    )
    public final List<Float> q() {
        return this.q;
    }

    /**
     * Estimated delay of the attitude data. 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 4,
            description = "Estimated delay of the attitude data."
    )
    public final long qEstimatedDelayUs() {
        return this.qEstimatedDelayUs;
    }

    /**
     * X Speed in NED (North, East, Down). 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 4,
            description = "X Speed in NED (North, East, Down)."
    )
    public final float vx() {
        return this.vx;
    }

    /**
     * Y Speed in NED (North, East, Down). 
     */
    @MavlinkFieldInfo(
            position = 7,
            unitSize = 4,
            description = "Y Speed in NED (North, East, Down)."
    )
    public final float vy() {
        return this.vy;
    }

    /**
     * Z Speed in NED (North, East, Down). 
     */
    @MavlinkFieldInfo(
            position = 8,
            unitSize = 4,
            description = "Z Speed in NED (North, East, Down)."
    )
    public final float vz() {
        return this.vz;
    }

    /**
     * Estimated delay of the speed data. 
     */
    @MavlinkFieldInfo(
            position = 9,
            unitSize = 4,
            description = "Estimated delay of the speed data."
    )
    public final long vEstimatedDelayUs() {
        return this.vEstimatedDelayUs;
    }

    /**
     * Feed forward Z component of angular velocity, positive is yawing to the right, NaN to be 
     * ignored. This is to indicate if the autopilot is actively yawing. 
     */
    @MavlinkFieldInfo(
            position = 10,
            unitSize = 4,
            description = "Feed forward Z component of angular velocity, positive is yawing to the right, NaN to be ignored. This is to indicate if the autopilot is actively yawing."
    )
    public final float feedForwardAngularVelocityZ() {
        return this.feedForwardAngularVelocityZ;
    }

    /**
     * Bitmap indicating which estimator outputs are valid. 
     */
    @MavlinkFieldInfo(
            position = 11,
            unitSize = 2,
            enumType = EstimatorStatusFlags.class,
            description = "Bitmap indicating which estimator outputs are valid."
    )
    public final EnumValue<EstimatorStatusFlags> estimatorStatus() {
        return this.estimatorStatus;
    }

    /**
     * The landed state. Is set to MAV_LANDED_STATE_UNDEFINED if landed state is unknown. 
     */
    @MavlinkFieldInfo(
            position = 12,
            unitSize = 1,
            enumType = MavLandedState.class,
            description = "The landed state. Is set to MAV_LANDED_STATE_UNDEFINED if landed state is unknown."
    )
    public final EnumValue<MavLandedState> landedState() {
        return this.landedState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        AutopilotStateForGimbalDevice other = (AutopilotStateForGimbalDevice)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(timeBootUs, other.timeBootUs)) return false;
        if (!Objects.deepEquals(q, other.q)) return false;
        if (!Objects.deepEquals(qEstimatedDelayUs, other.qEstimatedDelayUs)) return false;
        if (!Objects.deepEquals(vx, other.vx)) return false;
        if (!Objects.deepEquals(vy, other.vy)) return false;
        if (!Objects.deepEquals(vz, other.vz)) return false;
        if (!Objects.deepEquals(vEstimatedDelayUs, other.vEstimatedDelayUs)) return false;
        if (!Objects.deepEquals(feedForwardAngularVelocityZ, other.feedForwardAngularVelocityZ)) return false;
        if (!Objects.deepEquals(estimatorStatus, other.estimatorStatus)) return false;
        if (!Objects.deepEquals(landedState, other.landedState)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(timeBootUs);
        result = 31 * result + Objects.hashCode(q);
        result = 31 * result + Objects.hashCode(qEstimatedDelayUs);
        result = 31 * result + Objects.hashCode(vx);
        result = 31 * result + Objects.hashCode(vy);
        result = 31 * result + Objects.hashCode(vz);
        result = 31 * result + Objects.hashCode(vEstimatedDelayUs);
        result = 31 * result + Objects.hashCode(feedForwardAngularVelocityZ);
        result = 31 * result + Objects.hashCode(estimatorStatus);
        result = 31 * result + Objects.hashCode(landedState);
        return result;
    }

    @Override
    public String toString() {
        return "AutopilotStateForGimbalDevice{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", timeBootUs=" + timeBootUs
                 + ", q=" + q
                 + ", qEstimatedDelayUs=" + qEstimatedDelayUs
                 + ", vx=" + vx
                 + ", vy=" + vy
                 + ", vz=" + vz
                 + ", vEstimatedDelayUs=" + vEstimatedDelayUs
                 + ", feedForwardAngularVelocityZ=" + feedForwardAngularVelocityZ
                 + ", estimatorStatus=" + estimatorStatus
                 + ", landedState=" + landedState + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private BigInteger timeBootUs;

        private List<Float> q;

        private long qEstimatedDelayUs;

        private float vx;

        private float vy;

        private float vz;

        private long vEstimatedDelayUs;

        private float feedForwardAngularVelocityZ;

        private EnumValue<EstimatorStatusFlags> estimatorStatus;

        private EnumValue<MavLandedState> landedState;

        /**
         * System ID 
         */
        @MavlinkFieldInfo(
                position = 1,
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
                position = 2,
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
                position = 3,
                unitSize = 8,
                description = "Timestamp (time since system boot)."
        )
        public final Builder timeBootUs(BigInteger timeBootUs) {
            this.timeBootUs = timeBootUs;
            return this;
        }

        /**
         * Quaternion components of autopilot attitude: w, x, y, z (1 0 0 0 is the null-rotation, Hamilton 
         * convention). 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 4,
                arraySize = 4,
                description = "Quaternion components of autopilot attitude: w, x, y, z (1 0 0 0 is the null-rotation, Hamilton convention)."
        )
        public final Builder q(List<Float> q) {
            this.q = q;
            return this;
        }

        /**
         * Estimated delay of the attitude data. 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 4,
                description = "Estimated delay of the attitude data."
        )
        public final Builder qEstimatedDelayUs(long qEstimatedDelayUs) {
            this.qEstimatedDelayUs = qEstimatedDelayUs;
            return this;
        }

        /**
         * X Speed in NED (North, East, Down). 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 4,
                description = "X Speed in NED (North, East, Down)."
        )
        public final Builder vx(float vx) {
            this.vx = vx;
            return this;
        }

        /**
         * Y Speed in NED (North, East, Down). 
         */
        @MavlinkFieldInfo(
                position = 7,
                unitSize = 4,
                description = "Y Speed in NED (North, East, Down)."
        )
        public final Builder vy(float vy) {
            this.vy = vy;
            return this;
        }

        /**
         * Z Speed in NED (North, East, Down). 
         */
        @MavlinkFieldInfo(
                position = 8,
                unitSize = 4,
                description = "Z Speed in NED (North, East, Down)."
        )
        public final Builder vz(float vz) {
            this.vz = vz;
            return this;
        }

        /**
         * Estimated delay of the speed data. 
         */
        @MavlinkFieldInfo(
                position = 9,
                unitSize = 4,
                description = "Estimated delay of the speed data."
        )
        public final Builder vEstimatedDelayUs(long vEstimatedDelayUs) {
            this.vEstimatedDelayUs = vEstimatedDelayUs;
            return this;
        }

        /**
         * Feed forward Z component of angular velocity, positive is yawing to the right, NaN to be 
         * ignored. This is to indicate if the autopilot is actively yawing. 
         */
        @MavlinkFieldInfo(
                position = 10,
                unitSize = 4,
                description = "Feed forward Z component of angular velocity, positive is yawing to the right, NaN to be ignored. This is to indicate if the autopilot is actively yawing."
        )
        public final Builder feedForwardAngularVelocityZ(float feedForwardAngularVelocityZ) {
            this.feedForwardAngularVelocityZ = feedForwardAngularVelocityZ;
            return this;
        }

        /**
         * Bitmap indicating which estimator outputs are valid. 
         */
        @MavlinkFieldInfo(
                position = 11,
                unitSize = 2,
                enumType = EstimatorStatusFlags.class,
                description = "Bitmap indicating which estimator outputs are valid."
        )
        public final Builder estimatorStatus(EnumValue<EstimatorStatusFlags> estimatorStatus) {
            this.estimatorStatus = estimatorStatus;
            return this;
        }

        /**
         * Bitmap indicating which estimator outputs are valid. 
         */
        public final Builder estimatorStatus(EstimatorStatusFlags entry) {
            return estimatorStatus(EnumValue.of(entry));
        }

        /**
         * Bitmap indicating which estimator outputs are valid. 
         */
        public final Builder estimatorStatus(Enum... flags) {
            return estimatorStatus(EnumValue.create(flags));
        }

        /**
         * Bitmap indicating which estimator outputs are valid. 
         */
        public final Builder estimatorStatus(Collection<Enum> flags) {
            return estimatorStatus(EnumValue.create(flags));
        }

        /**
         * The landed state. Is set to MAV_LANDED_STATE_UNDEFINED if landed state is unknown. 
         */
        @MavlinkFieldInfo(
                position = 12,
                unitSize = 1,
                enumType = MavLandedState.class,
                description = "The landed state. Is set to MAV_LANDED_STATE_UNDEFINED if landed state is unknown."
        )
        public final Builder landedState(EnumValue<MavLandedState> landedState) {
            this.landedState = landedState;
            return this;
        }

        /**
         * The landed state. Is set to MAV_LANDED_STATE_UNDEFINED if landed state is unknown. 
         */
        public final Builder landedState(MavLandedState entry) {
            return landedState(EnumValue.of(entry));
        }

        /**
         * The landed state. Is set to MAV_LANDED_STATE_UNDEFINED if landed state is unknown. 
         */
        public final Builder landedState(Enum... flags) {
            return landedState(EnumValue.create(flags));
        }

        /**
         * The landed state. Is set to MAV_LANDED_STATE_UNDEFINED if landed state is unknown. 
         */
        public final Builder landedState(Collection<Enum> flags) {
            return landedState(EnumValue.create(flags));
        }

        public final AutopilotStateForGimbalDevice build() {
            return new AutopilotStateForGimbalDevice(targetSystem, targetComponent, timeBootUs, q, qEstimatedDelayUs, vx, vy, vz, vEstimatedDelayUs, feedForwardAngularVelocityZ, estimatorStatus, landedState);
        }
    }
}
