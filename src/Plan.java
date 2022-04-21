import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Plan{

    private int idPlan;
    private String nombreContribuyentePlan;
    private float deuda;
    private int cuotas;
    private Set<Pago> pagos;

    public Plan(int idPlan, String nombreContribuyentePlan, float deuda, int cuotas) {
        this.idPlan = idPlan;
        this.nombreContribuyentePlan = nombreContribuyentePlan;
        this.deuda = deuda;
        this.cuotas = cuotas;
        this.pagos = new HashSet<>();
    }

    public void agregarPago(Pago pago){

        pagos.add(pago);

    }

    public boolean estaPagadoTotalmente(){

        if(this.cuotas == pagos.size()){
            return true;
        }
        else{return false;}

    }

    public int cantidadPagos(){
        return pagos.size();
    }

    public String listadoPagos(){
        String cadena = "- Listado de pagos realizados: \n";
        for(Pago pago: pagos){
            cadena += pago.toString();
        }
        return cadena;
    }

    //aca devuelvo la sumatoria de intereses adicionales de UN solo plan
    public float sumaInteresesCobrados(){
        float sumaIntereses = 0.0f;
        for(Pago pago: pagos){
            sumaIntereses += pago.interesesAdicionales;
        }
        return sumaIntereses;
    }

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public String getNombreContribuyentePlan() {
        return nombreContribuyentePlan;
    }

    public void setNombreContribuyentePlan(String nombreContribuyentePlan) {
        this.nombreContribuyentePlan = nombreContribuyentePlan;
    }

    public float getDeuda() {
        return deuda;
    }

    public void setDeuda(float deuda) {
        this.deuda = deuda;
    }

    public int getCuotas() {
        return cuotas;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }



}
