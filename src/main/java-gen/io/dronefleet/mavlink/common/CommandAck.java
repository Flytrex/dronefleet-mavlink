package io.dronefleet.mavlink.common;

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
public final class CommandAck {
    private final EnumValue<MavCmd> command;

    private final EnumValue<MavResult> result;

    private CommandAck(EnumValue<MavCmd> command, EnumValue<MavResult> result) {
        this.command = command;
        this.result = result;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        CommandAck other = (CommandAck)o;
        if (!Objects.deepEquals(command, other.command)) return false;
        if (!Objects.deepEquals(result, other.result)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(command);
        result = 31 * result + Objects.hashCode(result);
        return result;
    }

    @Override
    public String toString() {
        return "CommandAck{command=" + command
                 + ", result=" + result + "}";
    }

    public static final class Builder {
        private EnumValue<MavCmd> command;

        private EnumValue<MavResult> result;

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

        public final CommandAck build() {
            return new CommandAck(command, result);
        }
    }
}
