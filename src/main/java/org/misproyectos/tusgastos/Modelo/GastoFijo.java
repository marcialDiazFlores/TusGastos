package org.misproyectos.tusgastos.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
@DiscriminatorValue("FIJO") // "FIJO" se asocia con GastoFijo
public class GastoFijo extends Gasto {
    @Column(nullable = false, unique = false, name = "fecha_vencimiento")
    private Date fechaVencimiento;

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }
}
