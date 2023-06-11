package io.dronefleet.mavlink.python_array_test;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Double;
import java.lang.Float;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;
import java.util.Objects;

/**
 * Array test #7. 
 */
@MavlinkMessageInfo(
        id = 17157,
        crc = 187,
        description = "Array test #7."
)
public final class ArrayTest7 {
    private final List<Double> arD;

    private final List<Float> arF;

    private final int[] arU32;

    private final int[] arI32;

    private final short[] arU16;

    private final short[] arI16;

    private final byte[] arU8;

    private final byte[] arI8;

    private final String arC;

    private ArrayTest7(List<Double> arD, List<Float> arF, int[] arU32, int[] arI32, short[] arU16,
            short[] arI16, byte[] arU8, byte[] arI8, String arC) {
        this.arD = arD;
        this.arF = arF;
        this.arU32 = arU32;
        this.arI32 = arI32;
        this.arU16 = arU16;
        this.arI16 = arI16;
        this.arU8 = arU8;
        this.arI8 = arI8;
        this.arC = arC;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArrayTest7 msg) {
        return builder()
                .arD(msg.arD)
                .arF(msg.arF)
                .arU32(msg.arU32)
                .arI32(msg.arI32)
                .arU16(msg.arU16)
                .arI16(msg.arI16)
                .arU8(msg.arU8)
                .arI8(msg.arI8)
                .arC(msg.arC);
    }

    /**
     * Value array 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 8,
            arraySize = 2,
            description = "Value array"
    )
    public final List<Double> arD() {
        return this.arD;
    }

    /**
     * Value array 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 4,
            arraySize = 2,
            description = "Value array"
    )
    public final List<Float> arF() {
        return this.arF;
    }

    /**
     * Value array 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 4,
            arraySize = 2,
            description = "Value array"
    )
    public final int[] arU32() {
        return this.arU32;
    }

    /**
     * Value array 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 4,
            arraySize = 2,
            signed = true,
            description = "Value array"
    )
    public final int[] arI32() {
        return this.arI32;
    }

    /**
     * Value array 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 2,
            arraySize = 2,
            description = "Value array"
    )
    public final short[] arU16() {
        return this.arU16;
    }

    /**
     * Value array 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 2,
            arraySize = 2,
            signed = true,
            description = "Value array"
    )
    public final short[] arI16() {
        return this.arI16;
    }

    /**
     * Value array 
     */
    @MavlinkFieldInfo(
            position = 7,
            unitSize = 1,
            arraySize = 2,
            description = "Value array"
    )
    public final byte[] arU8() {
        return this.arU8;
    }

    /**
     * Value array 
     */
    @MavlinkFieldInfo(
            position = 8,
            unitSize = 1,
            arraySize = 2,
            signed = true,
            description = "Value array"
    )
    public final byte[] arI8() {
        return this.arI8;
    }

    /**
     * Value array 
     */
    @MavlinkFieldInfo(
            position = 9,
            unitSize = 1,
            arraySize = 32,
            description = "Value array"
    )
    public final String arC() {
        return this.arC;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        ArrayTest7 other = (ArrayTest7)o;
        if (!Objects.deepEquals(arD, other.arD)) return false;
        if (!Objects.deepEquals(arF, other.arF)) return false;
        if (!Objects.deepEquals(arU32, other.arU32)) return false;
        if (!Objects.deepEquals(arI32, other.arI32)) return false;
        if (!Objects.deepEquals(arU16, other.arU16)) return false;
        if (!Objects.deepEquals(arI16, other.arI16)) return false;
        if (!Objects.deepEquals(arU8, other.arU8)) return false;
        if (!Objects.deepEquals(arI8, other.arI8)) return false;
        if (!Objects.deepEquals(arC, other.arC)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(arD);
        result = 31 * result + Objects.hashCode(arF);
        result = 31 * result + Objects.hashCode(arU32);
        result = 31 * result + Objects.hashCode(arI32);
        result = 31 * result + Objects.hashCode(arU16);
        result = 31 * result + Objects.hashCode(arI16);
        result = 31 * result + Objects.hashCode(arU8);
        result = 31 * result + Objects.hashCode(arI8);
        result = 31 * result + Objects.hashCode(arC);
        return result;
    }

    @Override
    public String toString() {
        return "ArrayTest7{arD=" + arD
                 + ", arF=" + arF
                 + ", arU32=" + arU32
                 + ", arI32=" + arI32
                 + ", arU16=" + arU16
                 + ", arI16=" + arI16
                 + ", arU8=" + arU8
                 + ", arI8=" + arI8
                 + ", arC=" + arC + "}";
    }

    public static final class Builder {
        private List<Double> arD;

        private List<Float> arF;

        private int[] arU32;

        private int[] arI32;

        private short[] arU16;

        private short[] arI16;

        private byte[] arU8;

        private byte[] arI8;

        private String arC;

        /**
         * Value array 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 8,
                arraySize = 2,
                description = "Value array"
        )
        public final Builder arD(List<Double> arD) {
            this.arD = arD;
            return this;
        }

        /**
         * Value array 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 4,
                arraySize = 2,
                description = "Value array"
        )
        public final Builder arF(List<Float> arF) {
            this.arF = arF;
            return this;
        }

        /**
         * Value array 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 4,
                arraySize = 2,
                description = "Value array"
        )
        public final Builder arU32(int[] arU32) {
            this.arU32 = arU32;
            return this;
        }

        /**
         * Value array 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 4,
                arraySize = 2,
                signed = true,
                description = "Value array"
        )
        public final Builder arI32(int[] arI32) {
            this.arI32 = arI32;
            return this;
        }

        /**
         * Value array 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 2,
                arraySize = 2,
                description = "Value array"
        )
        public final Builder arU16(short[] arU16) {
            this.arU16 = arU16;
            return this;
        }

        /**
         * Value array 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 2,
                arraySize = 2,
                signed = true,
                description = "Value array"
        )
        public final Builder arI16(short[] arI16) {
            this.arI16 = arI16;
            return this;
        }

        /**
         * Value array 
         */
        @MavlinkFieldInfo(
                position = 7,
                unitSize = 1,
                arraySize = 2,
                description = "Value array"
        )
        public final Builder arU8(byte[] arU8) {
            this.arU8 = arU8;
            return this;
        }

        /**
         * Value array 
         */
        @MavlinkFieldInfo(
                position = 8,
                unitSize = 1,
                arraySize = 2,
                signed = true,
                description = "Value array"
        )
        public final Builder arI8(byte[] arI8) {
            this.arI8 = arI8;
            return this;
        }

        /**
         * Value array 
         */
        @MavlinkFieldInfo(
                position = 9,
                unitSize = 1,
                arraySize = 32,
                description = "Value array"
        )
        public final Builder arC(String arC) {
            this.arC = arC;
            return this;
        }

        public final ArrayTest7 build() {
            return new ArrayTest7(arD, arF, arU32, arI32, arU16, arI16, arU8, arI8, arC);
        }
    }
}
