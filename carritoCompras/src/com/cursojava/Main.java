package com.cursojava;

import com.cursojava.useCase.CalculateDiscount;
import com.cursojava.useCase.GetItemsSaleTotal;
import com.cursojava.useCase.GetMenuOption;

import java.util.function.Supplier;

public class Main {
    private static Supplier<GetMenuOption> getMenuOptionSupplier = () -> new GetMenuOption();
    private static Supplier<CalculateDiscount> getDiscount = () -> CalculateDiscount.build();
    private static Supplier<GetItemsSaleTotal> getTotal = () -> GetItemsSaleTotal.build();

    public static void main(String[] args) {
        getMenuOptionSupplier.get().requestOption();
        System.out.println(getTotal.get());
        System.out.println(getDiscount.get());
    }
}
