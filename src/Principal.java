import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class Principal {

    public static void main(String[] args) {

        //creando nueva municipalidad
        Municipalidad muni = new Municipalidad();

        //------PLAN1-----------
        //creando nuevo plan1
        String contribuyente1 = "Diego";
        Plan plan1 = new Plan(1,contribuyente1,1500,2);
        //creando nuevos pagos para plan 1
        System.out.println("PLAN - CONTRIBUYENTE -> " + contribuyente1);
        System.out.println("---- creando pago 1 ---- " + contribuyente1);
        Pago pago1Plan1 = new Pago(cargarFechaVencimiento(), cargarFechaPago(), 3000);
        System.out.println("---- creando pago 2 ---- " + contribuyente1);
        Pago pago2Plan1 = new Pago(cargarFechaVencimiento(), cargarFechaPago(), 4500);
        //agregando pagos a plan 1
        plan1.agregarPago(pago1Plan1);
        plan1.agregarPago(pago2Plan1);
        //agregando plan1 a muni
        muni.agregarPlan(plan1);



        //-------PLAN2-------------
        //creando nuevo plan2
        String contribuyente2 = "Pablo";
        Plan plan2 = new Plan(2,contribuyente2,7500,2);
        //creando nuevos pagos para plan 2
        System.out.println("PLAN - CONTRIBUYENTE -> " + contribuyente2);
        System.out.println("---- creando pago 1 ---- " + contribuyente2);
        Pago pago1Plan2 = new Pago(cargarFechaVencimiento(), cargarFechaPago(), 5600);
        System.out.println("---- creando pago 2 ---- " + contribuyente2);
        Pago pago2Plan2 = new Pago(cargarFechaVencimiento(), cargarFechaPago(), 8100);
        //agregando pagos a plan2
        plan2.agregarPago(pago1Plan2);
        plan2.agregarPago(pago2Plan2);
        //agregando plan2 a muni
        muni.agregarPlan(plan2);


        //-----------PLAN3----------------
        //creando nuevo plan3
        String contribuyente3 = "Marcos";
        Plan plan3 = new Plan(3,contribuyente3,9000,6);
        //creando nuevos pagos para plan 1
        System.out.println("PLAN - CONTRIBUYENTE -> " + contribuyente3);
        System.out.println("---- creando pago 1 ---- " + contribuyente3);
        Pago pago1Plan3 = new Pago(cargarFechaVencimiento(), cargarFechaPago(), 19000);
        System.out.println("---- creando pago 2 ---- " + contribuyente3);
        Pago pago2Plan3 = new Pago(cargarFechaVencimiento(), cargarFechaPago(), 6600);
        System.out.println("------creando pago 3------" + contribuyente3);
        Pago pago3plan3 = new Pago(cargarFechaVencimiento(),cargarFechaPago(),13400);
        //agregando pagos a plan 3
        plan3.agregarPago(pago1Plan3);
        plan3.agregarPago(pago2Plan3);
        plan3.agregarPago(pago3plan3);
        //agregando plan3 a muni
        muni.agregarPlan(plan3);

        //---------------------------

        //listado de pagos de contribuyente 1 (Diego)
        String listadoPagoContribuyente1;
        listadoPagoContribuyente1 = muni.listadoPagosContribuyente(contribuyente1);
        System.out.println(listadoPagoContribuyente1);

        //listado de pagos de contribuyente 2 (Pablo)
        String listadoPagoContribuyente2;
        listadoPagoContribuyente2 = muni.listadoPagosContribuyente(contribuyente2);
        System.out.println(listadoPagoContribuyente2);

        //Listado de pagos de contribuyente 3 (Marcos)
        String listadoPagoContribuyente3;
        listadoPagoContribuyente3 = muni.listadoPagosContribuyente(contribuyente3);
        System.out.println(listadoPagoContribuyente3);

        //promedio general de intereses adicionales cobrados
        float promedioGeneralIntereses = muni.promedioGeneralIntereses();
        System.out.println("El promedio general de intereses adicionales es de: " +
                "" + promedioGeneralIntereses + " pesos");

        //cantidad de planes pagados
        int cantidadPlanesPagados = muni.cantidadPlanesPagados();
        System.out.println("Cantidad de planes pagados en su totalidad: " + cantidadPlanesPagados);

        //sumatoria de deudas
        float sumaDeudas;
        sumaDeudas = muni.sumatoriaDeudas();
        System.out.println("La sumatoria de deudas de todos los planes es de: " + sumaDeudas + " pesos");

    }

    public static LocalDate cargarFechaVencimiento(){

        Scanner lectura = new Scanner(System.in);

        //ingresando dia de vencimiento
        System.out.println("Ingrese dia de vencimiento: ");
        int diaVencimiento = lectura.nextInt();

        //ingresando mes de vencimiento
        System.out.println("Ingrese mes de vencimiento: ");
        int mesVencimiento = lectura.nextInt();

        //ingresando año de vencimiento
        System.out.println("Ingrese año de vencimiento: ");
        int añoVencimiento = lectura.nextInt();

        LocalDate fechaVencimiento = LocalDate.of(añoVencimiento,mesVencimiento,diaVencimiento);

        return fechaVencimiento;
    }

    public static LocalDate cargarFechaPago(){
        Scanner lectura = new Scanner(System.in);

        //ingresando dia de pago
        System.out.println("Ingrese dia de pago: ");
        int diaPago = lectura.nextInt();

        //ingresando mes de pago
        System.out.println("Ingrese mes de pago: ");
        int mesPago = lectura.nextInt();

        //ingresando año de pago
        System.out.println("Ingrese año de pago: ");
        int añoPago = lectura.nextInt();

        LocalDate fechaPago = LocalDate.of(añoPago,mesPago,diaPago);

        return fechaPago;
    }


}
