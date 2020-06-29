package io.dronefleet.mavlink.ualberta;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Complete set of calibration parameters for the radio 
 */
@MavlinkMessageInfo(
        id = 221,
        crc = 71,
        description = "Complete set of calibration parameters for the radio"
)
public final class RadioCalibration {
    private final short[] aileron;

    private final short[] elevator;

    private final short[] rudder;

    private final short[] gyro;

    private final short[] pitch;

    private final short[] throttle;

    private RadioCalibration(short[] aileron, short[] elevator, short[] rudder, short[] gyro,
            short[] pitch, short[] throttle) {
        this.aileron = aileron;
        this.elevator = elevator;
        this.rudder = rudder;
        this.gyro = gyro;
        this.pitch = pitch;
        this.throttle = throttle;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Aileron setpoints: left, center, right 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 2,
            arraySize = 3,
            description = "Aileron setpoints: left, center, right"
    )
    public final short[] aileron() {
        return this.aileron;
    }

    /**
     * Elevator setpoints: nose down, center, nose up 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 2,
            arraySize = 3,
            description = "Elevator setpoints: nose down, center, nose up"
    )
    public final short[] elevator() {
        return this.elevator;
    }

    /**
     * Rudder setpoints: nose left, center, nose right 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 2,
            arraySize = 3,
            description = "Rudder setpoints: nose left, center, nose right"
    )
    public final short[] rudder() {
        return this.rudder;
    }

    /**
     * Tail gyro mode/gain setpoints: heading hold, rate mode 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 2,
            arraySize = 2,
            description = "Tail gyro mode/gain setpoints: heading hold, rate mode"
    )
    public final short[] gyro() {
        return this.gyro;
    }

    /**
     * Pitch curve setpoints (every 25%) 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 2,
            arraySize = 5,
            description = "Pitch curve setpoints (every 25%)"
    )
    public final short[] pitch() {
        return this.pitch;
    }

    /**
     * Throttle curve setpoints (every 25%) 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 2,
            arraySize = 5,
            description = "Throttle curve setpoints (every 25%)"
    )
    public final short[] throttle() {
        return this.throttle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        RadioCalibration other = (RadioCalibration)o;
        if (!Objects.deepEquals(aileron, other.aileron)) return false;
        if (!Objects.deepEquals(elevator, other.elevator)) return false;
        if (!Objects.deepEquals(rudder, other.rudder)) return false;
        if (!Objects.deepEquals(gyro, other.gyro)) return false;
        if (!Objects.deepEquals(pitch, other.pitch)) return false;
        if (!Objects.deepEquals(throttle, other.throttle)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(aileron);
        result = 31 * result + Objects.hashCode(elevator);
        result = 31 * result + Objects.hashCode(rudder);
        result = 31 * result + Objects.hashCode(gyro);
        result = 31 * result + Objects.hashCode(pitch);
        result = 31 * result + Objects.hashCode(throttle);
        return result;
    }

    @Override
    public String toString() {
        return "RadioCalibration{aileron=" + aileron
                 + ", elevator=" + elevator
                 + ", rudder=" + rudder
                 + ", gyro=" + gyro
                 + ", pitch=" + pitch
                 + ", throttle=" + throttle + "}";
    }

    public static final class Builder {
        private short[] aileron;

        private short[] elevator;

        private short[] rudder;

        private short[] gyro;

        private short[] pitch;

        private short[] throttle;

        /**
         * Aileron setpoints: left, center, right 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 2,
                arraySize = 3,
                description = "Aileron setpoints: left, center, right"
        )
        public final Builder aileron(short[] aileron) {
            this.aileron = aileron;
            return this;
        }

        /**
         * Elevator setpoints: nose down, center, nose up 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 2,
                arraySize = 3,
                description = "Elevator setpoints: nose down, center, nose up"
        )
        public final Builder elevator(short[] elevator) {
            this.elevator = elevator;
            return this;
        }

        /**
         * Rudder setpoints: nose left, center, nose right 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 2,
                arraySize = 3,
                description = "Rudder setpoints: nose left, center, nose right"
        )
        public final Builder rudder(short[] rudder) {
            this.rudder = rudder;
            return this;
        }

        /**
         * Tail gyro mode/gain setpoints: heading hold, rate mode 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 2,
                arraySize = 2,
                description = "Tail gyro mode/gain setpoints: heading hold, rate mode"
        )
        public final Builder gyro(short[] gyro) {
            this.gyro = gyro;
            return this;
        }

        /**
         * Pitch curve setpoints (every 25%) 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 2,
                arraySize = 5,
                description = "Pitch curve setpoints (every 25%)"
        )
        public final Builder pitch(short[] pitch) {
            this.pitch = pitch;
            return this;
        }

        /**
         * Throttle curve setpoints (every 25%) 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 2,
                arraySize = 5,
                description = "Throttle curve setpoints (every 25%)"
        )
        public final Builder throttle(short[] throttle) {
            this.throttle = throttle;
            return this;
        }

        public final RadioCalibration build() {
            return new RadioCalibration(aileron, elevator, rudder, gyro, pitch, throttle);
        }
    }
}
