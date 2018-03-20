package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacBuilder() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("plain")
                .burgers(2)
                .sauce("1000 islands")
                .ingredient("lettuce")
                .ingredient("cheese")
                .ingredient("chilli pepper")
                .ingredient("mushrooms")
                .build();

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(4, howManyIngredients);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBigmacBuilderWithWrongArgument() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .roll("plain")
                .burgers(2)
                .sauce("garlic")
                .ingredient("lettuce")
                .ingredient("cheese")
                .ingredient("chilli pepper")
                .ingredient("mushrooms")
                .build();
    }
}
