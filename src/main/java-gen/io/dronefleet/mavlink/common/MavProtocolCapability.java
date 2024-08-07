package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkEntryInfo;
import io.dronefleet.mavlink.annotations.MavlinkEnum;
import java.lang.Deprecated;

/**
 * Bitmask of (optional) autopilot capabilities (64 bit). If a bit is set, the autopilot supports 
 * this capability. 
 */
@MavlinkEnum
public enum MavProtocolCapability {
    /**
     * Autopilot supports MISSION float message type. 
     */
    @MavlinkEntryInfo(1)
    MAV_PROTOCOL_CAPABILITY_MISSION_FLOAT,

    /**
     * Autopilot supports the new param float message type. 
     */
    @MavlinkEntryInfo(2)
    MAV_PROTOCOL_CAPABILITY_PARAM_FLOAT,

    /**
     * Autopilot supports {@link io.dronefleet.mavlink.common.MissionItemInt MISSION_ITEM_INT} scaled integer message type. 
     * @deprecated Since 2020-06, replaced by . This flag must always be set if missions are 
     * supported, because missions must always use {@link io.dronefleet.mavlink.common.MissionItemInt MISSION_ITEM_INT} (rather than {@link io.dronefleet.mavlink.common.MissionItem MISSION_ITEM}, 
     * which is deprecated). 
     */
    @MavlinkEntryInfo(4)
    @Deprecated
    MAV_PROTOCOL_CAPABILITY_MISSION_INT,

    /**
     * Autopilot supports {@link io.dronefleet.mavlink.common.CommandInt COMMAND_INT} scaled integer message type. 
     */
    @MavlinkEntryInfo(8)
    MAV_PROTOCOL_CAPABILITY_COMMAND_INT,

    /**
     * Autopilot supports the new param union message type. 
     */
    @MavlinkEntryInfo(16)
    MAV_PROTOCOL_CAPABILITY_PARAM_UNION,

    /**
     * Autopilot supports the File Transfer Protocol v1: 
     * https://mavlink.io/en/services/ftp.html. 
     */
    @MavlinkEntryInfo(32)
    MAV_PROTOCOL_CAPABILITY_FTP,

    /**
     * Autopilot supports commanding attitude offboard. 
     */
    @MavlinkEntryInfo(64)
    MAV_PROTOCOL_CAPABILITY_SET_ATTITUDE_TARGET,

    /**
     * Autopilot supports commanding position and velocity targets in local NED frame. 
     */
    @MavlinkEntryInfo(128)
    MAV_PROTOCOL_CAPABILITY_SET_POSITION_TARGET_LOCAL_NED,

    /**
     * Autopilot supports commanding position and velocity targets in global scaled integers. 
     */
    @MavlinkEntryInfo(256)
    MAV_PROTOCOL_CAPABILITY_SET_POSITION_TARGET_GLOBAL_INT,

    /**
     * Autopilot supports terrain protocol / data handling. 
     */
    @MavlinkEntryInfo(512)
    MAV_PROTOCOL_CAPABILITY_TERRAIN,

    /**
     * Autopilot supports direct actuator control. 
     */
    @MavlinkEntryInfo(1024)
    MAV_PROTOCOL_CAPABILITY_SET_ACTUATOR_TARGET,

    /**
     * Autopilot supports the MAV_CMD_DO_FLIGHTTERMINATION command (flight termination). 
     */
    @MavlinkEntryInfo(2048)
    MAV_PROTOCOL_CAPABILITY_FLIGHT_TERMINATION,

    /**
     * Autopilot supports onboard compass calibration. 
     */
    @MavlinkEntryInfo(4096)
    MAV_PROTOCOL_CAPABILITY_COMPASS_CALIBRATION,

    /**
     * Autopilot supports MAVLink version 2. 
     */
    @MavlinkEntryInfo(8192)
    MAV_PROTOCOL_CAPABILITY_MAVLINK2,

    /**
     * Autopilot supports mission fence protocol. 
     */
    @MavlinkEntryInfo(16384)
    MAV_PROTOCOL_CAPABILITY_MISSION_FENCE,

    /**
     * Autopilot supports mission rally point protocol. 
     */
    @MavlinkEntryInfo(32768)
    MAV_PROTOCOL_CAPABILITY_MISSION_RALLY,

    /**
     * Autopilot supports the flight information protocol. 
     */
    @MavlinkEntryInfo(65536)
    MAV_PROTOCOL_CAPABILITY_FLIGHT_INFORMATION
}
