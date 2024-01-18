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
 * Send a secure command. Data should be signed with a private key corresponding with a public key 
 * known to the recipient. Signature should be over the concatenation of the sequence number 
 * (little-endian format), the operation (little-endian format) the data and the session key. 
 * For SECURE_COMMAND_GET_SESSION_KEY the session key should be zero length. The data array 
 * consists of the data followed by the signature. The sum of the data_length and the sig_length 
 * cannot be more than 220. The format of the data is command specific. 
 */
@MavlinkMessageInfo(
        id = 11004,
        crc = 11,
        description = "Send a secure command. Data should be signed with a private key corresponding with a public key known to the recipient. Signature should be over the concatenation of the sequence number (little-endian format), the operation (little-endian format) the data and the session key. For SECURE_COMMAND_GET_SESSION_KEY the session key should be zero length. The data array consists of the data followed by the signature. The sum of the data_length and the sig_length cannot be more than 220. The format of the data is command specific."
)
public final class SecureCommand {
    private final int targetSystem;

    private final int targetComponent;

    private final long sequence;

    private final EnumValue<SecureCommandOp> operation;

    private final int dataLength;

    private final int sigLength;

    private final byte[] data;

    private SecureCommand(int targetSystem, int targetComponent, long sequence,
            EnumValue<SecureCommandOp> operation, int dataLength, int sigLength, byte[] data) {
        this.targetSystem = targetSystem;
        this.targetComponent = targetComponent;
        this.sequence = sequence;
        this.operation = operation;
        this.dataLength = dataLength;
        this.sigLength = sigLength;
        this.data = data;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecureCommand msg) {
        return builder()
                .targetSystem(msg.targetSystem)
                .targetComponent(msg.targetComponent)
                .sequence(msg.sequence)
                .operation(msg.operation)
                .dataLength(msg.dataLength)
                .sigLength(msg.sigLength)
                .data(msg.data);
    }

    /**
     * System ID. 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 1,
            description = "System ID."
    )
    public final int targetSystem() {
        return this.targetSystem;
    }

    /**
     * Component ID. 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 1,
            description = "Component ID."
    )
    public final int targetComponent() {
        return this.targetComponent;
    }

    /**
     * Sequence ID for tagging reply. 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 4,
            description = "Sequence ID for tagging reply."
    )
    public final long sequence() {
        return this.sequence;
    }

    /**
     * Operation being requested. 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 4,
            enumType = SecureCommandOp.class,
            description = "Operation being requested."
    )
    public final EnumValue<SecureCommandOp> operation() {
        return this.operation;
    }

    /**
     * Data length. 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 1,
            description = "Data length."
    )
    public final int dataLength() {
        return this.dataLength;
    }

    /**
     * Signature length. 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 1,
            description = "Signature length."
    )
    public final int sigLength() {
        return this.sigLength;
    }

    /**
     * Signed data. 
     */
    @MavlinkFieldInfo(
            position = 7,
            unitSize = 1,
            arraySize = 220,
            description = "Signed data."
    )
    public final byte[] data() {
        return this.data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        SecureCommand other = (SecureCommand)o;
        if (!Objects.deepEquals(targetSystem, other.targetSystem)) return false;
        if (!Objects.deepEquals(targetComponent, other.targetComponent)) return false;
        if (!Objects.deepEquals(sequence, other.sequence)) return false;
        if (!Objects.deepEquals(operation, other.operation)) return false;
        if (!Objects.deepEquals(dataLength, other.dataLength)) return false;
        if (!Objects.deepEquals(sigLength, other.sigLength)) return false;
        if (!Objects.deepEquals(data, other.data)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(targetSystem);
        result = 31 * result + Objects.hashCode(targetComponent);
        result = 31 * result + Objects.hashCode(sequence);
        result = 31 * result + Objects.hashCode(operation);
        result = 31 * result + Objects.hashCode(dataLength);
        result = 31 * result + Objects.hashCode(sigLength);
        result = 31 * result + Objects.hashCode(data);
        return result;
    }

    @Override
    public String toString() {
        return "SecureCommand{targetSystem=" + targetSystem
                 + ", targetComponent=" + targetComponent
                 + ", sequence=" + sequence
                 + ", operation=" + operation
                 + ", dataLength=" + dataLength
                 + ", sigLength=" + sigLength
                 + ", data=" + data + "}";
    }

    public static final class Builder {
        private int targetSystem;

        private int targetComponent;

        private long sequence;

        private EnumValue<SecureCommandOp> operation;

        private int dataLength;

        private int sigLength;

        private byte[] data;

        /**
         * System ID. 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 1,
                description = "System ID."
        )
        public final Builder targetSystem(int targetSystem) {
            this.targetSystem = targetSystem;
            return this;
        }

        /**
         * Component ID. 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 1,
                description = "Component ID."
        )
        public final Builder targetComponent(int targetComponent) {
            this.targetComponent = targetComponent;
            return this;
        }

        /**
         * Sequence ID for tagging reply. 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 4,
                description = "Sequence ID for tagging reply."
        )
        public final Builder sequence(long sequence) {
            this.sequence = sequence;
            return this;
        }

        /**
         * Operation being requested. 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 4,
                enumType = SecureCommandOp.class,
                description = "Operation being requested."
        )
        public final Builder operation(EnumValue<SecureCommandOp> operation) {
            this.operation = operation;
            return this;
        }

        /**
         * Operation being requested. 
         */
        public final Builder operation(SecureCommandOp entry) {
            return operation(EnumValue.of(entry));
        }

        /**
         * Operation being requested. 
         */
        public final Builder operation(Enum... flags) {
            return operation(EnumValue.create(flags));
        }

        /**
         * Operation being requested. 
         */
        public final Builder operation(Collection<Enum> flags) {
            return operation(EnumValue.create(flags));
        }

        /**
         * Data length. 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 1,
                description = "Data length."
        )
        public final Builder dataLength(int dataLength) {
            this.dataLength = dataLength;
            return this;
        }

        /**
         * Signature length. 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 1,
                description = "Signature length."
        )
        public final Builder sigLength(int sigLength) {
            this.sigLength = sigLength;
            return this;
        }

        /**
         * Signed data. 
         */
        @MavlinkFieldInfo(
                position = 7,
                unitSize = 1,
                arraySize = 220,
                description = "Signed data."
        )
        public final Builder data(byte[] data) {
            this.data = data;
            return this;
        }

        public final SecureCommand build() {
            return new SecureCommand(targetSystem, targetComponent, sequence, operation, dataLength, sigLength, data);
        }
    }
}
