public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(0.0));
        System.out.println(area(5,4 ));
    }

    public static double area( double radius){
        double circleArea = (radius * radius) * Math.PI;

        if ( radius < 0 ){
            return  -1.0;
        }return circleArea;
    }

    public static double area ( double x, double y){
        double areaOfTriangle =  (x * y);

        if ( x < 0 || y < 0){
            return -1.0;
        }return areaOfTriangle;
    }
}
