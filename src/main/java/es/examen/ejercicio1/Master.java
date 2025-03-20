package es.examen.ejercicio1;

public class Master extends CursoImpl {

    private boolean oficial;

    public Master(String nomCurso, int cupCurso, int codCurso, boolean oficial) {
        super(nomCurso, cupCurso, codCurso);
        this.oficial = oficial;
    }

    public boolean isOficial() {
        return oficial;
    }

    public void setOficial(boolean oficial) {
        this.oficial = oficial;
    }

    @Override
    public void codigoCurso(int codCurso) {
        // TODO Auto-generated method stub
        super.codigoCurso(codCurso);
    }

    @Override
    public void cupoCurso(int cupCurso) {
        // TODO Auto-generated method stub
        super.cupoCurso(cupCurso);
    }

    @Override
    public void nombreCurso(String nomCurso) {
        // TODO Auto-generated method stub
        super.nombreCurso(nomCurso);
    }

    
    

}
