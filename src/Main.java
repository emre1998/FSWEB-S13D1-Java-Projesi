
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(dog.shouldWakeUp(true, 1));  // true (Gece 1'de köpek havlıyor)
        System.out.println(dog.shouldWakeUp(false, 2)); // false (Köpek havlamıyor)
        System.out.println(age.hasTeen(9,99,19));
        System.out.println(age.hasTeen(23,15,42));
        System.out.println(cat.isCatPlaying(true,10));
        System.out.println(cat.isCatPlaying(false,30));
        System.out.println(AreaCalc.area(5.54,3.98));
        System.out.println(AreaCalc.area(-1,-5));
        System.out.println(AreaCalc.circleArea(5.8));
        System.out.println(AreaCalc.circleArea(-1));
    }
}

