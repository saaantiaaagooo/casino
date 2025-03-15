/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import vista.jackbot;
import vista.seleccion;

/**
 *
 * @author julio
 */
public class controladorVistaJackbot extends MouseAdapter{
    
    jackbot objJack;
    seleccion objSeleccion;
    public controladorVistaJackbot(jackbot objJack){
        this.objJack= objJack;
       
    }
    
    @Override
    public void mouseClicked(MouseEvent evt){
        if(evt.getSource() == objJack.lblExit){
            objSeleccion = new seleccion();
            objSeleccion.setVisible(true);
            objJack.setVisible(false);
        }
    }
}
