package cuoiky;


import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Tamkhung
 */
public class NewClass extends Panel{
    Image img;
        public NewClass()
        {
            // Loads the background image and stores in img object.
            img = new ImageIcon(getClass().getClassLoader().getResource("images/abc.jpg")).getImage();
        }

        public void paint(Graphics g)
        {
            // Draws the img to the BackgroundPanel.
            g.drawImage(img, 0, 0, null);
        }
}
