package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {


    @Test
    void testTaskAdd(){
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        TaskList toDoList = board.getToDoList();
        TaskList inProgressList = board.getInProgressList();
        TaskList doneList = board.getDoneList();

        //When
        toDoList.addTaskToTheList("First task");
        toDoList.addTaskToTheList("Second task");

        inProgressList.addTaskToTheList("First task in progress");

        doneList.addTaskToTheList("First done task");

        String toDoTask = toDoList.getTaskFromTheList(0);
        String inProgressTask = inProgressList.getTaskFromTheList(0);
        String doneTask = doneList.getTaskFromTheList(0);

        //Then
        Assertions.assertEquals("First task", toDoTask);
        Assertions.assertEquals(2, toDoList.getTasks().size());

        Assertions.assertEquals("First task in progress", inProgressTask);
        Assertions.assertEquals(1, inProgressList.getTasks().size());

        Assertions.assertEquals("First done task", doneTask);
        Assertions.assertEquals(1, doneList.getTasks().size());
    }

}
