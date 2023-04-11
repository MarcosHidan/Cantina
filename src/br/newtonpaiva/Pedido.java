package br.newtonpaiva;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    Massa massa;
    Cliente cliente;
    List<String> ingrediente = new ArrayList<>();
    public Double total = 0.0;

    public void Calcular(Double acres){
        total= total + acres;
    }

    public void adIngredientes(String ingredienteadd){
        ingrediente.add(ingredienteadd);
    }

    public List<String> getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(List<String> ingrediente) {
        this.ingrediente = ingrediente;
    }
}