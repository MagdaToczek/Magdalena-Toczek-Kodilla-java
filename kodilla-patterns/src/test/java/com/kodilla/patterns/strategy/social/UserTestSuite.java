package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User user1 = new YGeneration("John Snow");
        User user2 = new ZGeneration("Elizabeth Tailor");
        User user3 = new Millenials("Mark Elliot Zuckerberg");

        //When
        String user1ShareOn = user1.sharePost();
        String user2ShareOn = user2.sharePost();
        String user3ShareOn = user3.sharePost();

        //Then
        Assert.assertEquals("Facebook", user1ShareOn);
        Assert.assertEquals("Snapchat", user2ShareOn);
        Assert.assertEquals("Twitter", user3ShareOn);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User user1 = new YGeneration("John Snow");

        //When
        user1.setSocialMedia(new TwitterPublisher());
        String user1ShareOn = user1.sharePost();

        //Then
        Assert.assertEquals("Twitter", user1ShareOn);
    }
}
