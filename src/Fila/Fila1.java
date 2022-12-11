
package Fila;

import Contato.Pedido;
import java.util.ArrayList;

public class Fila1 {
    ArrayList dados;
 
    public Fila1(){
        dados = new ArrayList();
    }
    
    public void queue(Pedido pedido){
        dados.add(pedido);
    }
    
    public Pedido dequeue(){
        Pedido temp = (Pedido) dados.get(0);
        dados.remove(0);
        return temp;
    }
    public boolean isEmpty(){
        if(dados.isEmpty())
            return true;
        else
            return false;
    }
    public int size(){
        return dados.size();
        
    }
    public boolean hasMoreElements(){
        if(dados.size()>0)
            return true;
        else
            return false;
    }
}
