package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import io.dronefleet.mavlink.util.EnumValue;
import java.lang.Enum;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collection;
import java.util.Objects;

/**
 * Health status of different components 
 */
@MavlinkMessageInfo(
        id = 12010,
        crc = 40,
        description = "Health status of different components"
)
public final class ComponentHealthStatus {
    private final EnumValue<GpsAccuracyLevel> gpsAccuracyLevel;

    private ComponentHealthStatus(EnumValue<GpsAccuracyLevel> gpsAccuracyLevel) {
        this.gpsAccuracyLevel = gpsAccuracyLevel;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComponentHealthStatus msg) {
        return builder()
                .gpsAccuracyLevel(msg.gpsAccuracyLevel);
    }

    /**
     * Accuracy level of the GPS units. 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 1,
            enumType = GpsAccuracyLevel.class,
            description = "Accuracy level of the GPS units."
    )
    public final EnumValue<GpsAccuracyLevel> gpsAccuracyLevel() {
        return this.gpsAccuracyLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        ComponentHealthStatus other = (ComponentHealthStatus)o;
        if (!Objects.deepEquals(gpsAccuracyLevel, other.gpsAccuracyLevel)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(gpsAccuracyLevel);
        return result;
    }

    @Override
    public String toString() {
        return "ComponentHealthStatus{gpsAccuracyLevel=" + gpsAccuracyLevel + "}";
    }

    public static final class Builder {
        private EnumValue<GpsAccuracyLevel> gpsAccuracyLevel;

        /**
         * Accuracy level of the GPS units. 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 1,
                enumType = GpsAccuracyLevel.class,
                description = "Accuracy level of the GPS units."
        )
        public final Builder gpsAccuracyLevel(EnumValue<GpsAccuracyLevel> gpsAccuracyLevel) {
            this.gpsAccuracyLevel = gpsAccuracyLevel;
            return this;
        }

        /**
         * Accuracy level of the GPS units. 
         */
        public final Builder gpsAccuracyLevel(GpsAccuracyLevel entry) {
            return gpsAccuracyLevel(EnumValue.of(entry));
        }

        /**
         * Accuracy level of the GPS units. 
         */
        public final Builder gpsAccuracyLevel(Enum... flags) {
            return gpsAccuracyLevel(EnumValue.create(flags));
        }

        /**
         * Accuracy level of the GPS units. 
         */
        public final Builder gpsAccuracyLevel(Collection<Enum> flags) {
            return gpsAccuracyLevel(EnumValue.create(flags));
        }

        public final ComponentHealthStatus build() {
            return new ComponentHealthStatus(gpsAccuracyLevel);
        }
    }
}
