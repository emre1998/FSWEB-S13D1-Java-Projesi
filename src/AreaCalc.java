public class AreaCalc {
    public static double area(double length,double width) {
        if(length <0 || width < 0) {
            return  -1;
        }
        return length * width;
    }
    public static double circleArea(double radius) {
        if(radius < 0) {
            return  -1;
        }
        return radius * radius *Math.PI;
    }

}
