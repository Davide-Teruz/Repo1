package planetario;

public class Luna {
    private int posizioneX;
    private int posizioneY;
    private double massa;
    private String pianeta;
    private String nome;
    private String codice;


    public void setPianeta(String pianeta) {
        this.pianeta = pianeta;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPosizioneX() {
        return posizioneX;
    }
    public void setPosizioneX(int posizionex) {
        this.posizioneX = posizionex;
    }
    public double getPosizioneY() {
        return posizioneY;
    }
    public void setPosizioneY(int posizioney) {
        this.posizioneY = posizioney;
    }
    public double getMassa() {
        return massa;
    }
    public void setMassa(int massa) {
        this.massa = massa;
    }
    public String getPianeta() {
        return pianeta;
    }
    public Luna(int posizionex, int posizioney, double massa, String pianeta, String nome, String codice) {
        super();
        this.posizioneX = posizionex;
        this.posizioneY = posizioney;
        this.massa = massa;
        this.pianeta = pianeta;
        this.nome = nome;
        this.codice = codice;
    }

}