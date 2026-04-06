package com.example;

import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.google.gson.Gson;

public class AppTest {

    @Test
    public void testJsonConversion() {
        student s = new student("Mokshith", 20);

        Gson gson = new Gson();
        String json = gson.toJson(s);

        // Check if JSON contains expected values
        assertTrue(json.contains("Mokshith"));
        assertTrue(json.contains("20"));
    }
}