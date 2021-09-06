public class MegaBytesConverter {
    
    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int megabytes;
        int kilobytes;
        megabytes = Math.round(kiloBytes/1024);
        kilobytes = kiloBytes   - (megabytes * 1024);      
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }
        else{
        System.out.println(kiloBytes + " KB = " + megabytes + " MB and " + kilobytes + " KB");
        }

        
    }
    
}