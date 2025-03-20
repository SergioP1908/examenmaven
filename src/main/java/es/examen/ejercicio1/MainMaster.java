package es.examen.ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainMaster {

    public static void main(String[] args) {
        MainMaster mainMaster = new MainMaster();
        mainMaster.crearMaster();
        mainMaster.mostrarMaster(mainMaster.crearMaster());
        mainMaster.eliminarMaster(mainMaster.crearMaster());
        mainMaster.mostrarMasterOficiales(mainMaster.crearMaster());
    }

    private List <Master> crearMaster(){

       
        List<Master> master = new ArrayList<>();


        Master master1 = new Master("JAVA", 15, 101, true);
        Master master2 = new Master("ORACLE", 20, 102, false);
        Master master3 = new Master("CIBERSEGURIDAD", 25, 103, true);

        Master []masters ={master1,master2,master3};
 
        for (Master masterArray : masters) {
            master.add(masterArray);
        }


        
        return master;
    }

    private void mostrarMaster(List<Master>master){
        System.out.println("==========Todos los Masters=============");
        for (Master masterOficiales : master) {
           
                System.out.println(masterOficiales.getNomCurso()+" " +masterOficiales.getCupCurso()+" " +masterOficiales.getCodCurso());
            
            
        }
    }

    private void mostrarMasterOficiales(List<Master>master){
        System.out.println("=============Master oficiales================");
        for (Master masterOficiales : master) {
            if(masterOficiales.isOficial()){
                System.out.println("Los Master oficiales son: "+masterOficiales.getNomCurso()+" " +masterOficiales.getCupCurso()+" " +masterOficiales.getCodCurso());
            }
            
        }
    }

    private void eliminarMaster(List<Master>master){
        int codigoEliminar = 101;

        Iterator <Master> iter = master.iterator();

        while(iter.hasNext()){
            Master masterBorrar =  iter.next();

            if(masterBorrar.getCodCurso() == codigoEliminar){
                iter.remove();

                System.out.println("============================================");
                System.out.println("El master eliminado es "+ masterBorrar.getNomCurso()+ " con el codigo " + codigoEliminar);
            }
        }
    }
}
