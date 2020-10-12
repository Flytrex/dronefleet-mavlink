package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkEntryInfo;
import io.dronefleet.mavlink.annotations.MavlinkEnum;

/**
 * These encode the sensors whose status is sent as part of the {@link io.dronefleet.mavlink.common.SysStatus SYS_STATUS} message. 
 */
@MavlinkEnum
public enum MavSysStatusSensorExtension {
    /**
     * 0x01 2nd GPS 
     */
    @MavlinkEntryInfo(1)
    MAV_SYS_STATUS_SENSOR_GPS2,

    /**
     * 0x02 3rd 3D gyro 
     */
    @MavlinkEntryInfo(2)
    MAV_SYS_STATUS_SENSOR_3D_GYRO3,

    /**
     * 0x04 3rd 3D accelerometer 
     */
    @MavlinkEntryInfo(4)
    MAV_SYS_STATUS_SENSOR_3D_ACCEL3
}
