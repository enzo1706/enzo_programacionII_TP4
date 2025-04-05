public class main_gestion_empleados {
    public static void main(String[] args) {
        gestion_empleados empl1 = new gestion_empleados(1,"Alberto", "Arquitecto",5698.23);
        gestion_empleados empl2 = new gestion_empleados(2,"Juan","Programador",58642.65);
        gestion_empleados empl3 = new gestion_empleados(3,"Julian","Marketing",57213.21);

        System.out.println(empl1.toString());
        System.out.println(empl2.toString());
        System.out.println(empl3.toString());
        System.out.println(" ");
        System.out.println("Total de empleados: " + gestion_empleados.mostrarTotalEmpleados());

    }
}
