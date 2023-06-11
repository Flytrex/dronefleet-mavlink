package io.dronefleet.mavlink.uavionix;

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
 * Control message with all data sent in UCP control message. 
 */
@MavlinkMessageInfo(
        id = 10007,
        crc = 71,
        description = "Control message with all data sent in UCP control message."
)
public final class UavionixAdsbOutControl {
    private final EnumValue<UavionixAdsbOutControlState> state;

    private final int baroaltmsl;

    private final int squawk;

    private final EnumValue<UavionixAdsbEmergencyStatus> emergencystatus;

    private final String flightId;

    private final EnumValue<UavionixAdsbXbit> xBit;

    private UavionixAdsbOutControl(EnumValue<UavionixAdsbOutControlState> state, int baroaltmsl,
            int squawk, EnumValue<UavionixAdsbEmergencyStatus> emergencystatus, String flightId,
            EnumValue<UavionixAdsbXbit> xBit) {
        this.state = state;
        this.baroaltmsl = baroaltmsl;
        this.squawk = squawk;
        this.emergencystatus = emergencystatus;
        this.flightId = flightId;
        this.xBit = xBit;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UavionixAdsbOutControl msg) {
        return builder()
                .state(msg.state)
                .baroaltmsl(msg.baroaltmsl)
                .squawk(msg.squawk)
                .emergencystatus(msg.emergencystatus)
                .flightId(msg.flightId)
                .xBit(msg.xBit);
    }

    /**
     * ADS-B transponder control state flags 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 1,
            enumType = UavionixAdsbOutControlState.class,
            description = "ADS-B transponder control state flags"
    )
    public final EnumValue<UavionixAdsbOutControlState> state() {
        return this.state;
    }

    /**
     * Barometric pressure altitude (MSL) relative to a standard atmosphere of 1013.2 mBar and NOT 
     * bar corrected altitude (m * 1E-3). (up +ve). If unknown set to INT32_MAX 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 4,
            signed = true,
            description = "Barometric pressure altitude (MSL) relative to a standard atmosphere of 1013.2 mBar and NOT bar corrected altitude (m * 1E-3). (up +ve). If unknown set to INT32_MAX"
    )
    public final int baroaltmsl() {
        return this.baroaltmsl;
    }

    /**
     * Mode A code (typically 1200 [0x04B0] for VFR) 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 2,
            description = "Mode A code (typically 1200 [0x04B0] for VFR)"
    )
    public final int squawk() {
        return this.squawk;
    }

    /**
     * Emergency status 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 1,
            enumType = UavionixAdsbEmergencyStatus.class,
            description = "Emergency status"
    )
    public final EnumValue<UavionixAdsbEmergencyStatus> emergencystatus() {
        return this.emergencystatus;
    }

    /**
     * Flight Identification: 8 ASCII characters, '0' through '9', 'A' through 'Z' or space. Spaces 
     * (0x20) used as a trailing pad character, or when call sign is unavailable. 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 1,
            arraySize = 8,
            description = "Flight Identification: 8 ASCII characters, '0' through '9', 'A' through 'Z' or space. Spaces (0x20) used as a trailing pad character, or when call sign is unavailable."
    )
    public final String flightId() {
        return this.flightId;
    }

    /**
     * X-Bit enable (military transponders only) 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 1,
            enumType = UavionixAdsbXbit.class,
            description = "X-Bit enable (military transponders only)"
    )
    public final EnumValue<UavionixAdsbXbit> xBit() {
        return this.xBit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        UavionixAdsbOutControl other = (UavionixAdsbOutControl)o;
        if (!Objects.deepEquals(state, other.state)) return false;
        if (!Objects.deepEquals(baroaltmsl, other.baroaltmsl)) return false;
        if (!Objects.deepEquals(squawk, other.squawk)) return false;
        if (!Objects.deepEquals(emergencystatus, other.emergencystatus)) return false;
        if (!Objects.deepEquals(flightId, other.flightId)) return false;
        if (!Objects.deepEquals(xBit, other.xBit)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(state);
        result = 31 * result + Objects.hashCode(baroaltmsl);
        result = 31 * result + Objects.hashCode(squawk);
        result = 31 * result + Objects.hashCode(emergencystatus);
        result = 31 * result + Objects.hashCode(flightId);
        result = 31 * result + Objects.hashCode(xBit);
        return result;
    }

    @Override
    public String toString() {
        return "UavionixAdsbOutControl{state=" + state
                 + ", baroaltmsl=" + baroaltmsl
                 + ", squawk=" + squawk
                 + ", emergencystatus=" + emergencystatus
                 + ", flightId=" + flightId
                 + ", xBit=" + xBit + "}";
    }

    public static final class Builder {
        private EnumValue<UavionixAdsbOutControlState> state;

        private int baroaltmsl;

        private int squawk;

        private EnumValue<UavionixAdsbEmergencyStatus> emergencystatus;

        private String flightId;

        private EnumValue<UavionixAdsbXbit> xBit;

        /**
         * ADS-B transponder control state flags 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 1,
                enumType = UavionixAdsbOutControlState.class,
                description = "ADS-B transponder control state flags"
        )
        public final Builder state(EnumValue<UavionixAdsbOutControlState> state) {
            this.state = state;
            return this;
        }

        /**
         * ADS-B transponder control state flags 
         */
        public final Builder state(UavionixAdsbOutControlState entry) {
            return state(EnumValue.of(entry));
        }

