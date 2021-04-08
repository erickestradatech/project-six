package vista;

import javax.swing.table.DefaultTableModel;
import controlador.Negocio;
import modelo.*;

public class frmPC3_Repaso_1 extends javax.swing.JFrame {

    Negocio obj = new Negocio();

    public frmPC3_Repaso_1() {
        initComponents();
        setLocationRelativeTo(this);
        muestraClientes_p4("");
        muestraClientes_p5();
        llenarYear_p6();
    }

    public void muestra_p2(String cod) {

        DefaultTableModel dt = (DefaultTableModel) P2_tabFact.getModel();
        dt.setNumRows(0);

        double importeTotal = 0;

        for (P2_Articulo_Factura x : obj.lisFact_Art(cod)) {

            Object v[] = {x.getArt_cod(), x.getArt_can(), x.getArt_pre(),
                x.getArt_can(), x.total()};
            dt.addRow(v);

            importeTotal += x.total();
        }

        P2_lbTotalImporte.setText("" + importeTotal);
    }

    public void muestra_p3(String cod) {

        DefaultTableModel dt = (DefaultTableModel) P3_tabFactCli.getModel();
        dt.setNumRows(0);

        double totalGeneral = 0;

        for (P3_Cliente_Factura x : obj.lisFact_Cli(cod)) {

            Object v[] = {x.getFac_num(), x.getFac_fec(), x.getFac_igv(), x.getImp()};
            dt.addRow(v);

            totalGeneral += x.getImp();
        }

        P3_lbTotalGeneral.setText("" + totalGeneral);

    }

    public void muestraClientes_p4(String cod) {

        DefaultTableModel dt = (DefaultTableModel) P4_tabCli.getModel();
        dt.setNumRows(0);

        for (P4_Cliente x : obj.LisCliente_p4(cod)) {

            Object v[] = {x.getCli_cod(), x.getCli_nom(), x.getCli_dir(), x.getCli_tel()};
            dt.addRow(v);
        }
    }

    public void muestraFacturas_p4(String cod) {

        DefaultTableModel dt = (DefaultTableModel) P4_tabFact.getModel();
        dt.setNumRows(0);

        for (P4_Fac_cabe x : obj.lisFacturas_p4(cod)) {

            Object v[] = {x.getFac_num(), x.getFac_fec(), x.getFac_igv()};
            dt.addRow(v);
        }
    }

    public void muestraClientes_p5() {

        DefaultTableModel dt = (DefaultTableModel) P5_tabCli.getModel();
        dt.setNumRows(0);

        for (P5_Cliente x : obj.lisCliente_p5()) {

            Object v[] = {x.getCli_cod(), x.getCli_nom(), x.getCli_tel(), x.getCli_cor(), x.getCli_dir(), x.getCli_cre()};
            dt.addRow(v);
        }

    }

    public void muestraFacturas_p5(String cod) {

        DefaultTableModel dt = (DefaultTableModel) P5_tabFact.getModel();
        dt.setNumRows(0);

        for (P5_Factura_cabe x : obj.lisFactura_p5(cod)) {

            Object v[] = {x.getFac_num(), x.getFac_fec(), x.getCli_cod(), x.getFac_igv()};
            dt.addRow(v);
        }
    }

    public void muestra_detalleFac_p5(String cod) {

        DefaultTableModel dt = (DefaultTableModel) P5_tabFact_Detalle.getModel();
        dt.setNumRows(0);

        double suma = 0;

        for (P5_FacDeta_Art x : obj.lisFactDeta_Art_p5(cod)) {

            Object v[] = {x.getFac_num(), x.getArt_cod(), x.getArt_nom(), x.getArt_uni(), x.getArt_pre(), x.getArt_stk(), x.getArt_can(), x.getImporte()};
            dt.addRow(v);

            suma += x.getImporte();
        }

        P5_lbTotal_Factura.setText("" + suma);
    }

    public void llenarYear_p6() {

        for (P5_Factura_cabe x : obj.P6_listYear()) {
            P6_cbYear.addItem(x.getFac_fec());
        }
    }

