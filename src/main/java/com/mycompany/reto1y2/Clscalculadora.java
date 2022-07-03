/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto1y2;
import javax.swing.JOptionPane;
/**
 *
 * @author valeria milanes
 */
public class Clscalculadora {
    
    public void iniciarPrograma(){
String menu = """
               Seleccione una opción:
                  1. Realizar una operación.
                  2.Salir.
                """;

String menuOperacion= """
                      Selccione una operación:
                      
                      1. Suma
                      2. Resta
                      3. Multiplicación
                      4. División
                      5. Potencia
                      6. Raíz cuadrada
                      7. Salir
                      """;
        
String opcion= "";
String tipoOperacion= "";
double divisor=0; 
double division=0;

do{
      opcion= JOptionPane.showInputDialog(menu);
      if(opcion.equals("2")){
              break;
              }
      if(opcion.equals("1")){
          tipoOperacion=JOptionPane.showInputDialog(menuOperacion);
      }   
      if(tipoOperacion.equals("1")){
          String cadenaNumero = JOptionPane.showInputDialog(
"ingrese primer numero");
double n1 = Double.parseDouble(cadenaNumero);
String cadenaNumero2 = JOptionPane.showInputDialog(
"ingrese segundo numero");
double n2 = Double.parseDouble(cadenaNumero2);
double suma=n1+n2;
          JOptionPane.showMessageDialog(null,
"El resultado es: "+ suma);
      }
     else if(tipoOperacion.equals("2")){
          String Numero = JOptionPane.showInputDialog(
"ingrese minuendo");
double minuendo = Double.parseDouble(Numero);
String Numero2 = JOptionPane.showInputDialog(
"ingrese sustraendo");
double sustraendo = Double.parseDouble(Numero2);
double resta=minuendo-sustraendo;
          JOptionPane.showMessageDialog(null,
"El resultado es: "+ resta);
      }
     else if(tipoOperacion.equals("3")){
          String cadenaM = JOptionPane.showInputDialog(
"ingrese multiplicando");
double multiplicando = Double.parseDouble(cadenaM);
String cadenaM2 = JOptionPane.showInputDialog(
"ingrese multiplicador");
double multiplicador = Double.parseDouble(cadenaM2);
double multiplicacion=multiplicando*multiplicador;
          JOptionPane.showMessageDialog(null,
"El resultado es: "+ multiplicacion);
      }
     else if(tipoOperacion.equals("4")){
          String cadenaD = JOptionPane.showInputDialog(
"ingrese dividendo");
double dividendo = Double.parseDouble(cadenaD);
String cadenaD2 = JOptionPane.showInputDialog(
"ingrese divisor");
divisor = Double.parseDouble(cadenaD2);
division=dividendo/divisor;
       }
      if(divisor!=0){
          JOptionPane.showMessageDialog(null,
"El resultado es: "+ division);
      }
     if (divisor==0){
         JOptionPane.showMessageDialog(null,
"0 no es un divisor valido");
     }
         else if(tipoOperacion.equals("5")){
          String cadenaB = JOptionPane.showInputDialog(
"ingrese base");
double base = Double.parseDouble(cadenaB);
String cadenaE = JOptionPane.showInputDialog(
"ingrese exponente");
double exponente = Double.parseDouble(cadenaE);
double p= Math.pow(base,exponente);
          JOptionPane.showMessageDialog(null,
"El resultado es: "+ p);
      }
      else if(tipoOperacion.equals("6")){
          String cadenaRaiz = JOptionPane.showInputDialog(
"ingrese numero");
double num = Double.parseDouble(cadenaRaiz);
double raiz= Math.sqrt(num);
          JOptionPane.showMessageDialog(null,
"El resultado es: "+ raiz);
      }
      else if(tipoOperacion.equals("6")){
          break;
      }
      else {
          JOptionPane.showMessageDialog(null,
"opcion no valida");
      }

      
      
     }while (!opcion.equals("2"));
    }
}
