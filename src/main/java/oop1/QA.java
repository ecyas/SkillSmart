package oop1;

public class QA extends Person implements Payable {

    public QA(String name) {
        super(name);
    }
    public boolean increasePay(int percent) {
        System.out.println(getName() + "? Who is hell are you. F*** off, " + getName() + "!");
        return false;
    }
}
