public class Calificacion {
    private Estudiante estudiante;
    private  double Calificacion;
    private Materia materia;

    public Calificacion(Estudiante est, Materia mat, double cal){
        estudiante = est;
        materia = mat;
        setCalificaciones(cal);
    }
    public Estudiante getEstudiante(){ return estudiante;}
    public Materia getMateria(){return materia;}
    public double getCalificacion(){return Calificacion;}
    public void setCalificaciones(Double cal){ Calificacion = cal;}
    
}
