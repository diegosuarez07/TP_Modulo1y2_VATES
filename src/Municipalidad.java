import java.util.HashSet;
import java.util.Set;

public class Municipalidad {

    Set<Plan> planes;

    public Municipalidad() {
        this.planes = new HashSet<>();
    }

    public void agregarPlan(Plan plan){
        planes.add(plan);
    }

    public int cantidadPlanesPagados(){
        int cantidadPlanes = 0;
        for(Plan plan: planes){
            if(plan.estaPagadoTotalmente()){
                cantidadPlanes += 1;
            }
        }
        return cantidadPlanes;
    }

    public String listadoPagosContribuyente(String nombreContribuyente){
        String listadoContribuyente = nombreContribuyente + " ";
        for(Plan plan: planes){
            if(plan.getNombreContribuyentePlan().equals(nombreContribuyente)){
               listadoContribuyente += plan.listadoPagos();
            }
        }
        return listadoContribuyente;
    }

    //aca calculo la sumatoria de intereses adicionales de todos los planes cargados (de varias personas)
    public float promedioGeneralIntereses(){
        float sumaIntereses = 0.0f;
        float promedioGeneralIntereses;

        for (Plan plan: planes) {
            sumaIntereses += plan.sumaInteresesCobrados();
        }

        promedioGeneralIntereses = sumaIntereses / planes.size();

        return promedioGeneralIntereses;


    }

    public float sumatoriaDeudas(){
        float sumaDeudas = 0;
        for(Plan plan:planes){
            sumaDeudas += plan.getDeuda();
        }
        return sumaDeudas;
    }





    


}
