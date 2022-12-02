package com.citasmedicas.citasmedicas.model;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import lombok.Getter;
import lombok.experimental.SuperBuilder;

/**
 * @Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
 * Este tipo de herencia no lo utilizo por que no me termina de gustar, no se exactamente
 * cuando es buan opción utilizarlo ya que en este caso por ejemplo tendría una tabla Usuario
 * que creo que no le daría uso, ya que todas las consultas iran sobre las tablas paciente y 
 * medico.
 */

 /**
 * @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
 * No soy muy partidario de este tipo de herencia a no ser que las clases hijas
 * difieran en pocos atributos 1 o 2 ya que si no se quedarían muchas columnas en blanco.
 * Para este caso cuando se cree un médico se quedarían muchas columnas sin rellenar.
 */

 /**
  * MappedSuperclass
  * Creo que no lo utilizaría nunca por que no permite consultas polimórficas.
  */

/**
 * Se ha decidido utilizar este tipo de herencia ya que cada tabla tendrá una referencia
 * a la clase padre y considero que es la opción mas escalable a pesar de ser mas lenta.
 * 
 * En caso de querer construir un proyecto pequeño y no escalable no la utilizaría.
 */
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@Entity
@SuperBuilder
public class Usuario implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nombre;
    private String apellidos;
    private String usuario;
    private String clave;
}
