package oop;

public class Motherboard extends ComputerPart {
    private String socket;

    public Motherboard(String manufacturer, Enum e, double price, String socket) {
        super(manufacturer, e, price);
        this.socket = socket;
    }

    public String getSocket() {
        return socket;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Motherboard{" + ComputerParts.MOTHERBOARD + ": manufacturer='" + getManufacturer() +
                "', socket='" + socket +
                "', price=" + getPrice() +
                '}';
    }
}
