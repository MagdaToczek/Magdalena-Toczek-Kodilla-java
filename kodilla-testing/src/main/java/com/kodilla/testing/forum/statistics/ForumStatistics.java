package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double postsQuantityPerUser;
    private double commentsQuantityPerUser;
    private double commentsQuantityPerPost;
    //Statistics statistics;

    public void calculateAdvStatistics(Statistics statistics){
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        if(usersQuantity != 0) {
            postsQuantityPerUser = postsQuantity / usersQuantity;
            commentsQuantityPerUser = commentsQuantity/usersQuantity;
        }
        if(postsQuantity != 0) {
            commentsQuantityPerPost = commentsQuantity / postsQuantity;
        }
    }

    public void showStatistics(){
        System.out.println("Users quantity: " + usersQuantity);
        System.out.println("Posts quantity: " + postsQuantity);
        System.out.println("Comments quantity: " + commentsQuantity);
        System.out.println("Posts quantity per user: " + postsQuantityPerUser);
        System.out.println("Comments quantity per user: " + commentsQuantityPerUser);
        System.out.println("Comments quantity per post: " + commentsQuantityPerPost);
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getPostsQuantityPerUser() {
        return postsQuantityPerUser;
    }

    public double getCommentsQuantityPerUser() {
        return commentsQuantityPerUser;
    }

    public double getCommentsQuantityPerPost() {
        return commentsQuantityPerPost;
    }
}
