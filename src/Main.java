import java.util.Scanner;
public class Main {
    static void main(){Scanner leer = new Scanner(System.in);
        int op=0;
        ListaEstudiantes Lista = new ListaEstudiantes();
        do{
        System.out.println("====================================");
        System.out.println("SISTEMA DE GESTIÓN ACADÉMICA");
        System.out.println("====================================");
        System.out.println("1. Registrar estudiante");
        System.out.println("2. Registrar profeso");
        System.out.println("3. Registrar materia");
        System.out.println("4. Asignar materia a estudiante");
        System.out.println("5. Registrar calificación");
        System.out.println("6. Buscar estudiante");
        System.out.println("7. Mostrar estudiantes");
        System.out.println("8. Mostrar materias");
        System.out.println("9. Mostrar reporte de promedios");
        System.out.println("10. Salir");
        op = leer.nextInt();
        leer.nextLine();
        switch(op){

        case 1:
            Lista.RegistrarEstudiante();
            break;
        case 6:
            Lista.BuscarEstudiante();
            break;
        case 7:
            Lista.ListarEstudiantes();
            break;
        case 10:
            System.out.println("Gracias por participar");
            break;
        }

        }while(op!= 10);
    }
    
}





