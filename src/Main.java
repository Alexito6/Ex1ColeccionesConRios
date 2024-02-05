import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Trabajador,Pais> trabajadorPaisMap= new HashMap<>();
        trabajadorPaisMap.put(new Trabajador("1a","Luis","Sus",LocalDate.of(2004,1,6)),new Pais("Luislandia",2));
        trabajadorPaisMap.put(new Trabajador("2a","Alex","Paul",LocalDate.of(2008,1,6)),new Pais("España",300));
        trabajadorPaisMap.put(new Trabajador("3a","Blanca","Sussy",LocalDate.of(2009,1,6)),new Pais("Finlandia",1));
        trabajadorPaisMap.put(new Trabajador("4a","Sus","Negro",LocalDate.of(2000,1,6)),new Pais("Finlandia",1));
        trabajadorPaisMap.put(new Trabajador("5a","Aurelio","Sal",LocalDate.of(2005,1,6)),new Pais("Macedonia",1));
        //obtener un informe con los paises de los trabajadores de la empresa
       // for (Pais valor:trabajadorPaisMap.values()){
        //    System.out.println(valor);
       // }
        //ahora sin paises duplicados
        Set<Pais> paises=new TreeSet<>();
        paises.addAll(trabajadorPaisMap.values());
        for (Pais valor:paises){
            System.out.println(valor);
        }
        System.out.println("---------------------------------------");
        //Listado de los trabajadores ordenados alfabeticamente con TreeSet y ArrayList
        Set<Trabajador> trabajadorSet=new TreeSet<>(trabajadorPaisMap.keySet());
        for (Trabajador valor:trabajadorSet){
            System.out.println(valor);
        }
        List<Trabajador> trabajadorList=new ArrayList<>(trabajadorPaisMap.keySet());
        Collections.sort(trabajadorList);
        for (Trabajador valor:trabajadorList){
            System.out.println(valor);
        }
        System.out.println("---------------------------------------");
        //Informe con los países por orden alfabético y sus trabajadores por edad
        //(dos informes por separado e intentarlo con un único informe)
        List<Trabajador> listaEsclavos=new ArrayList<>(trabajadorSet);
        Collections.sort(listaEsclavos, new Comparator<Trabajador>() {
            @Override
            public int compare(Trabajador o1, Trabajador o2) {
                return Integer.compare(o1.getEdad(),o2.getEdad());
            }
        });
        for (Trabajador t:listaEsclavos){
            System.out.println(t);
        }
        System.out.println("----------------------------------------");
        Set<Pais> paisSet=new TreeSet<>(trabajadorPaisMap.values());
        for (Pais p:paisSet){
            System.out.println(p);
        }
        System.out.println("-----------------------------------------");
        Iterator<Trabajador> trabajadorIterator=listaEsclavos.iterator();
        while (trabajadorIterator.hasNext()){
            Trabajador sus=trabajadorIterator.next();
            if (sus.getEdad()>50){
                System.out.println(sus);
            }
        }
    }
}
