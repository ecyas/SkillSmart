package oop;

public class Main {
    public static void main(String[] args) {
        Plugable cpu = new CPU("Intel", ComputerParts.CPU, 300.0, 4.0, "LGA1511");
        Plugable cpu1 = new CPU("Intel", ComputerParts.CPU, 300.0, 4.0, "LGA1511");
        Plugable motherboard = new Motherboard("Gigabyte", ComputerParts.MOTHERBOARD, 150.0, "LGA1151");
        Plugable gpu = new GPU("Gigabyte", ComputerParts.GPU, 999.0, new Memory(12));
        Plugable ram = new RAM("Kingston", ComputerParts.RAM, 200.0, new Memory(24));

        Computer computer = new Computer(cpu, gpu, motherboard, ram);

        System.out.print("Here is your's computer: \n" + computer.toString());

    }
}
