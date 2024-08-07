package io.dronefleet.mavlink.common;

import io.dronefleet.mavlink.HasTransmissionId;
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
 * Report status of a command. Includes feedback whether the command was executed. The command 
 * microservice is documented at https://mavlink.io/en/services/command.html 
 */
@MavlinkMessageInfo(
        id = 77,
        crc = 143,
        description = "Report status of a command. Includes feedback whether the command was executed. The command microservice is documented at https://mavlink.io/en/services/command.html"
)
public final class CommandAck implements HasTransmissionId<CommandAck> {
    private final EnumValue<MavCmd> command;

    private final EnumValue<MavResult> result;

    private final int progress;

    private final int resultParam2;

    private final int targetSystem;

    private final int targetComponent;

    private final int tid;

    private CommandAck(EnumValue<MavCmd> command, EnumValue<MavResult> result, int progress,
            int resultParam2, int targetSystem, int targetComponent, int tid) {
        this.command = command;
        this.result = result;
        this.progress = progress;
        this.resultParam2 = resultParam2;
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.tid = tid;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommandAck msg) {
        return builder()
                .command(msg.command)
                .result(msg.result)
                .progress(msg.progress)
                .resultParam2(msg.resultParam2)
                .targetSystem(msg.targetSystem)
                .targetComponent(msg.targetComponent)
                .tid(msg.tid);
    }

    /**
     * Command ID (of acknowledged command). 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 2,
            enumType = MavCmd.class,
            description = "Command ID (of acknowledged command)."
    )
    public final EnumValue<MavCmd> command() {
        return this.command;
    }

    /**
     * Result of command. 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 1,
            enumType = MavResult.class,
            description = "Result of command."
    )
    public final EnumValue<MavResult> result() {
        return this.result;
    }

    /**
     * Also used as result_param1, it can be set with a enum containing the errors reasons of why the 
     * command was denied or the progress percentage or 255 if unknown the progress when result is 
     * MAV_RESULT_IN_PROGRESS. 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 1,
            extension = true,
            description = "Also used as result_param1, it can be set with a enum containing the errors reasons of why the command was denied or the progress percentage or 255 if unknown the progress when result is MAV_RESULT_IN_PROGRESS."
    )
    public final int progress() {
        return this.progress;
    }

    /**
     * Additional parameter of the result, example: which parameter of MAV_CMD_NAV_WAYPOINT 
     * caused it to be denied. 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 4,
            signed = true,
            extension = true,
            description = "Additional parameter of the result, example: which parameter of MAV_CMD_NAV_WAYPOINT caused it to be denied."
    )
    public final int resultParam2() {
        return this.resultParam2;
    }

    /**
     * System which requested the command to be executed 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 1,
            extension = true,
            description = "System which requested the command to be executed"
    )
    public final int targetSystem() {
        return this.targetSystem;
    }

    /**
     * Component which requested the command to be executed 
     */
    @MavlinkFieldInfo(
            position = 7,
            unitSize = 1,
            extension = true,
            description = "Component which requested the command to be executed"
    )
    public final int targetComponent() {
        return this.targetComponent;
    }

    /**
     * Transmission id. 
     */
    @MavlinkFieldInfo(
            position = 8,
            unitSize = 1,
            extension = true,
            description = "Transmission id."
    )
    public final int tid() {
        return this.tid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        CommandAck other = (CommandAck)o;
        if (!Objects.deepEquals(command, other.command)) return false;
        if (!Objects.deepEquals(result, other.result)) return false;
        if (!Objects.deepEquals(progress, other.progress)) return false;
        if (!Objects.deepEquals(resultParam2, other.resultParam2)) return false;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(tid, other.tid)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(command);
        result = 31 * result + Objects.hashCode(result);
        result = 31 * result + Objects.hashCode(progress);
        result = 31 * result + Objects.hashCode(resultParam2);
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(tid);
        return result;
    }

    @Override
    public String toString() {
        return "CommandAck{command=" + command
                 + ", result=" + result
                 + ", progress=" + progress
                 + ", resultParam2=" + resultParam2
                 + ", targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", tid=" + tid + "}";
    }

    @Override
    public CommandAck withTransmissionId(int tid) {
        return builder(this).tid(tid).build();
    }

    public static final class Builder {
        private EnumValue<MavCmd> command;

        private EnumValue<MavResult> result;

        private int progress;

        private int resultParam2;

        private int targetSystem;

        private int targetComponent;

        private int tid;

        /**
         * Command ID (of acknowledged command). 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 2,
                enumType = MavCmd.class,
                description = "Command ID (of acknowledged command)."
        )
        public final Builder command(EnumValue<MavCmd> command) {
            this.command = command;
            return this;
        }

        /**
         * Command ID (of acknowledged command). 
         */
        public final Builder command(MavCmd entry) {
            return command(EnumValue.of(entry));
        }

        /**
         * Command ID (of acknowledged command). 
         */
        public final Builder command(Enum... flags) {
            return command(EnumValue.create(flags));
        }

        /**
         * Command ID (of acknowledged command). 
         */
        public final Builder command(Collection<Enum> flags) {
            return command(EnumValue.create(flags));
        }

        /**
         * Result of command. 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 1,
                enumType = MavResult.class,
                description = "Result of command."
        )
        public final Builder result(EnumValue<MavResult> result) {
            this.result = result;
            return this;
        }

        /**
         * Result of command. 
         */
        public final Builder result(MavResult entry) {
            return result(EnumValue.of(entry));
        }

        /**
         * Result of command. 
         */
        public final Builder result(Enum... flags) {
            return result(EnumValue.create(flags));
        }

        /**
         * Result of command. 
         */
        public final Builder result(Collection<Enum> flags) {
            return result(EnumValue.create(flags));
        }

        /**
         * Also used as result_param1, it can be set with a enum containing the errors reasons of why the 
         * command was denied or the progress percentage or 255 if unknown the progress when result is 
         * MAV_RESULT_IN_PROGRESS. 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 1,
                extension = true,
                description = "Also used as result_param1, it can be set with a enum containing the errors reasons of why the command was denied or the progress percentage or 255 if unknown the progress when result is MAV_RESULT_IN_PROGRESS."
        )
        public final Builder progress(int progress) {
            this.progress = progress;
            return this;
        }

        /**
         * Additional parameter of the result, example: which parameter of MAV_CMD_NAV_WAYPOINT 
         * caused it to be denied. 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 4,
                signed = true,
                extension = true,
                description = "Additional parameter of the result, example: which parameter of MAV_CMD_NAV_WAYPOINT caused it to be denied."
        )
        public final Builder resultParam2(int resultParam2) {
            this.resultParam2 = resultParam2;
            return this;
        }

        /**
         * System which requested the command to be executed 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 1,
                extension = true,
                description = "System which requested the command to be executed"
        )
        public final Builder targetSystem(int targetSystem) {
            this.targetSystem = targetSystem;
            return this;
        }

        /**
         * Component which requested the command to be executed 
         */
        @MavlinkFieldInfo(
                position = 7,
                unitSize = 1,
                extension = true,
                description = "Component which requested the command to be executed"
        )
        public final Builder targetComponent(int targetComponent) {
            this.targetComponent = targetComponent;
            return this;
        }

        /**
         * Transmission id. 
         */
        @MavlinkFieldInfo(
                position = 8,
                unitSize = 1,
                extension = true,
                description = "Transmission id."
        )
        public final Builder tid(int tid) {
            this.tid = tid;
            return this;
        }

        public final CommandAck build() {
            return new CommandAck(command, result, progress, resultParam2, targetSystem, targetComponent, tid);
        }
    }
}
