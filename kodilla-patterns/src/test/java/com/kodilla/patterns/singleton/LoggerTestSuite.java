package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    private static Logger logger;

    @Test
    void testGetLastLog(){
        //given
        logger = Logger.INSTANCE;
        logger.log("Creating test log");
        //When
        String last = logger.getLastLog();
        //Then
        Assertions.assertEquals("Creating test log", last);

    }
}
