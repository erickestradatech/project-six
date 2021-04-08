package interfaces;

import java.util.List;
import modelo.*;

public interface Interfac {

    P1_Cliente ListCliente(String cod);

    List<P2_Articulo_Factura> lisFact_Art(String cod);

    List<P3_Cliente_Factura> lisFact_Cli(String cod);

    List<P4_Cliente> LisCliente_p4(String cod);

    List<P4_Fac_cabe> lisFacturas_p4(String cod);

    List<P5_Cliente> lisCliente_p5();

    List<P5_Factura_cabe> lisFactura_p5(String cod);

    List<P5_FacDeta_Art> lisFactDeta_Art_p5(String cod);

    List<P5_Factura_cabe> P6_listYear();

    List<P5_FacDeta_Art> P6_VenXYear(String cod);
}
