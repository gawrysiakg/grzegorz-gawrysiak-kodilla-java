package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.ArrayList;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {

    @Mock
    Statistics statisticsMock;


    @Test
    public void testZeroPostsInForum() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        ArrayList<String> users = new ArrayList<>();
        users.add("One");
        users.add("Two");
        users.add("Three");
        users.add("Four");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(20);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(users.size(), forumStatistics.calculateAdvStatistics(statisticsMock).getAmountOfUsers());
        Assertions.assertEquals(0, forumStatistics.calculateAdvStatistics(statisticsMock).getAmountOfPosts());
        Assertions.assertEquals(20, forumStatistics.calculateAdvStatistics(statisticsMock).getAmountOfComments());
        Assertions.assertEquals(0, forumStatistics.calculateAdvStatistics(statisticsMock).getAveragePostsPerUser());
        Assertions.assertEquals(20 / 4d, forumStatistics.calculateAdvStatistics(statisticsMock).getAverageCommentsPerUser());
        Assertions.assertEquals(0, forumStatistics.calculateAdvStatistics(statisticsMock).getAverageCommentsPerPost());
    }

    @Test
    public void testPostsThousand() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        ArrayList<String> users = new ArrayList<>();
        users.add("One");
        users.add("Two");
        users.add("Three");
        users.add("Four");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(20);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(users.size(), forumStatistics.calculateAdvStatistics(statisticsMock).getAmountOfUsers());
        Assertions.assertEquals(1000, forumStatistics.calculateAdvStatistics(statisticsMock).getAmountOfPosts());
        Assertions.assertEquals(20, forumStatistics.calculateAdvStatistics(statisticsMock).getAmountOfComments());
        Assertions.assertEquals(1000 / 4d, forumStatistics.calculateAdvStatistics(statisticsMock).getAveragePostsPerUser());
        Assertions.assertEquals(20 / 4d, forumStatistics.calculateAdvStatistics(statisticsMock).getAverageCommentsPerUser());
        Assertions.assertEquals(20 / 1000d, forumStatistics.calculateAdvStatistics(statisticsMock).getAverageCommentsPerPost());
    }

    @Test
    public void testCommentsZero() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        ArrayList<String> users = new ArrayList<>();
        users.add("One");
        users.add("Two");
        users.add("Three");
        users.add("Four");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(users.size(), forumStatistics.calculateAdvStatistics(statisticsMock).getAmountOfUsers());
        Assertions.assertEquals(50, forumStatistics.calculateAdvStatistics(statisticsMock).getAmountOfPosts());
        Assertions.assertEquals(0, forumStatistics.calculateAdvStatistics(statisticsMock).getAmountOfComments());
        Assertions.assertEquals(50 / 4d, forumStatistics.calculateAdvStatistics(statisticsMock).getAveragePostsPerUser());
        Assertions.assertEquals(0 / 4d, forumStatistics.calculateAdvStatistics(statisticsMock).getAverageCommentsPerUser());
        Assertions.assertEquals(0 / 50d, forumStatistics.calculateAdvStatistics(statisticsMock).getAverageCommentsPerPost());
    }

    @Test
    public void testMoreCommentsThanPosts() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        ArrayList<String> users = new ArrayList<>();
        users.add("One");
        users.add("Two");
        users.add("Three");
        users.add("Four");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(200);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(users.size(), forumStatistics.calculateAdvStatistics(statisticsMock).getAmountOfUsers());
        Assertions.assertEquals(50, forumStatistics.calculateAdvStatistics(statisticsMock).getAmountOfPosts());
        Assertions.assertEquals(200, forumStatistics.calculateAdvStatistics(statisticsMock).getAmountOfComments());
        Assertions.assertEquals(50 / 4d, forumStatistics.calculateAdvStatistics(statisticsMock).getAveragePostsPerUser());
        Assertions.assertEquals(200 / 4d, forumStatistics.calculateAdvStatistics(statisticsMock).getAverageCommentsPerUser());
        Assertions.assertEquals(200 / 50d, forumStatistics.calculateAdvStatistics(statisticsMock).getAverageCommentsPerPost());
    }

    @Test
    public void testMorePostsThanComments() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        ArrayList<String> users = new ArrayList<>();
        users.add("One");
        users.add("Two");
        users.add("Three");
        users.add("Four");
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(250);
        when(statisticsMock.commentsCount()).thenReturn(100);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(users.size(), forumStatistics.calculateAdvStatistics(statisticsMock).getAmountOfUsers());
        Assertions.assertEquals(250, forumStatistics.calculateAdvStatistics(statisticsMock).getAmountOfPosts());
        Assertions.assertEquals(100, forumStatistics.calculateAdvStatistics(statisticsMock).getAmountOfComments());
        Assertions.assertEquals(250 / 4d, forumStatistics.calculateAdvStatistics(statisticsMock).getAveragePostsPerUser());
        Assertions.assertEquals(100 / 4d, forumStatistics.calculateAdvStatistics(statisticsMock).getAverageCommentsPerUser());
        Assertions.assertEquals(100 / 250d, forumStatistics.calculateAdvStatistics(statisticsMock).getAverageCommentsPerPost());
    }

    @Test
    public void testZeroUsers() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        ArrayList<String> users = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(250);
        when(statisticsMock.commentsCount()).thenReturn(100);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(users.size(), forumStatistics.calculateAdvStatistics(statisticsMock).getAmountOfUsers());
        Assertions.assertEquals(250, forumStatistics.calculateAdvStatistics(statisticsMock).getAmountOfPosts());
        Assertions.assertEquals(100, forumStatistics.calculateAdvStatistics(statisticsMock).getAmountOfComments());
        Assertions.assertEquals(0, forumStatistics.calculateAdvStatistics(statisticsMock).getAveragePostsPerUser());
        Assertions.assertEquals(0, forumStatistics.calculateAdvStatistics(statisticsMock).getAverageCommentsPerUser());
        Assertions.assertEquals(100 / 250d, forumStatistics.calculateAdvStatistics(statisticsMock).getAverageCommentsPerPost());
    }

    @Test
    public void testHundredOfUsers() {
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        ArrayList<String> users = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            users.add("Forum User " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(users);
        when(statisticsMock.postsCount()).thenReturn(250);
        when(statisticsMock.commentsCount()).thenReturn(100);
        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        //Then
        Assertions.assertEquals(users.size(), forumStatistics.calculateAdvStatistics(statisticsMock).getAmountOfUsers());
        Assertions.assertEquals(250, forumStatistics.calculateAdvStatistics(statisticsMock).getAmountOfPosts());
        Assertions.assertEquals(100, forumStatistics.calculateAdvStatistics(statisticsMock).getAmountOfComments());
        Assertions.assertEquals(250/100d, forumStatistics.calculateAdvStatistics(statisticsMock).getAveragePostsPerUser());
        Assertions.assertEquals(100/100d, forumStatistics.calculateAdvStatistics(statisticsMock).getAverageCommentsPerUser());
        Assertions.assertEquals(100 / 250d, forumStatistics.calculateAdvStatistics(statisticsMock).getAverageCommentsPerPost());
    }


}
