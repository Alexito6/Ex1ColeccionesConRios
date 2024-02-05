import java.util.Comparator;

public class Pais implements Comparable<Pais>{
    private String nombre;
    private Integer poblacion;
    public static Comparator<Pais> SORT_BY_SOULS=(p1,p2)->p1.getPoblacion()-p2.getPoblacion();
    public Pais(String nombre,Integer poblacion){
        this.nombre=nombre;
        this.poblacion=poblacion;
    }
    public String getNombre(){
        return nombre;
    }
    public Integer getPoblacion(){
        return poblacion;
    }
    @Override
    public String toString(){
        return "Pais: "+nombre+" con población: "+poblacion;
    }
    @Override
    public int hashCode(){
        return nombre.hashCode()+poblacion;
    }
    @Override
    public boolean equals(Object obj){
        if(obj==null) return false;
        if(!(obj instanceof Trabajador)) return false;
        Pais pais = (Pais) obj;
        return this.nombre.equals(pais.getNombre());
    }
    @Override
    public int compareTo(Pais pais){
        if (nombre.compareTo(pais.getNombre()) > 0){
            return 1;
        }
        if (nombre.compareTo(pais.getNombre()) < 0){
            return -1;
        }
        return 0;
    }
}
