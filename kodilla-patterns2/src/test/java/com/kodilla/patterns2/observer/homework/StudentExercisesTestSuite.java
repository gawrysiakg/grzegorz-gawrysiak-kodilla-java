package com.kodilla.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentExercisesTestSuite {

    @Test
    public void testUpdate(){
        //Given
        StudentExercises javaStudent = new JavaStudentExercises("Stefan Bystry");
        StudentExercises javaStudent2 = new JavaStudentExercises("Maciej Głowacki");
        StudentExercises pythonStudent = new PythonStudentExercises("Mariusz Kot");
        StudentExercises fullStackStudent = new FullStackStudentExercises("Anna Kostek");
        Mentor mentor1 = new Mentor("Bartosz Orzeł");
        Mentor mentor2 = new Mentor("Małgorzata Nowak");
        javaStudent.registerObserver(mentor1);
        javaStudent2.registerObserver(mentor1);
        pythonStudent.registerObserver(mentor2);
        fullStackStudent.registerObserver(mentor1);
        //When
        javaStudent.addExercise("24.3 Aspects");
        javaStudent.addExercise("24.4 Observable");
        pythonStudent.addExercise("1.2 Python - start");
        fullStackStudent.addExercise("2.2 Simple project");
        javaStudent2.addExercise("24.2 Decorator");
        // Then
        assertEquals(4, mentor1.getUpdateCount());
        assertEquals(1, mentor2.getUpdateCount());
        assertEquals(2, javaStudent.getExercises().size());
    }
}
