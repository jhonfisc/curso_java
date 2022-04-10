package com.cursojava.enums;

public enum OptionsRange {
    MIN(1), MAX(5), CONTINUE(1), EXIT(2), CONTINUE_WHIT_ERROR(0);

    private int item;

    private OptionsRange(int item) {
        this.item = item;
    }

    public int get() {
        return item;
    }
}
