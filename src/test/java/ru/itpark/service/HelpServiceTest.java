package ru.itpark.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelpServiceTest {

    @Test
    void initials() {
        {
            HelpService service = new HelpService();
            String actual = service.initials("Vasiliy Petrov");
            String expected = "VP";

            assertEquals(expected, actual);
        }
    }
}