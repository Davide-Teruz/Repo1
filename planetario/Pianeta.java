package planetario;

import java.util.ArrayList;

public class Pianeta 
{
    private int posizionex;
    private int posizioney;
    private double massa;
    private String nome;
    private String codice;
    ArrayList<Luna> ListaLune = new ArrayList<Luna>();

    public String getNome() {
    return nome;
}
    public void setNome(String nome) {
    this.nome = nome;
}
    public int getPosizioneX() {
    return posizionex;
}
    public void setPosizioneX(int posizionex) {
    this.posizionex = posizionex;
}
    public int getPosizioneY() {
    return posizioney;
}
    public void setPosizioneY(int posizioney) {
    this.posizioney = posizioney;
}
    public double getMassa() {
    return massa;
}
    public void setMassa(double massa) {
    this.massa = massa;
}
    public Pianeta(int posizionex, int posizioney, double massa, String nome, String codice) {
    super();
    this.posizionex = posizionex;
    this.posizioney = posizioney;
    this.massa = massa;
    this.nome = nome;
    this.codice = codice;
}
    public ArrayList<Luna> getListaLune() {
    return ListaLune;
}
    public void setListaLune(ArrayList<Luna> listaLune) {
    this.ListaLune = listaLune;
    }
    public Pianeta() {
    super();
    }
}