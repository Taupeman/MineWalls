package fr.taupeman.minewalls.Game;

public class GameStatus {
    private static boolean isStart = false;
    private static boolean preIsStart = false;
    private static boolean endIsStart = false;

    public static boolean isIsStart() {
        return isStart;
    }

    public static void setIsStart(boolean start) {
        isStart = start;
    }

    public static boolean isPreIsStart() {
        return preIsStart;
    }

    public static void setPreIsStart(boolean start) {
        preIsStart = start;
    }

    public static boolean isEndIsStart() {
        return endIsStart;
    }

    public static void setEndIsStart(boolean start) {
        endIsStart = start;
    }

    public static void setAllNotStart() {
        isStart = false;
        preIsStart = false;
        endIsStart = false;
    }
}