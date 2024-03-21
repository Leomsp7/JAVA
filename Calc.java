/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercícios;

import javax.swing.JOptionPane;
        
public class Calc {
    void Soma(){
        double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de A:"));
        
        
        double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de B:"));
                
        double res = a + b;
        
        JOptionPane.showMessageDialog(null,"O valor da soma é: "+ res);
    }
    void Sub(){
        double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de A:"));
        
        
        double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de B:"));
                
        double res = a - b;
        
        JOptionPane.showMessageDialog(null,"O valor da subtração é: "+ res);
    }
   
    void Div(){
        double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de A:"));
        
        
        double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de B:"));
                
        double res = a / b;
        
        JOptionPane.showMessageDialog(null,"O valor da divisão é: "+ res);
    }
    void Mult(){
        double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de A:"));
        
        
        double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o valor de B:"));
                
        double res = a * b;
        
        JOptionPane.showMessageDialog(null,"O valor da multiplicação é: "+ res);
    }
     void AreaT(){
        double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a altura do triângulo:"));
        
        
        double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o base do triãngulo:"));
                
        double res = a * b / 2;
        
        JOptionPane.showMessageDialog(null,"A área do triângulo é: "+ res);
    }
    void AreaQ(){
        double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o lado do quadrado:"));
                
        double res = a * a;
        
        JOptionPane.showMessageDialog(null,"A área do quadrado é: "+ res);
    }
   
    void VolumeC(){
        double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Escreva Altura A:"));
                
        double res = a * a * a;
        
        JOptionPane.showMessageDialog(null,"O volume do cubo é: "+ res);
    }
    void VolumeCO(){
        double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite a altura:"));
        
        
        double b = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite o raio"));
                
        double res = 3.14 *(a*a) * b / 3;
        
        JOptionPane.showMessageDialog(null,"O volume do cone é: "+ res);
    }
        void RaioC(){
        double a = Double.parseDouble(JOptionPane.showInputDialog(null,"Digite O diâmetro do circulo:"));
        
        
        
        double res = a/ 2;
        
        JOptionPane.showMessageDialog(null,"O raio do circulo é: "+ res);
    }

}
