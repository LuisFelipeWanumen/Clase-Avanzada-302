package clase_03_302;

import java.net.ServerSocket;
import java.net.Socket;

public class ProcesoRecibir extends Thread{
    public void run() {
        try {
            System.out.println("SERVIDOR!!");
            ServerSocket ss = new ServerSocket(99);
            while(true){                
                Socket cliente = ss.accept();                
                System.out.println("Llego un cliente");
                Proceso hilo1 = new Proceso(cliente);
                hilo1.start();
                Servidor01_302.objListaSE.anadir(hilo1);
                Servidor01_302.objListaSE.imprimir();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }   
}
