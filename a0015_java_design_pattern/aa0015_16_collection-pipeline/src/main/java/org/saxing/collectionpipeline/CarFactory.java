package org.saxing.collectionpipeline;

import java.util.Arrays;
import java.util.List;

/**
 * A factory class to create a collection of {@link Car} instances.
 *
 * @author saxing  2018/11/19 9:16
 */
public class CarFactory {

    public CarFactory() {
    }

    public static List<Car> createCars(){
        return Arrays.asList(new Car("Jeep", "Wrangler", 2011, Category.JEEP),
                new Car("Jeep", "Comanche", 1990, Category.JEEP),
                new Car("Dodge", "Avenger", 2010, Category.SEDAN),
                new Car("Buick", "Cascada", 2016, Category.CONVERTIBLE),
                new Car("Ford", "Focus", 2012, Category.SEDAN),
                new Car("Chevrolet", "Geo Metro", 1992, Category.CONVERTIBLE));
    }
}
