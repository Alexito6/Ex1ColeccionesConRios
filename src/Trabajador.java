import java.time.LocalDate;
import java.util.Comparator;
import java.util.Set;

public class Trabajador implements Comparable<Trabajador>{
    public static final Comparator<Trabajador> SORT_BY_AGE=new Comparator<Trabajador>() {
        @Override
        public int compare(Trabajador o1, Trabajador o2) {
            return o1.getFechaNacimiento().compareTo(o2.getFechaNacimiento());
        }
    };
    private String DNI;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;

    public Trabajador(String DNI, String nombre, String apellidos, LocalDate fechaNacimiento) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDNI() {
        return DNI;
    }
    public int getEdad(){
        return LocalDate.now().getYear()-fechaNacimiento.getYear();
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setEdad(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    public void printDNI(){
        System.out.println("Desde Listas.Persona imprimo el DNI: " + DNI);
    }

    @Override
    public String toString(){
        return "DNI: " + DNI + " nombre completo: " + nombre + " "+ apellidos + " edad: "+fechaNacimiento;
    }
    @Override
    public int compareTo(Trabajador trabajador){
        if (apellidos.compareTo(trabajador.getApellidos()) > 0){
            return 1;
        }
        if (apellidos.compareTo(trabajador.getApellidos()) < 0){
            return -1;
        }
        return 0;
    }
    @Override
    public int hashCode(){
        return DNI.hashCode()+nombre.hashCode()+apellidos.hashCode();
    }
    @Override
    public boolean equals(Object obj){
        if(obj==null) return false;
        if(!(obj instanceof Trabajador)) return false;
        Trabajador trabajador = (Trabajador) obj;
        return this.DNI.equals(trabajador.getDNI()) &&
                this.nombre.equals(trabajador.getNombre()) &&
                this.apellidos.equals(trabajador.getApellidos());
    }

}
