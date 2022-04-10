package com.cursojava.useCase;

import com.cursojava.enums.OptionsRange;
import com.cursojava.exceptions.RangeNumberException;

import java.util.function.Predicate;
import java.util.function.Supplier;

import static com.cursojava.enums.OptionsRange.MAX;
import static com.cursojava.enums.OptionsRange.MIN;

public interface ShowMenu {
    Supplier<ShowMenuList> showMenuListSupplier = () -> new ShowMenuList();

    Predicate<Number> validateOption = (t) -> {
        try {
            if (t.intValue() >= MIN.get() && t.intValue() <= MAX.get()) {
                return true;
            } else {
                throw new RangeNumberException(t);
            }
        } catch (RangeNumberException e) {
            System.out.println(e.getMessage());
            return false;
        }
    };

    Predicate<Number> validateExitOption = (t) -> {
        try {
            if (t.intValue() == OptionsRange.CONTINUE.get() || t.intValue() == OptionsRange.EXIT.get()) {
                return false;
            } else {
                throw new RangeNumberException(t);
            }
        } catch (RangeNumberException e) {
            System.out.println(e.getExitMessage());
            return true;
        }
    };

    Predicate<Number> validateContinueWhitError = (t) -> t.intValue() == OptionsRange.CONTINUE_WHIT_ERROR.get();
}
