package io.dronefleet.mavlink.loweheiser;

import io.dronefleet.mavlink.annotations.MavlinkFieldInfo;
import io.dronefleet.mavlink.annotations.MavlinkMessageBuilder;
import io.dronefleet.mavlink.annotations.MavlinkMessageInfo;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;

/**
 * Composite EFI and Governor data from Loweheiser equipment. This message is created by the EFI 
 * unit based on its own data and data received from a governor attached to that EFI unit. 
 */
@MavlinkMessageInfo(
        id = 10151,
        crc = 195,
        description = "Composite EFI and Governor data from Loweheiser equipment.  This message is created by the EFI unit based on its own data and data received from a governor attached to that EFI unit."
)
public final class LoweheiserGovEfi {
    private final float voltBatt;

    private final float currBatt;

    private final float currGen;

    private final float currRot;

    private final float fuelLevel;

    private final float throttle;

    private final long runtime;

    private final int untilMaintenance;

    private final float rectifierTemp;

    private final float generatorTemp;

    private final float efiBatt;

    private final float efiRpm;

    private final float efiPw;

    private final float efiFuelFlow;

    private final float efiFuelConsumed;

    private final float efiBaro;

    private final float efiMat;

    private final float efiClt;

    private final float efiTps;

    private final float efiExhaustGasTemperature;

    private final int efiIndex;

    private final int generatorStatus;

    private final int efiStatus;

    private LoweheiserGovEfi(float voltBatt, float currBatt, float currGen, float currRot,
            float fuelLevel, float throttle, long runtime, int untilMaintenance,
            float rectifierTemp, float generatorTemp, float efiBatt, float efiRpm, float efiPw,
            float efiFuelFlow, float efiFuelConsumed, float efiBaro, float efiMat, float efiClt,
            float efiTps, float efiExhaustGasTemperature, int efiIndex, int generatorStatus,
            int efiStatus) {
        this.voltBatt = voltBatt;
        this.currBatt = currBatt;
        this.currGen = currGen;
        this.currRot = currRot;
        this.fuelLevel = fuelLevel;
        this.throttle = throttle;
        this.runtime = runtime;
        this.untilMaintenance = untilMaintenance;
        this.rectifierTemp = rectifierTemp;
        this.generatorTemp = generatorTemp;
        this.efiBatt = efiBatt;
        this.efiRpm = efiRpm;
        this.efiPw = efiPw;
        this.efiFuelFlow = efiFuelFlow;
        this.efiFuelConsumed = efiFuelConsumed;
        this.efiBaro = efiBaro;
        this.efiMat = efiMat;
        this.efiClt = efiClt;
        this.efiTps = efiTps;
        this.efiExhaustGasTemperature = efiExhaustGasTemperature;
        this.efiIndex = efiIndex;
        this.generatorStatus = generatorStatus;
        this.efiStatus = efiStatus;
    }

