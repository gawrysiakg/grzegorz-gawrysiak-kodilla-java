package com.kodilla.testing.forum.statistics;

public class StatisticsViewer {
    private final int amountOfUsers;
    private final int amountOfPosts;
    private final int amountOfComments;
    private final double averagePostsPerUser;
    private final double averageCommentsPerUser;
    private final double averageCommentsPerPost;

    public StatisticsViewer(int amountOfUsers, int amountOfPosts, int amountOfComments, double averagePostsPerUser,
                            double averageCommentsPerUser, double averageCommentsPerPost) {
        this.amountOfUsers = amountOfUsers;
        this.amountOfPosts = amountOfPosts;
        this.amountOfComments = amountOfComments;
        this.averagePostsPerUser = averagePostsPerUser;
        this.averageCommentsPerUser = averageCommentsPerUser;
        this.averageCommentsPerPost = averageCommentsPerPost;
    }

    public int getAmountOfUsers() {
        return amountOfUsers;
    }

    public int getAmountOfPosts() {
        return amountOfPosts;
    }

    public int getAmountOfComments() {
        return amountOfComments;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void showStatistics() {
        System.out.println("Forum info: " + "\nAmount of users:" + getAmountOfUsers() + "\nAmount of posts: " + getAmountOfPosts()
                + "\nAmount of comments: " + getAmountOfComments() + "\nAverage posts per user: " + getAveragePostsPerUser()
                + "\nAverage comments per user: " + getAverageCommentsPerUser() + "\nAverage comments per post: " + getAverageCommentsPerPost());
    }
}
