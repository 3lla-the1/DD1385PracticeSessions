package Facade;

class CPU {
    public void start() {
        System.out.println("CPU started");
    }

    public void shutdown() {
        System.out.println("CPU shut down");
    }
}


class Memory {
    public void load() {
        System.out.println("Memory loaded");
    }

    public void unload() {
        System.out.println("Memory unloaded");
    }
}


class Harddrive {
    public void read() {
        System.out.println("Hard drive read");
    }

    public void write() {
        System.out.println("Hard drive written");
    }
}






public class ComputerFacade {
    private CPU cpu;
    private Memory memory;
    private Harddrive hardDrive;

    public ComputerFacade() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.hardDrive = new Harddrive();
    }


    public void start() {
        this.cpu.start();
        this.memory.load();
        this.hardDrive.read();
        System.out.println("Computer started");
    }


    public void shutdown() {
        this.cpu.shutdown();
        this.memory.unload();
        this.hardDrive.write();
        System.out.println("Computer shut down");
    }
}
