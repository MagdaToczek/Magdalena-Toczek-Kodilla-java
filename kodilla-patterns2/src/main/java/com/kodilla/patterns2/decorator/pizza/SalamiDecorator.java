package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class SalamiDecorator extends AbstractPizzaOrderDecorator {
    protected SalamiDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2.00));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " and salami";
    }
}