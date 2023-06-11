package io.dronefleet.mavlink.uavionix;

import io.dronefleet.mavlink.annotations.MavlinkEntryInfo;
import io.dronefleet.mavlink.annotations.MavlinkEnum;

/**
 * State flags for ADS-B transponder status report 
 */
@MavlinkEnum
public enum UavionixAdsbOutStatusNicNacp {
    /**
     *  
     */
    @MavlinkEntryInfo(1)
    UAVIONIX_ADSB_NIC_CR_20_NM,

    /**
     *  
     */
    @MavlinkEntryInfo(2)
    UAVIONIX_ADSB_NIC_CR_8_NM,

    /**
     *  
     */
    @MavlinkEntryInfo(3)
    UAVIONIX_ADSB_NIC_CR_4_NM,

    /**
     *  
     */
    @MavlinkEntryInfo(4)
    UAVIONIX_ADSB_NIC_CR_2_NM,

    /**
     *  
     */
    @MavlinkEntryInfo(5)
    UAVIONIX_ADSB_NIC_CR_1_NM,

    /**
     *  
     */
    @MavlinkEntryInfo(6)
    UAVIONIX_ADSB_NIC_CR_0_3_NM,

    /**
     *  
     */
    @MavlinkEntryInfo(7)
    UAVIONIX_ADSB_NIC_CR_0_2_NM,

    /**
     *  
     */
    @MavlinkEntryInfo(8)
    UAVIONIX_ADSB_NIC_CR_0_1_NM,

    /**
     *  
     */
    @MavlinkEntryInfo(9)
    UAVIONIX_ADSB_NIC_CR_75_M,

    /**
     *  
     */
    @MavlinkEntryInfo(10)
    UAVIONIX_ADSB_NIC_CR_25_M,

    /**
     *  
     */
    @MavlinkEntryInfo(11)
    UAVIONIX_ADSB_NIC_CR_7_5_M,

    /**
     *  
     */
    @MavlinkEntryInfo(16)
    UAVIONIX_ADSB_NACP_EPU_10_NM,

    /**
     *  
     */
    @MavlinkEntryInfo(32)
    UAVIONIX_ADSB_NACP_EPU_4_NM,

    /**
     *  
     */
    @MavlinkEntryInfo(48)
    UAVIONIX_ADSB_NACP_EPU_2_NM,

    /**
     *  
     */
    @MavlinkEntryInfo(64)
    UAVIONIX_ADSB_NACP_EPU_1_NM,

    /**
     *  
     */
    @MavlinkEntryInfo(80)
    UAVIONIX_ADSB_NACP_EPU_0_5_NM,

    /**
     *  
     */
    @MavlinkEntryInfo(96)
    UAVIONIX_ADSB_NACP_EPU_0_3_NM,

    /**
     *  
     */
    @MavlinkEntryInfo(112)
    UAVIONIX_ADSB_NACP_EPU_0_1_NM,

    /**
     *  
     */
    @MavlinkEntryInfo(128)
    UAVIONIX_ADSB_NACP_EPU_0_05_NM,

    /**
     *  
     */
    @MavlinkEntryInfo(144)
    UAVIONIX_ADSB_NACP_EPU_30_M,

    /**
     *  
     */
    @MavlinkEntryInfo(160)
    UAVIONIX_ADSB_NACP_EPU_10_M,

    /**
     *  
     */
    @MavlinkEntryInfo(176)
    UAVIONIX_ADSB_NACP_EPU_3_M
}
