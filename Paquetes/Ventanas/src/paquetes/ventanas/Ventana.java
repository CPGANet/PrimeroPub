package paquetes.ventanas;

import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame {
    public Ventana() {
        /*Ventana(String tit, String lbl1, String lbl2, String txt) {
        String titulo = tit;
        String label1 = lbl1;
        String label2 = lbl2;
        String texto = txt;
        */
        setTitle("Ventana para salida de consola");


        setSize(800,600);
        setLocationRelativeTo(null);
        panelw();

        // Por las dudas finalizar al salir
        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }
    private void panelw(){
        String salida = "Salida de texto de consola \n Fin del Proceso \n";
        JPanel panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);

        JLabel lbl1 = new JLabel();
        JLabel lbl2 = new JLabel();
        lbl1.setText("  Label 1  ");
        lbl1.setBounds(30,20,150,30);
        lbl1.setHorizontalAlignment(SwingConstants.CENTER);
        lbl1.setOpaque(true);
        lbl1.setBackground(Color.lightGray);
        lbl1.setForeground(Color.blue);
        lbl2.setText("  Label 2  ");
        lbl2.setBounds(330,20,150,30);
        lbl2.setHorizontalAlignment(SwingConstants.CENTER);
        lbl2.setOpaque(true);
        lbl2.setBackground(Color.lightGray);
        lbl2.setForeground(Color.blue);
        panel.add(lbl1);
        panel.add(lbl2);

        JTextArea txt1 = new JTextArea();
        txt1.setText("   Aqui iría un texto largo o la salida de consola   " + "\n " + "   ");
        txt1.setBounds(20,60,740,480);
        txt1.setOpaque(true);
        txt1.setBackground(Color.lightGray);
        txt1.setForeground(Color.black);
        txt1.append("\n \n " + salida);
        System.out.println(txt1.getText() );
        panel.add(txt1);


    }


}
