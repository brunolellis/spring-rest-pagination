package com.github.brunolellis.store;

import lombok.Value;
import org.springframework.data.annotation.Id;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.index.GeoSpatialIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

import static org.springframework.data.mongodb.core.index.GeoSpatialIndexType.GEO_2DSPHERE;

/**
 * Entity to represent a {@link Store}.
 *
 * @author Oliver Gierke
 */
@Value
@Document
public class Store {

    @Id
    String id;
    String name;
    Address address;

    /**
     * Value object to represent an {@link Address}.
     *
     * @author Oliver Gierke
     */
    @Value
    public static class Address {

        String street, city, zip;
        @GeoSpatialIndexed(type = GEO_2DSPHERE) Point location;

        /*
         * (non-Javadoc)
         * @see java.lang.Object#toString()
         */
        public String toString() {
            return String.format("%s, %s %s", street, zip, city);
        }
    }
}
