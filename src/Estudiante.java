
public class Estudiante{
    private String Matricula;
    private String Nombre;
    private int Edad;
    private String Carrera;
    private String FechaDeInscripcio;

    public Estudiante(){}
    public Estudiante(String mat, String nom, int edad, String carrera, String fecha){
        setMatricula(mat);
        SetNombre(nom);
        setEdad(edad);
        setCarrera( carrera);
        setFechadDeInscripcio(fecha);

    }
    public String getMatricula(){return Matricula;}
    public String getNombre(){return Nombre;}
    public int getEdad(){return Edad;}
    public String getCarrera(){return Carrera;}
    public String getFechadDeInscripcio(){return FechaDeInscripcio;}

    public void SetNombre(String nom){Nombre = nom;}
    public void setMatricula(String mat){ Matricula = mat;}
    public void setEdad(int edad){Edad = edad;}
    public void setCarrera(String carrera){Carrera = carrera;}
    public void setFechadDeInscripcio(String fecha){FechaDeInscripcio=fecha;}
}

