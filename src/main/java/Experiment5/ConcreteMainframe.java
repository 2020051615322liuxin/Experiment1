package Experiment5;

public class ConcreteMainframe extends Mainframe{
    private CPU cpu;
    private HardDisk hardDisk;
    private Memory memory;
    private  OS os;

    ConcreteMainframe(){
        cpu = new CPU();
        hardDisk = new HardDisk();
        memory = new Memory();
        os = new OS();
    }

    @Override
    public void on() {
        cpu.run();
        hardDisk.read();
        memory.check();
        os.load();
    }
}

