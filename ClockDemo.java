package cs141.landon;

import java.util.Scanner;

public class ClockDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a time in total seconds for clock 1: ");
        int total = input.nextInt();
        Clock firstClock = new Clock(total);
        for (int i = 0; i < 10; i++) {
            firstClock.tick();
            System.out.println("Tick " + (i + 1) + ": " + firstClock.toPrint());
        }

        System.out.print("Enter a seconds amount for clock 2: ");
        int seconds = input.nextInt();
        System.out.print("Enter a minutes amount for clock 2: ");
        int minutes = input.nextInt();
        System.out.print("Enter a hours amount for clock 2: ");
        int hours = input.nextInt();
        Clock secondClock = new Clock(hours, minutes, seconds);
        for (int i = 0; i < 10; i++) {
            secondClock.tick();
            System.out.println("Tick " + (i + 1) + ": " + secondClock.toPrint());
        }
        System.out.println("Added Clock: " + firstClock.addClock(secondClock));

        Clock thirdClock = firstClock.subtractClock(secondClock);
        System.out.println("Third Clock: " + thirdClock.toPrint());
    }
}
