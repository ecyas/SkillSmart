package oop;

import java.util.Objects;

public class Computer {
    private CPU cpu;
    private GPU gpu;
    private Motherboard motherboard;
    private RAM ram;

    public Computer(Plugable cpu, Plugable gpu, Plugable motherboard, Plugable ram) {
        this.cpu = (CPU) cpu;
        this.gpu = (GPU) gpu;
        this.motherboard = (Motherboard) motherboard;
        this.ram = (RAM) ram;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public GPU getGpu() {
        return gpu;
    }

    public void setGpu(GPU gpu) {
        this.gpu = gpu;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(cpu, computer.cpu) &&
                Objects.equals(gpu, computer.gpu) &&
                Objects.equals(motherboard, computer.motherboard) &&
                Objects.equals(ram, computer.ram);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpu, gpu, motherboard, ram);
    }

    @Override
    public String toString() {
        return motherboard.getPartName() + ": " + motherboard.getManufacturer()
                + "(" + motherboard.getSocket() + ")" + "\n"
                + cpu.getPartName() + ": " + cpu.getManufacturer()
                + "(" + cpu.getFrequency() + " Mhz, " + cpu.getSocket() + ")" + "\n"
                + gpu.getPartName() + ": " + gpu.getManufacturer()
                + "(" + gpu.getMemory().getValue() + " Gb)" + "\n"
                + ram.getPartName() + ": " + ram.getManufacturer()
                + "(" + ram.getMemory().getValue() + " Mhz)";
    }
}
