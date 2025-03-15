/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.newSecion;

    

public class controladorNSecion implements ActionListener {
    
    conexionBD conectar;
    newSecion nuevaSecion;
    
    public controladorNSecion(newSecion nuevaSecion){
        this.nuevaSecion=nuevaSecion;
        conectar = new conexionBD();
        nuevaSecion.btnSave.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == nuevaSecion.btnSave){
            conectar.conector();
        }
    }
}
