package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkEntryInfo;
import io.dronefleet.mavlink.annotations.MavlinkEnum;

/**
 * Flags for gimbal device (lower level) operation. 
 */
@MavlinkEnum
public enum GimbalDeviceFlags {
    /**
     * Set to retracted safe position (no stabilization), takes presedence over all other flags. 
     */
    @MavlinkEntryInfo(1)
    GIMBAL_DEVICE_FLAGS_RETRACT,

    /**
     * Set to neutral/default position, taking precedence over all other flags except RETRACT. 
     * Neutral is commonly forward-facing and horizontal (pitch=yaw=0) but may be any orientation. 
     */
    @MavlinkEntryInfo(2)
    GIMBAL_DEVICE_FLAGS_NEUTRAL,

    /**
     * Lock roll angle to absolute angle relative to horizon (not relative to drone). This is 
     * generally the default with a stabilizing gimbal. 
     */
    @MavlinkEntryInfo(4)
    GIMBAL_DEVICE_FLAGS_ROLL_LOCK,

    /**
     * Lock pitch angle to absolute angle relative to horizon (not relative to drone). This is 
     * generally the default. 
     */
    @MavlinkEntryInfo(8)
    GIMBAL_DEVICE_FLAGS_PITCH_LOCK,

    /**
     * Lock yaw angle to absolute angle relative to North (not relative to drone). If this flag is set, 
     * the quaternion is in the Earth frame with the x-axis pointing North (yaw absolute). If this flag 
     * is not set, the quaternion frame is in the Earth frame rotated so that the x-axis is pointing 
     * forward (yaw relative to vehicle). 
     */
    @MavlinkEntryInfo(16)
    GIMBAL_DEVICE_FLAGS_YAW_LOCK
}
