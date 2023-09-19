package Model;

public class Venda {
	public int id_venda;
	public float preco_venda;
	public boolean financiamento;
	
	
	public int getId_venda() {
		return id_venda;
	}
	public void setId_venda(int id_venda) {
		this.id_venda = id_venda;
	}
	public float getPreco_venda() {
		return preco_venda;
	}
	public void setPreco_venda(float preco_venda) {
		this.preco_venda = preco_venda;
	}
	public boolean isFinanciamento() {
		return financiamento;
	}
	public void setFinanciamento(boolean financiamento) {
		this.financiamento = financiamento;
	}
	
}
