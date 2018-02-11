package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    @Test
    public void testUsersQuantityWithMock(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        ArrayList<String> usersList = new ArrayList<String>(){{
            add("Veronica");
            add("Mark");
            add("Stacy");
        }};
        when(statisticsMock.usersNames()).thenReturn(usersList);
        ForumStatistics forumStatistics = new ForumStatistics();

        //When
        int usersQuantity = forumStatistics.calculateAdvStatistics(statisticsMock)........;

        //Then
        Assert.assertEquals(3, usersQuantity);
    }

}
