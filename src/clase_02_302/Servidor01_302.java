package clase_02_302;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor01_302 {

    public Servidor01_302() {
        try {
            System.out.println("SERVIDOR!!");
            ServerSocket ss = new ServerSocket(99);
            while(true){                
                Socket cliente = ss.accept();
                System.out.println("Llego un cliente");
                Proceso hilo1 = new Proceso(cliente);
                hilo1.start();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public static void main(String[] args) {
        Servidor01_302 p = new Servidor01_302();
    }
}
