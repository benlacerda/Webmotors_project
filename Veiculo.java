package Model;

public abstract class Veiculo {
	protected String nome_veiculo;
	protected float kms_rodados;
	protected String marca_veiculo;
	protected String placa_veiculo;
	protected float preco_veiculo;
	
	public Veiculo() {
		super();
	}
	
	
	public String getNome_veiculo() {
		return nome_veiculo;
	}
	
	public float getKms_rodados() {
		return kms_rodados;
	}
	
	public String getMarca_veiculo() {
		return marca_veiculo;
	}
	
	public String getPlaca_veiculo() {
		return placa_veiculo;
	}
	
	public void setNome_veiculo(String nome_veiculo) {
		this.nome_veiculo = nome_veiculo;
	}
	
	public void setKms_rodados(float kms_rodados) {
		this.kms_rodados = kms_rodados;
	}
	
	public void setMarca_veiculo(String marca_veiculo) {
		this.marca_veiculo = marca_veiculo;
	}
	
	public void setPlaca_veiculo(String Placa_veiculo) {
		this.placa_veiculo = Placa_veiculo;
	}
	
	public float getPreco_veiculo() {
		return preco_veiculo;
	}
	
	public void setPreco_veiculo(float preco_veiculo) {
		this.preco_veiculo = preco_veiculo;
	}
}
