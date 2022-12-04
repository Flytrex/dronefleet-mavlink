package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Play a tone (buzzer) for a duration (in ms) 
 */
@MavlinkMessageInfo(
        id = 12200,
        crc = 226,
        description = "Play a tone (buzzer) for a duration (in ms)"
)
public final class PlayTone {
    private final int targetSystem;

    private final int targetComponent;

    private final long duration;

    private PlayTone(int targetSystem, int targetComponent, long duration) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.duration = duration;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlayTone msg) {
        return builder()
                .targetSystem(msg.targetSystem)
                .targetComponent(msg.targetComponent)
                .duration(msg.duration);
    }

    /**
     * System ID 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 1,
            description = "System ID"
    )
    public final int targetSystem() {
        return this.targetSystem;
    }

    /**
     * Component ID 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 1,
            description = "Component ID"
    )
    public final int targetComponent() {
        return this.targetComponent;
    }

    /**
     * Duration (in milliseconds) to play the tone for 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 4,
            description = "Duration (in milliseconds) to play the tone for"
    )
    public final long duration() {
        return this.duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        PlayTone other = (PlayTone)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(duration, other.duration)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(duration);
        return result;
    }

    @Override
    public String toString() {
        return "PlayTone{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", duration=" + duration + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private long duration;

        /**
         * System ID 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 1,
                description = "System ID"
        )
        public final Builder targetSystem(int targetSystem) {
            this.targetSystem = targetSystem;
            return this;
        }

        /**
         * Component ID 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 1,
                description = "Component ID"
        )
        public final Builder targetComponent(int targetComponent) {
            this.targetComponent = targetComponent;
            return this;
        }

        /**
         * Duration (in milliseconds) to play the tone for 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 4,
                description = "Duration (in milliseconds) to play the tone for"
        )
        public final Builder duration(long duration) {
            this.duration = duration;
            return this;
        }

        public final PlayTone build() {
            return new PlayTone(targetSystem, targetComponent, duration);
        }
    }
}
