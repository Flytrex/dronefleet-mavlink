package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkEntryInfo;
import io.dronefleet.mavlink.annotations.MavlinkEnum;

/**
 * Result of RTK message (in a {@link io.dronefleet.mavlink.ardupilotmega.GpsRtkAck GPS_RTK_ACK} message). 
 */
@MavlinkEnum
public enum MavGpsRtkResult {
    /**
     * RTK message accepted OK 
     */
    @MavlinkEntryInfo(0)
    MAV_GPS_RTK_ACCEPTED,

    /**
     * RTK message fragment accepted OK 
     */
    @MavlinkEntryInfo(1)
    MAV_GPS_RTK_FRAGMENT_ACCEPTED,

    /**
     * Generic error for the whole RTK message 
     */
    @MavlinkEntryInfo(2)
    MAV_GPS_RTK_ERROR,

    /**
     * Generic error for a specific fragment 
     */
    @MavlinkEntryInfo(3)
    MAV_GPS_RTK_FRAGMENT_ERROR,

    /**
     * Ready for RTK fragments receiving 
     */
    @MavlinkEntryInfo(4)
    MAV_GPS_RTK_RECEIVING
}
