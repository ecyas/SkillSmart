package oop;

import java.util.Objects;

public class CPU extends ComputerPart {
    private double frequency;
    private String socket;

    public CPU(String manufacturer, Enum e, double price, double frequency, String socket) {
        super(manufacturer, e, price);
        this.frequency = frequency;
        this.socket = socket;
    }

    public double getFrequency() {
        return frequency;
    }

    public String getSocket() {
        return socket;
    }

    public String setPlugIn() {
        return super.setPlugIn();
    }

    public boolean isPlugIn() {
        return this.plugIn();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        CPU cpu = (CPU) o;
        return Double.compare(cpu.frequency, frequency) == 0 &&
                Objects.equals(socket, cpu.socket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), frequency, socket);
    }

    public String toString() {
        return "CPU{" + ComputerParts.CPU + ": manufacturer='" + getManufacturer() +
                "', frequency=" + frequency +
                ", socket='" + socket +
                "', price=" + getPrice() +
                '}';

    }


}
