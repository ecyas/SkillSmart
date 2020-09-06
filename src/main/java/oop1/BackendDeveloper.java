package oop1;

public class BackendDeveloper extends Person implements Payable {

    public BackendDeveloper(String name) {
        super(name);
    }

    public boolean increasePay(int percent) {
        boolean b;
        if (percent <= INCREASE_CAP) {
            System.out.println("You're good worker, " + getName() + "! Yours salary is increased by " + percent + "%.");
            b = true;
        } else {
            System.out.println(getName() + " wants too much. I can't increase salary over than " + INCREASE_CAP + "%.");
            b = false;
        }
        return b;
    }
}
