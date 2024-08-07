package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkEntryInfo;
import io.dronefleet.mavlink.annotations.MavlinkEnum;
import java.lang.Deprecated;

/**
 * Co-ordinate frames used by MAVLink. Not all frames are supported by all commands, messages, or 
 * vehicles. Global frames use the following naming conventions: - "GLOBAL": Global 
 * co-ordinate frame with WGS84 latitude/longitude and altitude positive over mean sea level 
 * (MSL) by default. The following modifiers may be used with "GLOBAL": - "RELATIVE_ALT": 
 * Altitude is relative to the vehicle home position rather than MSL. - "TERRAIN_ALT": Altitude 
 * is relative to ground level rather than MSL. - "INT": Latitude/longitude (in degrees) are 
 * scaled by multiplying by 1E7. Local frames use the following naming conventions: - "LOCAL": 
 * Origin of local frame is fixed relative to earth. Unless otherwise specified this origin is the 
 * origin of the vehicle position-estimator ("EKF"). - "BODY": Origin of local frame travels 
 * with the vehicle. NOTE, "BODY" does NOT indicate alignment of frame axis with vehicle 
 * attitude. - "OFFSET": Deprecated synonym for "BODY" (origin travels with the vehicle). Not to 
 * be used for new frames. Some deprecated frames do not follow these conventions (e.g. 
 * MAV_FRAME_BODY_NED and MAV_FRAME_BODY_OFFSET_NED). 
 */
@MavlinkEnum
public enum MavFrame {
    /**
     * Global (WGS84) coordinate frame + MSL altitude. First value / x: latitude, second value / y: 
     * longitude, third value / z: positive altitude over mean sea level (MSL). 
     */
    @MavlinkEntryInfo(0)
    MAV_FRAME_GLOBAL,

    /**
     * NED local tangent frame (x: North, y: East, z: Down) with origin fixed relative to earth. 
     */
    @MavlinkEntryInfo(1)
    MAV_FRAME_LOCAL_NED,

    /**
     * NOT a coordinate frame, indicates a mission command. 
     */
    @MavlinkEntryInfo(2)
    MAV_FRAME_MISSION,

    /**
     * Global (WGS84) coordinate frame + altitude relative to the home position. First value / x: 
     * latitude, second value / y: longitude, third value / z: positive altitude with 0 being at the 
     * altitude of the home location. 
     */
    @MavlinkEntryInfo(3)
    MAV_FRAME_GLOBAL_RELATIVE_ALT,

    /**
     * ENU local tangent frame (x: East, y: North, z: Up) with origin fixed relative to earth. 
     */
    @MavlinkEntryInfo(4)
    MAV_FRAME_LOCAL_ENU,

    /**
     * Global (WGS84) coordinate frame (scaled) + MSL altitude. First value / x: latitude in 
     * degrees*1E7, second value / y: longitude in degrees*1E7, third value / z: positive altitude 
     * over mean sea level (MSL). 
     */
    @MavlinkEntryInfo(5)
    MAV_FRAME_GLOBAL_INT,

    /**
     * Global (WGS84) coordinate frame (scaled) + altitude relative to the home position. First 
     * value / x: latitude in degrees*1E7, second value / y: longitude in degrees*1E7, third value / z: 
     * positive altitude with 0 being at the altitude of the home location. 
     */
    @MavlinkEntryInfo(6)
    MAV_FRAME_GLOBAL_RELATIVE_ALT_INT,

    /**
     * NED local tangent frame (x: North, y: East, z: Down) with origin that travels with the vehicle. 
     */
    @MavlinkEntryInfo(7)
    MAV_FRAME_LOCAL_OFFSET_NED,

    /**
     * Same as MAV_FRAME_LOCAL_NED when used to represent position values. Same as 
     * MAV_FRAME_BODY_FRD when used with velocity/accelaration values. 
     * @deprecated Since 2019-08, replaced by MAV_FRAME_BODY_FRD. 
     */
    @MavlinkEntryInfo(8)
    @Deprecated
    MAV_FRAME_BODY_NED,

    /**
     * This is the same as MAV_FRAME_BODY_FRD. 
     * @deprecated Since 2019-08, replaced by MAV_FRAME_BODY_FRD. 
     */
    @MavlinkEntryInfo(9)
    @Deprecated
    MAV_FRAME_BODY_OFFSET_NED,

