public class AreaCalculator {
    public static double area(double radius) {
        if ( radius<0){
            return -1;
        }
        else{
            double area = (radius*radius*Math.PI);
            System.out.println(area);
            return area;
        }
    }
    public static double area(double x, double y) {
        if(x<0 ||y<0 ){
            return -1;
        }
        else{
            double area = x * y;
            return area;

        }
        
    }
    
}
