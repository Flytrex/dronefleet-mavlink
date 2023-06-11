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
 * Status message with information from UCP Heartbeat and Status messages. 
 */
@MavlinkMessageInfo(
        id = 10008,
        crc = 240,
        description = "Status message with information from UCP Heartbeat and Status messages."
)
public final class UavionixAdsbOutStatus {
    private final EnumValue<UavionixAdsbOutStatusState> state;

    private final int squawk;

    private final EnumValue<UavionixAdsbOutStatusNicNacp> nicNacp;

    private final int boardtemp;

    private final EnumValue<UavionixAdsbOutStatusFault> fault;

    private final String flightId;

    private UavionixAdsbOutStatus(EnumValue<UavionixAdsbOutStatusState> state, int squawk,
            EnumValue<UavionixAdsbOutStatusNicNacp> nicNacp, int boardtemp,
            EnumValue<UavionixAdsbOutStatusFault> fault, String flightId) {
        this.state = state;
        this.squawk = squawk;
        this.nicNacp = nicNacp;
        this.boardtemp = boardtemp;
        this.fault = fault;
        this.flightId = flightId;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UavionixAdsbOutStatus msg) {
        return builder()
                .state(msg.state)
                .squawk(msg.squawk)
                .nicNacp(msg.nicNacp)
                .boardtemp(msg.boardtemp)
                .fault(msg.fault)
                .flightId(msg.flightId);
    }

    /**
     * ADS-B transponder status state flags 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 1,
            enumType = UavionixAdsbOutStatusState.class,
            description = "ADS-B transponder status state flags"
    )
    public final EnumValue<UavionixAdsbOutStatusState> state() {
        return this.state;
    }

    /**
     * Mode A code (typically 1200 [0x04B0] for VFR) 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 2,
            description = "Mode A code (typically 1200 [0x04B0] for VFR)"
    )
    public final int squawk() {
        return this.squawk;
    }

    /**
     * Integrity and Accuracy of traffic reported as a 4-bit value for each field (NACp 7:4, NIC 3:0) 
     * and encoded by Containment Radius (HPL) and Estimated Position Uncertainty (HFOM), 
     * respectively 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 1,
            enumType = UavionixAdsbOutStatusNicNacp.class,
            description = "Integrity and Accuracy of traffic reported as a 4-bit value for each field (NACp 7:4, NIC 3:0) and encoded by Containment Radius (HPL) and Estimated Position Uncertainty (HFOM), respectively"
    )
    public final EnumValue<UavionixAdsbOutStatusNicNacp> nicNacp() {
        return this.nicNacp;
    }

    /**
     * Board temperature in C 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 1,
            description = "Board temperature in C"
    )
    public final int boardtemp() {
        return this.boardtemp;
    }

    /**
     * ADS-B transponder fault flags 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 1,
            enumType = UavionixAdsbOutStatusFault.class,
            description = "ADS-B transponder fault flags"
    )
    public final EnumValue<UavionixAdsbOutStatusFault> fault() {
        return this.fault;
    }

    /**
     * Flight Identification: 8 ASCII characters, '0' through '9', 'A' through 'Z' or space. Spaces 
     * (0x20) used as a trailing pad character, or when call sign is unavailable. 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 1,
            arraySize = 8,
            description = "Flight Identification: 8 ASCII characters, '0' through '9', 'A' through 'Z' or space. Spaces (0x20) used as a trailing pad character, or when call sign is unavailable."
    )
    public final String flightId() {
        return this.flightId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        UavionixAdsbOutStatus other = (UavionixAdsbOutStatus)o;
        if (!Objects.deepEquals(state, other.state)) return false;
        if (!Objects.deepEquals(squawk, other.squawk)) return false;
        if (!Objects.deepEquals(nicNacp, other.nicNacp)) return false;
        if (!Objects.deepEquals(boardtemp, other.boardtemp)) return false;
        if (!Objects.deepEquals(fault, other.fault)) return false;
        if (!Objects.deepEquals(flightId, other.flightId)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(state);
        result = 31 * result + Objects.hashCode(squawk);
        result = 31 * result + Objects.hashCode(nicNacp);
        result = 31 * result + Objects.hashCode(boardtemp);
        result = 31 * result + Objects.hashCode(fault);
        result = 31 * result + Objects.hashCode(flightId);
        return result;
    }

    @Override
    public String toString() {
        return "UavionixAdsbOutStatus{state=" + state
                 + ", squawk=" + squawk
                 + ", nicNacp=" + nicNacp
                 + ", boardtemp=" + boardtemp
                 + ", fault=" + fault
                 + ", flightId=" + flightId + "}";
    }

    public static final class Builder {
        private EnumValue<UavionixAdsbOutStatusState> state;

        private int squawk;

        private EnumValue<UavionixAdsbOutStatusNicNacp> nicNacp;

        private int boardtemp;

        private EnumValue<UavionixAdsbOutStatusFault> fault;

        private String flightId;

        /**
         * ADS-B transponder status state flags 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 1,
                enumType = UavionixAdsbOutStatusState.class,
                description = "ADS-B transponder status state flags"
        )
        public final Builder state(EnumValue<UavionixAdsbOutStatusState> state) {
            this.state = state;
            return this;
        }

        /**
         * ADS-B transponder status state flags 
         */
        public final Builder state(UavionixAdsbOutStatusState entry) {
            return state(EnumValue.of(entry));
        }

