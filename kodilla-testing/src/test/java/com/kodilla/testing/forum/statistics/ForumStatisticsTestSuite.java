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
        int testUsersQuantity = forumStatistics.getUsersQuantity();
        int testPostsQuantity = forumStatistics.getPostsQuantity();
        int testCommentsQuantity = forumStatistics.getCommentsQuantity();
        double testPostsQuantityPerUser = forumStatistics.getPostsQuantityPerUser();
        double testCommentsQuantityPerPost = forumStatistics.getCommentsQuantityPerPost();
        double testCommentsQuantityPerUser = forumStatistics.getCommentsQuantityPerUser();

        Assert.assertEquals(3, testUsersQuantity);
        Assert.assertEquals(2, testPostsQuantity);
        Assert.assertEquals(4, testCommentsQuantity);
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
        int testUsersQuantity = forumStatistics.getUsersQuantity();
        int testPostsQuantity = forumStatistics.getPostsQuantity();
        int testCommentsQuantity = forumStatistics.getCommentsQuantity();
        double testPostsQuantityPerUser = forumStatistics.getPostsQuantityPerUser();
        double testCommentsQuantityPerPost = forumStatistics.getCommentsQuantityPerPost();
        double testCommentsQuantityPerUser = forumStatistics.getCommentsQuantityPerUser();

        Assert.assertEquals(3, testUsersQuantity);
        Assert.assertEquals(0, testPostsQuantity);
        Assert.assertEquals(4, testCommentsQuantity);
        Assert.assertEquals(0, testPostsQuantityPerUser,0);
        Assert.assertEquals(2.0, testCommentsQuantityPerPost, 0);
        Assert.assertEquals(4/3, testCommentsQuantityPerUser, 0);
    }

}
