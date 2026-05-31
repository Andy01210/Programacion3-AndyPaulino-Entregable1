import java.util.Scanner;
import java.util.ArrayList;
public class ListaProfesores {
    ArrayList <Profesor> ArregloProfe = new ArrayList<Profesor>();
    Scanner leer = new Scanner(System.in);

    public void RegistrarProfesor(){
        System.out.println("Ingrese el nombre del profesor");
        String nom = Validar();
        System.out.println("Ingrese el Apellido del profesor");
        String ape = Validar();
        System.out.println("ingrese la especialidad del profeso");
        String esp = Validar();
        System.out.println("Ingrese el Codigoprofesor");
        int cod = ValidarInt();
        ArregloProfe.add(new Profesor(nom, ape, cod, esp));
    }
    public void ListarProfesores(){
        for( Profesor profe : ArregloProfe){
            System.out.println("Nombre: "+ profe.getNombre());
            System.out.println("Apellido: "+profe.getApellido());
            System.out.println("Codigo: " +profe.getCodigo());
            System.out.println("Especialidad: " +profe.getEspecialidad());

        }
    }

    public String Validar(){
        String validar = leer.nextLine();   
        do{
            if(validar.isEmpty()){
                System.out.println("Error. Intentelo nuevamente");
            }
        }while(validar.isEmpty());
        return validar;
    }
    public int ValidarInt(){
        int cod = leer.nextInt();
        leer.nextLine();
        do{
            if(cod< 0){
                System.out.println("Error. Intentelo nuevamente");
            }
        }while(cod <0);
        return cod;
    }
    
}
