/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import vista.bingo;
import vista.entrada;
import vista.jackbot;
import vista.secion;
import vista.seleccion;

/**
 *
 * @author julio
 */
public class controladorVistaSeleccion extends MouseAdapter{
    
    seleccion objSeleccion;
    entrada objEntrada;
    jackbot objJack;
    bingo objBingo;
    secion objSecion;
    
    private ImageIcon imagenOrig;
    
    public controladorVistaSeleccion(seleccion objSeleccion){
        
        this.objSeleccion=objSeleccion;
             
    }
    
    @Override
    public void mouseClicked(MouseEvent evt){
        if(evt.getSource() == objSeleccion.lblExit){
            objEntrada = new entrada();
            objEntrada.setVisible(true);
            objSeleccion.setVisible(false);
        }
        if(evt.getSource() == objSeleccion.btnJackbot){
            objJack = new jackbot();
            objJack.setVisible(true);
            objSeleccion.setVisible(false);
        }
        if(evt.getSource() == objSeleccion.btnBingo){
            objBingo = new bingo();
            objBingo.setVisible(true);
            objSeleccion.setVisible(false);
        }
        if(evt.getSource() == objSeleccion.lblBack){
            objSecion = new secion();
            objSecion.setVisible(true);
            objSeleccion.setVisible(false);
        }
    }
    
    @Override
    public void mouseEntered(MouseEvent evt){ 
        
        if(evt.getSource() == objSeleccion.lblExit){
            imagenOrig = (ImageIcon) objSeleccion.lblExit.getIcon();
            Image imagen = imagenOrig.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            objSeleccion.lblExit.setIcon(new ImageIcon (imagen));
        }
        if(evt.getSource() == objSeleccion.lblBack){
            imagenOrig = (ImageIcon) objSeleccion.lblBack.getIcon();
            Image imagen = imagenOrig.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            objSeleccion.lblBack.setIcon(new ImageIcon (imagen));
        }
        if(evt.getSource() == objSeleccion.btnJackbot){
            imagenOrig = (ImageIcon) objSeleccion.btnJackbot.getIcon();
            Image imagen = imagenOrig.getImage().getScaledInstance(215, 215, Image.SCALE_SMOOTH);
            objSeleccion.btnJackbot.setIcon(new ImageIcon (imagen));
        }
        if(evt.getSource() == objSeleccion.btnBingo){
            imagenOrig = (ImageIcon) objSeleccion.btnBingo.getIcon();
            Image imagen = imagenOrig.getImage().getScaledInstance(215, 215, Image.SCALE_SMOOTH);
            objSeleccion.btnBingo.setIcon(new ImageIcon (imagen));
        }
    }
    
    @Override
    public void mouseExited(MouseEvent evt){ 
        
        if(evt.getSource() == objSeleccion.lblExit){
         
            Image imagen = imagenOrig.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
            objSeleccion.lblExit.setIcon(new ImageIcon (imagen));
        }
        if(evt.getSource() == objSeleccion.lblBack){
       
            Image imagen = imagenOrig.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
            objSeleccion.lblBack.setIcon(new ImageIcon (imagen));
        }
         if(evt.getSource() == objSeleccion.btnJackbot){
         
            Image imagen = imagenOrig.getImage().getScaledInstance(195, 195, Image.SCALE_SMOOTH);
            objSeleccion.btnJackbot.setIcon(new ImageIcon (imagen));
        }
         if(evt.getSource() == objSeleccion.btnBingo){
         
            Image imagen = imagenOrig.getImage().getScaledInstance(195, 195, Image.SCALE_SMOOTH);
            objSeleccion.btnBingo.setIcon(new ImageIcon (imagen));
        }
    }
            
}
