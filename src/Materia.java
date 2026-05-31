import java.util.ArrayList;

public class Materia {
    private String Nombre;
    private int Creditos;
    private int Codigo;
    private ArrayList<Estudiante> ArregloEstudiantes;

    public Materia(){

    }
    public Materia(String nom, int cod, int cre){
        setNombre(nom);
        setCodigo(cod);
        setCreditos(cre);
        ArrayList<Estudiante> ArregloEstudiantes = new ArrayList<Estudiante>();
    }


    public String getNombre(){return Nombre;}
    public int getCodigo(){return Codigo;}
    public int getCreditos(){return Creditos;}
    public void AgregarEstudiante(Estudiante nuevo){
        ArregloEstudiantes.add(nuevo);
    }
    public void ImprimirEstudiantes(){
        for( Estudiante est : ArregloEstudiantes){
            System.out.println("Nombre: "+est.getNombre());
            System.out.println("Matricula: "+est.getMatricula());
            System.out.println("Carrera: "+est.getCarrera());
             System.out.println("------------------------------------------\n");
        }
    }

    public void setNombre(String nom){Nombre = nom;}
    public void setCodigo(int cod){Codigo = cod;}
    public void setCreditos(int cre){Creditos = cre;}
}
    

