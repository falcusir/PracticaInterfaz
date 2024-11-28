/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Dell Core i7
 */
public class Cuadrado implements FiguraGeometrica{

    //1. ATRIBUTOS
    private double lado;
    
    // 2. CONSTRUCTORES
    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }
    //3. ENCAPSULAMIENTO
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    //4. METODOS DE REGLA DE NEGOCIO
    
    @Override
    public String toString (){
        return "DATOS DEL CUADRADO \n"+
            "LADOS:" + getLado();}
    
    @Override  //sobreescribir el mismo metrodo parametros pero con diferente cuerpo 
    public void area() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double perimetro() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
} 
