package main.sandwich.impl;

import main.sandwich.SandwichTemplate;

public class HamSandwich extends SandwichTemplate {
    @Override
    protected void addFillings() {
        System.out.println("Adding ham slices");
        System.out.println("Adding lettuce and tomato");
        System.out.println("Adding a touch of mustard");
    }
}
