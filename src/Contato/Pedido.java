package Contato;
import java.util.ArrayList;
public class Pedido {
private String placa;
private String itensDoPedido;
private double valorTotal;
ArrayList itensdopedido;
private int npedido;
public int getNpedido() {
return npedido;
}
public void setNpedido(int npedido) {
this.npedido = npedido;
}
public ArrayList getItensdopedido() {
return itensdopedido;
}
public void setItensdopedido(ArrayList itensdopedido) {
this.itensdopedido = itensdopedido;
}
public String getPlaca() {
return placa;
}
public void setPlaca(String placa) {
this.placa = placa;
}
public String getItensDoPedido() {
return itensDoPedido;
}
public void setItensDoPedido(String itensDoPedido) {
this.itensDoPedido = itensDoPedido;
}
public double getValorTotal() {
return valorTotal;
}
public void setValorTotal(double valorTotal) {

this.valorTotal = valorTotal;
}
public String getStatus() {
return status;
}
public void setStatus(String status) {
this.status = status;
}
private String status;
}