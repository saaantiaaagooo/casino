/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


/**
 *
 * @author julio
 */
public class imagenPane extends JPanel{
    
    Image fondo;
    
    public imagenPane(String ruta){
        ImageIcon icono = new ImageIcon(getClass().getResource(ruta));
        
        if(icono.getImage() == null){
            throw new IllegalArgumentException("No se encontro ruta"+ ruta);
        }
        URL urlImagen = getClass().getResource(ruta);
    
    if (urlImagen == null) {
        throw new IllegalArgumentException("Imagen no encontrada: " + ruta);
    }
    
    this.fondo = new ImageIcon(urlImagen).getImage();
        
        this.fondo = icono.getImage();
        
        setPreferredSize(new Dimension(fondo.getWidth(this), fondo.getHeight(this)));
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        
        g.drawImage(fondo, 0, 0, this);
    }
    
}
