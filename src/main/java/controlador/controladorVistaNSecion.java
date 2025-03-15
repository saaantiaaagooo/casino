/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import javax.swing.ImageIcon;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import vista.entrada;
import vista.newSecion;
import vista.secion;
import vista.seleccion;

/**
 *
 * @author julio
 */
public class controladorVistaNSecion extends MouseAdapter{
    
    newSecion objNSecion;
    entrada objEntrada;
    secion objSecion;
  
    private ImageIcon imagenOrig;
    
    public controladorVistaNSecion (newSecion objNSecion){
        
        this.objNSecion=objNSecion;
       
    }
    
    @Override
    public void mouseClicked(MouseEvent evt){
        if(evt.getSource() == objNSecion.lblExit){
            objSecion = new secion();
            objSecion.setVisible(true);
            objNSecion.setVisible(false);
        }
        if(evt.getSource() == objNSecion.btnSave){
            objSecion = new secion();
            objSecion.setVisible(true);
            objNSecion.setVisible(false);
        }
    }
    
    @Override
    public void mouseEntered(MouseEvent evt){
        if(evt.getSource() == objNSecion.btnSave){
             imagenOrig = (ImageIcon) objNSecion.btnSave.getIcon();
            Image iimage = imagenOrig.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            objNSecion.btnSave.setIcon(new ImageIcon(iimage));
        }
        
        if(evt.getSource() == objNSecion.lblExit){
             imagenOrig = (ImageIcon) objNSecion.lblExit.getIcon();
            Image iimage = imagenOrig.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            objNSecion.lblExit.setIcon(new ImageIcon(iimage));
        }
    }
    
    @Override
    public void mouseExited(MouseEvent evt){
        if(evt.getSource() == objNSecion.btnSave){
         
            Image iimage = imagenOrig.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
            objNSecion.btnSave.setIcon(new ImageIcon(iimage));
        }
        
        if(evt.getSource() == objNSecion.lblExit){
  
            Image iimage = imagenOrig.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
            objNSecion.lblExit.setIcon(new ImageIcon(iimage));
        }
    }
}
