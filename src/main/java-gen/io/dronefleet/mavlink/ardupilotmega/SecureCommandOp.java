package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkEntryInfo;
import io.dronefleet.mavlink.annotations.MavlinkEnum;

/**
 *  
 */
@MavlinkEnum
public enum SecureCommandOp {
    /**
     * Get an 8 byte session key which is used for remote secure updates which operate on flight 
     * controller data such as bootloader public keys. Return data will be 8 bytes on success. The 
     * session key remains valid until either the flight controller reboots or another 
     * SECURE_COMMAND_GET_SESSION_KEY is run. 
     */
    @MavlinkEntryInfo(0)
    SECURE_COMMAND_GET_SESSION_KEY,

    /**
     * Get an 8 byte session key which is used for remote secure updates which operate on RemoteID 
     * module data. Return data will be 8 bytes on success. The session key remains valid until either 
     * the remote ID module reboots or another SECURE_COMMAND_GET_REMOTEID_SESSION_KEY is run. 
     */
    @MavlinkEntryInfo(1)
    SECURE_COMMAND_GET_REMOTEID_SESSION_KEY,

    /**
     * Remove range of public keys from the bootloader. Command data consists of two bytes, first byte 
     * if index of first public key to remove. Second byte is the number of keys to remove. If all keys are 
     * removed then secure boot is disabled and insecure firmware can be loaded. 
     */
    @MavlinkEntryInfo(2)
    SECURE_COMMAND_REMOVE_PUBLIC_KEYS,

    /**
     * Get current public keys from the bootloader. Command data consists of two bytes, first byte is 
     * index of first public key to fetch, 2nd byte is number of keys to fetch. Total data needs to fit in 
     * data portion of reply (max 6 keys for 32 byte keys). Reply data has the index of the first key in the 
     * first byte, followed by the keys. Returned keys may be less than the number of keys requested if 
     * there are less keys installed than requested. 
     */
    @MavlinkEntryInfo(3)
    SECURE_COMMAND_GET_PUBLIC_KEYS,

    /**
     * Set current public keys in the bootloader. Data consists of a one byte public key index followed 
     * by the public keys. With 32 byte keys this allows for up to 6 keys to be set in one request. Keys 
     * outside of the range that is being set will remain unchanged. 
     */
    @MavlinkEntryInfo(4)
    SECURE_COMMAND_SET_PUBLIC_KEYS,

    /**
     * Get config data for remote ID module. This command should be sent to the component ID of the 
     * flight controller which will forward it to the RemoteID module either over mavlink or 
     * DroneCAN. Data format is specific to the RemoteID implementation, see RemoteID firmware 
     * documentation for details. 
     */
    @MavlinkEntryInfo(5)
    SECURE_COMMAND_GET_REMOTEID_CONFIG,

    /**
     * Set config data for remote ID module. This command should be sent to the component ID of the 
     * flight controller which will forward it to the RemoteID module either over mavlink or 
     * DroneCAN. Data format is specific to the RemoteID implementation, see RemoteID firmware 
     * documentation for details. 
     */
    @MavlinkEntryInfo(6)
    SECURE_COMMAND_SET_REMOTEID_CONFIG,

    /**
     * Flash bootloader from local storage. Data is the filename to use for the bootloader. This is 
     * intended to be used with MAVFtp to upload a new bootloader to a microSD before flashing. 
     */
    @MavlinkEntryInfo(7)
    SECURE_COMMAND_FLASH_BOOTLOADER
}
