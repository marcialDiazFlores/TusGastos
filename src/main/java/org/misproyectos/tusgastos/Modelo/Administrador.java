package org.misproyectos.tusgastos.Modelo;
import jakarta.persistence.*;

@Entity
@DiscriminatorValue("A") // "A" se asocia con Administrador
public class Administrador extends Perfil {

}
