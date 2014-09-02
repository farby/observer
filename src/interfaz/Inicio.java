/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;

import dominio.Contador;

/**
 *
 * @author alumnoFI
 */
public class Inicio {
    public static void main(String[] args){
        Contador modelo = new Contador(0);
        Menu uiMenu = new Menu(modelo);
        uiMenu.setVisible(true);
    }
}
