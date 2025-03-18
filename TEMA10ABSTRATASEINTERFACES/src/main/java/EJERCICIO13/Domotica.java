/*
De cada elemento (y los futuros que aparezcan) deben ser capaces de realizar las siguientes
funciones:
• subir(), incrementa una unidad el elemento domótico. Devuelve true si la operación se realiza
correctamente o false si no se puede hacer por estar al máximo.
• bajar(): decrementa una unidad el elemento domótico. Devuelve true si la operación se realiza
correctamente o false si no se puede hacer por estar al mínimo.
• reset(): pone en la situación inicial el elemento domótico. No devuelve nada.
• verEstado(): Devuelve un String con el tipo de dispositivo y su estado actual.
Además, el termostato debe incluir un nuevo método:
• revisar(). Fija a la fecha de revisión a la fecha actual. No devuelve nada.
 */
package EJERCICIO13;

/**
 *
 * @author silvia
 */
public interface Domotica {
    public boolean subir();
    public boolean bajar();
    public void reset();
    public String verEstado();
    public void revisar();
}
