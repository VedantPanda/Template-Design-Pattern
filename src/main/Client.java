package main;

import main.sandwich.SandwichTemplate;
import main.sandwich.impl.CheeseSandwich;
import main.sandwich.impl.HamSandwich;
import main.sandwich.impl.PeanutButterJellySandwich;

public class Client {
    public static void main(String[] args) {
        SandwichTemplate peanutButterJellySandwich = new PeanutButterJellySandwich();
        peanutButterJellySandwich.makeSandwich();
        SandwichTemplate cheeseSandwich = new CheeseSandwich();
        cheeseSandwich.makeSandwich();
        SandwichTemplate hamSandwich = new HamSandwich();
        hamSandwich.makeSandwich();
    }
}
