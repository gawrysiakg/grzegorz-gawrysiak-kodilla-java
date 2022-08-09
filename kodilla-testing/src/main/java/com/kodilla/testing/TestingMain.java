package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {

    public static void main(String[] args) {
        Calculator calculator = new Calculator(39, 17);
       int resultAdd = 39+17;
       int resultSubstract = 39-17;


        if(resultAdd==calculator.add(39,17)){
            System.out.println("add method test OK");
        } else {
            System.out.println("add method ERROR!");
        }

        if(resultSubstract==calculator.substract(39, 17)){
            System.out.println("substract method test OK");
        } else{
            System.out.println("substract method ERROR!");
        }



        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }



    }
}