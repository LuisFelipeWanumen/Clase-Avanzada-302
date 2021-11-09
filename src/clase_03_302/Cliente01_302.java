package clase_03_302;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
public class Cliente01_302 {    
    public Cliente01_302(){
        Socket cs = null;
        try{
            System.out.println("CLIENTE!!");
            try{
                cs = new Socket("localhost",99);
            }
            catch(Exception e2){
                System.out.println(e2.toString());
            }            
            OutputStream flujoSalida = cs.getOutputStream();            
            DataOutputStream fs = new DataOutputStream(flujoSalida);            
            fs.writeUTF("Wanumen 1");
            fs.writeUTF("Wanumen 2");
            fs.writeUTF("Wanumen 3");
            fs.writeUTF("Wanumen 4");
            
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        Cliente01_302 p = new Cliente01_302();
    }
    
}