    /**
     * Global (WGS84) coordinate frame with AGL altitude (at the waypoint coordinate). First value / 
     * x: latitude in degrees, second value / y: longitude in degrees, third value / z: positive 
     * altitude in meters with 0 being at ground level in terrain model. 
     */
    @MavlinkEntryInfo(10)
    MAV_FRAME_GLOBAL_TERRAIN_ALT,

    /**
     * Global (WGS84) coordinate frame (scaled) with AGL altitude (at the waypoint coordinate). 
     * First value / x: latitude in degrees*1E7, second value / y: longitude in degrees*1E7, third 
     * value / z: positive altitude in meters with 0 being at ground level in terrain model. 
     */
    @MavlinkEntryInfo(11)
    MAV_FRAME_GLOBAL_TERRAIN_ALT_INT,

    /**
     * FRD local tangent frame (x: Forward, y: Right, z: Down) with origin that travels with vehicle. 
     * The forward axis is aligned to the front of the vehicle in the horizontal plane. 
     */
    @MavlinkEntryInfo(12)
    MAV_FRAME_BODY_FRD,

    /**
     * MAV_FRAME_BODY_FLU - Body fixed frame of reference, Z-up (x: Forward, y: Left, z: Up). 
     * @deprecated Since 2019-04, replaced by . 
     */
    @MavlinkEntryInfo(13)
    @Deprecated
    MAV_FRAME_RESERVED_13,

    /**
     * MAV_FRAME_MOCAP_NED - Odometry local coordinate frame of data given by a motion capture 
     * system, Z-down (x: North, y: East, z: Down). 
     * @deprecated Since 2019-04, replaced by MAV_FRAME_LOCAL_FRD. 
     */
    @MavlinkEntryInfo(14)
    @Deprecated
    MAV_FRAME_RESERVED_14,

    /**
     * MAV_FRAME_MOCAP_ENU - Odometry local coordinate frame of data given by a motion capture 
     * system, Z-up (x: East, y: North, z: Up). 
     * @deprecated Since 2019-04, replaced by MAV_FRAME_LOCAL_FLU. 
     */
    @MavlinkEntryInfo(15)
    @Deprecated
    MAV_FRAME_RESERVED_15,

    /**
     * MAV_FRAME_VISION_NED - Odometry local coordinate frame of data given by a vision estimation 
     * system, Z-down (x: North, y: East, z: Down). 
     * @deprecated Since 2019-04, replaced by MAV_FRAME_LOCAL_FRD. 
     */
    @MavlinkEntryInfo(16)
    @Deprecated
    MAV_FRAME_RESERVED_16,

    /**
     * MAV_FRAME_VISION_ENU - Odometry local coordinate frame of data given by a vision estimation 
     * system, Z-up (x: East, y: North, z: Up). 
     * @deprecated Since 2019-04, replaced by MAV_FRAME_LOCAL_FLU. 
     */
    @MavlinkEntryInfo(17)
    @Deprecated
    MAV_FRAME_RESERVED_17,

    /**
     * MAV_FRAME_ESTIM_NED - Odometry local coordinate frame of data given by an estimator running 
     * onboard the vehicle, Z-down (x: North, y: East, z: Down). 
     * @deprecated Since 2019-04, replaced by MAV_FRAME_LOCAL_FRD. 
     */
    @MavlinkEntryInfo(18)
    @Deprecated
    MAV_FRAME_RESERVED_18,

    /**
     * MAV_FRAME_ESTIM_ENU - Odometry local coordinate frame of data given by an estimator running 
     * onboard the vehicle, Z-up (x: East, y: North, z: Up). 
     * @deprecated Since 2019-04, replaced by MAV_FRAME_LOCAL_FLU. 
     */
    @MavlinkEntryInfo(19)
    @Deprecated
    MAV_FRAME_RESERVED_19,

    /**
     * FRD local tangent frame (x: Forward, y: Right, z: Down) with origin fixed relative to earth. The 
     * forward axis is aligned to the front of the vehicle in the horizontal plane. 
     */
    @MavlinkEntryInfo(20)
    MAV_FRAME_LOCAL_FRD,

    /**
     * FLU local tangent frame (x: Forward, y: Left, z: Up) with origin fixed relative to earth. The 
     * forward axis is aligned to the front of the vehicle in the horizontal plane. 
     */
    @MavlinkEntryInfo(21)
    MAV_FRAME_LOCAL_FLU
}
