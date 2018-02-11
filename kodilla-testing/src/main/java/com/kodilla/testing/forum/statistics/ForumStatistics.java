package com.kodilla.testing.forum.statistics;

public class ForumStatistics {
    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private int postsQuantityPerUser;
    private int commentsQuantityPerUser;
    private int commentsQuantityPerPost;
    //Statistics statistics;

    public void calculateAdvStatistics(Statistics statistics){
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();
        postsQuantityPerUser = (int)Math.ceil(postsQuantity/usersQuantity);
        commentsQuantityPerUser = (int)Math.ceil(commentsQuantity/usersQuantity);
        commentsQuantityPerPost = (int)Math.ceil(commentsQuantity/postsQuantity);
        //return null;
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

    public int getPostsQuantityPerUser() {
        return postsQuantityPerUser;
    }

    public int getCommentsQuantityPerUser() {
        return commentsQuantityPerUser;
    }

    public int getCommentsQuantityPerPost() {
        return commentsQuantityPerPost;
    }
}
