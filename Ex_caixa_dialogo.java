/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Erxercícios;


import javax.swing.JOptionPane;

public class Ex_caixa_dialogo {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B"));
        
        
        double res = a + b;
        
        JOptionPane.showMessageDialog(null,"O valor da soma é: "+res);
        
        
        
        
        
    }
    
}
