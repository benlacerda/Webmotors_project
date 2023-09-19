package Model;

public class Carro extends Veiculo{
	private String tipo_carro;
	private int quant_cavalos;
	private boolean manual_carro;
	private boolean automatico_carro;
	
	public Carro() {
		super();
	}

	public String getTipo_carro() {
		return tipo_carro;
	}

	public void setTipo_carro(String tipo_carro) {
		this.tipo_carro = tipo_carro;
	}

	public int getQuant_cavalos() {
		return quant_cavalos;
	}

	public void setQuant_cavalos(int quant_cavalos) {
		this.quant_cavalos = quant_cavalos;
	}

	public boolean isManual_carro() {
		return manual_carro;
	}

	public void setManual_carro(boolean manual_carro) {
		this.manual_carro = manual_carro;
	}

	public boolean isAutomatico_carro() {
		return automatico_carro;
	}

	public void setAutomatico_carro(boolean automatico_carro) {
		this.automatico_carro = automatico_carro;
	}
	
	
	
	
	
}
