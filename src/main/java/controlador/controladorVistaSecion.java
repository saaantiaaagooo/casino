/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import vista.entrada;
import vista.newSecion;
import vista.secion;
import vista.seleccion;

/**
 *
 * @author julio
 */
public class controladorVistaSecion extends MouseAdapter{
    
    secion objSecion;
    entrada objEntrada;
    seleccion objSeleccion;
    newSecion objNSecion;
    
    private ImageIcon imagenOrig;
    
    public controladorVistaSecion(secion objSecion){
        this.objSecion = objSecion;
        
    }
    
    @Override
    public void mouseClicked(MouseEvent evt){
        if(evt.getSource() == objSecion.lblExit){
            objEntrada = new entrada();
            objEntrada.setVisible(true);
            objSecion.setVisible(false);
        }
        if(evt.getSource() == objSecion.btnContinue){
            objSeleccion = new seleccion();
            objSeleccion.setVisible(true);
            objSecion.setVisible(false);
        }
        if(evt.getSource() == objSecion.lblNewSecion){
            objNSecion = new newSecion();
            objNSecion.setVisible(true);
            objSecion.setVisible(false);
        }
    } 
    
    @Override
    public void mouseEntered(MouseEvent evt){
        if(evt.getSource() == objSecion.lblExit){
            imagenOrig = (ImageIcon) objSecion.lblExit.getIcon();
            Image iimage = imagenOrig.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            objSecion.lblExit.setIcon(new ImageIcon(iimage));
        }
        if(evt.getSource() == objSecion.lblNewSecion){
            imagenOrig = (ImageIcon) objSecion.lblNewSecion.getIcon();
            Image iimage = imagenOrig.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            objSecion.lblNewSecion.setIcon(new ImageIcon(iimage));
        }
        if(evt.getSource() == objSecion.btnContinue){
            imagenOrig = (ImageIcon) objSecion.btnContinue.getIcon();
            Image iimage = imagenOrig.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
            objSecion.btnContinue.setIcon(new ImageIcon(iimage));
        }
    }
    
    @Override
    public void mouseExited(MouseEvent evt){
        if(evt.getSource() == objSecion.lblExit){
           
            Image iimage = imagenOrig.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
            objSecion.lblExit.setIcon(new ImageIcon(iimage));
        }
        if(evt.getSource() == objSecion.lblNewSecion){
           
            Image iimage = imagenOrig.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
            objSecion.lblNewSecion.setIcon(new ImageIcon(iimage));
        }
        if(evt.getSource() == objSecion.btnContinue){
           
            Image iimage = imagenOrig.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
            objSecion.btnContinue.setIcon(new ImageIcon(iimage));
        }
    }
}
