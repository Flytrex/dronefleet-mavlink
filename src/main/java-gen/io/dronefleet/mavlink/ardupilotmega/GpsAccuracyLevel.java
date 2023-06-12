package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkEntryInfo;
import io.dronefleet.mavlink.annotations.MavlinkEnum;

/**
 * Accuracy level of the GPS units. 
 */
@MavlinkEnum
public enum GpsAccuracyLevel {
    /**
     *  
     */
    @MavlinkEntryInfo(0)
    GPS_ACCURACY_LEVEL_GOOD,

    /**
     *  
     */
    @MavlinkEntryInfo(1)
    GPS_ACCURACY_LEVEL_REDUCED,

    /**
     *  
     */
    @MavlinkEntryInfo(2)
    GPS_ACCURACY_LEVEL_PARTIAL,

    /**
     *  
     */
    @MavlinkEntryInfo(3)
    GPS_ACCURACY_LEVEL_BAD,

    /**
     *  
     */
    @MavlinkEntryInfo(4)
    GPS_ACCURACY_LEVEL_UNRELIABLE
}
