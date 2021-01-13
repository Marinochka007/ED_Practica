package empleadoed_y5904039e;
import java.util.*;
/**
 *
 * @author ASUS
 */
public class EmpleadoED_y5904039e {
static final double FACTOR_HORA_EXTRA = 1.2;
private String nombreCompleto, dni;
private double salarioBasePorHora = 10.56;
public EmpleadoED_y5904039e(String nombreCompleto, String dni) {
this.nombreCompleto = nombreCompleto;
this.dni = dni;
}
public double getSalarioEsteMes(int horasExtra) {
double cantidadExtra, salarioFinal;
cantidadExtra = horasExtra * this.salarioBasePorHora *
FACTOR_HORA_EXTRA;
salarioFinal=this.salarioBasePorHora * 40 * 4 + cantidadExtra;
salarioFinal=(double)Math.round(salarioFinal * 100d) / 100d;
return salarioFinal;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmpleadoED_y5904039e emp = new EmpleadoED_y5904039e("Marina Smirnova","Y5904039e");
int horasExtra = 2;
System.out.println("El salario de " + emp.nombreCompleto + " este mes será de " + emp.getSalarioEsteMes(horasExtra)+ " euros, al hacer " + horasExtra + " horas extra.");
}
}
