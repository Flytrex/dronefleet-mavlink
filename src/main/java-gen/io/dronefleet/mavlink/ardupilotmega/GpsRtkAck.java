package io.dronefleet.mavlink.ardupilotmega;

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
 * Acknowledgment message during RTK message handling. The type field states if this message is a 
 * positive ack or if an error happened (for a specific fragment or the whole RTK message). 
 */
@MavlinkMessageInfo(
        id = 12302,
        crc = 95,
        description = "Acknowledgment message during RTK message handling. The type field states if this message is a positive ack or if an error happened (for a specific fragment or the whole RTK message)."
)
public final class GpsRtkAck {
    private final long sequenceId;

    private final int fragmentId;

    private final EnumValue<MavGpsRtkResult> type;

    private GpsRtkAck(long sequenceId, int fragmentId, EnumValue<MavGpsRtkResult> type) {
        this.sequenceId = sequenceId;
        this.fragmentId = fragmentId;
        this.type = type;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GpsRtkAck msg) {
        return builder()
                .sequenceId(msg.sequenceId)
                .fragmentId(msg.fragmentId)
                .type(msg.type);
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
     * RTK transmission result. 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 1,
            enumType = MavGpsRtkResult.class,
            description = "RTK transmission result."
    )
    public final EnumValue<MavGpsRtkResult> type() {
        return this.type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        GpsRtkAck other = (GpsRtkAck)o;
        if (!Objects.deepEquals(sequenceId, other.sequenceId)) return false;
        if (!Objects.deepEquals(fragmentId, other.fragmentId)) return false;
        if (!Objects.deepEquals(type, other.type)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(sequenceId);
        result = 31 * result + Objects.hashCode(fragmentId);
        result = 31 * result + Objects.hashCode(type);
        return result;
    }

    @Override
    public String toString() {
        return "GpsRtkAck{sequenceId=" + sequenceId
                 + ", fragmentId=" + fragmentId
                 + ", type=" + type + "}";
    }

    public static final class Builder {
        private long sequenceId;

        private int fragmentId;

        private EnumValue<MavGpsRtkResult> type;

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
         * RTK transmission result. 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 1,
                enumType = MavGpsRtkResult.class,
                description = "RTK transmission result."
        )
        public final Builder type(EnumValue<MavGpsRtkResult> type) {
            this.type = type;
            return this;
        }

        /**
         * RTK transmission result. 
         */
        public final Builder type(MavGpsRtkResult entry) {
            return type(EnumValue.of(entry));
        }

        /**
         * RTK transmission result. 
         */
        public final Builder type(Enum... flags) {
            return type(EnumValue.create(flags));
        }

        /**
         * RTK transmission result. 
         */
        public final Builder type(Collection<Enum> flags) {
            return type(EnumValue.create(flags));
        }

        public final GpsRtkAck build() {
            return new GpsRtkAck(sequenceId, fragmentId, type);
        }
    }
}
