package com.cursojava;

import com.cursojava.calculator.Calculator;

public class Main {

    private static final String TEST_SUMA_ENTEROS = "when_add_two_integers";
    private static final String TEST_SUMA_PUNTO_FLOTANTE = "when_add_two_doubles";
    private static final String TEST_RESTA_ENTEROS = "when_add_two_integers";
    private static final String TEST_RESTA_PUNTO_FLOTANTE = "when_subtract_two_doubles";
    private static final String TEST_MULTIPLICAR_ENTEROS = "when_multiply_two_integers";
    private static final String TEST_MULTIPLICAR_PUNTO_FLOTANTE = "when_multiply_two_doubles";
    private static final String TEST_DIVIDIR_ENTEROS = "when_divide_two_integers";
    private static final String TEST_DIVIDIR_PUNTO_FLOTANTE = "when_divide_two_doubles";
    private static final String TEST_DIVIDIR_ZERO = "when_divide_by_zero";

    public static void main(String[] args) {
        Calculator calculator = new Calculator(2);

        int d = new Calculator().i;
        d++;
        System.out.println("*---------> " + d);
        int primerOperando;
        int segundoOperando;
        double primerOperandoDouble;
        double segundoOperandoDouble;
        double received;
        double expected;

        boolean isOK;

        // test: when_add_two_integers

        primerOperando = 10;
        segundoOperando = 20;
        expected = 30;

        received = calculator.sumar(primerOperando, segundoOperando);

        isOK = received == expected;

        showAssertResult(TEST_SUMA_ENTEROS, isOK, expected, received);

        // test: when_add_two_doubles

        primerOperandoDouble = 10.1;
        segundoOperandoDouble = 10.1;

        expected = 20.2;

        received = calculator.sumar(primerOperandoDouble, segundoOperandoDouble);

        isOK = received == expected;

        showAssertResult(TEST_SUMA_PUNTO_FLOTANTE, isOK, expected, received);

        // test: when_subtract_two_integers

        primerOperando = 10;
        segundoOperando = 20;
        expected = -10;

        received = calculator.restar(primerOperando, segundoOperando);

        isOK = received == expected;

        showAssertResult(TEST_RESTA_ENTEROS, isOK, expected, received);

        // test: when_subtract_two_doubles

        primerOperandoDouble = 10.1;
        segundoOperandoDouble = 10.12;

        expected = -0.02;

        received = calculator.restar(primerOperandoDouble, segundoOperandoDouble);

        isOK = received == expected;

        showAssertResult(TEST_RESTA_PUNTO_FLOTANTE, isOK, expected, received);

        // test: when_multiply_two_integers

        primerOperando = 10;
        segundoOperando = 20;
        expected = 200;

        received = calculator.multiplicar(primerOperando, segundoOperando);

        isOK = received == expected;

        showAssertResult(TEST_MULTIPLICAR_ENTEROS, isOK, expected, received);

        // test: when_multiply_two_doubles

        primerOperandoDouble = -10.1;
        segundoOperandoDouble = 10.1;

        expected = -102.01;

        received = calculator.multiplicar(primerOperandoDouble, segundoOperandoDouble);

        isOK = received == expected;

        showAssertResult(TEST_MULTIPLICAR_PUNTO_FLOTANTE, isOK, expected, received);

        // test: when_divide_two_integers

        primerOperando = 10;
        segundoOperando = 2;
        expected = 5;

        received = calculator.dividir(primerOperando, segundoOperando);

        isOK = received == expected;

        showAssertResult(TEST_DIVIDIR_ENTEROS, isOK, expected, received);

        // test: when_divide_two_doubles

        primerOperandoDouble = 10;
        segundoOperandoDouble = 20;

        expected = 0.5;

        received = calculator.dividir(primerOperandoDouble, segundoOperandoDouble);

        isOK = received == expected;

        showAssertResult(TEST_DIVIDIR_PUNTO_FLOTANTE, isOK, expected, received);

        // test: when_divide_by_zero

        primerOperandoDouble = 10;
        segundoOperandoDouble = 0;

        expected = 0;

        received = calculator.dividir(primerOperandoDouble, segundoOperandoDouble);

        isOK = received == expected;

        showAssertResult(TEST_DIVIDIR_ZERO, isOK, expected, received);

    }

    private static void showAssertResult(String test , boolean isOk, double expected, double received) {
        if (isOk) {
            System.out.println("Test: "+test+": OK");
        } else {
            System.out.println("Test: "+test+": Not OK");
            System.out.println("Expected: " + expected);
            System.out.println("Received: " + received);
        }
    }
/*
        /************************* 07/02/2022 *******************/
/*
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
*/
        /*Elevator elevatorLeft = new Elevator();
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
        boolean isOk = false;
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


    }
        /*
        // Test 1
        Elevator elevator = new Elevator();
        elevator.goUp();
        // System.out.println("Up: " + elevator.currentLevel);
        // Test 2
        Elevator elevator2 = new Elevator();
        elevator2.goDown();
        // System.out.println("Down: " + elevator2.currentLevel);
        */
        /*
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
        */

        //------------------------------------------------------------
        // Test 4 when_try_move_and_the_door_is_open
        /*boolean isOk;
        int expectedLevel = 0;

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
        }*/

        /*for(int item = 0; item < names.length; item += 1) {
            if (names[item] == searchName) {
                foundName = true;
            }
        }*/
/*
        String[] names = {"jhon", "juan", "david", "fredy", "lina", "alexa","jhon", "juan", "david", "fredy", "fredy","natalia"};
        String[] cloneNames = names;
        String searchName = "";
        boolean foundName = false;
        int repetition = 0;

        for(String name : names) {
            for (String cloneName : cloneNames) {
                if (name == cloneName) {
                    repetition++;
                }
            }
            if (repetition == 3) {
                searchName = name;
                foundName = true;
                break;
            } else {
                repetition = 0;
            }
        }

        if (foundName) {
            System.out.println("Nombre " +searchName+ " encontrado." );
        } else {
            System.out.println("Nombre " +searchName+ " No encontrado." );
        }
*/




        //------
/*
        String[] names = {"jhon", "juan", "david", "fredy", "lina", "alexa","jhon", "juan", "david", "fredy", "fredy","natalia"};
        String searchName = "fredy";
        boolean foundName = false;
        int repetition = 0;

        for(String name : names) {
            if (searchName == name) {
                repetition++;
                if (repetition == 3) {
                    foundName = true;
                    break;
                }
            }
        }

        if (foundName) {
            System.out.println("Nombre " +searchName+ " encontrado." );
        } else {
            System.out.println("Nombre " +searchName+ " No encontrado." );
        }


    }*/
}
