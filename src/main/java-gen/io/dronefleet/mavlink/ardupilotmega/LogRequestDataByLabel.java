package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Request a chunk of a log, by a preset label 
 */
@MavlinkMessageInfo(
        id = 12101,
        crc = 221,
        description = "Request a chunk of a log, by a preset label"
)
public final class LogRequestDataByLabel {
    private final int targetSystem;

    private final int targetComponent;

    private final String label;

    private final long ofs;

    private final long count;

    private LogRequestDataByLabel(int targetSystem, int targetComponent, String label, long ofs,
            long count) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.label = label;
        this.ofs = ofs;
        this.count = count;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
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
     * Log label (preset with {@link io.dronefleet.mavlink.ardupilotmega.SetLogLabel SET_LOG_LABEL}), NULL terminated 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 1,
            arraySize = 50,
            description = "Log label (preset with SET_LOG_LABEL), NULL terminated"
    )
    public final String label() {
        return this.label;
    }

    /**
     * Offset into the log 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 4,
            description = "Offset into the log"
    )
    public final long ofs() {
        return this.ofs;
    }

    /**
     * Number of bytes 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 4,
            description = "Number of bytes"
    )
    public final long count() {
        return this.count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        LogRequestDataByLabel other = (LogRequestDataByLabel)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(label, other.label)) return false;
        if (!Objects.deepEquals(ofs, other.ofs)) return false;
        if (!Objects.deepEquals(count, other.count)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(label);
        result = 31 * result + Objects.hashCode(ofs);
        result = 31 * result + Objects.hashCode(count);
        return result;
    }

    @Override
    public String toString() {
        return "LogRequestDataByLabel{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", label=" + label
                 + ", ofs=" + ofs
                 + ", count=" + count + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private String label;

        private long ofs;

        private long count;

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
         * Log label (preset with {@link io.dronefleet.mavlink.ardupilotmega.SetLogLabel SET_LOG_LABEL}), NULL terminated 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 1,
                arraySize = 50,
                description = "Log label (preset with SET_LOG_LABEL), NULL terminated"
        )
        public final Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * Offset into the log 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 4,
                description = "Offset into the log"
        )
        public final Builder ofs(long ofs) {
            this.ofs = ofs;
            return this;
        }

        /**
         * Number of bytes 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 4,
                description = "Number of bytes"
        )
        public final Builder count(long count) {
            this.count = count;
            return this;
        }

        public final LogRequestDataByLabel build() {
            return new LogRequestDataByLabel(targetSystem, targetComponent, label, ofs, count);
        }
    }
}
