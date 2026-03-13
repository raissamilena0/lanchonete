package model;

public class Pedido {


    private Cliente cliente;
    private Hamburguer hamburguer;
    private Pedido pedido;

    public Pedido(Cliente cliente, Hamburguer hamburguer) {
        this.cliente = cliente;
        this.hamburguer = hamburguer;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Hamburguer getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(Hamburguer hamburguer) {
        this.hamburguer = hamburguer;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    public String getTudo(){
        return cliente.getNomeInteiro() + " : " + hamburguer.getTodosIngredientes();
    }
}
