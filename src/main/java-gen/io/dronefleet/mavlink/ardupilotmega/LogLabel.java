package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Reply to {@link io.dronefleet.mavlink.ardupilotmega.LogRequestLabelList LOG_REQUEST_LABEL_LIST} 
 */
@MavlinkMessageInfo(
        id = 12103,
        crc = 184,
        description = "Reply to LOG_REQUEST_LABEL_LIST"
)
public final class LogLabel {
    private final int labelIndex;

    private final String label;

    private final int numLogs;

    private LogLabel(int labelIndex, String label, int numLogs) {
        this.labelIndex = labelIndex;
        this.label = label;
        this.numLogs = numLogs;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Log index within the list of {@link io.dronefleet.mavlink.ardupilotmega.LogLabel LOG_LABEL} messages been sent in a batch 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 2,
            description = "Log index within the list of LOG_LABEL messages been sent in a batch"
    )
    public final int labelIndex() {
        return this.labelIndex;
    }

    /**
     * Log label, null terminated 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 1,
            arraySize = 50,
            description = "Log label, null terminated"
    )
    public final String label() {
        return this.label;
    }

    /**
     * Total number of labeled logs 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 2,
            description = "Total number of labeled logs"
    )
    public final int numLogs() {
        return this.numLogs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        LogLabel other = (LogLabel)o;
        if (!Objects.deepEquals(labelIndex, other.labelIndex)) return false;
        if (!Objects.deepEquals(label, other.label)) return false;
        if (!Objects.deepEquals(numLogs, other.numLogs)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(labelIndex);
        result = 31 * result + Objects.hashCode(label);
        result = 31 * result + Objects.hashCode(numLogs);
        return result;
    }

    @Override
    public String toString() {
        return "LogLabel{labelIndex=" + labelIndex
                 + ", label=" + label
                 + ", numLogs=" + numLogs + "}";
    }

    public static final class Builder {
        private int labelIndex;

        private String label;

        private int numLogs;

        /**
         * Log index within the list of {@link io.dronefleet.mavlink.ardupilotmega.LogLabel LOG_LABEL} messages been sent in a batch 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 2,
                description = "Log index within the list of LOG_LABEL messages been sent in a batch"
        )
        public final Builder labelIndex(int labelIndex) {
            this.labelIndex = labelIndex;
            return this;
        }

        /**
         * Log label, null terminated 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 1,
                arraySize = 50,
                description = "Log label, null terminated"
        )
        public final Builder label(String label) {
            this.label = label;
            return this;
        }

        /**
         * Total number of labeled logs 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 2,
                description = "Total number of labeled logs"
        )
        public final Builder numLogs(int numLogs) {
            this.numLogs = numLogs;
            return this;
        }

        public final LogLabel build() {
            return new LogLabel(labelIndex, label, numLogs);
        }
    }
}
