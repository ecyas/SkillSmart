package oop;


import java.util.Objects;

public class ComputerPart implements Plugable{
    private String manufacturer;
    //private String partName;
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

    public String setPlugIn() {
        plugIn();
        return ComputerParts.valueOf(getPartName()) + " is plug in.";
    }

    public String setPlugOut() {
        plugOut();
        return ComputerParts.valueOf(getPartName()) + " is plug out.";
    }

    /*public boolean isPlugIn() {

    }*/

    @Override
    public String toString() {
        return this.e.name() + ": " + this.manufacturer;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputerPart that = (ComputerPart) o;
        return Double.compare(that.price, price) == 0 &&
                Objects.equals(manufacturer, that.manufacturer) &&
                Objects.equals(e, that.e);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, e, price);
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
