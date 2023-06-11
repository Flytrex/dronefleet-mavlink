package io.dronefleet.mavlink.uavionix;

import io.dronefleet.mavlink.annotations.MavlinkEntryInfo;
import io.dronefleet.mavlink.annotations.MavlinkEnum;

/**
 * State flags for ADS-B transponder dynamic report 
 */
@MavlinkEnum
public enum UavionixAdsbOutControlState {
    /**
     *  
     */
    @MavlinkEntryInfo(1)
    UAVIONIX_ADSB_OUT_CONTROL_STATE_EXTERNAL_BARO_CROSSCHECKED,

    /**
     *  
     */
    @MavlinkEntryInfo(4)
    UAVIONIX_ADSB_OUT_CONTROL_STATE_ON_GROUND,

    /**
     *  
     */
    @MavlinkEntryInfo(8)
    UAVIONIX_ADSB_OUT_CONTROL_STATE_IDENT_BUTTON_ACTIVE,

    /**
     *  
     */
    @MavlinkEntryInfo(16)
    UAVIONIX_ADSB_OUT_CONTROL_STATE_MODE_A_ENABLED,

    /**
     *  
     */
    @MavlinkEntryInfo(32)
    UAVIONIX_ADSB_OUT_CONTROL_STATE_MODE_C_ENABLED,

    /**
     *  
     */
    @MavlinkEntryInfo(64)
    UAVIONIX_ADSB_OUT_CONTROL_STATE_MODE_S_ENABLED,

    /**
     *  
     */
    @MavlinkEntryInfo(128)
    UAVIONIX_ADSB_OUT_CONTROL_STATE_1090ES_TX_ENABLED
}
