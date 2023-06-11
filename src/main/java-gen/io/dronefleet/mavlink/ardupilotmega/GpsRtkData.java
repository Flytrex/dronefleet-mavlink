package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * RTK message for injecting into the onboard GPS (used for DGPS). 
 */
@MavlinkMessageInfo(
        id = 12301,
        crc = 145,
        description = "RTK message for injecting into the onboard GPS (used for DGPS)."
)
public final class GpsRtkData {
    private final long sequenceId;

    private final int fragmentId;

    private final byte[] data;

    private GpsRtkData(long sequenceId, int fragmentId, byte[] data) {
        this.sequenceId = sequenceId;
        this.fragmentId = fragmentId;
        this.data = data;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GpsRtkData msg) {
        return builder()
                .sequenceId(msg.sequenceId)
                .fragmentId(msg.fragmentId)
                .data(msg.data);
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
     * ID of an RTK message fragment. 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 1,
            description = "ID of an RTK message fragment."
    )
    public final int fragmentId() {
        return this.fragmentId;
    }

    /**
     * RTK message payload (may be fragmented). 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 1,
            arraySize = 240,
            description = "RTK message payload (may be fragmented)."
    )
    public final byte[] data() {
        return this.data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        GpsRtkData other = (GpsRtkData)o;
        if (!Objects.deepEquals(sequenceId, other.sequenceId)) return false;
        if (!Objects.deepEquals(fragmentId, other.fragmentId)) return false;
        if (!Objects.deepEquals(data, other.data)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(sequenceId);
        result = 31 * result + Objects.hashCode(fragmentId);
        result = 31 * result + Objects.hashCode(data);
        return result;
    }

    @Override
    public String toString() {
        return "GpsRtkData{sequenceId=" + sequenceId
                 + ", fragmentId=" + fragmentId
                 + ", data=" + data + "}";
    }

    public static final class Builder {
        private long sequenceId;

        private int fragmentId;

        private byte[] data;

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
         * ID of an RTK message fragment. 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 1,
                description = "ID of an RTK message fragment."
        )
        public final Builder fragmentId(int fragmentId) {
            this.fragmentId = fragmentId;
            return this;
        }

        /**
         * RTK message payload (may be fragmented). 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 1,
                arraySize = 240,
                description = "RTK message payload (may be fragmented)."
        )
        public final Builder data(byte[] data) {
            this.data = data;
            return this;
        }

        public final GpsRtkData build() {
            return new GpsRtkData(sequenceId, fragmentId, data);
        }
    }
}
