public class FactorPrinter {
    public static void printFactors(int number) {
        //invalid case
        if(number<1){
            System.out.println("Invalid Value");
        }
        else{
            int factor =1;
            while (factor<=number) {
                if(number%factor==0){
                    System.out.println(factor);
                    factor++;
                }
                else{
                    factor++;
                }

                
            }

        }
        
    }
    
}
