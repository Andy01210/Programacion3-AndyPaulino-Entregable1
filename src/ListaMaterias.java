import java.util.Scanner;
import java.util.ArrayList;

public class ListaMaterias{
    Scanner leer = new Scanner(System.in);
    ArrayList<Materia> ArregloMaterias = new ArrayList<Materia>();

    public void AgregarMateria(){
        System.out.println("Ingrese el nombre de la materia");
        String nom = Validar();
        System.out.println("Ingrese el codigo de la materia");
        int cod = ValidarInt();
        System.out.println("Ingrese la cantidad de creditos de la materia");
        int cre = ValidarInt();
        ArregloMaterias.add(new Materia(nom,cod,cre));

    }
    public void ListarMaterias(){
        for( Materia materia : ArregloMaterias){
            System.out.println("Nombre de la materia: "+ materia.getNombre());
            System.out.println("Codigo de la materia: "+ materia.getCodigo());
            System.out.println("Creditos de la materia: "+ materia.getCreditos());
            System.out.println("------------------------------------------\n");
        }
    }
    public String Validar(){
        String validar;
        do{
            validar = leer.nextLine();
        if(validar.isEmpty()){
            System.out.println("Error, intentelo de nuevo");
        }
    }while(validar.isEmpty());
    return validar;
    }
    public int ValidarInt(){
        int validar;
        do{
            validar = leer.nextInt();
            leer.nextLine();
            if(validar < 0){
                System.out.println("Error. Intentelo de nuevo");
            }
        }while(validar <0);
        return validar;
    }
}
