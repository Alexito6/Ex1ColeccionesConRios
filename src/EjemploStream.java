import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EjemploStream {
    public static void main(String[] args) {
        List<Pais> paises=List.of(new Pais("Luislandia",1),
                new Pais("España",2),
                new Pais("Polonia",4),
                new Pais("No",7),
                new Pais("Si",0));
        String luis=paises.stream()
                .sorted()
                .map(p->p.getNombre())
                .collect(Collectors.joining(",","Paises: ","."));
        System.out.println(luis);

        String luis2=paises.stream()
                .sorted(Pais.SORT_BY_SOULS)
                .map(p->p.getNombre())
                .collect(Collectors.joining(",","Paises: ","."));
        System.out.println(luis2);
        //paises que empiezan por consonante y que su poblacion sea par
        String luis3=paises.stream()
                .sorted()
                .filter(pais -> pais.getPoblacion()%2==0 && pais.getNombre().charAt(0)!='A' && pais.getNombre().charAt(0)!='E' && pais.getNombre().charAt(0)!='I' && pais.getNombre().charAt(0)!='O' && pais.getNombre().charAt(0)!='U')
                .map(p->p.getNombre())
                .collect(Collectors.joining(",","Paises: ","."));
        System.out.println(luis3);
    }
}
