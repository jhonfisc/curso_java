package com.cursojava.useCase;

import com.cursojava.service.DescuentoServiceImpl;
import com.cursojava.service.DescuentoSevice;
import com.cursojava.service.GetTotalDiscount;

import java.text.DecimalFormat;

public class CalculateDiscount implements GetTotalDiscount {
    private DescuentoSevice descuentoSevice;
    private CalculateDiscount() {
        this.descuentoSevice = new DescuentoServiceImpl();
    }

    public static CalculateDiscount build() {
        return new CalculateDiscount();
    }

    public Double get() {
        Double total = GetItemsSaleTotal.build().getTotal();
        return this.getTotal.apply(total, this.descuentoSevice.getDescuento(total));
    }

    public Double getPorcentaje() {
        Double total = GetItemsSaleTotal.build().getTotal();
        return this.descuentoSevice.getDescuento(total).getPorcentaje();
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("$#,###.00");
        return "Descueto aplicado: "+ this.getPorcentaje() + "% \n Total descuento: " + decimalFormat.format(this.get());
    }
}
