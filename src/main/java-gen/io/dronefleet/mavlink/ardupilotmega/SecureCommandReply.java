package io.dronefleet.mavlink.ardupilotmega;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import io.dronefleet.mavlink.common.MavResult;
import io.dronefleet.mavlink.util.EnumValue;
import java.lang.Enum;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Collection;
import java.util.Objects;

/**
 * Reply from secure command. 
 */
@MavlinkMessageInfo(
        id = 11005,
        crc = 93,
        description = "Reply from secure command."
)
public final class SecureCommandReply {
    private final long sequence;

    private final EnumValue<SecureCommandOp> operation;

    private final EnumValue<MavResult> result;

    private final int dataLength;

    private final byte[] data;

    private SecureCommandReply(long sequence, EnumValue<SecureCommandOp> operation,
            EnumValue<MavResult> result, int dataLength, byte[] data) {
        this.sequence = sequence;
        this.operation = operation;
        this.result = result;
        this.dataLength = dataLength;
        this.data = data;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecureCommandReply msg) {
        return builder()
                .sequence(msg.sequence)
                .operation(msg.operation)
                .result(msg.result)
                .dataLength(msg.dataLength)
                .data(msg.data);
    }

    /**
     * Sequence ID from request. 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 4,
            description = "Sequence ID from request."
    )
    public final long sequence() {
        return this.sequence;
    }

    /**
     * Operation that was requested. 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 4,
            enumType = SecureCommandOp.class,
            description = "Operation that was requested."
    )
    public final EnumValue<SecureCommandOp> operation() {
        return this.operation;
    }

    /**
     * Result of command. 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 1,
            enumType = MavResult.class,
            description = "Result of command."
    )
    public final EnumValue<MavResult> result() {
        return this.result;
    }

    /**
     * Data length. 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 1,
            description = "Data length."
    )
    public final int dataLength() {
        return this.dataLength;
    }

    /**
     * Reply data. 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 1,
            arraySize = 220,
            description = "Reply data."
    )
    public final byte[] data() {
        return this.data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        SecureCommandReply other = (SecureCommandReply)o;
        if (!Objects.deepEquals(sequence, other.sequence)) return false;
        if (!Objects.deepEquals(operation, other.operation)) return false;
        if (!Objects.deepEquals(result, other.result)) return false;
        if (!Objects.deepEquals(dataLength, other.dataLength)) return false;
        if (!Objects.deepEquals(data, other.data)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(sequence);
        result = 31 * result + Objects.hashCode(operation);
        result = 31 * result + Objects.hashCode(result);
        result = 31 * result + Objects.hashCode(dataLength);
        result = 31 * result + Objects.hashCode(data);
        return result;
    }

    @Override
    public String toString() {
        return "SecureCommandReply{sequence=" + sequence
                 + ", operation=" + operation
                 + ", result=" + result
                 + ", dataLength=" + dataLength
                 + ", data=" + data + "}";
    }

    public static final class Builder {
        private long sequence;

        private EnumValue<SecureCommandOp> operation;

        private EnumValue<MavResult> result;

        private int dataLength;

        private byte[] data;

        /**
         * Sequence ID from request. 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 4,
                description = "Sequence ID from request."
        )
        public final Builder sequence(long sequence) {
            this.sequence = sequence;
            return this;
        }

        /**
         * Operation that was requested. 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 4,
                enumType = SecureCommandOp.class,
                description = "Operation that was requested."
        )
        public final Builder operation(EnumValue<SecureCommandOp> operation) {
            this.operation = operation;
            return this;
        }

        /**
         * Operation that was requested. 
         */
        public final Builder operation(SecureCommandOp entry) {
            return operation(EnumValue.of(entry));
        }

        /**
         * Operation that was requested. 
         */
        public final Builder operation(Enum... flags) {
            return operation(EnumValue.create(flags));
        }

        /**
         * Operation that was requested. 
         */
        public final Builder operation(Collection<Enum> flags) {
            return operation(EnumValue.create(flags));
        }

        /**
         * Result of command. 
         */
        @MavlinkFieldInfo(
                position = 3,
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
         * Data length. 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 1,
                description = "Data length."
        )
        public final Builder dataLength(int dataLength) {
            this.dataLength = dataLength;
            return this;
        }

        /**
         * Reply data. 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 1,
                arraySize = 220,
                description = "Reply data."
        )
        public final Builder data(byte[] data) {
            this.data = data;
            return this;
        }

        public final SecureCommandReply build() {
            return new SecureCommandReply(sequence, operation, result, dataLength, data);
        }
    }
}
