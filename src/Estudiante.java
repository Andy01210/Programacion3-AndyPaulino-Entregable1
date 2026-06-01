import java.util.ArrayList;
public class Estudiante extends Persona{
    private String Matricula;
    private int Edad;
    private String Carrera;
    private String FechaDeInscripcio;
    private ArrayList<Materia> ArregloMateriasEst;

    public Estudiante(){}
    public Estudiante(String mat, String nom, int edad, String carrera, String fecha){
        super(nom);
        setMatricula(mat);
        setEdad(edad);
        setCarrera( carrera);
        setFechadDeInscripcio(fecha);
        ArregloMateriasEst = new ArrayList<Materia>();

    }
    public String getMatricula(){return Matricula;}
    public int getEdad(){return Edad;}
    public String getCarrera(){return Carrera;}
    public String getFechadDeInscripcio(){return FechaDeInscripcio;}

    public void AgregarMateriaEst(Materia nueva){
        ArregloMateriasEst.add(nueva);
    }
    public void ImprimirMateriasInscritas(){
        for(Materia materias : ArregloMateriasEst){
            System.out.println("Materia: "+ materias.getNombre());
            System.out.println("Codigo: "+ materias.getCodigo());
            System.out.println("Creditos: "+ materias.getCreditos());
             System.out.println("------------------------------------------\n");
        }
    }

    public void setMatricula(String mat){ Matricula = mat;}
    public void setEdad(int edad){Edad = edad;}
    public void setCarrera(String carrera){Carrera = carrera;}
    public void setFechadDeInscripcio(String fecha){FechaDeInscripcio=fecha;}
}
