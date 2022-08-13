package com.kodilla.testing.shape;

import com.kodilla.testing.forum.ForumUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


@DisplayName("TDD: Shape Collector Test Suite")
public class ShapeCollectorTestSuite {

    @Nested
    class AddAndRemove {

        @DisplayName("when create Shape, " +
                "then addFigure should add figure to Arraylist")
        @Test
        void testAddFigure()  {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle("Circle_1", 2);
            //When
            shapeCollector.addFigure(circle);
            //Then
            Assertions.assertEquals(1, shapeCollector.collectedShapes.size());
        }

        @DisplayName("when created ArrayList of Shapes, " +
                "then removeFigure should remove proper figure from List")
        @Test
        void testRemoveFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle("Circle_1", 2);
            Shape square = new Square("Square_1", 6);
            Shape triangle = new Triangle("Triangle_1", 4, 4);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);
            //When
            shapeCollector.removeFigure(square);
            //Then
            Assertions.assertEquals(2, shapeCollector.collectedShapes.size());
        }
    }

    @Nested
    class ShowAndGet {

        @DisplayName("when created ArrayList of Shapes, " +
                "then getFigure() should return proper figure")
        @Test
        void testGetFigure() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle("Circle_1", 2);
            Shape square = new Square("Square_1", 6);
            Shape triangle = new Triangle("Triangle_1", 4, 4);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);
            //When
            Shape result = shapeCollector.getFigure(1);
            //Then
            Assertions.assertEquals(square, result);
        }

        @DisplayName("when created some figures, " +
                "then showFigures() should return all created figures")
        @Test
        void testShowFigures() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Shape circle = new Circle("Circle_1", 2);
            Shape square = new Square("Square_1", 6);
            Shape triangle = new Triangle("Triangle_1", 4, 4);
            shapeCollector.addFigure(circle);
            shapeCollector.addFigure(square);
            shapeCollector.addFigure(triangle);
            //When
            String result = shapeCollector.showFigures();
            //Then
            Assertions.assertEquals(String.valueOf(shapeCollector.collectedShapes), result);
        }
    }
}
