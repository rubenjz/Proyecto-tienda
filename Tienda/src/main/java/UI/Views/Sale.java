package UI.Views;

import Controler.DAODetalles_VentaImpl;
import Controler.DAOProductoImpl;
import Controler.DAOVentaImpl;
import Interfaces.DAODetalles_Venta;
import Interfaces.DAOProducto;
import Interfaces.DAOVenta;
import Model.Detalles_Venta;
import Model.Producto;
import Model.Venta;
import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

public class Sale extends javax.swing.JPanel {

    private List<Integer> idProductos = new ArrayList();
    private double total;
    DefaultTableModel model;
    
    public Sale() {
        initComponents();
        rellenarComboBox();
        Spinner();
        model = (DefaultTableModel) jTable1.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Bg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Consumidor_venta = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        totalmsg = new javax.swing.JLabel();
        VentaButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nombrePBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cantSpinner = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        AgregarButton = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(788, 650));

        Bg.setBackground(new java.awt.Color(255, 255, 255));
        Bg.setPreferredSize(new java.awt.Dimension(766, 520));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Consumidor_venta.setBackground(new java.awt.Color(255, 102, 102));
        Consumidor_venta.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        Consumidor_venta.setForeground(new java.awt.Color(255, 255, 255));
        Consumidor_venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ic-ad_97607.png"))); // NOI18N
        Consumidor_venta.setText("Consumidor");
        Consumidor_venta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        Consumidor_venta.setBorderPainted(false);
        Consumidor_venta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Consumidor_venta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Total:");

        totalmsg.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        totalmsg.setText("0");

        VentaButton.setBackground(new java.awt.Color(255, 102, 102));
        VentaButton.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        VentaButton.setForeground(new java.awt.Color(255, 255, 255));
        VentaButton.setText("Realizar Venta");
        VentaButton.setBorder(null);
        VentaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Consumidor_venta, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VentaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(78, 78, 78)
                        .addComponent(totalmsg)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Consumidor_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(totalmsg))
                .addGap(146, 146, 146)
                .addComponent(VentaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("Producto:");

        nombrePBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        nombrePBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantidad:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Precio Unitario", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        AgregarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_circle_create_expand_new_plus_icon_123218.png"))); // NOI18N
        AgregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BgLayout = new javax.swing.GroupLayout(Bg);
        Bg.setLayout(BgLayout);
        BgLayout.setHorizontalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgLayout.createSequentialGroup()
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(BgLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cantSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombrePBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addComponent(AgregarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BgLayout.setVerticalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BgLayout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgLayout.createSequentialGroup()
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(nombrePBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cantSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgLayout.createSequentialGroup()
                        .addComponent(AgregarButton)
                        .addGap(10, 10, 10)))
                .addGap(51, 51, 51)
                .addComponent(jScrollPane1)
                .addGap(39, 39, 39))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, 788, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bg, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nombrePBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombrePBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombrePBoxActionPerformed

    private void AgregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarButtonActionPerformed
        LoadProducts();
    }//GEN-LAST:event_AgregarButtonActionPerformed

    private void VentaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentaButtonActionPerformed
        executeSale();
        CleanScreen();
    }//GEN-LAST:event_VentaButtonActionPerformed

    private void rellenarComboBox() {
        try {
            DAOProducto dao = new DAOProductoImpl();
            List<Producto> listaProductos = dao.listar();

            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();

            comboBoxModel.addElement("");

            for (Producto producto : listaProductos) {
                comboBoxModel.addElement(producto.getNombre());
            }

            nombrePBox.setModel(comboBoxModel);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ocurrió un problema al mostrar la lista", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }

    private void Spinner() {
        SpinnerNumberModel spinner = new SpinnerNumberModel();
        spinner.setValue(1);
        spinner.setMinimum(1);
        cantSpinner.setModel(spinner);
    }
    
    private void LoadProducts() {
        String productName = nombrePBox.getSelectedItem().toString();
        
        if (!productName.isEmpty()) {
            try {
                DAOProducto dao = new DAOProductoImpl();

                int rowCount = model.getRowCount();
                boolean found = false;
                
                for (int i = 0; i < rowCount; i++) {
                    if (model.getValueAt(i, 0).equals(productName)) {
                        found = true;
                        int existingQuantity = (int) model.getValueAt(i, 1);
                        double price = dao.obtenerPrecio(0,0,productName);
                        int newQuantity = existingQuantity + (int) cantSpinner.getValue();
                        double totalPrice = price * newQuantity;

                        model.setValueAt(newQuantity, i, 1);
                        model.setValueAt(totalPrice, i, 3);
                        break;
                    }
                }
            
                if (!found) {
                    Producto producto;
                    producto = dao.obtenerProducto(0, 0, nombrePBox.getSelectedItem().toString());
                    
                    idProductos.add(producto.getId_Producto());
                    Object[] rowData = new Object[]{
                        producto.getNombre(),
                        cantSpinner.getValue(),
                        producto.getPrecio_venta(),
                        producto.getPrecio_venta() * Double.parseDouble(cantSpinner.getValue().toString())
                    };
                    model.addRow(rowData);
                }
                
                LoadTotal();
            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error al cargar productos\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe escoger un producto\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void LoadTotal() {
        double preciosTotales = 0;
        int rowCount = model.getRowCount();
        for (int i = 0; i < rowCount; i++) {
            preciosTotales += (double) model.getValueAt(i, 3);
        }
        
        this.total = preciosTotales;
        totalmsg.setText(String.valueOf(this.total));
    }
    
    private void executeSale() {
        if (model.getRowCount() == 0) {
            javax.swing.JOptionPane.showMessageDialog(this, "No se a ingresado ningun producto\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                DAOVenta daoVenta = new DAOVentaImpl();
                DAODetalles_Venta daoDetallesVenta = new DAODetalles_VentaImpl();
                
                //se registra la venta en la base de datos
                daoVenta.registrar(new Venta(1,obtenerFechaActual(),this.total));
                
                int rowCount = model.getRowCount();
                for (int i = 0; i < rowCount; i++) {
                    int cantidad = (int) model.getValueAt(i, 1);
                    double precio_unitario = (double) model.getValueAt(i, 2);
                    
                    daoDetallesVenta.registrar(new Detalles_Venta(daoVenta.obtenerUltimaVenta(), idProductos.get(i), cantidad, precio_unitario));
                }
                
                javax.swing.JOptionPane.showMessageDialog(this, "Venta Realizada\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error al realizar la venta\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private String obtenerFechaActual() {
        LocalDate fechaActual = LocalDate.now();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        String fechaFormateada = fechaActual.format(formato);

        return fechaFormateada;
    }
    
    private void CleanScreen() {
        cantSpinner.setValue(1);
        model.setRowCount(0);
        
        totalmsg.setText(String.valueOf(0));
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarButton;
    private javax.swing.JPanel Bg;
    private javax.swing.JButton Consumidor_venta;
    private javax.swing.JButton VentaButton;
    private javax.swing.JSpinner cantSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> nombrePBox;
    private javax.swing.JLabel totalmsg;
    // End of variables declaration//GEN-END:variables
}
