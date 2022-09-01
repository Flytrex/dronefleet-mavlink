package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkEntryInfo;
import io.dronefleet.mavlink.annotations.MavlinkEnum;

/**
 *  
 */
@MavlinkEnum
public enum MavOdidArmStatus {
    /**
     * Passing arming checks. 
     */
    @MavlinkEntryInfo(0)
    MAV_ODID_GOOD_TO_ARM,

    /**
     * Generic arming failure, see error string for details. 
     */
    @MavlinkEntryInfo(1)
    MAV_ODID_PRE_ARM_FAIL_GENERIC
}