    /**
     * Returns a builder instance for this message.
     */
    @MavlinkMessageBuilder
    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoweheiserGovEfi msg) {
        return builder()
                .voltBatt(msg.voltBatt)
                .currBatt(msg.currBatt)
                .currGen(msg.currGen)
                .currRot(msg.currRot)
                .fuelLevel(msg.fuelLevel)
                .throttle(msg.throttle)
                .runtime(msg.runtime)
                .untilMaintenance(msg.untilMaintenance)
                .rectifierTemp(msg.rectifierTemp)
                .generatorTemp(msg.generatorTemp)
                .efiBatt(msg.efiBatt)
                .efiRpm(msg.efiRpm)
                .efiPw(msg.efiPw)
                .efiFuelFlow(msg.efiFuelFlow)
                .efiFuelConsumed(msg.efiFuelConsumed)
                .efiBaro(msg.efiBaro)
                .efiMat(msg.efiMat)
                .efiClt(msg.efiClt)
                .efiTps(msg.efiTps)
                .efiExhaustGasTemperature(msg.efiExhaustGasTemperature)
                .efiIndex(msg.efiIndex)
                .generatorStatus(msg.generatorStatus)
                .efiStatus(msg.efiStatus);
    }

    /**
     * Generator Battery voltage. 
     */
    @MavlinkFieldInfo(
            position = 1,
            unitSize = 4,
            description = "Generator Battery voltage."
    )
    public final float voltBatt() {
        return this.voltBatt;
    }

    /**
     * Generator Battery current. 
     */
    @MavlinkFieldInfo(
            position = 2,
            unitSize = 4,
            description = "Generator Battery current."
    )
    public final float currBatt() {
        return this.currBatt;
    }

    /**
     * Current being produced by generator. 
     */
    @MavlinkFieldInfo(
            position = 3,
            unitSize = 4,
            description = "Current being produced by generator."
    )
    public final float currGen() {
        return this.currGen;
    }

    /**
     * Load current being consumed by the UAV (sum of curr_gen and curr_batt) 
     */
    @MavlinkFieldInfo(
            position = 4,
            unitSize = 4,
            description = "Load current being consumed by the UAV (sum of curr_gen and curr_batt)"
    )
    public final float currRot() {
        return this.currRot;
    }

    /**
     * Generator fuel remaining in litres. 
     */
    @MavlinkFieldInfo(
            position = 5,
            unitSize = 4,
            description = "Generator fuel remaining in litres."
    )
    public final float fuelLevel() {
        return this.fuelLevel;
    }

    /**
     * Throttle Output. 
     */
    @MavlinkFieldInfo(
            position = 6,
            unitSize = 4,
            description = "Throttle Output."
    )
    public final float throttle() {
        return this.throttle;
    }

    /**
     * Seconds this generator has run since it was rebooted. 
     */
    @MavlinkFieldInfo(
            position = 7,
            unitSize = 4,
            description = "Seconds this generator has run since it was rebooted."
    )
    public final long runtime() {
        return this.runtime;
    }

    /**
     * Seconds until this generator requires maintenance. A negative value indicates maintenance 
     * is past due. 
     */
    @MavlinkFieldInfo(
            position = 8,
            unitSize = 4,
            signed = true,
            description = "Seconds until this generator requires maintenance.  A negative value indicates maintenance is past due."
    )
    public final int untilMaintenance() {
        return this.untilMaintenance;
    }

    /**
     * The Temperature of the rectifier. 
     */
    @MavlinkFieldInfo(
            position = 9,
            unitSize = 4,
            description = "The Temperature of the rectifier."
    )
    public final float rectifierTemp() {
        return this.rectifierTemp;
    }

    /**
     * The temperature of the mechanical motor, fuel cell core or generator. 
     */
    @MavlinkFieldInfo(
            position = 10,
            unitSize = 4,
            description = "The temperature of the mechanical motor, fuel cell core or generator."
    )
    public final float generatorTemp() {
        return this.generatorTemp;
    }

    /**
     * EFI Supply Voltage. 
     */
    @MavlinkFieldInfo(
            position = 11,
            unitSize = 4,
            description = "EFI Supply Voltage."
    )
    public final float efiBatt() {
        return this.efiBatt;
    }

    /**
     * Motor RPM. 
     */
    @MavlinkFieldInfo(
            position = 12,
            unitSize = 4,
            description = "Motor RPM."
    )
    public final float efiRpm() {
        return this.efiRpm;
    }

    /**
     * Injector pulse-width in miliseconds. 
     */
    @MavlinkFieldInfo(
            position = 13,
            unitSize = 4,
            description = "Injector pulse-width in miliseconds."
    )
    public final float efiPw() {
        return this.efiPw;
    }

    /**
     * Fuel flow rate in litres/hour. 
     */
    @MavlinkFieldInfo(
            position = 14,
            unitSize = 4,
            description = "Fuel flow rate in litres/hour."
    )
    public final float efiFuelFlow() {
        return this.efiFuelFlow;
    }

    /**
     * Fuel consumed. 
     */
    @MavlinkFieldInfo(
            position = 15,
            unitSize = 4,
            description = "Fuel consumed."
    )
    public final float efiFuelConsumed() {
        return this.efiFuelConsumed;
    }

    /**
     * Atmospheric pressure. 
     */
    @MavlinkFieldInfo(
            position = 16,
            unitSize = 4,
            description = "Atmospheric pressure."
    )
    public final float efiBaro() {
        return this.efiBaro;
    }

    /**
     * Manifold Air Temperature. 
     */
    @MavlinkFieldInfo(
            position = 17,
            unitSize = 4,
            description = "Manifold Air Temperature."
    )
    public final float efiMat() {
        return this.efiMat;
    }

    /**
     * Cylinder Head Temperature. 
     */
    @MavlinkFieldInfo(
            position = 18,
            unitSize = 4,
            description = "Cylinder Head Temperature."
    )
    public final float efiClt() {
        return this.efiClt;
    }

    /**
     * Throttle Position. 
     */
    @MavlinkFieldInfo(
            position = 19,
            unitSize = 4,
            description = "Throttle Position."
    )
    public final float efiTps() {
        return this.efiTps;
    }

    /**
     * Exhaust gas temperature. 
     */
    @MavlinkFieldInfo(
            position = 20,
            unitSize = 4,
            description = "Exhaust gas temperature."
    )
    public final float efiExhaustGasTemperature() {
        return this.efiExhaustGasTemperature;
    }

    /**
     * EFI index. 
     */
    @MavlinkFieldInfo(
            position = 21,
            unitSize = 1,
            description = "EFI index."
    )
    public final int efiIndex() {
        return this.efiIndex;
    }

    /**
     * Generator status. 
     */
    @MavlinkFieldInfo(
            position = 22,
            unitSize = 2,
            description = "Generator status."
    )
    public final int generatorStatus() {
        return this.generatorStatus;
    }

    /**
     * EFI status. 
     */
    @MavlinkFieldInfo(
            position = 23,
            unitSize = 2,
            description = "EFI status."
    )
    public final int efiStatus() {
        return this.efiStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || !getClass().equals(o.getClass())) return false;
        LoweheiserGovEfi other = (LoweheiserGovEfi)o;
        if (!Objects.deepEquals(voltBatt, other.voltBatt)) return false;
        if (!Objects.deepEquals(currBatt, other.currBatt)) return false;
        if (!Objects.deepEquals(currGen, other.currGen)) return false;
        if (!Objects.deepEquals(currRot, other.currRot)) return false;
        if (!Objects.deepEquals(fuelLevel, other.fuelLevel)) return false;
        if (!Objects.deepEquals(throttle, other.throttle)) return false;
        if (!Objects.deepEquals(runtime, other.runtime)) return false;
        if (!Objects.deepEquals(untilMaintenance, other.untilMaintenance)) return false;
        if (!Objects.deepEquals(rectifierTemp, other.rectifierTemp)) return false;
        if (!Objects.deepEquals(generatorTemp, other.generatorTemp)) return false;
        if (!Objects.deepEquals(efiBatt, other.efiBatt)) return false;
        if (!Objects.deepEquals(efiRpm, other.efiRpm)) return false;
        if (!Objects.deepEquals(efiPw, other.efiPw)) return false;
        if (!Objects.deepEquals(efiFuelFlow, other.efiFuelFlow)) return false;
        if (!Objects.deepEquals(efiFuelConsumed, other.efiFuelConsumed)) return false;
        if (!Objects.deepEquals(efiBaro, other.efiBaro)) return false;
        if (!Objects.deepEquals(efiMat, other.efiMat)) return false;
        if (!Objects.deepEquals(efiClt, other.efiClt)) return false;
        if (!Objects.deepEquals(efiTps, other.efiTps)) return false;
        if (!Objects.deepEquals(efiExhaustGasTemperature, other.efiExhaustGasTemperature)) return false;
        if (!Objects.deepEquals(efiIndex, other.efiIndex)) return false;
        if (!Objects.deepEquals(generatorStatus, other.generatorStatus)) return false;
        if (!Objects.deepEquals(efiStatus, other.efiStatus)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + Objects.hashCode(voltBatt);
        result = 31 * result + Objects.hashCode(currBatt);
        result = 31 * result + Objects.hashCode(currGen);
        result = 31 * result + Objects.hashCode(currRot);
        result = 31 * result + Objects.hashCode(fuelLevel);
        result = 31 * result + Objects.hashCode(throttle);
        result = 31 * result + Objects.hashCode(runtime);
        result = 31 * result + Objects.hashCode(untilMaintenance);
        result = 31 * result + Objects.hashCode(rectifierTemp);
        result = 31 * result + Objects.hashCode(generatorTemp);
        result = 31 * result + Objects.hashCode(efiBatt);
        result = 31 * result + Objects.hashCode(efiRpm);
        result = 31 * result + Objects.hashCode(efiPw);
        result = 31 * result + Objects.hashCode(efiFuelFlow);
        result = 31 * result + Objects.hashCode(efiFuelConsumed);
        result = 31 * result + Objects.hashCode(efiBaro);
        result = 31 * result + Objects.hashCode(efiMat);
        result = 31 * result + Objects.hashCode(efiClt);
        result = 31 * result + Objects.hashCode(efiTps);
        result = 31 * result + Objects.hashCode(efiExhaustGasTemperature);
        result = 31 * result + Objects.hashCode(efiIndex);
        result = 31 * result + Objects.hashCode(generatorStatus);
        result = 31 * result + Objects.hashCode(efiStatus);
        return result;
    }

    @Override
    public String toString() {
        return "LoweheiserGovEfi{voltBatt=" + voltBatt
                 + ", currBatt=" + currBatt
                 + ", currGen=" + currGen
                 + ", currRot=" + currRot
                 + ", fuelLevel=" + fuelLevel
                 + ", throttle=" + throttle
                 + ", runtime=" + runtime
                 + ", untilMaintenance=" + untilMaintenance
                 + ", rectifierTemp=" + rectifierTemp
                 + ", generatorTemp=" + generatorTemp
                 + ", efiBatt=" + efiBatt
                 + ", efiRpm=" + efiRpm
                 + ", efiPw=" + efiPw
                 + ", efiFuelFlow=" + efiFuelFlow
                 + ", efiFuelConsumed=" + efiFuelConsumed
                 + ", efiBaro=" + efiBaro
                 + ", efiMat=" + efiMat
                 + ", efiClt=" + efiClt
                 + ", efiTps=" + efiTps
                 + ", efiExhaustGasTemperature=" + efiExhaustGasTemperature
                 + ", efiIndex=" + efiIndex
                 + ", generatorStatus=" + generatorStatus
                 + ", efiStatus=" + efiStatus + "}";
    }

    public static final class Builder {
        private float voltBatt;

        private float currBatt;

        private float currGen;

        private float currRot;

        private float fuelLevel;

        private float throttle;

        private long runtime;

        private int untilMaintenance;

        private float rectifierTemp;

        private float generatorTemp;

        private float efiBatt;

        private float efiRpm;

        private float efiPw;

        private float efiFuelFlow;

        private float efiFuelConsumed;

        private float efiBaro;

        private float efiMat;

        private float efiClt;

        private float efiTps;

        private float efiExhaustGasTemperature;

        private int efiIndex;

        private int generatorStatus;

        private int efiStatus;

        /**
         * Generator Battery voltage. 
         */
        @MavlinkFieldInfo(
                position = 1,
                unitSize = 4,
                description = "Generator Battery voltage."
        )
        public final Builder voltBatt(float voltBatt) {
            this.voltBatt = voltBatt;
            return this;
        }

        /**
         * Generator Battery current. 
         */
        @MavlinkFieldInfo(
                position = 2,
                unitSize = 4,
                description = "Generator Battery current."
        )
        public final Builder currBatt(float currBatt) {
            this.currBatt = currBatt;
            return this;
        }

        /**
         * Current being produced by generator. 
         */
        @MavlinkFieldInfo(
                position = 3,
                unitSize = 4,
                description = "Current being produced by generator."
        )
        public final Builder currGen(float currGen) {
            this.currGen = currGen;
            return this;
        }

        /**
         * Load current being consumed by the UAV (sum of curr_gen and curr_batt) 
         */
        @MavlinkFieldInfo(
                position = 4,
                unitSize = 4,
                description = "Load current being consumed by the UAV (sum of curr_gen and curr_batt)"
        )
        public final Builder currRot(float currRot) {
            this.currRot = currRot;
            return this;
        }

        /**
         * Generator fuel remaining in litres. 
         */
        @MavlinkFieldInfo(
                position = 5,
                unitSize = 4,
                description = "Generator fuel remaining in litres."
        )
        public final Builder fuelLevel(float fuelLevel) {
            this.fuelLevel = fuelLevel;
            return this;
        }

        /**
         * Throttle Output. 
         */
        @MavlinkFieldInfo(
                position = 6,
                unitSize = 4,
                description = "Throttle Output."
        )
        public final Builder throttle(float throttle) {
            this.throttle = throttle;
            return this;
        }

        /**
         * Seconds this generator has run since it was rebooted. 
         */
        @MavlinkFieldInfo(
                position = 7,
                unitSize = 4,
                description = "Seconds this generator has run since it was rebooted."
        )
        public final Builder runtime(long runtime) {
            this.runtime = runtime;
            return this;
        }

        /**
         * Seconds until this generator requires maintenance. A negative value indicates maintenance 
         * is past due. 
         */
        @MavlinkFieldInfo(
                position = 8,
                unitSize = 4,
                signed = true,
                description = "Seconds until this generator requires maintenance.  A negative value indicates maintenance is past due."
        )
        public final Builder untilMaintenance(int untilMaintenance) {
            this.untilMaintenance = untilMaintenance;
            return this;
        }

        /**
         * The Temperature of the rectifier. 
         */
        @MavlinkFieldInfo(
                position = 9,
                unitSize = 4,
                description = "The Temperature of the rectifier."
        )
        public final Builder rectifierTemp(float rectifierTemp) {
            this.rectifierTemp = rectifierTemp;
            return this;
        }

        /**
         * The temperature of the mechanical motor, fuel cell core or generator. 
         */
        @MavlinkFieldInfo(
                position = 10,
                unitSize = 4,
                description = "The temperature of the mechanical motor, fuel cell core or generator."
        )
        public final Builder generatorTemp(float generatorTemp) {
            this.generatorTemp = generatorTemp;
            return this;
        }

        /**
         * EFI Supply Voltage. 
         */
        @MavlinkFieldInfo(
                position = 11,
                unitSize = 4,
                description = "EFI Supply Voltage."
        )
        public final Builder efiBatt(float efiBatt) {
            this.efiBatt = efiBatt;
            return this;
        }

        /**
         * Motor RPM. 
         */
        @MavlinkFieldInfo(
                position = 12,
                unitSize = 4,
                description = "Motor RPM."
        )
        public final Builder efiRpm(float efiRpm) {
            this.efiRpm = efiRpm;
            return this;
        }

        /**
         * Injector pulse-width in miliseconds. 
         */
        @MavlinkFieldInfo(
                position = 13,
                unitSize = 4,
                description = "Injector pulse-width in miliseconds."
        )
        public final Builder efiPw(float efiPw) {
            this.efiPw = efiPw;
            return this;
        }

        /**
         * Fuel flow rate in litres/hour. 
         */
        @MavlinkFieldInfo(
                position = 14,
                unitSize = 4,
                description = "Fuel flow rate in litres/hour."
        )
        public final Builder efiFuelFlow(float efiFuelFlow) {
            this.efiFuelFlow = efiFuelFlow;
            return this;
        }

        /**
         * Fuel consumed. 
         */
        @MavlinkFieldInfo(
                position = 15,
                unitSize = 4,
                description = "Fuel consumed."
        )
        public final Builder efiFuelConsumed(float efiFuelConsumed) {
            this.efiFuelConsumed = efiFuelConsumed;
            return this;
        }

        /**
         * Atmospheric pressure. 
         */
        @MavlinkFieldInfo(
                position = 16,
                unitSize = 4,
                description = "Atmospheric pressure."
        )
        public final Builder efiBaro(float efiBaro) {
            this.efiBaro = efiBaro;
            return this;
        }

        /**
         * Manifold Air Temperature. 
         */
        @MavlinkFieldInfo(
                position = 17,
                unitSize = 4,
                description = "Manifold Air Temperature."
        )
        public final Builder efiMat(float efiMat) {
            this.efiMat = efiMat;
            return this;
        }

        /**
         * Cylinder Head Temperature. 
         */
        @MavlinkFieldInfo(
                position = 18,
                unitSize = 4,
                description = "Cylinder Head Temperature."
        )
        public final Builder efiClt(float efiClt) {
            this.efiClt = efiClt;
            return this;
        }

        /**
         * Throttle Position. 
         */
        @MavlinkFieldInfo(
                position = 19,
                unitSize = 4,
                description = "Throttle Position."
        )
        public final Builder efiTps(float efiTps) {
            this.efiTps = efiTps;
            return this;
        }

        /**
         * Exhaust gas temperature. 
         */
        @MavlinkFieldInfo(
                position = 20,
                unitSize = 4,
                description = "Exhaust gas temperature."
        )
        public final Builder efiExhaustGasTemperature(float efiExhaustGasTemperature) {
            this.efiExhaustGasTemperature = efiExhaustGasTemperature;
            return this;
        }

        /**
         * EFI index. 
         */
        @MavlinkFieldInfo(
                position = 21,
                unitSize = 1,
                description = "EFI index."
        )
        public final Builder efiIndex(int efiIndex) {
            this.efiIndex = efiIndex;
            return this;
        }

        /**
         * Generator status. 
         */
        @MavlinkFieldInfo(
                position = 22,
                unitSize = 2,
                description = "Generator status."
        )
        public final Builder generatorStatus(int generatorStatus) {
            this.generatorStatus = generatorStatus;
            return this;
        }

        /**
         * EFI status. 
         */
        @MavlinkFieldInfo(
                position = 23,
                unitSize = 2,
                description = "EFI status."
        )
        public final Builder efiStatus(int efiStatus) {
            this.efiStatus = efiStatus;
            return this;
        }

        public final LoweheiserGovEfi build() {
            return new LoweheiserGovEfi(voltBatt, currBatt, currGen, currRot, fuelLevel, throttle, runtime, untilMaintenance, rectifierTemp, generatorTemp, efiBatt, efiRpm, efiPw, efiFuelFlow, efiFuelConsumed, efiBaro, efiMat, efiClt, efiTps, efiExhaustGasTemperature, efiIndex, generatorStatus, efiStatus);
        }
    }
}
