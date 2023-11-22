package negocio;
public class Venda {


    private String id_venda;
    private double preco_venda;
    private String metodo_pagamento;
    
    public Venda(String id_venda, double preco_venda, String metodo_pagamento) {
        this.id_venda = id_venda;
        this.preco_venda = preco_venda;
        this.metodo_pagamento = metodo_pagamento;

    }

    public String getId_venda() {
        return id_venda;
    }

    public void setId_venda(String id_venda) {
        this.id_venda = id_venda;
    }

    public double getPreco_venda() {
        return preco_venda;
    }

    public void setPreco_venda(double preco_venda) {
        this.preco_venda = preco_venda;
    }

    public String getMetodo_pagamento() {
        return metodo_pagamento;
    }

    public void setMetodo_pagamento(String metodo_pagamento) {
        this.metodo_pagamento = metodo_pagamento;
    }

    @Override
    public String toString() {
        return "Venda{" +
                "id_venda=" + id_venda +
                ", preco_venda=" + preco_venda +
                ", metodo_pagamento='" + metodo_pagamento + '\'' +
                '}';
    }
}
