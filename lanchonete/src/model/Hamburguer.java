package model;

import java.util.ArrayList;

public class Hamburguer {

    private ArrayList<String> ingredientes;
    private ArrayList<String> preco;

    public Hamburguer(ArrayList<String> ingredientes, ArrayList<String> preco, double preco1) {
        this.ingredientes = ingredientes;
        this.preco = preco;
        Preco = preco1;
    }

    double Preco;
    public ArrayList<String> getPreco() {
        return preco;
    }

    public void setPreco(ArrayList<String> preco) {
        this.preco = preco;
    }

    public ArrayList getIngredientes() {
        return this.ingredientes = ingredientes;
    }

    public void setIngredientes(ArrayList<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
}
