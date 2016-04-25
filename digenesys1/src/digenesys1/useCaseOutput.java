/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digenesys1;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Brian
 */
public class useCaseOutput extends JPanel {
    public static String actorstr;
    public static String act[] = new String[10];
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();
        
        frame.setTitle("DIAGRAM GENERATING SYSTEM");
        frame.setSize(800, 390);
        frame.setBackground(Color.white);
        frame.addWindowListener(new WindowAdapter() {
          public void windowClosing(WindowEvent e) {
            System.exit(0);
          }
        });
        
        Container contentPane = frame.getContentPane();
        contentPane.add(new useCaseOutput());
        frame.show();
        
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponents(g);
        Graphics2D g2 = (Graphics2D) g;
            g2.setColor(Color.black);
            g2.setFont(new Font("Timesnewroman",Font.BOLD,12));
            g2.drawString("USE CASE Diagram:", 10, 30);
            
            for (int i=0; i<10; i++){
                if (act[i] == null)
                    act[i] = "Empty";
            }
            
            
            Image actor = new ImageIcon("actor1.png").getImage();
            g2.drawImage(actor,10, 100, this);

            g2.setStroke(new BasicStroke(2));
            //lines
            g2.drawLine(280, 100, 155, 195);
            g2.drawLine(280, 155, 155, 195);
            g2.drawLine(280, 195, 155, 195);
            g2.drawLine(290, 240, 155, 195);
            g2.drawLine(300, 295, 155, 195);
            //fields
            g2.drawString(actorstr, 65, 270);
            g2.drawString(act[0], 350, 100);
            g2.drawString(act[1], 350, 160);
            g2.drawString(act[2], 350, 200);
            g2.drawString(act[3], 350, 250);
            g2.drawString(act[4], 370, 300);
            //ovals
            g.drawOval(280, 80, 150, 30);
            g.drawOval(280, 140, 150, 30);
            g.drawOval(280, 180, 150, 30);
            g.drawOval(285, 230, 150, 30);
            g.drawOval(300, 280, 150, 30);

     }
 

}
