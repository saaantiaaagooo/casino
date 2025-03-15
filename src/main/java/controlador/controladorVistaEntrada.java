/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import vista.entrada;
import vista.informacion;
import vista.secion;

public class controladorVistaEntrada extends MouseAdapter {

    entrada objEntrada;
    secion objSecion;
    informacion objInfo;

    private ImageIcon imagenOrig;

    public controladorVistaEntrada(entrada objEntrada) {

        this.objEntrada = objEntrada;

    }

    @Override
    public void mouseClicked(MouseEvent evt) {
        if (evt.getSource() == objEntrada.lblExit) {

            System.exit(0);

        }
        if (evt.getSource() == objEntrada.btnStart) {
            objSecion = new secion();
            objSecion.setVisible(true);
            objEntrada.setVisible(false);
        }
        
    }

    @Override
    public void mouseEntered(MouseEvent evt) {
        if (evt.getSource() == objEntrada.lblExit) {
            imagenOrig = (ImageIcon) objEntrada.lblExit.getIcon();
            Image iimage = imagenOrig.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            objEntrada.lblExit.setIcon(new ImageIcon(iimage));

        }
        if(evt.getSource() == objEntrada.btnStart){
            
            imagenOrig = (ImageIcon) objEntrada.btnStart.getIcon();
            Image imagen = imagenOrig.getImage().getScaledInstance(90, 90, Image.SCALE_SMOOTH);
            objEntrada.btnStart.setIcon(new ImageIcon (imagen));
        }

    }

    @Override
    public void mouseExited(MouseEvent evt) {
        if (evt.getSource() == objEntrada.lblExit) {

            Image iimage = imagenOrig.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
            objEntrada.lblExit.setIcon(new ImageIcon(iimage));

        }
        if(evt.getSource() == objEntrada.btnStart){
            
            Image imagen = imagenOrig.getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
            objEntrada.btnStart.setIcon(new ImageIcon (imagen));
        }
    }
}
