package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {


    @Test
    void testDefaultSharingStrategies(){
        //Given
        User mil = new Millenials("Millenials");
        User genY = new YGeneration("Y-generation");
        User genZ = new ZGeneration("Z-generation");
        //When
        String milSocial = mil.sharePost();
        System.out.println("Millenials choose: "+milSocial);
        String genYSocial = genY.sharePost();
        System.out.println("Y-generation choose: "+genYSocial);
        String genZSocial = genZ.sharePost();
        System.out.println("Z-generation choose: "+genZSocial);
        //Then
        assertEquals("Facebook", milSocial);
        assertEquals("Twitter", genYSocial);
        assertEquals("Snapchat", genZSocial);
    }


    @Test
    void testIndividualSharingStrategy(){
    //Given
    User mil2 = new Millenials("Second Millenial");
    String milSocial = mil2.sharePost();
    System.out.println("Second Millenial choose: "+milSocial);
    //When
    mil2.setSocialPublisher(new SnapchatPublisher());
    String newMilSocial = mil2.sharePost();
    System.out.println("Second Millenial choose: "+newMilSocial);
    //Then
    assertEquals("Facebook", milSocial);
    assertEquals("Snapchat", newMilSocial);
    }
}
