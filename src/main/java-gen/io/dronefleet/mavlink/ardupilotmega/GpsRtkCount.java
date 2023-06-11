package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Genral metadata of RTK message for injecting into the onboard GPS (used for DGPS). 
 */
@MavlinkMessageInfo(
        id = 12300,
        crc = 50,
        description = "Genral metadata of RTK message for injecting into the onboard GPS (used for DGPS)."
)
public final class GpsRtkCount {
    private final long sequenceId;

    private final int totalLength;

    private final long crc;

    private GpsRtkCount(long sequenceId, int totalLength, long crc) {
        this.sequenceId = sequenceId;
        this.totalLength = totalLength;
        this.crc = crc;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GpsRtkCount msg) {
        return builder()
                .sequenceId(msg.sequenceId)
                .totalLength(msg.totalLength)
                .crc(msg.crc);
    }

    /**
     * ID of the inner RTK message. 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 4,
            description = "ID of the inner RTK message."
    )
    public final long sequenceId() {
        return this.sequenceId;
    }

    /**
     * Total data length. 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 2,
            description = "Total data length."
    )
    public final int totalLength() {
        return this.totalLength;
    }

    /**
     * CRC32 of the payload. 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 4,
            description = "CRC32 of the payload."
    )
    public final long crc() {
        return this.crc;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        GpsRtkCount other = (GpsRtkCount)o;
        if (!Objects.deepEquals(sequenceId, other.sequenceId)) return false;
        if (!Objects.deepEquals(totalLength, other.totalLength)) return false;
        if (!Objects.deepEquals(crc, other.crc)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(sequenceId);
        result = 31 * result + Objects.hashCode(totalLength);
        result = 31 * result + Objects.hashCode(crc);
        return result;
    }

    @Override
    public String toString() {
        return "GpsRtkCount{sequenceId=" + sequenceId
                 + ", totalLength=" + totalLength
                 + ", crc=" + crc + "}";
    }

    public static final class Builder {
        private long sequenceId;

        private int totalLength;

        private long crc;

        /**
         * ID of the inner RTK message. 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 4,
                description = "ID of the inner RTK message."
        )
        public final Builder sequenceId(long sequenceId) {
            this.sequenceId = sequenceId;
            return this;
        }

        /**
         * Total data length. 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 2,
                description = "Total data length."
        )
        public final Builder totalLength(int totalLength) {
            this.totalLength = totalLength;
            return this;
        }

        /**
         * CRC32 of the payload. 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 4,
                description = "CRC32 of the payload."
        )
        public final Builder crc(long crc) {
            this.crc = crc;
            return this;
        }

        public final GpsRtkCount build() {
            return new GpsRtkCount(sequenceId, totalLength, crc);
        }
    }
}
