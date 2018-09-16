package SIG.AR;


public class Main {

    public static void timeLine(long value){

        long valueCopy = value;
        while(valueCopy / 10 != 0){
            System.out.print("|");
            valueCopy -= 10;
        }
        value = 10 - value / 10;
        for(int i = 0; i < value; ++i){
            System.out.print("-");
        }
    }
    public static void main(String[] args) throws Exception {
        new Ps().processCommand(args);
        new MemExample().getInformationsAboutMemory();
        new SystemMonitor().getSystemStatistics();
        long cpuLoad = (long)(SystemMonitor.cpuperc.getCombined() * 100);
        long memUsage = MemExample.uInPer;
        System.out.print("Cpu load ..... (");
        timeLine(cpuLoad);
        System.out.println(") (" + cpuLoad + "%)");
        System.out.print("Memory usage.. (");
        timeLine(memUsage);
        System.out.println(") (" + memUsage + "%)");
    }
}
