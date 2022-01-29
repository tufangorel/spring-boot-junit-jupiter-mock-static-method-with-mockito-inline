package com.company.customerinfo.util;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.anyString;
import static org.mockito.Mockito.mockStatic;

public class StringUtilsTest {


    @Test
    void testIsEmpty() {

        // before mock scope, usual behavior.
        assertEquals(false, StringUtils.isEmpty("abc"));

        // Mock scope
        try (MockedStatic mocked = mockStatic(StringUtils.class)) {

            // Mocking
            mocked.when(() -> StringUtils.isEmpty(anyString())).thenReturn(false);

            // Mocked behavior
            assertEquals(false, StringUtils.isEmpty("abc"));
        }

        // After mock scope returns to usual behavior.
        assertEquals(false, StringUtils.isEmpty("abc"));
    }

}
