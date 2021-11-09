package clase_03_302;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JFrame;

public class Servidor01_302 {

    public static ListaSE objListaSE = new ListaSE();
    public ProcesoRecibir objProcesoRecibir = null;

    public Servidor01_302() {
        try {
            objProcesoRecibir = new ProcesoRecibir();
            objProcesoRecibir.start();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        JFrame frame = new JFrame("JFrame Example");
        frame.setSize(200, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Servidor01_302 p = new Servidor01_302();
    }
}
