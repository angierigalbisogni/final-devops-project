package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GoalTest {

    @Test
    public void testGoalCreation() {
        Main.Goal goal = new Main.Goal("Test Goal", "Finish project", "2025-08-05", "In Progress");
        assertEquals("Test Goal", goal.title);
        assertEquals("Finish project", goal.description);
        assertEquals("2025-08-05", goal.deadline);
        assertEquals("In Progress", goal.status);
    }

    @Test
    public void testGoalToString() {
        Main.Goal goal = new Main.Goal("Read Book", "Finish reading by Friday", "2025-08-09", "Completed");
        String result = goal.toString();
        assertTrue(result.contains("Title: Read Book"));
        assertTrue(result.contains("Description: Finish reading by Friday"));
        assertTrue(result.contains("Deadline: 2025-08-09"));
        assertTrue(result.contains("Status: Completed"));
    }
}