    // Mostrar años
    public void muestra_prodYear_p6(String cod) {

        DefaultTableModel dt = (DefaultTableModel) P6_tabProYear.getModel();
        dt.setNumRows(0);

        for (P5_FacDeta_Art x : obj.P6_VenXYear(cod)) {

            Object v[] = {x.getArt_cod(), x.getArt_nom(), x.getImporte()};
            dt.addRow(v);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        P1_lbNombre = new javax.swing.JLabel();
        P1_lbDirec = new javax.swing.JLabel();
        P1_lbTel = new javax.swing.JLabel();
        P1_txtCodCli = new javax.swing.JTextField();
        P1_btnBusca = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        P2_txtCodFac = new javax.swing.JTextField();
        P2_btnBusca = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        P2_tabFact = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        P2_lbTotalImporte = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        P3_txtFactCli = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        P3_tabFactCli = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        P3_lbTotalGeneral = new javax.swing.JLabel();
        P3_btnBuscar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        P4_txtCliente = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        P4_tabCli = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        P4_tabFact = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        P5_tabFact_Detalle = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        P5_tabCli = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        P5_lbTotal_Factura = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        P5_tabFact = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        P6_cbYear = new javax.swing.JComboBox<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        P6_tabProYear = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Consulta de Clientes");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(350, 30, 380, 47);

        jLabel2.setText("Código del cliente:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(60, 120, 103, 20);

        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(60, 170, 48, 16);

        jLabel4.setText("Dirección:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(60, 230, 57, 16);

        jLabel5.setText("Teléfono:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(60, 280, 52, 16);

        P1_lbNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(P1_lbNombre);
        P1_lbNombre.setBounds(190, 170, 310, 28);

        P1_lbDirec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(P1_lbDirec);
        P1_lbDirec.setBounds(190, 220, 310, 28);

        P1_lbTel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(P1_lbTel);
        P1_lbTel.setBounds(190, 270, 310, 28);
        jPanel1.add(P1_txtCodCli);
        P1_txtCodCli.setBounds(190, 110, 160, 30);

        P1_btnBusca.setText("Buscar");
        P1_btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P1_btnBuscaActionPerformed(evt);
            }
        });
        jPanel1.add(P1_btnBusca);
        P1_btnBusca.setBounds(400, 110, 71, 32);

        jTabbedPane1.addTab("Pregunta_1", jPanel1);

        jPanel2.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel6.setText("Detalle de una Factura");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(319, 39, 383, 47);

        jLabel7.setText("Código de Factura:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(80, 130, 105, 16);
        jPanel2.add(P2_txtCodFac);
        P2_txtCodFac.setBounds(210, 120, 150, 30);

        P2_btnBusca.setText("Buscar");
        P2_btnBusca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P2_btnBuscaActionPerformed(evt);
            }
        });
        jPanel2.add(P2_btnBusca);
        P2_btnBusca.setBounds(420, 120, 71, 32);

