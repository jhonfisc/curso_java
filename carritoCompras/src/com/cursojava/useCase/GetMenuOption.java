package com.cursojava.useCase;

import com.cursojava.domain.Item;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.function.Supplier;

import static com.cursojava.enums.MenuMessages.*;

public class GetMenuOption implements ShowMenu {
    private Supplier<SetItemSaleList> setList = () -> SetItemSaleList.build();

    public void requestOption() {
        int option;
        do {
            showMenuListSupplier.get().show();
            System.out.print(MESSAGE);
            try {
                option = getUserOption();
                this.setList.get().set(showMenuListSupplier.get().getItem(option));
            } catch (InputMismatchException ex) {
                System.out.println(ERROR_MESSAGE);
                option = 0;
            }
        } while (validateContinueWhitError.or(validateOption.negate()).test(option));
        exitOption();
    }

    public void exitOption() {
        int option;
        do {
            System.out.println(MESSAGE_CONTINUE);
            try {
                option = getUserOption();
            } catch (InputMismatchException ex) {
                System.out.println(EXIT_ERROR_MESSAGE);
                option = 0;
            }
        } while (validateContinueWhitError.or(validateExitOption).test(option));
        if (option != 2) requestOption();
    }

    private int getUserOption() throws InputMismatchException {
        Scanner inputInteger = new Scanner(System.in);
        return inputInteger.nextInt();
    }
}
