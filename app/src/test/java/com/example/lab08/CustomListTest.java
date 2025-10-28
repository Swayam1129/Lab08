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

}
