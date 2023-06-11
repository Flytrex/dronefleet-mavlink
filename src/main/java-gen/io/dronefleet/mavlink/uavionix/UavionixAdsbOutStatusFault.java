package io.dronefleet.mavlink.uavionix;

import io.dronefleet.mavlink.annotations.MavlinkEntryInfo;
import io.dronefleet.mavlink.annotations.MavlinkEnum;

/**
 * State flags for ADS-B transponder fault report 
 */
@MavlinkEnum
public enum UavionixAdsbOutStatusFault {
    /**
     *  
     */
    @MavlinkEntryInfo(8)
    UAVIONIX_ADSB_OUT_STATUS_FAULT_STATUS_MESSAGE_UNAVAIL,

    /**
     *  
     */
    @MavlinkEntryInfo(16)
    UAVIONIX_ADSB_OUT_STATUS_FAULT_GPS_NO_POS,

    /**
     *  
     */
    @MavlinkEntryInfo(32)
    UAVIONIX_ADSB_OUT_STATUS_FAULT_GPS_UNAVAIL,

    /**
     *  
     */
    @MavlinkEntryInfo(64)
    UAVIONIX_ADSB_OUT_STATUS_FAULT_TX_SYSTEM_FAIL,

    /**
     *  
     */
    @MavlinkEntryInfo(128)
    UAVIONIX_ADSB_OUT_STATUS_FAULT_MAINT_REQ
}
