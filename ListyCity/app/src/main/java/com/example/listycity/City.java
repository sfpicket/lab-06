package com.example.listycity;

/**
 * This is a class that defines a city.
 * This class has String city and String province
 * @author sampickett
 * @version 1
 */
public class City implements Comparable
{
    private String city;
    private String province;

    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * gets the city name of a city
     * @return String city name
     */
    String getCityName(){
        return this.city;
    }

    /**
     * gets the province name of the city
     * @return String province name
     */
    String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(Object o){
        City city = (City) o;
        return this.city.compareTo(city.getCityName());
    }


}


