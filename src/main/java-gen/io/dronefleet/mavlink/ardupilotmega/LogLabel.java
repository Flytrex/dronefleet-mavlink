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
        crc = 13,
        description = "Reply to LOG_REQUEST_LABEL_LIST"
)
public final class LogLabel {
    private final int labelIndex;

    private final String label;

    private final int numLogs;

    private final int logNum;

    private final long timeUtc;

    private final long size;

    private LogLabel(int labelIndex, String label, int numLogs, int logNum, long timeUtc,
            long size) {
        this.labelIndex = labelIndex;
        this.label = label;
        this.numLogs = numLogs;
        this.logNum = logNum;
        this.timeUtc = timeUtc;
        this.size = size;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LogLabel msg) {
        return builder()
                .labelIndex(msg.labelIndex)
                .label(msg.label)
                .numLogs(msg.numLogs)
                .logNum(msg.logNum)
                .timeUtc(msg.timeUtc)
                .size(msg.size);
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

    /**
     * Log num 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 2,
            description = "Log num"
    )
    public final int logNum() {
        return this.logNum;
    }

    /**
     * UTC timestamp of log since 1970, or 0 if not available 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 4,
            description = "UTC timestamp of log since 1970, or 0 if not available"
    )
    public final long timeUtc() {
        return this.timeUtc;
    }

    /**
     * Size of the log (may be approximate) 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 4,
            description = "Size of the log (may be approximate)"
    )
    public final long size() {
        return this.size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        LogLabel other = (LogLabel)o;
        if (!Objects.deepEquals(labelIndex, other.labelIndex)) return false;
        if (!Objects.deepEquals(label, other.label)) return false;
        if (!Objects.deepEquals(numLogs, other.numLogs)) return false;
        if (!Objects.deepEquals(logNum, other.logNum)) return false;
        if (!Objects.deepEquals(timeUtc, other.timeUtc)) return false;
        if (!Objects.deepEquals(size, other.size)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(labelIndex);
        result = 31 * result + Objects.hashCode(label);
        result = 31 * result + Objects.hashCode(numLogs);
        result = 31 * result + Objects.hashCode(logNum);
        result = 31 * result + Objects.hashCode(timeUtc);
        result = 31 * result + Objects.hashCode(size);
        return result;
    }

    @Override
    public String toString() {
        return "LogLabel{labelIndex=" + labelIndex
                 + ", label=" + label
                 + ", numLogs=" + numLogs
                 + ", logNum=" + logNum
                 + ", timeUtc=" + timeUtc
                 + ", size=" + size + "}";
    }

    public static final class Builder {
        private int labelIndex;

        private String label;

        private int numLogs;

        private int logNum;

        private long timeUtc;

        private long size;

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

        /**
         * Log num 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 2,
                description = "Log num"
        )
        public final Builder logNum(int logNum) {
            this.logNum = logNum;
            return this;
        }

        /**
         * UTC timestamp of log since 1970, or 0 if not available 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 4,
                description = "UTC timestamp of log since 1970, or 0 if not available"
        )
        public final Builder timeUtc(long timeUtc) {
            this.timeUtc = timeUtc;
            return this;
        }

        /**
         * Size of the log (may be approximate) 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 4,
                description = "Size of the log (may be approximate)"
        )
        public final Builder size(long size) {
            this.size = size;
            return this;
        }

        public final LogLabel build() {
            return new LogLabel(labelIndex, label, numLogs, logNum, timeUtc, size);
        }
    }
}
