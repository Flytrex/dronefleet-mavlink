package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.HasTransmissionId;
import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import io.dronefleet.mavlink.util.EnumValue;
import java.lang.Deprecated;
import java.lang.Enum;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collection;
import java.util.Objects;

/**
 * Set the system mode, as defined by enum {@link io.dronefleet.mavlink.common.MavMode MAV_MODE}. There is no target component id as the mode is by 
 * definition for the overall aircraft, not only for one component. 
 * @deprecated Since 2015-12, replaced by MAV_CMD_DO_SET_MODE. Use {@link io.dronefleet.mavlink.common.CommandLong COMMAND_LONG} with 
 * MAV_CMD_DO_SET_MODE instead 
 */
@MavlinkMessageInfo(
        id = 11,
        crc = 89,
        description = "Set the system mode, as defined by enum MAV_MODE. There is no target component id as the mode is by definition for the overall aircraft, not only for one component."
)
@Deprecated
public final class SetMode implements HasTransmissionId<SetMode> {
    private final int targetSystem;

    private final EnumValue<MavMode> baseMode;

    private final long customMode;

    private final int tid;

    private SetMode(int targetSystem, EnumValue<MavMode> baseMode, long customMode, int tid) {
        this.targetSystem = targetSystem;
        this.baseMode = baseMode;
        this.customMode = customMode;
        this.tid = tid;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SetMode msg) {
        return builder()
                .targetSystem(msg.targetSystem)
                .baseMode(msg.baseMode)
                .customMode(msg.customMode)
                .tid(msg.tid);
    }

    /**
     * The system setting the mode 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 1,
            description = "The system setting the mode"
    )
    public final int targetSystem() {
        return this.targetSystem;
    }

    /**
     * The new base mode. 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 1,
            enumType = MavMode.class,
            description = "The new base mode."
    )
    public final EnumValue<MavMode> baseMode() {
        return this.baseMode;
    }

    /**
     * The new autopilot-specific mode. This field can be ignored by an autopilot. 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 4,
            description = "The new autopilot-specific mode. This field can be ignored by an autopilot."
    )
    public final long customMode() {
        return this.customMode;
    }

    /**
     * Transmission id. 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 1,
            extension = true,
            description = "Transmission id."
    )
    public final int tid() {
        return this.tid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        SetMode other = (SetMode)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(baseMode, other.baseMode)) return false;
        if (!Objects.deepEquals(customMode, other.customMode)) return false;
        if (!Objects.deepEquals(tid, other.tid)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(baseMode);
        result = 31 * result + Objects.hashCode(customMode);
        result = 31 * result + Objects.hashCode(tid);
        return result;
    }

    @Override
    public String toString() {
        return "SetMode{targetSystem=" + targetSystem
                 + ", baseMode=" + baseMode
                 + ", customMode=" + customMode
                 + ", tid=" + tid + "}";
    }

    @Override
    public SetMode withTransmissionId(int tid) {
        return builder(this).tid(tid).build();
    }

    public static final class Builder {
        private int targetSystem;

        private EnumValue<MavMode> baseMode;

        private long customMode;

        private int tid;

        /**
         * The system setting the mode 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 1,
                description = "The system setting the mode"
        )
        public final Builder targetSystem(int targetSystem) {
            this.targetSystem = targetSystem;
            return this;
        }

        /**
         * The new base mode. 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 1,
                enumType = MavMode.class,
                description = "The new base mode."
        )
        public final Builder baseMode(EnumValue<MavMode> baseMode) {
            this.baseMode = baseMode;
            return this;
        }

        /**
         * The new base mode. 
         */
        public final Builder baseMode(MavMode entry) {
            return baseMode(EnumValue.of(entry));
        }

        /**
         * The new base mode. 
         */
        public final Builder baseMode(Enum... flags) {
            return baseMode(EnumValue.create(flags));
        }

        /**
         * The new base mode. 
         */
        public final Builder baseMode(Collection<Enum> flags) {
            return baseMode(EnumValue.create(flags));
        }

        /**
         * The new autopilot-specific mode. This field can be ignored by an autopilot. 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 4,
                description = "The new autopilot-specific mode. This field can be ignored by an autopilot."
        )
        public final Builder customMode(long customMode) {
            this.customMode = customMode;
            return this;
        }

        /**
         * Transmission id. 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 1,
                extension = true,
                description = "Transmission id."
        )
        public final Builder tid(int tid) {
            this.tid = tid;
            return this;
        }

        public final SetMode build() {
            return new SetMode(targetSystem, baseMode, customMode, tid);
        }
    }
}
