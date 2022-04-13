import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.lang.Double;

public class AppRestaurante {
    private static JPanel jpanel = new JPanel();
    private static JButton Bontao1 = new JButton ("Teste");
    public static void main(String args[]) throws Exception{
        //jpanel.setSize(300, 200);
        jpanel.add(Bontao1);
        JFrame f=new JFrame( );
        f.getContentPane( ).add(jpanel); // ContentPane
        f.pack( ); // para exibir o frame deve-se
        f.setVisible(true); // pack+setVisible
    }
}
