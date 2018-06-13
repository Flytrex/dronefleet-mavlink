package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.annotations.MavlinkMessage;
import io.dronefleet.mavlink.annotations.MavlinkMessageField;
import java.math.BigInteger;

/**
 * Sent from autopilot to simulation. Hardware in the loop control outputs 
 */
@MavlinkMessage(
    id = 91,
    crc = 63
)
public final class HilControls {
  /**
   * Timestamp (microseconds since UNIX epoch or microseconds since system boot) 
   */
  private final BigInteger timeUsec;

  /**
   * Control output -1 .. 1 
   */
  private final float rollAilerons;

  /**
   * Control output -1 .. 1 
   */
  private final float pitchElevator;

  /**
   * Control output -1 .. 1 
   */
  private final float yawRudder;

  /**
   * Throttle 0 .. 1 
   */
  private final float throttle;

  /**
   * Aux 1, -1 .. 1 
   */
  private final float aux1;

  /**
   * Aux 2, -1 .. 1 
   */
  private final float aux2;

  /**
   * Aux 3, -1 .. 1 
   */
  private final float aux3;

  /**
   * Aux 4, -1 .. 1 
   */
  private final float aux4;

  /**
   * System mode ({@link io.dronefleet.mavlink.common.MavMode MavMode}) 
   */
  private final MavMode mode;

  /**
   * Navigation mode (MAV_NAV_MODE) 
   */
  private final int navMode;

  private HilControls(BigInteger timeUsec, float rollAilerons, float pitchElevator, float yawRudder,
      float throttle, float aux1, float aux2, float aux3, float aux4, MavMode mode, int navMode) {
    this.timeUsec = timeUsec;
    this.rollAilerons = rollAilerons;
    this.pitchElevator = pitchElevator;
    this.yawRudder = yawRudder;
    this.throttle = throttle;
    this.aux1 = aux1;
    this.aux2 = aux2;
    this.aux3 = aux3;
    this.aux4 = aux4;
    this.mode = mode;
    this.navMode = navMode;
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Timestamp (microseconds since UNIX epoch or microseconds since system boot) 
   */
  @MavlinkMessageField(
      position = 1,
      length = 8
  )
  public final BigInteger timeUsec() {
    return timeUsec;
  }

  /**
   * Control output -1 .. 1 
   */
  @MavlinkMessageField(
      position = 2,
      length = 4
  )
  public final float rollAilerons() {
    return rollAilerons;
  }

  /**
   * Control output -1 .. 1 
   */
  @MavlinkMessageField(
      position = 3,
      length = 4
  )
  public final float pitchElevator() {
    return pitchElevator;
  }

  /**
   * Control output -1 .. 1 
   */
  @MavlinkMessageField(
      position = 4,
      length = 4
  )
  public final float yawRudder() {
    return yawRudder;
  }

  /**
   * Throttle 0 .. 1 
   */
  @MavlinkMessageField(
      position = 5,
      length = 4
  )
  public final float throttle() {
    return throttle;
  }

  /**
   * Aux 1, -1 .. 1 
   */
  @MavlinkMessageField(
      position = 6,
      length = 4
  )
  public final float aux1() {
    return aux1;
  }

  /**
   * Aux 2, -1 .. 1 
   */
  @MavlinkMessageField(
      position = 7,
      length = 4
  )
  public final float aux2() {
    return aux2;
  }

  /**
   * Aux 3, -1 .. 1 
   */
  @MavlinkMessageField(
      position = 8,
      length = 4
  )
  public final float aux3() {
    return aux3;
  }

  /**
   * Aux 4, -1 .. 1 
   */
  @MavlinkMessageField(
      position = 9,
      length = 4
  )
  public final float aux4() {
    return aux4;
  }

  /**
   * System mode ({@link io.dronefleet.mavlink.common.MavMode MavMode}) 
   */
  @MavlinkMessageField(
      position = 10,
      length = 1
  )
  public final MavMode mode() {
    return mode;
  }

  /**
   * Navigation mode (MAV_NAV_MODE) 
   */
  @MavlinkMessageField(
      position = 11,
      length = 1
  )
  public final int navMode() {
    return navMode;
  }

  public static class Builder {
    private BigInteger timeUsec;

    private float rollAilerons;

    private float pitchElevator;

    private float yawRudder;

    private float throttle;

    private float aux1;

    private float aux2;

    private float aux3;

    private float aux4;

    private MavMode mode;

    private int navMode;

    private Builder() {
    }

    /**
     * Timestamp (microseconds since UNIX epoch or microseconds since system boot) 
     */
    @MavlinkMessageField(
        position = 1,
        length = 8
    )
    public final Builder timeUsec(BigInteger timeUsec) {
      this.timeUsec = timeUsec;
      return this;
    }

    /**
     * Control output -1 .. 1 
     */
    @MavlinkMessageField(
        position = 2,
        length = 4
    )
    public final Builder rollAilerons(float rollAilerons) {
      this.rollAilerons = rollAilerons;
      return this;
    }

    /**
     * Control output -1 .. 1 
     */
    @MavlinkMessageField(
        position = 3,
        length = 4
    )
    public final Builder pitchElevator(float pitchElevator) {
      this.pitchElevator = pitchElevator;
      return this;
    }

    /**
     * Control output -1 .. 1 
     */
    @MavlinkMessageField(
        position = 4,
        length = 4
    )
    public final Builder yawRudder(float yawRudder) {
      this.yawRudder = yawRudder;
      return this;
    }

    /**
     * Throttle 0 .. 1 
     */
    @MavlinkMessageField(
        position = 5,
        length = 4
    )
    public final Builder throttle(float throttle) {
      this.throttle = throttle;
      return this;
    }

    /**
     * Aux 1, -1 .. 1 
     */
    @MavlinkMessageField(
        position = 6,
        length = 4
    )
    public final Builder aux1(float aux1) {
      this.aux1 = aux1;
      return this;
    }

    /**
     * Aux 2, -1 .. 1 
     */
    @MavlinkMessageField(
        position = 7,
        length = 4
    )
    public final Builder aux2(float aux2) {
      this.aux2 = aux2;
      return this;
    }

    /**
     * Aux 3, -1 .. 1 
     */
    @MavlinkMessageField(
        position = 8,
        length = 4
    )
    public final Builder aux3(float aux3) {
      this.aux3 = aux3;
      return this;
    }

    /**
     * Aux 4, -1 .. 1 
     */
    @MavlinkMessageField(
        position = 9,
        length = 4
    )
    public final Builder aux4(float aux4) {
      this.aux4 = aux4;
      return this;
    }

    /**
     * System mode ({@link io.dronefleet.mavlink.common.MavMode MavMode}) 
     */
    @MavlinkMessageField(
        position = 10,
        length = 1
    )
    public final Builder mode(MavMode mode) {
      this.mode = mode;
      return this;
    }

    /**
     * Navigation mode (MAV_NAV_MODE) 
     */
    @MavlinkMessageField(
        position = 11,
        length = 1
    )
    public final Builder navMode(int navMode) {
      this.navMode = navMode;
      return this;
    }

    public final HilControls build() {
      return new HilControls(timeUsec, rollAilerons, pitchElevator, yawRudder, throttle, aux1, aux2, aux3, aux4, mode, navMode);
    }
  }
}