import java.util.ArrayList;
import java.util.Scanner;

public class ListaEstudiantes {
    Scanner leer = new Scanner(System.in);
    ArrayList<Estudiante> Arreglo = new ArrayList<Estudiante>();


    public void RegistrarEstudiante(){
        System.out.println("Ingrese la matricula del Estudiante");
        String mat = validar();
        System.out.println("Ingrese El nombre del Estudiante");
        String nom = validar();
        System.out.println("Ingrese la Edad del Estudiante");
        int edad;
        do{
        edad = leer.nextInt();
        leer.nextLine();
        }while(edad < 0);
        System.out.println("Ingrese la carrera del Estudiante");
        String carrera = validar();
        System.out.println("Ingrese la fecha de ingreso del Estudiante");
        String fecha = validar();
        Arreglo.add(new Estudiante(mat,nom,edad,carrera,fecha));
    }

    public void ListarEstudiantes(){
        System.out.println("La lista de estudiantes inscritos es la siguiente\n");
        for(Estudiante n : Arreglo){
            System.out.println("Matricula:"+ n.getMatricula()+"\nNombre:"+ n.getNombre()+"\nCarrera: "+n.getCarrera());
            System.out.println("------------------------------------------\n");
        }
    }
    
    public void BuscarEstudiante(){
        System.out.println("Ingrese el nombre o Matricula del estudiante a buscar");
        String busqueda = leer.nextLine();
        for (Estudiante n : Arreglo){
            if(busqueda.equalsIgnoreCase(n.getNombre())|| busqueda.equalsIgnoreCase(n.getMatricula())){
                System.out.println("Estudiante encontrado");
                System.out.println("Matricula:"+ n.getMatricula()+"\nNombre:"+ n.getNombre()+"\nCarrera: "+n.getCarrera());
            System.out.println("------------------------------------------\n");
            return;
            }
        }
        System.out.println("Estudiante no encontrado");
    }

     public void AgregarMateriaEst(ListaMaterias Materias){
        int op = 0;
        do{
            System.out.println("1.Inscribir Estudiante");
            System.out.println("2.salir");
            op = leer.nextInt();
            leer.nextLine();
            switch(op){
                case 1:
                    System.out.println("Ingrese la matricula de el estudiante que desea inscribir en alguna materia");
                    String EstudianteABuscar = validar();
                    for(Estudiante Est : Arreglo){
                        if(EstudianteABuscar.equalsIgnoreCase((Est.getMatricula()))){
                            System.out.println("Estudiante encontrado");
                            System.out.println("Ingrese el nombre de la materia que desea imprimir");
                            String MateriaAgregar= validar();
                            for(Materia materia : Materias.ArregloMaterias){
                                if(MateriaAgregar.equalsIgnoreCase(materia.getNombre())){
                                    System.out.println("MAteria encontrada y registrada exitosamente");
                                    Est.AgregarMateriaEst(materia);
                                    return;
                                }
                            }System.out.println("Materia no encontrada");
                            return;
                        }
                    
                    }System.out.println("Estudiante no encontrado. Registrelo");
                    break;
                case 2:
                    System.out.println("Gracias por inscribir el estudiante");  
                    break; 
    }

    }while(op != 2);
}
    
    public String validar(){
        String Validar;
        do { 
            Validar = leer.nextLine();
            if(Validar.isEmpty()){
                System.out.println("Valor invalido. Intente de nuevo");
            } 
        } while(Validar.isEmpty());
        return Validar;
    }
     }
    

