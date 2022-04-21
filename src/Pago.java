import java.time.*;
import java.time.temporal.ChronoUnit;

public class Pago{

    LocalDate fechaVencimiento;
    LocalDate fechaPago;
    long demora;
    float importe;
    float interesesAdicionales;

    public Pago(LocalDate fechaVencimiento , LocalDate fechaPago ,float importe) {

        this.fechaVencimiento = fechaVencimiento;
        this.fechaPago = fechaPago;
        this.importe = importe;
        this.demora = calcularDemora(fechaVencimiento, fechaPago);
        this.interesesAdicionales = calcularInteresesAdicionales(this.demora,this.importe);
        //this.demora = demora;
        //this.interesesAdicionales = interesesAdicionales;
    }

    public long getDemora() {
        return demora;
    }

    //metodo privado, solo se ejecuta en el constructor de la clase Pago.
    //el usuario no puede ejecutarlo
    private Long calcularDemora(LocalDate fechaVencimiento, LocalDate fechaPago){
        Long demora;
        demora = ChronoUnit.DAYS.between(fechaVencimiento, fechaPago);

        if(demora <= 0){
            demora = 0L;
            return demora;
        }
        else{
            return demora;
        }

    }

    private float calcularInteresesAdicionales(Long demora, float importe){

        float interesesAdicionales;
        if(demora == 0){
            interesesAdicionales = 0.0f;
            return interesesAdicionales;
        }
        else{
            interesesAdicionales = 0.5f * importe;
            return interesesAdicionales;
        }


    }


    /*
    Dejo comentado el metodo setDemora ya que le evito al usuario la posibilidad
    de que pueda ingresar su demora manualmente.
    El sistema la calcula a la demora a travez del metodo calcularDemora()

    public void setDemora(int demora) {
        this.demora = demora;
    }
    */


    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public float getInteresesAdicionales() {
        return interesesAdicionales;
    }

    /*
    Este metodo set tambien lo bloqueo, lo dejo comentado ya que le evito al usuario tener que
    setear el interesAdicional . Este atributo lo calcula el sistema atraves del metodo
    calcularInteresesAdicionales()

    public void setInteresesAdicionales(float interesesAdicionales) {
        this.interesesAdicionales = interesesAdicionales;
    }
    */

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setFechaPago(LocalDate fechaPago) {
        this.fechaPago = fechaPago;
    }

    @Override
    public String toString() {
        return "Pago{" +
                "fechaVencimiento=" + fechaVencimiento +
                ", fechaPago=" + fechaPago +
                ", demora=" + demora + " dias" +
                ", importe=" + importe + " pesos" +
                ", interesesAdicionales=" + interesesAdicionales + " pesos" +
                '}' + "\n";
    }





}
