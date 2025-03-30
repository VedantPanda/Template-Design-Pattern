package main.sandwich;

public abstract class SandwichTemplate {

    public final void makeSandwich(){
        getBread();
        cutSandwich();
        addFillings();
        serveSandwich();
    }

    private void getBread(){
        System.out.println("Taking 2 slices of bread");
    }

    private void cutSandwich(){
        System.out.println("Cutting the sandwich in half");
    }

    private void serveSandwich(){
        System.out.println("Putting the sandwich on a plate");
        System.out.println("Sandwich is ready");
    }

    protected abstract void addFillings();

}
