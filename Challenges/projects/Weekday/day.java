package projects.Weekday;

public enum day {
    SUNDAY(false),
    MONDAY(true),
    TUESDAY(true),
    WEDNESDAY(true),
    THRUSDAY(true),
    FRIDAY(true),
    SATURDAY(false);

    private final boolean isWeekDay;

    private day(boolean isWeekDay) {
        this.isWeekDay = isWeekDay;
    }
    public String getType() {
        return isWeekDay ? "Weekday" : "Weekend";
    }
}
