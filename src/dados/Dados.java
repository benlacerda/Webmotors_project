package dados;

import negocio.*;
public class Dados{

    private Carro[] carro;
    private int nCarro = 0;
    private Moto[] moto;
    private int nMoto = 0;
    private int nVenda = 0;
    private Venda[] venda;

    public Dados(){
        carro = new Carro[100];
        moto = new Moto[100];
        venda = new Venda[200];
    }


    public Carro[] getCarro() {
        return this.carro;
    }

    //obter um carro especifico
    public Carro getCarro(int i){
        return carro[i];
    }

    //obter o nome do carro
    public String[] getNomeCarro(){
        String[] s = new String[nCarro];
        for(int i =0; i < nCarro; i++ ){
            s[i] = carro[i].getNome_veiculo();
        }
        return s;
    }

    public void setCarro(Carro[] carro) {
        this.carro = carro;
    }

    public Moto[] getMoto() { 
        return this.moto;
    }

    public void setMoto(Moto[] moto) {
        this.moto = moto;
    }

    public Venda[] getVenda() {
        return this.venda;
    }

    public void setVenda(Venda[] venda) {
        this.venda = venda;
    }

    public int getNCarro(){
        return nCarro;
    }

    public void setNCarro(int nCarro){
        this.nCarro = nCarro;
    }

    public int getNMoto(){
        return this.nMoto;
    }

    public void setNMoto(int nMoto){
        this.nMoto = nMoto;
    }

    public int getNVenda(){
        return nVenda;
    }

    public void setNVenda(int nVenda){
        this.nVenda = nVenda;
    }

    public void preencherDados() {
        for(int i = 0; i < 10; i++) {
            String s = String.valueOf(i);
            carro[i] = new Carro("Carro".concat(s), "kms_carro".concat(s), "marca_carro".concat(s),
                    "placa_carro".concat(s), i, "modelo_carro".concat(s));
            moto[i] = new Moto("Moto".concat(s), "kms_moto".concat(s), "marca_moto".concat(s),
                    "placa_moto".concat(s),i,"modelo_moto".concat(s), i);
            venda[i] = new Venda("Venda".concat(s), i, "metodo_pag".concat(s));
        }
        nCarro = nMoto = nVenda = 10;
    }


}