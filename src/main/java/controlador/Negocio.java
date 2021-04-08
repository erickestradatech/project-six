package controlador;

import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;
import util.MySQLConexion;
import modelo.*;

public class Negocio implements interfaces.Interfac {

    // Mostrar datos del cliente pasado codigo
    @Override
    public P1_Cliente ListCliente(String cod) {

        P1_Cliente c = null;
        Connection conn = null;

        try {

            conn = MySQLConexion.getConexion();
            String sql = "SELECT c.cli_cod,c.cli_nom,c.cli_dir,c.cli_tel FROM clientes c WHERE c.cli_cod=?";
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, cod);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {

                c = new P1_Cliente();
                c.setCli_nom(rs.getString(2));
                c.setCli_dir(rs.getString(3));
                c.setCli_tel(rs.getString(4));

            } else {

                JOptionPane.showMessageDialog(null, "No existe codigo");
            }

        } catch (Exception ex) {
            ex.printStackTrace();

        } finally {

            try {

                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e2) {

            }
        }
        return c;

    }

    @Override
    // listar artículo pasando código de fac_det
    public List<P2_Articulo_Factura> lisFact_Art(String cod) {

        List<P2_Articulo_Factura> lis = new ArrayList<>();
        Connection conn = null;

        try {

            conn = MySQLConexion.getConexion();
            String sql = "SELECT a.art_cod,a.art_nom,a.art_pre,f.art_can FROM articulos a, fac_deta f WHERE a.art_cod = f.art_cod AND f.fac_num = ?";

            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, cod);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                P2_Articulo_Factura a = new P2_Articulo_Factura();
                a.setArt_cod(rs.getString(1));
                a.setArt_nom(rs.getString(2));
                a.setArt_pre(rs.getDouble(3));
                a.setArt_can(rs.getInt(4));
                lis.add(a);
            }
        } catch (Exception ex) {

            ex.printStackTrace();
        } finally {

            try {

                if (conn != null) {
                    conn.close();
                }

            } catch (Exception e2) {

            }
        }

        return lis;
    }

    // Pasando un codigo de cliente listar detalle de factura
    @Override
    public List<P3_Cliente_Factura> lisFact_Cli(String cod) {

        List<P3_Cliente_Factura> lis = new ArrayList();

        Connection conn = null;

        try {

            conn = MySQLConexion.getConexion();
            String sql = "SELECT F.fac_num,DATE_FORMAT(fac_fec, \"%d/%m/%Y\"),fac_igv,cli_cod,SUM(art_pre*art_can) FROM fac_cabe F,fac_deta D, articulos A\n"
                    + " WHERE F.fac_num=D.fac_num AND A.art_cod=D.art_cod AND cli_cod=?\n"
                    + "GROUP BY F.fac_num,DATE_FORMAT(fac_fec, \"%d/%m/%Y\"),fac_igv,cli_cod ";

            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, cod);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                P3_Cliente_Factura a = new P3_Cliente_Factura();
                a.setFac_num(rs.getString(1));
                a.setFac_fec(rs.getString(2));
                a.setFac_igv(rs.getString(3));
                a.setCli_cod(rs.getString(4));
                a.setImp(rs.getDouble(5));
                lis.add(a);
            }

        } catch (Exception ex) {

            ex.printStackTrace();
        } finally {

            try {

                if (conn != null) {

                    conn.close();
                }

            } catch (Exception e2) {

            }
        }

        return lis;
    }

    @Override
    // Pasando un codigo de cliente listar detalle de factura
    public List<P4_Cliente> LisCliente_p4(String cod) {

        List<P4_Cliente> lis = new ArrayList();

        Connection conn = null;

        try {

            conn = MySQLConexion.getConexion();
            String sql = "SELECT c.cli_cod,c.cli_nom,c.cli_dir,c.cli_tel FROM clientes c WHERE c.cli_nom like ?";

            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, cod + "%");

            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                P4_Cliente a = new P4_Cliente();
                a.setCli_cod(rs.getString(1));
                a.setCli_nom(rs.getString(2));
                a.setCli_dir(rs.getString(3));
                a.setCli_tel(rs.getString(4));
                lis.add(a);
            }

        } catch (Exception ex) {

            ex.printStackTrace();
        } finally {

            try {

                if (conn != null) {

                    conn.close();
                }

            } catch (Exception e2) {

            }
        }

        return lis;
    }

    @Override
    // Pasando un codigo de cliente listar detalle de factura
    public List<P4_Fac_cabe> lisFacturas_p4(String cod) {

        List<P4_Fac_cabe> lis = new ArrayList();

        Connection conn = null;

        try {

            conn = MySQLConexion.getConexion();
            String sql = "SELECT fc.fac_num,fc.fac_fec,fc.fac_igv FROM fac_cabe fc WHERE fc.cli_cod=?";

            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, cod);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {

                P4_Fac_cabe a = new P4_Fac_cabe();
                a.setFac_num(rs.getString(1));
                a.setFac_fec(rs.getString(2));
                a.setFac_igv(rs.getString(3));
                lis.add(a);
            }

        } catch (Exception ex) {

            ex.printStackTrace();
        } finally {

            try {

                if (conn != null) {

                    conn.close();
                }

            } catch (Exception e2) {

            }
        }

        return lis;
    }

    @Override
    // Listar clientes
    public List<P5_Cliente> lisCliente_p5() {

        List<P5_Cliente> lis = new ArrayList();
        Connection conn = null;

        try {

            conn = MySQLConexion.getConexion();
            String sql = "SELECT c.cli_cod,c.cli_nom,c.cli_tel,c.cli_cor,c.cli_dir,c.cli_cre FROM clientes c";

            PreparedStatement st = conn.prepareStatement(sql);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                P5_Cliente a = new P5_Cliente();
                a.setCli_cod(rs.getString(1));
                a.setCli_nom(rs.getString(2));
                a.setCli_tel(rs.getString(3));
                a.setCli_cor(rs.getString(4));
                a.setCli_dir(rs.getString(5));
                a.setCli_cre(rs.getDouble(6));

                lis.add(a);
            }

        } catch (Exception ex) {

            ex.printStackTrace();
        } finally {

            try {

                if (conn != null) {

                    conn.close();
                }

            } catch (Exception e2) {

            }
        }

        return lis;
    }

    @Override
    // Listar Facturas
    public List<P5_Factura_cabe> lisFactura_p5(String cod) {

        List<P5_Factura_cabe> lis = new ArrayList();
        Connection conn = null;

        try {

            conn = MySQLConexion.getConexion();
            String sql = "SELECT f.fac_num,f.fac_fec,f.cli_cod,f.fac_igv FROM fac_cabe f, clientes c WHERE f.cli_cod = c.cli_cod AND c.cli_cod=?";

            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, cod);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                P5_Factura_cabe a = new P5_Factura_cabe();
                a.setFac_num(rs.getString(1));
                a.setFac_fec(rs.getString(2));
                a.setCli_cod(rs.getString(3));
                a.setFac_igv(rs.getString(4));

                lis.add(a);
            }

        } catch (Exception ex) {

            ex.printStackTrace();
        } finally {

            try {

                if (conn != null) {

                    conn.close();
                }

            } catch (Exception e2) {

            }
        }

        return lis;
    }

    @Override
    public List<P5_FacDeta_Art> lisFactDeta_Art_p5(String cod) {

        List<P5_FacDeta_Art> lis = new ArrayList();
        Connection conn = null;

        try {

            conn = MySQLConexion.getConexion();
            String sql = "SELECT fd.fac_num,a.art_cod, a.art_nom,a.art_uni,a.art_pre,a.art_stk,fd.art_can,a.art_pre*fd.art_can \n"
                    + "FROM  articulos a ,fac_deta fd\n"
                    + "WHERE a.art_cod = fd.art_cod AND fd.fac_num=?";

            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, cod);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                P5_FacDeta_Art a = new P5_FacDeta_Art();
                a.setFac_num(rs.getString(1));
                a.setArt_cod(rs.getString(2));
                a.setArt_nom(rs.getString(3));
                a.setArt_uni(rs.getString(4));
                a.setArt_pre(rs.getDouble(5));
                a.setArt_stk(rs.getInt(6));
                a.setArt_can(rs.getInt(7));
                a.setImporte(rs.getDouble(8));

                lis.add(a);
            }

        } catch (Exception ex) {

            ex.printStackTrace();
        } finally {

            try {

                if (conn != null) {

                    conn.close();
                }

            } catch (Exception e2) {

            }
        }

        return lis;
    }

    @Override
    //listar combo Year
    public List<P5_Factura_cabe> P6_listYear() {
        List<P5_Factura_cabe> lis = new ArrayList<>();
        Connection conn = null;

        try {
            conn = MySQLConexion.getConexion();
            String sql = "SELECT distinct DATE_FORMAT(fac_fec, \"%Y\") FROM fac_cabe";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                P5_Factura_cabe a = new P5_Factura_cabe();
                a.setFac_fec(rs.getString(1));
                lis.add(a);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {

                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e2) {
            }
        }

        return lis;
    }

    @Override
    public List<P5_FacDeta_Art> P6_VenXYear(String cod) {

        List<P5_FacDeta_Art> lis = new ArrayList();
        Connection conn = null;

        try {

            conn = MySQLConexion.getConexion();
            String sql = "SELECT DISTINCT a.art_cod,a.art_nom,fd.art_can*a.art_pre\n"
                    + "FROM fac_deta fd \n"
                    + "INNER JOIN articulos a ON a.art_cod = fd.art_cod\n"
                    + "INNER JOIN fac_cabe fc ON fc.fac_num = fd.fac_num\n"
                    + "WHERE  DATE_FORMAT(fc.fac_fec, '%Y') = ?";

            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, cod);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                P5_FacDeta_Art a = new P5_FacDeta_Art();
                a.setArt_cod(rs.getString(1));
                a.setArt_nom(rs.getString(2));
                a.setImporte(rs.getDouble(3));

                lis.add(a);
            }

        } catch (Exception ex) {

            ex.printStackTrace();
        } finally {

            try {

                if (conn != null) {

                    conn.close();
                }

            } catch (Exception e2) {

            }
        }

        return lis;

    }

}