        /**
         * ADS-B transponder control state flags 
         */
        public final Builder state(Enum... flags) {
            return state(EnumValue.create(flags));
        }

        /**
         * ADS-B transponder control state flags 
         */
        public final Builder state(Collection<Enum> flags) {
            return state(EnumValue.create(flags));
        }

        /**
         * Barometric pressure altitude (MSL) relative to a standard atmosphere of 1013.2 mBar and NOT 
         * bar corrected altitude (m * 1E-3). (up +ve). If unknown set to INT32_MAX 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 4,
                signed = true,
                description = "Barometric pressure altitude (MSL) relative to a standard atmosphere of 1013.2 mBar and NOT bar corrected altitude (m * 1E-3). (up +ve). If unknown set to INT32_MAX"
        )
        public final Builder baroaltmsl(int baroaltmsl) {
            this.baroaltmsl = baroaltmsl;
            return this;
        }

        /**
         * Mode A code (typically 1200 [0x04B0] for VFR) 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 2,
                description = "Mode A code (typically 1200 [0x04B0] for VFR)"
        )
        public final Builder squawk(int squawk) {
            this.squawk = squawk;
            return this;
        }

        /**
         * Emergency status 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 1,
                enumType = UavionixAdsbEmergencyStatus.class,
                description = "Emergency status"
        )
        public final Builder emergencystatus(
                EnumValue<UavionixAdsbEmergencyStatus> emergencystatus) {
            this.emergencystatus = emergencystatus;
            return this;
        }

        /**
         * Emergency status 
         */
        public final Builder emergencystatus(UavionixAdsbEmergencyStatus entry) {
            return emergencystatus(EnumValue.of(entry));
        }

        /**
         * Emergency status 
         */
        public final Builder emergencystatus(Enum... flags) {
            return emergencystatus(EnumValue.create(flags));
        }

        /**
         * Emergency status 
         */
        public final Builder emergencystatus(Collection<Enum> flags) {
            return emergencystatus(EnumValue.create(flags));
        }

        /**
         * Flight Identification: 8 ASCII characters, '0' through '9', 'A' through 'Z' or space. Spaces 
         * (0x20) used as a trailing pad character, or when call sign is unavailable. 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 1,
                arraySize = 8,
                description = "Flight Identification: 8 ASCII characters, '0' through '9', 'A' through 'Z' or space. Spaces (0x20) used as a trailing pad character, or when call sign is unavailable."
        )
        public final Builder flightId(String flightId) {
            this.flightId = flightId;
            return this;
        }

        /**
         * X-Bit enable (military transponders only) 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 1,
                enumType = UavionixAdsbXbit.class,
                description = "X-Bit enable (military transponders only)"
        )
        public final Builder xBit(EnumValue<UavionixAdsbXbit> xBit) {
            this.xBit = xBit;
            return this;
        }

        /**
         * X-Bit enable (military transponders only) 
         */
        public final Builder xBit(UavionixAdsbXbit entry) {
            return xBit(EnumValue.of(entry));
        }

        /**
         * X-Bit enable (military transponders only) 
         */
        public final Builder xBit(Enum... flags) {
            return xBit(EnumValue.create(flags));
        }

        /**
         * X-Bit enable (military transponders only) 
         */
        public final Builder xBit(Collection<Enum> flags) {
            return xBit(EnumValue.create(flags));
        }

        public final UavionixAdsbOutControl build() {
            return new UavionixAdsbOutControl(state, baroaltmsl, squawk, emergencystatus, flightId, xBit);
        }
    }
}
