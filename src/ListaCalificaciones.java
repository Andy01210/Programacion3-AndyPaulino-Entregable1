import java.util.ArrayList;
import java.util.Scanner;
public class ListaCalificaciones {
    ArrayList<Calificacion> ArregloCalificaciones = new ArrayList<Calificacion>();
    Scanner leer = new Scanner(System.in);

   
        public Estudiante BuscarEstudiante(ListaEstudiantes lista){
        System.out.println("Ingrese el nombre o Matricula del estudiante a buscar");
        String busqueda = leer.nextLine();
        for (Estudiante n : lista.Arreglo){
            if(busqueda.equalsIgnoreCase(n.getNombre())|| busqueda.equalsIgnoreCase(n.getMatricula())){
            return n;
            }
        }
        System.out.println("Estudiante no encontrado");
        return null;
    }

        public Materia BuscarMateria(ListaMaterias materias){
            System.out.println("Ingrese el nombre la materia a buscar a buscar");
        String busqueda = leer.nextLine();
        for (Materia n : materias.ArregloMaterias){
            if(busqueda.equalsIgnoreCase(n.getNombre())){
            return n;
            }
        }
        System.out.println("Estudiante no encontrado");
        return null;

        }

        public double AsignarCalificacion(){
            System.out.println("Ingrese la calificacion del estudiante en la materia");
            double calificaciones = ValidarDouble();
            return calificaciones;
        }

        public double ValidarDouble(){
            double validar;
            do {
                validar = leer.nextDouble();
                leer.nextLine(); 
            } while (validar < 0 || validar > 4.00);
            return validar;
        }

        public void AgregarCalificacion(ListaEstudiantes lista,ListaMaterias materias){
            int op;
            do{
                
                System.out.println("1.Asignar Calificaion");
                System.out.println("2.Imprimir calificaciones inscritas");
                System.out.println("3.Salir");
                op = leer.nextInt();
                leer.nextLine();
                switch(op){
                    case 1:
                         Estudiante est = BuscarEstudiante(lista);
                         if(est == null){
                            System.out.println("Estudiante no encontrado");
                             break;
                         }
                         Materia mat = BuscarMateria(materias);
                         if(mat == null){
                            System.out.println("Materia no encontrada");
                             break;
                         }
                         ArregloCalificaciones.add(new Calificacion(est, mat, AsignarCalificacion()));
                     
                        break;
                    case 2:
                         ImprimirCalificaciones();
                         break;
                     }
        }while(op!=3);
    }

    public void promedio(ListaEstudiantes est, ListaCalificaciones cal){
        int aprobados = 0;
        int reprobados = 0;
        for(Estudiante estudiante : est.Arreglo){
            int contador = 0;
            double calificacionTotal = 0;
            double promedio;
            for( Calificacion calificacion : cal.ArregloCalificaciones ){
                if(estudiante.getMatricula().equalsIgnoreCase(calificacion.getEstudiante().getMatricula())){
                    calificacionTotal += calificacion.getCalificacion();
                    contador++;
                }
            }
            promedio = calificacionTotal / contador;
            if(promedio >= 2.00){aprobados ++;}
            else{reprobados++;}
            System.out.println(estudiante.getNombre() +":"+ promedio);

        }
        System.out.println("Estudiantes aprobador:"+ aprobados);
        System.out.println("Estudiantes reprobados:"+ reprobados);
    }
    


        public void ImprimirCalificaciones(){
            for (Calificacion n : ArregloCalificaciones){
                System.out.println("Estudiante: "+n.getEstudiante().getNombre());
                System.out.println("Materia: "+n.getMateria().getNombre());
                System.out.println("Calificacion: "+n.getCalificacion());
                System.out.println("_____________________________________");
            }
        }
        

    }
    

