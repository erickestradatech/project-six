package modelo;

public class P2_Articulo_Factura {

    private String fac_num; // fac_deta
    private String art_cod;
    private String art_nom;
    private double art_pre;
    private int art_can; // fac_deta

    public double total() {

        return art_pre * art_can;
    }

    public String getFac_num() {
        return fac_num;
    }

    public void setFac_num(String fac_num) {
        this.fac_num = fac_num;
    }

    public String getArt_cod() {
        return art_cod;
    }

    public void setArt_cod(String art_cod) {
        this.art_cod = art_cod;
    }

    public String getArt_nom() {
        return art_nom;
    }

    public void setArt_nom(String art_nom) {
        this.art_nom = art_nom;
    }

    public double getArt_pre() {
        return art_pre;
    }

    public void setArt_pre(double art_pre) {
        this.art_pre = art_pre;
    }

    public int getArt_can() {
        return art_can;
    }

    public void setArt_can(int art_can) {
        this.art_can = art_can;
    }

}
