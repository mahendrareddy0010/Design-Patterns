package structural.facadePattern;

import structural.facadePattern.subSystems.Cpu;
import structural.facadePattern.subSystems.HardDisk;
import structural.facadePattern.subSystems.Memory;
import structural.facadePattern.subSystems.OperatingSystem;

public class Computer {
    private Memory memory = new Memory();
    private HardDisk hardDisk = new HardDisk();
    private OperatingSystem operatingSystem = new OperatingSystem();
    private Cpu cpu = new Cpu();
    private final int BOOT_LOC = 0;
    private final int OS_LOC = 1024;

    public void startComputer() {
        String bootSector = hardDisk.readBootSector();
        String osData = operatingSystem.loadKernel();
        memory.load(BOOT_LOC, bootSector);
        memory.load(OS_LOC, osData);
        cpu.initialize();
    }
}
