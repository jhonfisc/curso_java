package test;

import com.cursojava.examples.ElevatorOddLevels;

public class ElevatorOddLevelsTest {

    private static String testName;

    public static void main(String[] args) {
        when_elevator_go_up_whit_max_level_default();
        when_elevator_go_up_whit_max_level_9();
    }

    private static void when_elevator_go_up_whit_max_level_default() {
        testName = "when_elevator_go_up_whit_max_level_default";
        int expectedLevel = 3;
        int receivedLevel;
        ElevatorOddLevels elevatorOddLevels = new ElevatorOddLevels();
        elevatorOddLevels.closeDoor();
        elevatorOddLevels.goUp();
        receivedLevel = elevatorOddLevels.currentLevel;
        assertEquals(expectedLevel, receivedLevel);
    }

    private static void when_elevator_go_up_whit_max_level_9() {
        testName = "when_elevator_go_up_whit_max_level_9";
        int expectedLevel = 9;
        int receivedLevel;
        ElevatorOddLevels elevatorOddLevels = new ElevatorOddLevels(9);
        elevatorOddLevels.closeDoor();
        elevatorOddLevels.goUp();
        elevatorOddLevels.goUp();
        elevatorOddLevels.goUp();
        elevatorOddLevels.goUp();
        receivedLevel = elevatorOddLevels.currentLevel;
        assertEquals(expectedLevel, receivedLevel);
    }

    private static void assertEquals(Number expected, Number received) {
        System.out.println("\n----------------------");
         System.out.println(testName);
         if (expected == received) {
             System.out.println("Test OK");
         } else {
             System.out.println("Error in Test");
             System.out.println("Expected: " + expected + ".  Received: " + received);
         }
    }
}
