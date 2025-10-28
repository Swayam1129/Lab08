package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList cityList = new CustomList();
        City city = new City("Edmonton", "AB");
        cityList.addCity(city);

        // Expect true since the city was added
        assertTrue(cityList.hasCity(city));

        // Expect false for a city not in the list
        City notInList = new City("Calgary", "AB");
        assertFalse(cityList.hasCity(notInList));
    }

    @Test
    public void testDeleteCity() {
        CustomList cityList = new CustomList();
        City city = new City("Edmonton", "AB");
        cityList.addCity(city);

        // Delete the city
        cityList.deleteCity(city);

        // Now the city should not exist
        assertFalse(cityList.hasCity(city));
    }

    @Test
    public void testCountCities() {
        CustomList cityList = new CustomList();
        // initially count == 0
        assertEquals(0, cityList.countCities());

        cityList.addCity(new City("Edmonton", "AB"));
        cityList.addCity(new City("Calgary", "AB"));
        // Count should increase to 2
        assertEquals(2, cityList.countCities());
    }

}
