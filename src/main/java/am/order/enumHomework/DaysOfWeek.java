package am.order.enumHomework;

public enum DaysOfWeek {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    //Task 2: Use the DayOfWeek enum in a switch statement to print whether the day is a weekday or weekend
    public static void weekDayOrWeekend(DaysOfWeek day) {
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY:
                System.out.println("You need to go to work today. Today is weekday");
                break;
            case SATURDAY, SUNDAY:
                System.out.println("Have a good weekend");
                break;
        }
    }
    public static void currentDay(DaysOfWeek x) {
        System.out.println("Today is " + x);
    }
}

