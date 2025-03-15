/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author lenovo
 */
public class FondoImagen extends JPanel{
    private Image image; // Almacena la imagen de fondo

   
    public FondoImagen(String imagePath) {
        this.setImage(imagePath);
    }

   
    public void setImage(String imagePath) {
        image = new ImageIcon(getClass().getResource(imagePath)).getImage();
        repaint(); // Actualiza el fondo al cambiar la imagen
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (image != null) {
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
