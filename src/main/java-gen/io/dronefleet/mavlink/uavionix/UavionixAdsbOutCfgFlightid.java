package io.dronefleet.mavlink.uavionix;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Flight Identification for ADSB-Out vehicles. 
 */
@MavlinkMessageInfo(
        id = 10005,
        crc = 103,
        description = "Flight Identification for ADSB-Out vehicles."
)
public final class UavionixAdsbOutCfgFlightid {
    private final String flightId;

    private UavionixAdsbOutCfgFlightid(String flightId) {
        this.flightId = flightId;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UavionixAdsbOutCfgFlightid msg) {
        return builder()
                .flightId(msg.flightId);
    }

    /**
     * Flight Identification: 8 ASCII characters, '0' through '9', 'A' through 'Z' or space. Spaces 
     * (0x20) used as a trailing pad character, or when call sign is unavailable. Reflects Control 
     * message setting. This is null-terminated. 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 1,
            arraySize = 9,
            description = "Flight Identification: 8 ASCII characters, '0' through '9', 'A' through 'Z' or space. Spaces (0x20) used as a trailing pad character, or when call sign is unavailable. Reflects Control message setting. This is null-terminated."
    )
    public final String flightId() {
        return this.flightId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        UavionixAdsbOutCfgFlightid other = (UavionixAdsbOutCfgFlightid)o;
        if (!Objects.deepEquals(flightId, other.flightId)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(flightId);
        return result;
    }

    @Override
    public String toString() {
        return "UavionixAdsbOutCfgFlightid{flightId=" + flightId + "}";
    }

    public static final class Builder {
        private String flightId;

        /**
         * Flight Identification: 8 ASCII characters, '0' through '9', 'A' through 'Z' or space. Spaces 
         * (0x20) used as a trailing pad character, or when call sign is unavailable. Reflects Control 
         * message setting. This is null-terminated. 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 1,
                arraySize = 9,
                description = "Flight Identification: 8 ASCII characters, '0' through '9', 'A' through 'Z' or space. Spaces (0x20) used as a trailing pad character, or when call sign is unavailable. Reflects Control message setting. This is null-terminated."
        )
        public final Builder flightId(String flightId) {
            this.flightId = flightId;
            return this;
        }

        public final UavionixAdsbOutCfgFlightid build() {
            return new UavionixAdsbOutCfgFlightid(flightId);
        }
    }
}
