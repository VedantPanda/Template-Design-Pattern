package main.sandwich.impl;

import main.sandwich.SandwichTemplate;

public class CheeseSandwich extends SandwichTemplate {
    @Override
    protected void addFillings() {
        System.out.println("Adding cheese slices");
        System.out.println("Adding a little bit of mayonnaise");
    }
}
