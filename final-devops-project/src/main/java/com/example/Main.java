package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    static class Goal {
        String title;
        String description;
        String deadline;
        String status;

        Goal(String title, String description, String deadline, String status) {
            this.title = title;
            this.description = description;
            this.deadline = deadline;
            this.status = status;
        }

        @Override
        public String toString() {
            return "\nTitle: " + title +
                   "\nDescription: " + description +
                   "\nDeadline: " + deadline +
                   "\nStatus: " + status + "\n";
        }
    }

    public static void main(String[] args) {
        logger.info("Starting Goal Tracker App...");

        List<Goal> goalList = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\nWhat do you wanna do?\n1. Add Goal\n2. View Goals\n3. Get Affirmation\n4. Exit");
            String choice = input.nextLine();

            switch (choice) {
                case "1":
                    System.out.print("Title: ");
                    String title = input.nextLine();
                    System.out.print("Description: ");
                    String desc = input.nextLine();
                    System.out.print("Deadline: ");
                    String deadline = input.nextLine();
                    System.out.print("Status: ");
                    String status = input.nextLine();
                    Goal goal = new Goal(title, desc, deadline, status);
                    goalList.add(goal);
                    logger.info("Added goal: " + title);
                    break;
                case "2":
                    System.out.println("Your Goals:");
                    for (Goal g : goalList) {
                        System.out.println(g);
                    }
                    break;
                case "3":
                    String[] affirmations = {
                        "You are doing your best, and that's enough.",
                        "Progress over perfection.",
                        "You are capable of amazing things.",
                        "Every step you take matters."
                    };
                    int rand = (int)(Math.random() * affirmations.length);
                    System.out.println("✨ Daily Affirmation: " + affirmations[rand]);
                    break;
                case "4":
                    running = false;
                    logger.info("Exiting Goal Tracker App.");
                    break;
                default:
                    System.out.println("Oops! Not a valid choice.");
            }
        }
        input.close();
    }
}
