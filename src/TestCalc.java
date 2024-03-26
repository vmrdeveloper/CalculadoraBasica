/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Vladimir Mota
 */
public class TestCalc {
    
    public static void main(String[] args) {
        
        Calculadora calc = new Calculadora();
        
        System.out.println(""+calc.sumar(4, 4));
        System.out.println(""+ calc.restar(6, 3));
        System.out.println(""+calc.dividir(4, 4));
        System.out.println(""+ calc.multiplicar(6, 3));
    }
    
}
