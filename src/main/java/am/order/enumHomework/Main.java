package am.order.enumHomework;


import static am.order.enumHomework.DaysOfWeek.currentDay;
import static am.order.enumHomework.DaysOfWeek.weekDayOrWeekend;

public class Main {
    public static void main(String[] args) {

        //Task 1: Print a message based on the current day.
        currentDay(DaysOfWeek.MONDAY);
        currentDay(DaysOfWeek.SATURDAY);
        System.out.println("------------------------------------");

        // Task 2
        weekDayOrWeekend(DaysOfWeek.WEDNESDAY);
        weekDayOrWeekend(DaysOfWeek.SATURDAY);
        System.out.println("------------------------------------");

        //Task 3: Task: Print the average temperature for each season.

        System.out.println("The average temperature for summer is " + Season.SUMMER.getAverageTemperature());
        System.out.println("------------------------------------");

    }
}