package Lista07;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private String cliente;
    List<Produto> produtos = new ArrayList<>();

    public Integer getQuantidade() {
        return produtos.size();
    }

    public void adicionar(Produto p) {
        produtos.add(p);
    }

    public Boolean existsPorNome(String nome) {
        return produtos.contains(nome);
    }

    public Integer getPorCategoria(String nome) {
        Integer contador = 0;
        for (Produto produto : produtos) {
            if (produto.getCategoria().equals(nome)) {
                contador++;
            }
        }
        return contador;
    }

    public void limpar() {
        for (Produto produto : produtos) {
            produtos.remove(produto);
        }
    }

    public void removerPorNome(String nome) {
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                produtos.remove(produto);
            }
        }
    }

    public Produto getPorNome(String nome) {
        Produto produtoPesquisado = new Produto();
        for (Produto produto : produtos) {
            if (produto.getNome().equals(nome)) {
                produtoPesquisado = produto;
            }
        }    
        
        return produtoPesquisado;
    }

    public Double getValorTotal(){
        Double valorTotal = 0.0;
        
        for (Produto produto : produtos){
            valorTotal += produto.getPreco();
        }
        return valorTotal;
    }
    

    public Carrinho(String cliente) {
        this.cliente = cliente;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

}
