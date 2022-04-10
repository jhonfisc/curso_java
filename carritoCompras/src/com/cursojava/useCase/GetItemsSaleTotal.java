package com.cursojava.useCase;

import com.cursojava.service.ItemService;
import com.cursojava.service.ItemServiceImpl;

import java.text.DecimalFormat;
import java.util.function.Supplier;

public class GetItemsSaleTotal {

    private Supplier<ItemService> getService = () -> new ItemServiceImpl();

    private GetItemsSaleTotal() {}

    public static GetItemsSaleTotal build() {
        return new GetItemsSaleTotal();
    }

    public Double getTotal() {
        return this.getService.get().getList().stream().map(item -> item.getPrecio()).reduce(0.0, (a, b) -> a +b);
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("$#,###.00");
        return "EL total es: " + decimalFormat.format(this.getTotal());
    }
}
