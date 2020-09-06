package oop1;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Payable> workers = new ArrayList<Payable>();

        workers.add(new BackendDeveloper("Aleksandr"));
        workers.add(new FrontendDeveloper("Mike"));
        workers.add(new QA("Papandopolo"));

        for (Payable p : workers) {
            p.increasePay(20);
        }
    }
}
