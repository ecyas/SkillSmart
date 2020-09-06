package oop;

import java.util.Objects;

public class ComputerPart implements Plugable{
    private String manufacturer;
    private String partName;
    private Enum e;
    private double price;

    public ComputerPart(String manufacturer, Enum e, double price) {
        this.manufacturer = manufacturer;
        this.e = e;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPartName() {
        return e.name();
    }

    public double getPrice() {
        return price;
    }

    public boolean plugIn() {
        return true;
    }

    public boolean plugOut() {
        return false;
    }

    @Override
    public String setPlugIn() {
        plugIn();
        return ComputerParts.valueOf(getPartName()) + " is plug in.";
    }

    @Override
    public String setPlugOut() {
        plugOut();
        return ComputerParts.valueOf(getPartName()) + " is plug out.";
    }

    /*public boolean isPlugIn() {

    }*/


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputerPart that = (ComputerPart) o;
        return Double.compare(that.price, price) == 0 &&
                Objects.equals(manufacturer, that.manufacturer) &&
                Objects.equals(partName, that.partName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, partName, price);
    }


    public static void main(String[] args) {
        Plugable cpu = new CPU("Intel", ComputerParts.CPU, 300.0, 4.0, "LGA1511");
        Plugable cpu1 = new CPU("Intel", ComputerParts.CPU, 300.0, 4.0, "LGA1511");
        Plugable motherboard = new Motherboard("Gigabyte", ComputerParts.MOTHERBOARD, 150.0, "LGA1151");
        Plugable gpu = new GPU("Gigabyte", ComputerParts.GPU, 999.0, new Memory(12));
        Plugable ram = new RAM("Kingston", ComputerParts.RAM, 200.0, new Memory(24));

        //System.out.println(cpu.isPlugIn());
        System.out.println(cpu1.setPlugIn());

    }

}
    enum ComputerParts {
        CPU("Processor"), GPU("GraphicCard"), MOTHERBOARD("Motherboard"), RAM("Memory");
        private String name;
        ComputerParts(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return this.getName();
        }
    }
