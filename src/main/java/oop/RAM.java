package oop;

import java.util.Objects;

public class RAM extends ComputerPart {
    private Memory memory;

    public RAM(String manufacturer, Enum e, double price, Memory memory) {
        super(manufacturer, e, price);
        this.memory = memory;
    }

    public Memory getMemory() {
        return memory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RAM ram = (RAM) o;
        return Objects.equals(memory, ram.memory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), memory);
    }

    @Override
    public String toString() {
        return "RAM{" + ComputerParts.RAM + ": manufacturer='" + getManufacturer() +
                "', memory=" + memory.getValue() + "Gb" +
                ", price=" + getPrice() +
                '}';
    }

}
