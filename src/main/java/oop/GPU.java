package oop;

import java.util.Objects;

public class GPU extends ComputerPart {
    private Memory memory;

    public GPU(String manufacturer, Enum e, double price, Memory memory) {
        super(manufacturer, e, price);
        this.memory = memory;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        GPU gpu = (GPU) o;
        return Objects.equals(memory, gpu.memory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), memory);
    }

    @Override
    public String toString() {
        return "GPU{" + ComputerParts.GPU + ": manufacturer='" + getManufacturer() +
                "', memory=" + memory.getValue() + "Gb" +
                ", price=" + getPrice() +
                '}';
    }
}
