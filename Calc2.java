/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercícios;

import java.util.Scanner;
        
public class Calc2 {
   
    
      Scanner x = new Scanner(System.in);
    void soma() {
    double a, b;
    
    System.out.println("Digite o valor de a");
    a = x.nextDouble();
    
    
    System.out.println("Digite o valor de b");
    b = x.nextDouble();
    
    double res = a + b;
    System.out.println("O valor da soma é "+ res);
    }
    void sub() {
    double a, b;
    
    System.out.println("Digite o valor de a");
    a = x.nextDouble();
    
    
    System.out.println("Digite o valor de b");
    b = x.nextDouble();
    
    double res = a - b;
    System.out.println("O valor da subtração é "+ res);
    }
    void Div() {
    double a, b;
    
    System.out.println("Digite o valor de a");
    a = x.nextDouble();
    
    
    System.out.println("Digite o valor de b");
    b = x.nextDouble();
    
    double res = a / b;
    System.out.println("O valor da divisão é "+ res);
    }
    void Mult() {
    double a, b;
    
    System.out.println("Digite o valor de a");
    a = x.nextDouble();
    
    
    System.out.println("Digite o valor de b");
    b = x.nextDouble();
    
    double res = a * b;
    System.out.println("O valor da multiplicação é "+ res);
    }
    void AreaQ() {
    double a, b;
    
    System.out.println("Digite a altura do quadrado");
    a = x.nextDouble();
   
    
    double res = a * a;
    System.out.println("A área do Quadrado é "+ res);
    }
    void AreaT() {
    double a, b;
    
    System.out.println("Digite a altura do triângulo");
    a = x.nextDouble();
    
    
    System.out.println("Digite a base do triângulo");
    b = x.nextDouble();
    
    double res = a * b /2;
    System.out.println("A área do triângulo é "+ res);
    }
    void VolumeC() {
    double a, b;
    
    System.out.println("Digite o valor de a");
    a = x.nextDouble();
       
    double res = a * a *a;
    System.out.println("o volume do cubo é "+ res);
    }
    void VolumeCO() {
    double a, b;
    
    System.out.println("Digite a altura do cone");
    a = x.nextDouble();
    
    
    System.out.println("Digite o raio do cone");
    b = x.nextDouble();
    
    double res = 3.14*a*a*b/3;
    System.out.println("O volume do cone é "+ res);
    }
    void RaioC() {
    double a, b;
    
    System.out.println("Digite o diâmjetro do circulo");
    a = x.nextDouble();
      
    double res = a / 2;
    System.out.println("O raio do circulço é "+ res);
    }
    }
   

