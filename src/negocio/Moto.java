
package negocio;
public class Moto extends Veiculo{

    private int qtd_cilindradas;
    private boolean eletrica_moto;
    private boolean combustao_moto;



    public Moto(String nome_veiculo,String kms_rodados, String marca_veiculo, String placa_veiculo, float preco_veiculo, String modelo_veiculo,int qtd_cilindradas) {
        
        this.nome_veiculo = nome_veiculo;
        this.kms_rodados = kms_rodados;
        this.marca_veiculo = marca_veiculo;
        this.placa_veiculo = placa_veiculo;
        this.preco_veiculo = preco_veiculo;
        this.modelo_veiculo = modelo_veiculo;
        this.qtd_cilindradas = qtd_cilindradas;
        this.eletrica_moto = eletrica_moto;
        this.combustao_moto = combustao_moto;
    }


    public int getQtd_cilindradas() {
        return this.qtd_cilindradas;
    }

    public void setQtd_cilindradas(int qtd_cilindradas) {
        this.qtd_cilindradas = qtd_cilindradas;
    }

    public boolean isEletrica_moto() {
        return this.eletrica_moto;
    }

    public boolean getEletrica_moto() {
        return this.eletrica_moto;
    }

    public void setEletrica_moto(boolean eletrica_moto) {
        this.eletrica_moto = eletrica_moto;
    }

    public boolean isCombustao_moto() {
        return this.combustao_moto;
    }

    public boolean getCombustao_moto() {
        return this.combustao_moto;
    }

    public void setCombustao_moto(boolean combustao_moto) {
        this.combustao_moto = combustao_moto;
    }


    @Override
    public String toString() {
        return "{" +
            " qtd_cilindradas='" + getQtd_cilindradas() + "'" +
            ", eletrica_moto='" + isEletrica_moto() + "'" +
            ", combustao_moto='" + isCombustao_moto() + "'" +
            "}";
    }
    
}