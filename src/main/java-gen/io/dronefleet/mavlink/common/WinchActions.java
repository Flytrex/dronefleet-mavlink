package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkEntryInfo;
import io.dronefleet.mavlink.annotations.MavlinkEnum;

/**
 * Winch actions. 
 */
@MavlinkEnum
public enum WinchActions {
    /**
     * Relax winch. 
     */
    @MavlinkEntryInfo(0)
    WINCH_RELAXED,

    /**
     * Wind or unwind specified length of cable, optionally using specified rate. 
     */
    @MavlinkEntryInfo(1)
    WINCH_RELATIVE_LENGTH_CONTROL,

    /**
     * Wind or unwind cable at specified rate. 
     */
    @MavlinkEntryInfo(2)
    WINCH_RATE_CONTROL
}
