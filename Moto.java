package Model;

public class Moto {
	private int cilindradas;
	private String tipo_moto;
	private boolean eltrica;
	private boolean combustao;
	

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	public String getTipo_moto() {
		return tipo_moto;
	}

	public void setTipo_moto(String tipo_moto) {
		this.tipo_moto = tipo_moto;
	}

	public boolean isEltrica() {
		return eltrica;
	}

	public void setEltrica(boolean eltrica) {
		this.eltrica = eltrica;
	}

	public boolean isCombustao() {
		return combustao;
	}

	public void setCombustao(boolean combustao) {
		this.combustao = combustao;
	}
	
}
