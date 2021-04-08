package modelo;

public class P3_Cliente_Factura {

    private String cli_cod; // clientes
    private String fac_num; // fac_deta
    private String fac_fec; // fac_deta
    private String fac_igv; //fac_cabe

    private Double Imp; // Importe

    private int art_can; // fac_deta
    private double art_pre; // articulos

    public Double getImp() {
        return Imp;
    }

    public void setImp(Double Imp) {
        this.Imp = Imp;
    }

    public String getCli_cod() {
        return cli_cod;
    }

    public void setCli_cod(String cli_cod) {
        this.cli_cod = cli_cod;
    }

    public String getFac_num() {
        return fac_num;
    }

    public void setFac_num(String fac_num) {
        this.fac_num = fac_num;
    }

    public String getFac_fec() {
        return fac_fec;
    }

    public void setFac_fec(String fac_fec) {
        this.fac_fec = fac_fec;
    }

    public String getFac_igv() {
        return fac_igv;
    }

    public void setFac_igv(String fac_igv) {
        this.fac_igv = fac_igv;
    }

    public int getArt_can() {
        return art_can;
    }

    public void setArt_can(int art_can) {
        this.art_can = art_can;
    }

    public double getArt_pre() {
        return art_pre;
    }

    public void setArt_pre(double art_pre) {
        this.art_pre = art_pre;
    }

}
