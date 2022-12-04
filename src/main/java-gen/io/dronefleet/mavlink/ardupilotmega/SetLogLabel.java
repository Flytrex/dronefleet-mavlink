package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Mark the current log with a specific label 
 */
@MavlinkMessageInfo(
        id = 12100,
        crc = 103,
        description = "Mark the current log with a specific label"
)
public final class SetLogLabel {
    private final int targetSystem;

    private final int targetComponent;

    private final String label;

    private SetLogLabel(int targetSystem, int targetComponent, String label) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.label = label;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SetLogLabel msg) {
        return builder()
                .targetSystem(msg.targetSystem)
                .targetComponent(msg.targetComponent)
                .label(msg.label);
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
     * Label to apply to the current log, NULL terminated 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 1,
            arraySize = 50,
            description = "Label to apply to the current log, NULL terminated"
    )
    public final String label() {
        return this.label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        SetLogLabel other = (SetLogLabel)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(label, other.label)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(label);
        return result;
    }

    @Override
    public String toString() {
        return "SetLogLabel{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", label=" + label + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private String label;

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
         * Label to apply to the current log, NULL terminated 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 1,
                arraySize = 50,
                description = "Label to apply to the current log, NULL terminated"
        )
        public final Builder label(String label) {
            this.label = label;
            return this;
        }

        public final SetLogLabel build() {
            return new SetLogLabel(targetSystem, targetComponent, label);
        }
    }
}
