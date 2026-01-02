package projects.Weekday;

public class WhichDay {
    public static void main(String[] args) {
        for (day day : day.values()) {
            System.out.printf("%s : %s\n", day, day.getType());
        }
    }
}
