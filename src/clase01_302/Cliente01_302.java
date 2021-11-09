package clase01_302;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
public class Cliente01_302 {    
    public Cliente01_302(){
        try{
            System.out.println("CLIENTE!!");
            Socket cs = new Socket("localhost",99);
            // OutputStream flujoSalida = cs.getOutputStream();
            InputStream flujoEntrada = cs.getInputStream();
            DataInputStream fe = new DataInputStream(flujoEntrada);
            while(true){
                String leido = fe.readUTF();
                System.out.println("El server me dijo "+leido);
            }
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        Cliente01_302 p = new Cliente01_302();
    }
    
}