        /**
         * ADS-B transponder status state flags 
         */
        public final Builder state(Enum... flags) {
            return state(EnumValue.create(flags));
        }

        /**
         * ADS-B transponder status state flags 
         */
        public final Builder state(Collection<Enum> flags) {
            return state(EnumValue.create(flags));
        }

        /**
         * Mode A code (typically 1200 [0x04B0] for VFR) 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 2,
                description = "Mode A code (typically 1200 [0x04B0] for VFR)"
        )
        public final Builder squawk(int squawk) {
            this.squawk = squawk;
            return this;
        }

        /**
         * Integrity and Accuracy of traffic reported as a 4-bit value for each field (NACp 7:4, NIC 3:0) 
         * and encoded by Containment Radius (HPL) and Estimated Position Uncertainty (HFOM), 
         * respectively 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 1,
                enumType = UavionixAdsbOutStatusNicNacp.class,
                description = "Integrity and Accuracy of traffic reported as a 4-bit value for each field (NACp 7:4, NIC 3:0) and encoded by Containment Radius (HPL) and Estimated Position Uncertainty (HFOM), respectively"
        )
        public final Builder nicNacp(EnumValue<UavionixAdsbOutStatusNicNacp> nicNacp) {
            this.nicNacp = nicNacp;
            return this;
        }

        /**
         * Integrity and Accuracy of traffic reported as a 4-bit value for each field (NACp 7:4, NIC 3:0) 
         * and encoded by Containment Radius (HPL) and Estimated Position Uncertainty (HFOM), 
         * respectively 
         */
        public final Builder nicNacp(UavionixAdsbOutStatusNicNacp entry) {
            return nicNacp(EnumValue.of(entry));
        }

        /**
         * Integrity and Accuracy of traffic reported as a 4-bit value for each field (NACp 7:4, NIC 3:0) 
         * and encoded by Containment Radius (HPL) and Estimated Position Uncertainty (HFOM), 
         * respectively 
         */
        public final Builder nicNacp(Enum... flags) {
            return nicNacp(EnumValue.create(flags));
        }

        /**
         * Integrity and Accuracy of traffic reported as a 4-bit value for each field (NACp 7:4, NIC 3:0) 
         * and encoded by Containment Radius (HPL) and Estimated Position Uncertainty (HFOM), 
         * respectively 
         */
        public final Builder nicNacp(Collection<Enum> flags) {
            return nicNacp(EnumValue.create(flags));
        }

        /**
         * Board temperature in C 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 1,
                description = "Board temperature in C"
        )
        public final Builder boardtemp(int boardtemp) {
            this.boardtemp = boardtemp;
            return this;
        }

        /**
         * ADS-B transponder fault flags 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 1,
                enumType = UavionixAdsbOutStatusFault.class,
                description = "ADS-B transponder fault flags"
        )
        public final Builder fault(EnumValue<UavionixAdsbOutStatusFault> fault) {
            this.fault = fault;
            return this;
        }

        /**
         * ADS-B transponder fault flags 
         */
        public final Builder fault(UavionixAdsbOutStatusFault entry) {
            return fault(EnumValue.of(entry));
        }

        /**
         * ADS-B transponder fault flags 
         */
        public final Builder fault(Enum... flags) {
            return fault(EnumValue.create(flags));
        }

        /**
         * ADS-B transponder fault flags 
         */
        public final Builder fault(Collection<Enum> flags) {
            return fault(EnumValue.create(flags));
        }

        /**
         * Flight Identification: 8 ASCII characters, '0' through '9', 'A' through 'Z' or space. Spaces 
         * (0x20) used as a trailing pad character, or when call sign is unavailable. 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 1,
                arraySize = 8,
                description = "Flight Identification: 8 ASCII characters, '0' through '9', 'A' through 'Z' or space. Spaces (0x20) used as a trailing pad character, or when call sign is unavailable."
        )
        public final Builder flightId(String flightId) {
            this.flightId = flightId;
            return this;
        }

        public final UavionixAdsbOutStatus build() {
            return new UavionixAdsbOutStatus(state, squawk, nicNacp, boardtemp, fault, flightId);
        }
    }
}
