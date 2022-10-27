package com.kodilla.hibernate.tasklist.dao;


import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByListName(){
        //Given
        TaskList taskList = new TaskList("To do", "Things to do in free time");
        taskListDao.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> result =  taskListDao.findByListName(listName);

        //Then
        assertEquals(1, result.size());
        assertEquals(listName, result.get(0).getListName());

        //CleanUp
        int id = result.get(0).getId();
        taskListDao.deleteById(id);


    }

}
