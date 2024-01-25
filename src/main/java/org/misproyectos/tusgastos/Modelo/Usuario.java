package org.misproyectos.tusgastos.Modelo;

import jakarta.persistence.*;

import java.util.List;

@Entity
@DiscriminatorValue("U")
public class Usuario extends Perfil {
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Gasto> historialDeGastos;

    // Getter y Setter para historialDeGastos
    public List<Gasto> getHistorialDeGastos() {
        return historialDeGastos;
    }

    public void setHistorialDeGastos(List<Gasto> historialDeGastos) {
        this.historialDeGastos = historialDeGastos;
    }
}
