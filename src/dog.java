public class dog {
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        if (isBarking && (hourOfDay < 8 || hourOfDay == 23)) {
            return true;
        }
        return false;
    }

}
