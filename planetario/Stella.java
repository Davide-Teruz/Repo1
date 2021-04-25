package planetario;

import java.util.ArrayList;

public class Stella
{
    private int posizionex=0;
    private int posizioney=0;
    private double massa;
    private String nome;
    private String codice;
    private ArrayList<Pianeta> ListaPianeti = new ArrayList<Pianeta>();

    public Stella() {
        super();
    }
    public ArrayList<Pianeta> getListaPianeti() {
        return ListaPianeti;
    }
    public void setListaPianeti(ArrayList<Pianeta> listaPianeti) {
        ListaPianeti = listaPianeti;
    }
    public Stella(double a, String nome) {
        super();
        this.massa = a;
        this.nome = nome;
    }
    public double getMassa() {
        return massa;
    }
    public void setMassa(double massa) {
        this.massa = massa;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Stella(int posizionex, int posizioney, double massa, String nome, String codice) {
        super();
        this.posizionex = posizionex;
        this.posizioney = posizioney;
        this.massa = massa;
        this.nome = nome;
        this.codice = codice;
    }
    public String getCodice() {
        return codice;
    }
    public void setCodice(String codice) {
        this.codice = codice;
    }
}