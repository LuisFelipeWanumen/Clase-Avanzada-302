package clase_03_302;

public class ListaSE {
    public Proceso procesoRaiz = null;
    public Proceso procesoFinal = null;
    
    public void anadir(Proceso refProceso){
        if(procesoRaiz==null){
            procesoRaiz = refProceso;
            procesoFinal = refProceso;
        }
        else{
            procesoFinal.sig = refProceso;
            procesoFinal  = refProceso;
        }            
    }
    
    public void imprimir(){
        Proceso recorrer = procesoRaiz;
        while(recorrer!=null){
            recorrer.imprimir();
            recorrer = recorrer.sig;
        }
    }
    
}
