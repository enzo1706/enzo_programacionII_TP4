public class gestion_empleados {
    private Integer Id;
    private String nombre;
    private String puesto;
    private Double salario;
    private static Integer totalEmpleados = 0;

    public gestion_empleados(Integer id, String nombre, String puesto, Double salario) {
        Id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        gestion_empleados.totalEmpleados ++;
    }

    public gestion_empleados(String nombre, String puesto) {
        this.Id = ++totalEmpleados;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000.0;
    }


    // Aumentar salario por porcentaje
    public void actualizarSalario(Double porcentaje){
        salario += salario * (porcentaje / 100);
        System.out.println("Salario actualizado por porcentaje: " + salario);
    }

    // Aumentar salario por cantidad fija
    public void actualizarSalario(int cantidadFija) {
        salario += cantidadFija;
        System.out.println("Salario actualizado por cantidad fija: " + salario);
    }


    // Metodo toString
    @Override
    public String toString() {
        return "Persona{Id = " + Id + " nombre = " + nombre + ", puesto = " + puesto + ", salario = " + salario + "}";
    }

    public static Integer mostrarTotalEmpleados(){
        return totalEmpleados;
    }
}
