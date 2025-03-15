/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import vista.bingo;
import vista.seleccion;

/**
 *
 * @author julio
 */
public class controladorVistaBingo extends MouseAdapter {
    
    bingo objBingo;
    seleccion objSeleccion;
    public controladorVistaBingo(bingo objBingo){
        
        this.objBingo=objBingo;
       
    }
    
    @Override
    public void mouseClicked(MouseEvent evt){
        if(evt.getSource() == objBingo.lblExit){
            objSeleccion = new seleccion();
            objSeleccion.setVisible(true);
            objBingo.setVisible(false);
        }
    }
}
