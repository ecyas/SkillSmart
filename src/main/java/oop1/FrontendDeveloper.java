package oop1;

public class FrontendDeveloper extends Person implements Payable {
    public FrontendDeveloper(String name) {
        super(name);
    }

    public boolean increasePay(int percent) {
        System.out.println("I don't increase salary to frontenders, " + getName() + ". Ha-ha-ha-ha.");
        return false;
    }
}
