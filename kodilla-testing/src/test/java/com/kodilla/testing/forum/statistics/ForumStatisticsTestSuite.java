package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Test
    public void testStatisticsWithMock(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<String>(){{
            add("Veronica");
            add("Mark");
            add("Stacy");
        }};
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(2);
        when(statisticsMock.commentsCount()).thenReturn(4);
        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        double testPostsQuantityPerUser = forumStatistics.getPostsQuantityPerUser();
        double testCommentsQuantityPerPost = forumStatistics.getCommentsQuantityPerPost();
        double testCommentsQuantityPerUser = forumStatistics.getCommentsQuantityPerUser();

        Assert.assertEquals(1/3, testPostsQuantityPerUser,0);
        Assert.assertEquals(2.0, testCommentsQuantityPerPost, 0);
        Assert.assertEquals(4/3, testCommentsQuantityPerUser, 0);
    }

    @Test
    public void testStatisticsWithMockPosts0(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<String>(){{
            add("Veronica");
            add("Mark");
            add("Stacy");
        }};
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(4);
        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        double testPostsQuantityPerUser = forumStatistics.getPostsQuantityPerUser();
        double testCommentsQuantityPerPost = forumStatistics.getCommentsQuantityPerPost();
        double testCommentsQuantityPerUser = forumStatistics.getCommentsQuantityPerUser();

        Assert.assertEquals(0, testPostsQuantityPerUser,0);
        Assert.assertEquals(0, testCommentsQuantityPerPost, 0);
        Assert.assertEquals(4/3, testCommentsQuantityPerUser, 0);
    }

    @Test
    public void testStatisticsWithMockPosts1000(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<String>(){{
            add("Veronica");
            add("Mark");
            add("Stacy");
        }};
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(4);
        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        double testPostsQuantityPerUser = forumStatistics.getPostsQuantityPerUser();
        double testCommentsQuantityPerPost = forumStatistics.getCommentsQuantityPerPost();
        double testCommentsQuantityPerUser = forumStatistics.getCommentsQuantityPerUser();

        Assert.assertEquals(1000/3, testPostsQuantityPerUser,0);
        Assert.assertEquals(4/1000, testCommentsQuantityPerPost, 0);
        Assert.assertEquals(4/3, testCommentsQuantityPerUser, 0);
    }

    @Test
    public void testStatisticsWithMockComments0(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<String>(){{
            add("Veronica");
            add("Mark");
            add("Stacy");
        }};
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(2);
        when(statisticsMock.commentsCount()).thenReturn(0);
        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        double testPostsQuantityPerUser = forumStatistics.getPostsQuantityPerUser();
        double testCommentsQuantityPerPost = forumStatistics.getCommentsQuantityPerPost();
        double testCommentsQuantityPerUser = forumStatistics.getCommentsQuantityPerUser();

        Assert.assertEquals(2/3, testPostsQuantityPerUser,0);
        Assert.assertEquals(0, testCommentsQuantityPerPost, 0);
        Assert.assertEquals(0, testCommentsQuantityPerUser, 0);
    }

    @Test
    public void testStatisticsWithMockCommentsLessThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<String>(){{
            add("Veronica");
            add("Mark");
            add("Stacy");
        }};
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(2);
        when(statisticsMock.commentsCount()).thenReturn(1);
        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        double testPostsQuantityPerUser = forumStatistics.getPostsQuantityPerUser();
        double testCommentsQuantityPerPost = forumStatistics.getCommentsQuantityPerPost();
        double testCommentsQuantityPerUser = forumStatistics.getCommentsQuantityPerUser();

        Assert.assertEquals(2/3, testPostsQuantityPerUser,0);
        Assert.assertEquals(1/2, testCommentsQuantityPerPost, 0);
        Assert.assertEquals(1/3, testCommentsQuantityPerUser, 0);
    }

    @Test
    public void testStatisticsWithMockCommentsMoreThanPosts(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<String>(){{
            add("Veronica");
            add("Mark");
            add("Stacy");
        }};
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(2);
        when(statisticsMock.commentsCount()).thenReturn(4);
        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        double testPostsQuantityPerUser = forumStatistics.getPostsQuantityPerUser();
        double testCommentsQuantityPerPost = forumStatistics.getCommentsQuantityPerPost();
        double testCommentsQuantityPerUser = forumStatistics.getCommentsQuantityPerUser();

        Assert.assertEquals(2/3, testPostsQuantityPerUser,0);
        Assert.assertEquals(2, testCommentsQuantityPerPost, 0);
        Assert.assertEquals(4/3, testCommentsQuantityPerUser, 0);
    }

    @Test
    public void testStatisticsWithMockUsers0(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<String>();

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(2);
        when(statisticsMock.commentsCount()).thenReturn(4);
        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        double testPostsQuantityPerUser = forumStatistics.getPostsQuantityPerUser();
        double testCommentsQuantityPerPost = forumStatistics.getCommentsQuantityPerPost();
        double testCommentsQuantityPerUser = forumStatistics.getCommentsQuantityPerUser();

        Assert.assertEquals(0, testPostsQuantityPerUser,0);
        Assert.assertEquals(2, testCommentsQuantityPerPost, 0);
        Assert.assertEquals(0, testCommentsQuantityPerUser, 0);
    }

    @Test
    public void testStatisticsWithMockUsers100(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<String>();
        for(int i = 0; i < 100; i++){
            usersList.add("User" + i);
        }

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(2);
        when(statisticsMock.commentsCount()).thenReturn(4);
        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);

        //Then
        double testPostsQuantityPerUser = forumStatistics.getPostsQuantityPerUser();
        double testCommentsQuantityPerPost = forumStatistics.getCommentsQuantityPerPost();
        double testCommentsQuantityPerUser = forumStatistics.getCommentsQuantityPerUser();

        Assert.assertEquals(2/100, testPostsQuantityPerUser,0);
        Assert.assertEquals(2, testCommentsQuantityPerPost, 0);
        Assert.assertEquals(4/100, testCommentsQuantityPerUser, 0);
    }
}
