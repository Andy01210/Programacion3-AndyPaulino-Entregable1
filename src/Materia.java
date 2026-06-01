import java.util.ArrayList;

public class Materia {
    private String Nombre;
    private int Creditos;
    private int Codigo;
    private ArrayList<Double> ArregloEstudiantes;

    public Materia(){

    }
    public Materia(String nom, int cod, int cre){
        setNombre(nom);
        setCodigo(cod);
        setCreditos(cre);
        ArregloEstudiantes = new ArrayList<Double>();
    }


    public String getNombre(){return Nombre;}
    public int getCodigo(){return Codigo;}
    public int getCreditos(){return Creditos;}
    public void AgregarEstudiante(Double Calificacion){
        ArregloEstudiantes.add(Calificacion);
    }
   
    public void setNombre(String nom){Nombre = nom;}
    public void setCodigo(int cod){Codigo = cod;}
    public void setCreditos(int cre){Creditos = cre;}
}