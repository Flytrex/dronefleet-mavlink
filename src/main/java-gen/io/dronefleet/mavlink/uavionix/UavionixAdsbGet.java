package io.dronefleet.mavlink.uavionix;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Request messages. 
 */
@MavlinkMessageInfo(
        id = 10006,
        crc = 193,
        description = "Request messages."
)
public final class UavionixAdsbGet {
    private final long reqmessageid;

    private UavionixAdsbGet(long reqmessageid) {
        this.reqmessageid = reqmessageid;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UavionixAdsbGet msg) {
        return builder()
                .reqmessageid(msg.reqmessageid);
    }

    /**
     * Message ID to request. Supports any message in this 10000-10099 range 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 4,
            description = "Message ID to request. Supports any message in this 10000-10099 range"
    )
    public final long reqmessageid() {
        return this.reqmessageid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        UavionixAdsbGet other = (UavionixAdsbGet)o;
        if (!Objects.deepEquals(reqmessageid, other.reqmessageid)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(reqmessageid);
        return result;
    }

    @Override
    public String toString() {
        return "UavionixAdsbGet{reqmessageid=" + reqmessageid + "}";
    }

    public static final class Builder {
        private long reqmessageid;

        /**
         * Message ID to request. Supports any message in this 10000-10099 range 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 4,
                description = "Message ID to request. Supports any message in this 10000-10099 range"
        )
        public final Builder reqmessageid(long reqmessageid) {
            this.reqmessageid = reqmessageid;
            return this;
        }

        public final UavionixAdsbGet build() {
            return new UavionixAdsbGet(reqmessageid);
        }
    }
}
