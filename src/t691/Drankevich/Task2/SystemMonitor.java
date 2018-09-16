package SIG.AR;

import org.hyperic.sigar.*;

public class SystemMonitor {

    private static Sigar sigar = new Sigar();
    public static CpuPerc cpuperc = null;

    public static void getSystemStatistics(){

        try {
            cpuperc = sigar.getCpuPerc();
        } catch (SigarException se) {
            se.printStackTrace();
        }
    }
}