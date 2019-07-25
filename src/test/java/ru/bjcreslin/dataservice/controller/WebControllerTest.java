package ru.bjcreslin.dataservice.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class WebControllerTest {
    WebController webController = new WebController();

    @Test
    void testGetTest() {
        String result = webController.getTest();
        Assertions.assertEquals("test OK", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: http://weirddev.com/forum#!/testme