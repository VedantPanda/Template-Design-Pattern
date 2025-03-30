package main.sandwich.impl;

import main.sandwich.SandwichTemplate;

public class PeanutButterJellySandwich extends SandwichTemplate {
    @Override
    protected void addFillings() {
        System.out.println("Spreading peanut butter on one slice");
        System.out.println("Spreading jelly on the other slice");
    }
}
