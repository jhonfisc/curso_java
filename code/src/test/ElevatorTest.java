package test;

import com.cursojava.examples.Building;
import com.cursojava.examples.Elevator;

public class ElevatorTest {

    public static void main(String[] args) {
        int maxLevel = 10;
        int minLevel = 1;
        Elevator elevator = new Elevator(maxLevel, minLevel);

        int expectedLevel = 10;
        int receivedLevel;
        boolean isOk;

        elevator.currentLevel = 10;
        elevator.callLevel = 10;

        elevator.goUp();

        receivedLevel  = elevator.currentLevel;

        isOk =  receivedLevel == expectedLevel;

        if (isOk) {
            System.out.println("Test when_elevator_go_up_in_max_level: OK");
        } else {
            System.out.println("Test when_elevator_go_up_in_max_level: Not OK");
            System.out.println("Expected: " + expectedLevel);
            System.out.println("Received: " + receivedLevel);
        }

        //------------------------------------------------------------

        int destinyLevel = 8;

        boolean expectedVerify = true;
        boolean receivedVerify = elevator.isAcceptedLevel(destinyLevel);

        isOk = expectedVerify ==  receivedVerify;

        if (isOk) {
            System.out.println("Test when_verify_destiny_level: OK");
        } else {
            System.out.println("Test when_verify_destiny_level: Not OK");
        }

        elevator.verifyLevel(destinyLevel);

        Elevator elevatorLeft = new Elevator();
        Elevator elevatorCenter = new Elevator();
        Elevator elevatorRight = new Elevator();
        Elevator[] buildingElevator = {elevatorLeft, elevatorCenter, elevatorRight};
        Building building = new Building(buildingElevator);

        building.getElevatorCenter().currentLevel = 1;
        building.getElevatorLeft().currentLevel = 1;
        building.getElevatorRight().currentLevel = 1;

        building.getElevatorCenter().callLevel = 2;
        building.getElevatorLeft().callLevel = 2;
        building.getElevatorRight().callLevel = 2;

        //--- Suit Test
        //boolean isOk = false;
        int expected;
        // describe: when_elevator_center_go_up

        expected = 2;
        building.getElevatorCenter().goUp();

        isOk = building.getElevatorCenter().currentLevel == expected;

        if (isOk) {
            System.out.println("Test when_elevator_center_go_up: OK");
        } else {
            System.out.println("Test when_elevator_center_go_up: Not OK");
            System.out.println("Expected: " + expected);
            System.out.println("Received: " + building.getElevatorCenter().currentLevel);
        }

        // describe: when_elevator_left_go_up

        expected = 2;

        building.getElevatorLeft().goUp();

        isOk = building.getElevatorLeft().currentLevel == expected;

        if (isOk) {
            System.out.println("Test: when_elevator_left_go_up: OK");
        } else {
            System.out.println("Test when_elevator_left_go_up: Not OK");
            System.out.println(" - Expected: " + expected);
            System.out.println(" - Received: " + building.getElevatorLeft().currentLevel);
        }


        // describe: when_elevator_right_go_up

        expected = 2;

        building.getElevatorRight().goUp();

        isOk = building.getElevatorRight().currentLevel == expected;

        if (isOk) {
            System.out.println("Test when_elevator_right_go_up: OK");
        } else {
            System.out.println("Test when_elevator_right_go_up: Not OK");
            System.out.println(" - Expected: " + expected);
            System.out.println(" - Received: " + building.getElevatorRight().currentLevel);
        }

        // clear

        building.getElevatorCenter().currentLevel = 1;
        building.getElevatorLeft().currentLevel = 1;
        building.getElevatorRight().currentLevel = 1;

        building.getElevatorCenter().callLevel = 2;
        building.getElevatorLeft().callLevel = 2;
        building.getElevatorRight().callLevel = 2;

        // describe: when_elevator_center_go_up_whit_open_door

        expected = 3;
        building.getElevatorCenter().goUp();
        building.getElevatorCenter().openDoor();
        building.getElevatorCenter().goUp();

        isOk = building.getElevatorCenter().currentLevel == expected;

        if (isOk) {
            System.out.println("Test when_elevator_center_go_up_whit_open_door: OK");
        } else {
            System.out.println("Test when_elevator_center_go_up_whit_open_door: Not OK");
            System.out.println(" - Expected: " + expected);
            System.out.println(" - Received: " + building.getElevatorCenter().currentLevel);
        }

        // describe: when_elevator_left_go_up

        expected = 3;
        building.getElevatorLeft().goUp();
        building.getElevatorLeft().openDoor();
        building.getElevatorLeft().goUp();

        isOk = building.getElevatorLeft().currentLevel == expected;

        if (isOk) {
            System.out.println("Test: when_elevator_left_go_up_whit_open_door: OK");
        } else {
            System.out.println("Test when_elevator_left_go_up_whit_open_door: Not OK");
            System.out.println(" - Expected: " + expected);
            System.out.println(" - Received: " + building.getElevatorLeft().currentLevel);
        }


        // describe: when_elevator_right_go_up

        expected = 3;
        building.getElevatorRight().goUp();
        building.getElevatorRight().openDoor();
        building.getElevatorRight().goUp();

        isOk = building.getElevatorRight().currentLevel == expected;

        if (isOk) {
            System.out.println("Test when_elevator_right_go_up_whit_open_door: OK");
        } else {
            System.out.println("Test when_elevator_right_go_up_whit_open_door: Not OK");
            System.out.println(" - Expected: " + expected);
            System.out.println(" - Received: " + building.getElevatorRight().currentLevel);
        }


        // Test 1
        Elevator elevator1 = new Elevator();
        elevator1.goUp();
        System.out.println("Up: " + elevator1.currentLevel);
        // Test 2
        Elevator elevator2 = new Elevator();
        elevator2.goDown();
        // System.out.println("Down: " + elevator2.currentLevel);

        // Test 3
        Elevator elevator3 = new Elevator();

        elevator3.callLevel = 1;

        elevator3.goUp();

        System.out.println("Call Level: " + elevator3.callLevel);
        System.out.println("Current Level: " + elevator3.currentLevel);

        elevator3.openDoor();

        System.out.println("--- Action Open ---");
        System.out.println("is Open Door: " + elevator3.isOpenDoor);
        System.out.println("is Close Door: " + elevator3.isCloseDoor);

        elevator3.closeDoor();

        System.out.println("--- Action Close ---");
        System.out.println("is Open Door: " + elevator3.isOpenDoor);
        System.out.println("is Close Door: " + elevator3.isCloseDoor);


        //------------------------------------------------------------
        // Test 4 when_try_move_and_the_door_is_open
        // boolean isOk;
        expectedLevel = 0;

        Elevator elevator4 = new Elevator();
        elevator4.callLevel = 1;

        elevator4.goUp();
        elevator4.openDoor();
        elevator4.goDown();

        isOk = elevator4.currentLevel == expectedLevel;

        if(isOk) {
            System.out.println("Test 4: OK");
        } else {
            System.out.println("Test 4: Not OK. The door are close.");
        }

        // Test 5 when_try_move_and_the_door_is_close

        Elevator elevator5 = new Elevator();

        elevator5.callLevel = 1;

        elevator5.goUp();
        elevator5.openDoor();
        elevator5.closeDoor();
        elevator5.goDown();

        isOk = elevator5.currentLevel == expectedLevel;

        if(isOk) {
            System.out.println("Test 5: OK");
        } else {
            System.out.println("Test 5: Not OK. The door are close.");
        }

    }
}
