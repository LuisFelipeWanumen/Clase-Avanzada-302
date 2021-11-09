package clase01_302;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
public class Servidor01_302 {    
    public Servidor01_302(){
        try{
            System.out.println("SERVIDOR!!");
            ServerSocket ss = new ServerSocket(99);
            Socket cliente = ss.accept();
            OutputStream flujoSalida = cliente.getOutputStream();
            DataOutputStream fS = new DataOutputStream(flujoSalida);            
            fS.writeUTF("Hola, soy el Server Wanumen");
            fS.writeUTF("Te queria saludar");
            
            /*
            InputStream flujoEntrada = cliente.getInputStream();
            DataInputStream fe = new DataInputStream(flujoEntrada);
            String leido = fe.readUTF();
            System.out.println("El cliente me dijo "+leido); */
            
            fS.writeUTF("Se me olvidaba decirte que te extraño!!");
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
    public static void main(String[] args) {
        Servidor01_302 p = new Servidor01_302();
    }    
}
