package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ListyCity holds a list of all of the cities the user has added
 * @author sampickett
 * @version 1
 */
public class ListyCity {
    private List<City> cities = new ArrayList<>();

    /**
     * Adds a city to the stored list if it is unique
     * @param city
     *    Candidate city to add
     * @exception IllegalArgumentException
     */
    public void add(City city) {

            if (cities.contains(city)) {
                throw new IllegalArgumentException("City already exists in the list.");
            }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     * @return the sorted list
     */
    public List<City> getCities(){
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

}
