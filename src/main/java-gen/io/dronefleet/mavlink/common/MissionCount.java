package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.HasTransmissionId;
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
 * This message is emitted as response to {@link io.dronefleet.mavlink.common.MissionRequestList MISSION_REQUEST_LIST} by the MAV and to initiate a write 
 * transaction. The GCS can then request the individual mission item based on the knowledge of the 
 * total number of waypoints. 
 */
@MavlinkMessageInfo(
        id = 44,
        crc = 221,
        description = "This message is emitted as response to MISSION_REQUEST_LIST by the MAV and to initiate a write transaction. The GCS can then request the individual mission item based on the knowledge of the total number of waypoints."
)
public final class MissionCount implements HasTransmissionId<MissionCount> {
    private final int targetSystem;

    private final int targetComponent;

    private final int count;

    private final EnumValue<MavMissionType> missionType;

    private final int tid;

    private MissionCount(int targetSystem, int targetComponent, int count,
            EnumValue<MavMissionType> missionType, int tid) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.count = count;
        this.missionType = missionType;
        this.tid = tid;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MissionCount msg) {
        return builder()
                .targetSystem(msg.targetSystem)
                .targetComponent(msg.targetComponent)
                .count(msg.count)
                .missionType(msg.missionType)
                .tid(msg.tid);
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
     * Number of mission items in the sequence 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 2,
            description = "Number of mission items in the sequence"
    )
    public final int count() {
        return this.count;
    }

    /**
     * Mission type. 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 1,
            enumType = MavMissionType.class,
            extension = true,
            description = "Mission type."
    )
    public final EnumValue<MavMissionType> missionType() {
        return this.missionType;
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
        MissionCount other = (MissionCount)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(count, other.count)) return false;
        if (!Objects.deepEquals(missionType, other.missionType)) return false;
        if (!Objects.deepEquals(tid, other.tid)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(count);
        result = 31 * result + Objects.hashCode(missionType);
        result = 31 * result + Objects.hashCode(tid);
        return result;
    }

    @Override
    public String toString() {
        return "MissionCount{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", count=" + count
                 + ", missionType=" + missionType
                 + ", tid=" + tid + "}";
    }

    @Override
    public MissionCount withTransmissionId(int tid) {
        return builder(this).tid(tid).build();
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private int count;

        private EnumValue<MavMissionType> missionType;

        private int tid;

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
         * Number of mission items in the sequence 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 2,
                description = "Number of mission items in the sequence"
        )
        public final Builder count(int count) {
            this.count = count;
            return this;
        }

        /**
         * Mission type. 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 1,
                enumType = MavMissionType.class,
                extension = true,
                description = "Mission type."
        )
        public final Builder missionType(EnumValue<MavMissionType> missionType) {
            this.missionType = missionType;
            return this;
        }

        /**
         * Mission type. 
         */
        public final Builder missionType(MavMissionType entry) {
            return missionType(EnumValue.of(entry));
        }

        /**
         * Mission type. 
         */
        public final Builder missionType(Enum... flags) {
            return missionType(EnumValue.create(flags));
        }

        /**
         * Mission type. 
         */
        public final Builder missionType(Collection<Enum> flags) {
            return missionType(EnumValue.create(flags));
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

        public final MissionCount build() {
            return new MissionCount(targetSystem, targetComponent, count, missionType, tid);
        }
    }
}