        P2_tabFact.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Código", "Descripción", "Precio Unitario", "Cantidad", "Total"
            }
        ));
        jScrollPane1.setViewportView(P2_tabFact);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(60, 190, 1030, 360);

        jLabel8.setText("Total importe:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(820, 610, 90, 30);

        P2_lbTotalImporte.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(P2_lbTotalImporte);
        P2_lbTotalImporte.setBounds(930, 610, 130, 30);

        jTabbedPane1.addTab("Pregunta_2", jPanel2);

        jPanel3.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel9.setText("Facturas por Cliente");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(327, 42, 345, 47);

        jLabel10.setText("Código del cliente:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(64, 145, 103, 16);
        jPanel3.add(P3_txtFactCli);
        P3_txtFactCli.setBounds(190, 140, 120, 30);

        P3_tabFactCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Factura", "Fecha", "IGV", "Total Importe"
            }
        ));
        jScrollPane2.setViewportView(P3_tabFactCli);

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(64, 202, 1030, 390);

        jLabel11.setText("Total general:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(830, 630, 77, 16);

        P3_lbTotalGeneral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.add(P3_lbTotalGeneral);
        P3_lbTotalGeneral.setBounds(920, 620, 150, 30);

        P3_btnBuscar.setText("Buscar");
        P3_btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P3_btnBuscarActionPerformed(evt);
            }
        });
        jPanel3.add(P3_btnBuscar);
        P3_btnBuscar.setBounds(370, 140, 71, 32);

        jTabbedPane1.addTab("Pregunta_3", jPanel3);

        jLabel12.setText("Clientes primeros caracteres:");

        P4_txtCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P4_txtClienteActionPerformed(evt);
            }
        });
        P4_txtCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                P4_txtClienteKeyReleased(evt);
            }
        });

        jLabel13.setText("Lista de Clientes");

        P4_tabCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Dirección", "Teléfono"
            }
        ));
        P4_tabCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P4_tabCliMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(P4_tabCli);

        P4_tabFact.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Fecha", "IGV"
            }
        ));
        jScrollPane4.setViewportView(P4_tabFact);

        jLabel14.setText("Lista de Facturas");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1092, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(P4_txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1092, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(P4_txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        jTabbedPane1.addTab("Pregunta_4", jPanel4);

        jLabel15.setText("Clientes:");

        P5_tabFact_Detalle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "# Factura", "Codigo Articulo", "Nombre", "Tipo", "Precio unitario", "Stock", "Cantidad", "Importe"
            }
        ));
        P5_tabFact_Detalle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P5_tabFact_DetalleMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(P5_tabFact_Detalle);

        jLabel16.setText("Facturas:");

        P5_tabCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Teléfono", "Correo", "Dirección", "Crédito"
            }
        ));
        P5_tabCli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P5_tabCliMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(P5_tabCli);

        jLabel17.setText("Total Factura:");

        P5_lbTotal_Factura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        P5_tabFact.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "# Factura", "Fecha", "Código Cliente", "IGV"
            }
        ));
        P5_tabFact.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                P5_tabFactMouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(P5_tabFact);

        jLabel19.setText("Detalle de la Factura:");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(807, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(P5_lbTotal_Factura, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 1101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 1101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 1102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(P5_lbTotal_Factura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Pregunta_5", jPanel5);

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel18.setText("PRODUCTOS VENDIDOS POR AÑO");

        jLabel20.setText("SELECCIONE AÑO:");

        P6_cbYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                P6_cbYearActionPerformed(evt);
            }
        });

        P6_tabProYear.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código", "Descripcion", "Total"
            }
        ));
        jScrollPane8.setViewportView(P6_tabProYear);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel18))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 1008, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(P6_cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel18)
                .addGap(47, 47, 47)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(P6_cbYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Pregunta_6", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 718, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void P6_cbYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P6_cbYearActionPerformed

        String cod = P6_cbYear.getSelectedItem().toString();
        muestra_prodYear_p6(cod);
    }//GEN-LAST:event_P6_cbYearActionPerformed

    private void P5_tabFactMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P5_tabFactMouseClicked

        int f = P5_tabFact.getSelectedRow(); // Obtener numero de fila
        String cod = P5_tabFact.getValueAt(f, 0).toString();

        muestra_detalleFac_p5(cod);
    }//GEN-LAST:event_P5_tabFactMouseClicked

    private void P5_tabCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P5_tabCliMouseClicked
        // Mostrar fac_cabe x click
        int f = P5_tabCli.getSelectedRow(); // Obtener numero de fila
        String cod = P5_tabCli.getValueAt(f, 0).toString();

        muestraFacturas_p5(cod);
    }//GEN-LAST:event_P5_tabCliMouseClicked

    private void P5_tabFact_DetalleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P5_tabFact_DetalleMouseClicked

    }//GEN-LAST:event_P5_tabFact_DetalleMouseClicked

    private void P4_tabCliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P4_tabCliMouseClicked
        // Mostrar fac_cabe x click
        int f = P4_tabCli.getSelectedRow(); // Obtener numero de fila
        String cod = P4_tabCli.getValueAt(f, 0).toString();

        muestraFacturas_p4(cod);
    }//GEN-LAST:event_P4_tabCliMouseClicked

    private void P4_txtClienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_P4_txtClienteKeyReleased

        muestraClientes_p4(P4_txtCliente.getText());
    }//GEN-LAST:event_P4_txtClienteKeyReleased

    private void P3_btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P3_btnBuscarActionPerformed

        String cod = P3_txtFactCli.getText();
        muestra_p3(cod);
    }//GEN-LAST:event_P3_btnBuscarActionPerformed

    private void P2_btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P2_btnBuscaActionPerformed

        String cod = P2_txtCodFac.getText();
        muestra_p2(cod);
    }//GEN-LAST:event_P2_btnBuscaActionPerformed

    private void P1_btnBuscaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P1_btnBuscaActionPerformed

        try {

            String cod = P1_txtCodCli.getText();
            P1_Cliente x = obj.ListCliente(cod);
            P1_lbNombre.setText(x.getCli_nom());
            P1_lbDirec.setText(x.getCli_dir());
            P1_lbTel.setText(x.getCli_tel());

        } catch (Exception e) {

        }
    }//GEN-LAST:event_P1_btnBuscaActionPerformed

    private void P4_txtClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_P4_txtClienteActionPerformed

    }//GEN-LAST:event_P4_txtClienteActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmPC3_Repaso_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPC3_Repaso_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPC3_Repaso_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPC3_Repaso_1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPC3_Repaso_1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton P1_btnBusca;
    private javax.swing.JLabel P1_lbDirec;
    private javax.swing.JLabel P1_lbNombre;
    private javax.swing.JLabel P1_lbTel;
    private javax.swing.JTextField P1_txtCodCli;
    private javax.swing.JButton P2_btnBusca;
    private javax.swing.JLabel P2_lbTotalImporte;
    private javax.swing.JTable P2_tabFact;
    private javax.swing.JTextField P2_txtCodFac;
    private javax.swing.JButton P3_btnBuscar;
    private javax.swing.JLabel P3_lbTotalGeneral;
    private javax.swing.JTable P3_tabFactCli;
    private javax.swing.JTextField P3_txtFactCli;
    private javax.swing.JTable P4_tabCli;
    private javax.swing.JTable P4_tabFact;
    private javax.swing.JTextField P4_txtCliente;
    private javax.swing.JLabel P5_lbTotal_Factura;
    private javax.swing.JTable P5_tabCli;
    private javax.swing.JTable P5_tabFact;
    private javax.swing.JTable P5_tabFact_Detalle;
    private javax.swing.JComboBox<String> P6_cbYear;
    private javax.swing.JTable P6_tabProYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
