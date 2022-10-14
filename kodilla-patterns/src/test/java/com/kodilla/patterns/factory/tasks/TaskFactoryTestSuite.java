package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryDrivingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task driving = taskFactory.makeTask(TaskFactory.DRIVING_TASK);
        //Then
        assertEquals("Take the kids", driving.getTaskName());
        assertFalse(driving.isTaskExecuted());
    }

    @Test
    void testFactoryPaintingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task painting = taskFactory.makeTask(TaskFactory.PAINTING_TASK);
        painting.executeTask();
        //Then
        assertEquals("Paint", painting.getTaskName());
        assertTrue(painting.isTaskExecuted());
    }

    @Test
    void testFactoryShoppingTask(){
        //Given
        TaskFactory taskFactory = new TaskFactory();
        //When
        Task shopping = taskFactory.makeTask(TaskFactory.SHOPPING_TASK);
        shopping.executeTask();
        //Then
        assertEquals("Go to supermarket", shopping.getTaskName());
        assertTrue(shopping.isTaskExecuted());
    }


}
