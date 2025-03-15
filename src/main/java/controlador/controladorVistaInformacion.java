/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import vista.entrada;
import vista.informacion;

/**
 *
 * @author julio
 */
public class controladorVistaInformacion  extends MouseAdapter{
    
    informacion objInfo;
    entrada objEntrada;
    public  controladorVistaInformacion(informacion objInfo){
        this.objInfo=objInfo;
    }
    
    @Override
    public void mouseClicked(MouseEvent evt){
        if(evt.getSource() == objInfo.lblExit){
            objEntrada= new entrada();
            objEntrada.setVisible(true);
            objInfo.setVisible(false);
        }
    }
}
