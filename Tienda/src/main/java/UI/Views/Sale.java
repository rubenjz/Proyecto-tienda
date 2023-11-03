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
import java.awt.event.KeyEvent;
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
        jTextCodigo = new javax.swing.JTextField();
        nombrePBox = new javax.swing.JComboBox<>();
        AgregarButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cantSpinner = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();

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

        jTextCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCodigoActionPerformed(evt);
            }
        });
        jTextCodigo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextCodigoKeyPressed(evt);
            }
        });

        nombrePBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        nombrePBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombrePBoxActionPerformed(evt);
            }
        });

        AgregarButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_circle_create_expand_new_plus_icon_123218.png"))); // NOI18N
        AgregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarButtonActionPerformed(evt);
            }
        });

        DeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trash_bin_icon-icons.com_67981.png"))); // NOI18N
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
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

        jLabel4.setText("Código:");

        javax.swing.GroupLayout BgLayout = new javax.swing.GroupLayout(Bg);
        Bg.setLayout(BgLayout);
        BgLayout.setHorizontalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgLayout.createSequentialGroup()
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE))
                    .addGroup(BgLayout.createSequentialGroup()
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(BgLayout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BgLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)))
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cantSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(nombrePBox, 0, 150, Short.MAX_VALUE)
                            .addComponent(jTextCodigo))
                        .addGap(45, 45, 45)
                        .addComponent(AgregarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        BgLayout.setVerticalGroup(
            BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(BgLayout.createSequentialGroup()
                .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BgLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombrePBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(33, 33, 33)
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(34, 34, 34)
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cantSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(BgLayout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(BgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DeleteButton)
                            .addComponent(AgregarButton))))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 379, Short.MAX_VALUE)
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
        jTextCodigo.requestFocus();
    }//GEN-LAST:event_AgregarButtonActionPerformed

    private void VentaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentaButtonActionPerformed
        executeSale();
        CleanScreen();
    }//GEN-LAST:event_VentaButtonActionPerformed

    private void jTextCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCodigoActionPerformed
        
    }//GEN-LAST:event_jTextCodigoActionPerformed

    private void jTextCodigoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCodigoKeyPressed
        if (evt.getExtendedKeyCode() == KeyEvent.VK_ENTER) {
            // Realizar la acción deseada al presionar Enter
            LoadProducts();
            jTextCodigo.setText("");
        }
    }//GEN-LAST:event_jTextCodigoKeyPressed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        int c = 0;
        for (int i: jTable1.getSelectedRows()) {
            try {
                model.removeRow(i - c);
                c++;
                LoadTotal();
            } catch (Exception e) {
                javax.swing.JOptionPane.showMessageDialog(this, "Error al eliminar productos\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_DeleteButtonActionPerformed

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
        String codigo = jTextCodigo.getText();
        
        if (!codigo.isEmpty() && !productName.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe colocar solo el nombre o el codigo \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else if (codigo.isEmpty() && productName.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debe escoger un producto o ingresar el codigo\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else if (!codigo.isEmpty()) {
            LoadCodigo(codigo);
        } else {
            LoadName(productName);
        }
    }
    
    private void LoadCodigo(String codigo_String) {
        try {
            long codigo = Long.parseLong(codigo_String);

            DAOProducto dao = new DAOProductoImpl();
            Producto producto = dao.obtenerProducto(0, codigo, null);
            
            int rowCount = model.getRowCount();
            boolean found = false;
            
            for (int i = 0; i < rowCount; i++) {
                if (model.getValueAt(i, 0).equals(producto.getNombre())) {
                    found = true;
                    int existingQuantity = (int) model.getValueAt(i, 1);
                    double price = producto.getPrecio_venta();
                    int newQuantity = existingQuantity + (int) cantSpinner.getValue();
                    double totalPrice = price * newQuantity;

                    model.setValueAt(newQuantity, i, 1);
                    model.setValueAt(totalPrice, i, 3);
                    break;
                }
            }
            
            if (!found) {
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
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "El código debe contener solo numeros\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al cargar productos\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void LoadName(String name) {
        try {
            DAOProducto dao = new DAOProductoImpl();

            int rowCount = model.getRowCount();
            boolean found = false;
            
            for (int i = 0; i < rowCount; i++) {
                if (model.getValueAt(i, 0).equals(name)) {
                    found = true;
                    int existingQuantity = (int) model.getValueAt(i, 1);
                    double price = dao.obtenerPrecio(0,0,name);
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
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton VentaButton;
    private javax.swing.JSpinner cantSpinner;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JComboBox<String> nombrePBox;
    private javax.swing.JLabel totalmsg;
    // End of variables declaration//GEN-END:variables
}
