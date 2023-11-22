package negocio;
public abstract class Veiculo{

    protected String nome_veiculo;
    protected String kms_rodados;
    protected String marca_veiculo;
    protected String placa_veiculo;
    protected float preco_veiculo;
    protected String modelo_veiculo;



    public String getNome_veiculo() {
        return this.nome_veiculo;
    }

    public void setNome_veiculo(String nome_veiculo) {
        this.nome_veiculo = nome_veiculo;
    }

    public String getKms_rodados() {
        return this.kms_rodados;
    }

    public void setKms_rodados(String kms_rodados) {
        this.kms_rodados = kms_rodados;
    }

    public String getMarca_veiculo() {
        return this.marca_veiculo;
    }

    public void setMarca_veiculo(String marca_veiculo) {
        this.marca_veiculo = marca_veiculo;
    }

    public String getPlaca_veiculo() {
        return this.placa_veiculo;
    }

    public void setPlaca_veiculo(String placa_veiculo) {
        this.placa_veiculo = placa_veiculo;
    }

    public float getPreco_veiculo() {
        return this.preco_veiculo;
    }

    public void setPreco_veiculo(float preco_veiculo) {
        this.preco_veiculo = preco_veiculo;
    }

    public String getModelo_veiculo() {
        return this.modelo_veiculo;
    }

    public void setModelo_veiculo(String modelo_veiculo) {
        this.modelo_veiculo = modelo_veiculo;
    }


    @Override
    public String toString() {
        return "{" +
            " nome_veiculo='" + getNome_veiculo() + "'" +
            ", kms_rodados='" + getKms_rodados() + "'" +
            ", marca_veiculo='" + getMarca_veiculo() + "'" +
            ", placa_veiculo='" + getPlaca_veiculo() + "'" +
            ", preco_veiculo='" + getPreco_veiculo() + "'" +
            ", marca_veiculo='" + getMarca_veiculo() + "'" +
            "}";
    }


}