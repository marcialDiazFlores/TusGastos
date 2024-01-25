package org.misproyectos.tusgastos.Modelo;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("VARIABLE") // "VARIABLE" se asocia con GastoVariable
public class GastoVariable extends Gasto {

}