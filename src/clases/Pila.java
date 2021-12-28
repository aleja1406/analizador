/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author aleja
 */
public class Pila {
    
    private Nodo Ultimovalor;
    
    public Pila(){
        
        Ultimovalor=null;
    }
    
    public void Insertar(char valor){
        
        Nodo nuevo= new Nodo();
        nuevo.informacion=valor;
        if(Ultimovalor==null){
            nuevo.siguiente=null;
            Ultimovalor=nuevo;
        }else{
            nuevo.siguiente=Ultimovalor;
            Ultimovalor=nuevo;
        }
        
    }
    
    public char Extraer(){
        
        if(Ultimovalor!=null){
            char informacion=Ultimovalor.informacion;
            Ultimovalor=Ultimovalor.siguiente;
            return informacion;
        }else{
            return Character.MAX_VALUE;
        }
    }
    
    public boolean Pilavacia(){
        return Ultimovalor==null;
    }
}
