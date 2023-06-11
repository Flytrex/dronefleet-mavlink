package io.dronefleet.mavlink.uavionix;

import io.dronefleet.mavlink.annotations.MavlinkEntryInfo;
import io.dronefleet.mavlink.annotations.MavlinkEnum;

/**
 * State flags for X-Bit and reserved fields. 
 */
@MavlinkEnum
public enum UavionixAdsbXbit {
    /**
     *  
     */
    @MavlinkEntryInfo(128)
    UAVIONIX_ADSB_XBIT_ENABLED
}
