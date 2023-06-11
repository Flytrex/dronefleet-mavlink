package io.dronefleet.mavlink.uavionix;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Aircraft Registration. 
 */
@MavlinkMessageInfo(
        id = 10004,
        crc = 133,
        description = "Aircraft Registration."
)
public final class UavionixAdsbOutCfgRegistration {
    private final String registration;

    private UavionixAdsbOutCfgRegistration(String registration) {
        this.registration = registration;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UavionixAdsbOutCfgRegistration msg) {
        return builder()
                .registration(msg.registration);
    }

    /**
     * Aircraft Registration (ASCII string A-Z, 0-9 only), e.g. "N8644B ". Trailing spaces (0x20) 
     * only. This is null-terminated. 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 1,
            arraySize = 9,
            description = "Aircraft Registration (ASCII string A-Z, 0-9 only), e.g. \"N8644B \". Trailing spaces (0x20) only. This is null-terminated."
    )
    public final String registration() {
        return this.registration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        UavionixAdsbOutCfgRegistration other = (UavionixAdsbOutCfgRegistration)o;
        if (!Objects.deepEquals(registration, other.registration)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(registration);
        return result;
    }

    @Override
    public String toString() {
        return "UavionixAdsbOutCfgRegistration{registration=" + registration + "}";
    }

    public static final class Builder {
        private String registration;

        /**
         * Aircraft Registration (ASCII string A-Z, 0-9 only), e.g. "N8644B ". Trailing spaces (0x20) 
         * only. This is null-terminated. 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 1,
                arraySize = 9,
                description = "Aircraft Registration (ASCII string A-Z, 0-9 only), e.g. \"N8644B \". Trailing spaces (0x20) only. This is null-terminated."
        )
        public final Builder registration(String registration) {
            this.registration = registration;
            return this;
        }

        public final UavionixAdsbOutCfgRegistration build() {
            return new UavionixAdsbOutCfgRegistration(registration);
        }
    }
}
