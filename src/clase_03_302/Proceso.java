package clase_03_302;
import java.io.DataInputStream;
import java.io.InputStream;
import java.net.Socket;

public class Proceso extends Thread{
    public InputStream flujoEntrada = null;
    public DataInputStream fe = null;
    public Socket refC = null;
    public Proceso sig = null;
    
    public void imprimir(){
        try{
            if(refC!=null){
                System.out.println(refC.toString());
            }
        }
        catch(Exception e){
        }
    }
    
    public Proceso(Socket refeC){
        try{
            refC = refeC;
            flujoEntrada = refeC.getInputStream();
            fe = new DataInputStream(flujoEntrada);
            
        }
        catch(Exception e){
        }
    }
    public void run(){
        int cont = 0;
        while(true){
            try{
                String leido = fe.readUTF();
                System.out.println(leido);                 
            }
            catch(Exception e){
            }
        }
    }
    
}
