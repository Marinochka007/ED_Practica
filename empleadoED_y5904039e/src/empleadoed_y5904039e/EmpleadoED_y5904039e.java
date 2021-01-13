package empleadoed_y5904039e;
/*EJERCICIO PRÁCTICO EXAMEN EVAL 1 ED
@author Marina Smirnova
la version 1.0*/
import java.util.*;

public class EmpleadoED_y5904039e {
static final double FACTOR_HORA_EXTRA = 1.2;
private String nombreCompleto, dni;
private double salarioBasePorHora = 10.56;
public EmpleadoED_y5904039e(String nombreCompleto, String dni) {
this.nombreCompleto = nombreCompleto;
this.dni = dni;
}
/*Constructor con 3 parametros
*@param cantidat nombreCompleto nombre completo en mayúsculas
*@dni documento nacional de identidad con letra y sin espacios
*@param salario
*/
public double getSalarioEsteMes(int horasExtra) {
/*@param horasExtra número de horas extra dedicadas redondeado a la baja (entero)
*/
double cantidadExtra, salarioFinal;
cantidadExtra = horasExtra * this.salarioBasePorHora *
FACTOR_HORA_EXTRA;
salarioFinal=this.salarioBasePorHora * 40 * 4 + cantidadExtra;
salarioFinal=(double)Math.round(salarioFinal * 100d) / 100d;
return salarioFinal;
/*devuelve el salario bruto mensual en euros con dos decimales
*/
}
    public static void main(String[] args) {
/*Calcula el salario bruto mensual en función del salario base por hora y
las horas extras.
◦ El precio por hora de la hora extra se determina con la
constante FACTOR_HORA_EXTRA
*/
      EmpleadoED_y5904039e emp = new EmpleadoED_y5904039e("Marina Smirnova","Y5904039E");
int horasExtra = 2;
System.out.println("El salario de " + emp.nombreCompleto + " este mes será de " + emp.getSalarioEsteMes(horasExtra)+ " euros, al hacer " + horasExtra + " horas extra.");
}
}
