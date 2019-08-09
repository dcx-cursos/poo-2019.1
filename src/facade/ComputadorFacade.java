package facade;

public class ComputadorFacade {
    private Cpu cpu = null;
    private Memoria memoria = null;
    private DiscDriver disco = null;
 
    public ComputadorFacade(Cpu cpu,
                    Memoria memoria,
                    DiscDriver hardDrive) {
        this.cpu = cpu;
        this.memoria = memoria;
        this.disco = hardDrive;
    }
 
    public void ligarComputador() {
        cpu.start();
        String hdBootInfo = disco.read("BOOT_SECTOR", "SECTOR_SIZE");
        memoria.load("BOOT_ADDRESS", hdBootInfo);
        cpu.execute();
        memoria.free("BOOT_ADDRESS", hdBootInfo);
    }
}