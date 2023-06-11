package io.dronefleet.mavlink.loweheiser;

import io.dronefleet.mavlink.annotations.MavlinkEntryInfo;
import io.dronefleet.mavlink.annotations.MavlinkEnum;

/**
 *  
 */
@MavlinkEnum
public enum MavCmd {
    /**
     * Set Loweheiser desired states 
     * <dl>
     *   <dt>param1</dt>
     *   <dd>EFI Index</dd>
     *
     *   <dt>param2</dt>
     *   <dd>Desired Engine/EFI State (0: Power Off, 1:Running)</dd>
     *
     *   <dt>param3</dt>
     *   <dd>Desired Governor State (0:manual throttle, 1:Governed throttle)</dd>
     *
     *   <dt>param4</dt>
     *   <dd>Manual throttle level, 0% - 100%</dd>
     *
     *   <dt>param5</dt>
     *   <dd>Electronic Start up (0:Off, 1:On)</dd>
     *
     *   <dt>param6</dt>
     *   <dd>Empty</dd>
     *
     *   <dt>param7</dt>
     *   <dd>Empty</dd>
     * </dl>
     */
    @MavlinkEntryInfo(10151)
    MAV_CMD_LOWEHEISER_SET_STATE
}
