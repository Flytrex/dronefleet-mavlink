package io.dronefleet.mavlink;


/**
 * The interface for message types that have a transmission id field.
 */
public interface HasTransmissionId<T extends HasTransmissionId<T>>{


    /**
     * Returns the transmission id; 0 if not set.
     */
    int tid();


    /**
     * Returns an instance of this type, but with the given transmission id.
     */
    T withTransmissionId(int tid);


}
