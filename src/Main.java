import java.util.Scanner;
public class Main {
    public static void main(){Scanner leer = new Scanner(System.in);
        int op=0;
        ListaEstudiantes Lista = new ListaEstudiantes();
        ListaProfesores ListaProfe = new ListaProfesores();
        ListaMaterias ListaMat = new ListaMaterias();
        ListaCalificaciones ListaCal = new ListaCalificaciones();
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
            CLS(leer);
            break;
        case 2:
            ListaProfe.RegistrarProfesor();
            CLS(leer);
            break;
        case 3:
            ListaMat.AgregarMateria();
            CLS(leer);
            break;
            case 4:
                Lista.AgregarMateriaEst(ListaMat);
                CLS(leer);
                break;
        case 5:
            ListaCal.AgregarCalificacion(Lista, ListaMat);
            CLS(leer);
            break;

        case 6:
            Lista.BuscarEstudiante();
            CLS(leer);
            break;
        case 7:
            Lista.ListarEstudiantes();
            CLS(leer);
            break;
        case 8:
            ListaMat.ListarMaterias();
            CLS(leer);
            break;
        case 9:
            ListaCal.promedio(Lista, ListaCal);
            CLS(leer);
            break;
        case 10:
            System.out.println("Gracias por participar");
            CLS(leer);
            break;
        }

        }while(op!= 10);
    }
    


static void CLS(Scanner leer){
    leer.nextLine();
    leer.nextLine();
    for (int i = 0; i < 10; i++) {
       System.out.println("\n"); 
    }
}
}





