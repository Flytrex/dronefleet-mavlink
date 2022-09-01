package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkEntryInfo;
import io.dronefleet.mavlink.annotations.MavlinkEnum;

/**
 * Winch status flags used in {@link io.dronefleet.mavlink.common.WinchStatus WINCH_STATUS} 
 */
@MavlinkEnum
public enum MavWinchStatusFlag {
    /**
     * Winch is healthy 
     */
    @MavlinkEntryInfo(1)
    MAV_WINCH_STATUS_HEALTHY,

    /**
     * Winch thread is fully retracted 
     */
    @MavlinkEntryInfo(2)
    MAV_WINCH_STATUS_FULLY_RETRACTED,

    /**
     * Winch motor is moving 
     */
    @MavlinkEntryInfo(4)
    MAV_WINCH_STATUS_MOVING,

    /**
     * Winch clutch is engaged allowing motor to move freely 
     */
    @MavlinkEntryInfo(8)
    MAV_WINCH_STATUS_CLUTCH_ENGAGED
}
