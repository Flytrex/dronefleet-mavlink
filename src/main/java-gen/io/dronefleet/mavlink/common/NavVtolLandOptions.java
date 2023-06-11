package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkEntryInfo;
import io.dronefleet.mavlink.annotations.MavlinkEnum;

/**
 *  
 */
@MavlinkEnum
public enum NavVtolLandOptions {
    /**
     * Default autopilot landing behaviour. 
     */
    @MavlinkEntryInfo(0)
    NAV_VTOL_LAND_OPTIONS_DEFAULT,

    /**
     * Use a fixed wing spiral desent approach before landing. 
     */
    @MavlinkEntryInfo(1)
    NAV_VTOL_LAND_OPTIONS_FW_SPIRAL_APPROACH,

    /**
     * Use a fixed wing approach before detransitioning and landing vertically. 
     */
    @MavlinkEntryInfo(2)
    NAV_VTOL_LAND_OPTIONS_FW_APPROACH
}
