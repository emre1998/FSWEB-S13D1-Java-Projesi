public class cat {
    public static boolean isCatPlaying(boolean isSummer,int temperature) {
        int upperLimit = isSummer ? 45:35;
        return temperature >= 25 && temperature <= upperLimit;
    }

}
