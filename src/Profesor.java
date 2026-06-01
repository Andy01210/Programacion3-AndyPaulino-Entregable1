public class Profesor extends Persona{
    private String Apellido;
    private String Especialidad;
    private int Codigo;

    public Profesor(){

    }
    public Profesor(String nom, String ape, int cod, String esp){
        super(nom);
        setApellido(ape);
        setCodigo(cod);
        setEspecialidad(esp);
    }

    public String getApellido(){return Apellido;}
    public int getCodigo(){return Codigo;}
    public String getEspecialidad(){return Especialidad;}

    public void setApellido(String ape){Apellido = ape;}
    public void setCodigo(int cod){Codigo = cod;}
    public void setEspecialidad(String esp){Especialidad = esp;}
}