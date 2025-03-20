package es.examen.ejercicio1;



public abstract class CursoImpl implements Curso{

    private String nomCurso;
    private int cupCurso;
    private int codCurso;

    

    public CursoImpl(String nomCurso, int cupCurso, int codCurso) {
        this.nomCurso = nomCurso;
        this.cupCurso = cupCurso;
        this.codCurso = codCurso;
    }

    public String getNomCurso() {
        return nomCurso;
    }

    public void setNomCurso(String nomCurso) {
        this.nomCurso = nomCurso;
    }

    public int getCupCurso() {
        return cupCurso;
    }

    public void setCupCurso(int cupCurso) {
        this.cupCurso = cupCurso;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    @Override
    public void nombreCurso(String nomCurso) {
        
        System.out.println("El nombre del curso es : "+nomCurso);

        
    }

    @Override
    public void cupoCurso(int cupCurso) {
        System.out.println("Los cupos que quedan en el curso son : " + cupCurso);
        
    }

    @Override
    public void codigoCurso(int codCurso) {
        System.out.println("El codigo del curso es : " +codCurso);
        
    }



}
