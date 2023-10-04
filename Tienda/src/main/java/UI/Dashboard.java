package UI;

import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatMaterialLighterIJTheme;
import java.awt.Color;
import javax.swing.UIManager;
import UI.Views.*;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Ruben
 */
public class Dashboard extends javax.swing.JFrame {

    public Dashboard() {
        initComponents();
        InitializeStyles();
        initContend();
    }

    private void InitializeStyles() {
        Contend.setLayout(new BorderLayout());
    }
    
    private void initContend() {
        ShowJPanel(new Principal());
    }
    
    private void ShowJPanel(JPanel p){
        Contend.removeAll();
        Contend.add(p, BorderLayout.CENTER);
        Contend.revalidate();
        Contend.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        Inicio = new javax.swing.JButton();
        Venta = new javax.swing.JButton();
        Agregar_p = new javax.swing.JButton();
        Eliminar_p = new javax.swing.JButton();
        Modificar_p = new javax.swing.JButton();
        Modificar_v = new javax.swing.JButton();
        Revisar_Ventas = new javax.swing.JButton();
        Inventario = new javax.swing.JButton();
        Contend = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1036, 643));

        Background.setBackground(new java.awt.Color(255, 255, 255));

        Menu.setBackground(new java.awt.Color(188, 7, 7));
        Menu.setPreferredSize(new java.awt.Dimension(270, 640));

        Inicio.setBackground(new java.awt.Color(255, 102, 102));
        Inicio.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        Inicio.setForeground(new java.awt.Color(255, 255, 255));
        Inicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3643769-building-home-house-main-menu-start_113416.png"))); // NOI18N
        Inicio.setText("Inicio");
        Inicio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        Inicio.setBorderPainted(false);
        Inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Inicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });

        Venta.setBackground(new java.awt.Color(255, 102, 102));
        Venta.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        Venta.setForeground(new java.awt.Color(255, 255, 255));
        Venta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shopping-cart-add-button_icon-icons.com_56132.png"))); // NOI18N
        Venta.setText("Realizar Venta");
        Venta.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        Venta.setBorderPainted(false);
        Venta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Venta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentaActionPerformed(evt);
            }
        });

        Agregar_p.setBackground(new java.awt.Color(255, 102, 102));
        Agregar_p.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        Agregar_p.setForeground(new java.awt.Color(255, 255, 255));
        Agregar_p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add_circle_create_expand_new_plus_icon_123218.png"))); // NOI18N
        Agregar_p.setText("Agregar Producto");
        Agregar_p.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        Agregar_p.setBorderPainted(false);
        Agregar_p.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Agregar_p.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Agregar_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Agregar_pActionPerformed(evt);
            }
        });

        Eliminar_p.setBackground(new java.awt.Color(255, 102, 102));
        Eliminar_p.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        Eliminar_p.setForeground(new java.awt.Color(255, 255, 255));
        Eliminar_p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trash_bin_icon-icons.com_67981.png"))); // NOI18N
        Eliminar_p.setText("Eliminar Producto");
        Eliminar_p.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        Eliminar_p.setBorderPainted(false);
        Eliminar_p.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Eliminar_p.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Eliminar_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Eliminar_pActionPerformed(evt);
            }
        });

        Modificar_p.setBackground(new java.awt.Color(255, 102, 102));
        Modificar_p.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        Modificar_p.setForeground(new java.awt.Color(255, 255, 255));
        Modificar_p.setIcon(new javax.swing.ImageIcon(getClass().getResource("/twocirclingarrows1_120592 (1).png"))); // NOI18N
        Modificar_p.setText("Ver y Modificar Producto");
        Modificar_p.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        Modificar_p.setBorderPainted(false);
        Modificar_p.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Modificar_p.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Modificar_p.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modificar_pActionPerformed(evt);
            }
        });

        Modificar_v.setBackground(new java.awt.Color(255, 102, 102));
        Modificar_v.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        Modificar_v.setForeground(new java.awt.Color(255, 255, 255));
        Modificar_v.setIcon(new javax.swing.ImageIcon(getClass().getResource("/twocirclingarrows1_120592 (1).png"))); // NOI18N
        Modificar_v.setText("Modificar Ventas");
        Modificar_v.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        Modificar_v.setBorderPainted(false);
        Modificar_v.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Modificar_v.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        Revisar_Ventas.setBackground(new java.awt.Color(255, 102, 102));
        Revisar_Ventas.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        Revisar_Ventas.setForeground(new java.awt.Color(255, 255, 255));
        Revisar_Ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stats_icon-icons.com_69294.png"))); // NOI18N
        Revisar_Ventas.setText("Revisar Ventas");
        Revisar_Ventas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        Revisar_Ventas.setBorderPainted(false);
        Revisar_Ventas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Revisar_Ventas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Revisar_Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Revisar_VentasActionPerformed(evt);
            }
        });

        Inventario.setBackground(new java.awt.Color(255, 102, 102));
        Inventario.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        Inventario.setForeground(new java.awt.Color(255, 255, 255));
        Inventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ad_product_icon_155850.png"))); // NOI18N
        Inventario.setText("Inventario");
        Inventario.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        Inventario.setBorderPainted(false);
        Inventario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Inventario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Venta, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Agregar_p, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Eliminar_p, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Revisar_Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Modificar_p, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(Modificar_v, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(Inicio, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(Venta, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addGap(41, 41, 41)
                .addComponent(Agregar_p, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Eliminar_p, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Modificar_p, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addGap(44, 44, 44)
                .addComponent(Modificar_v, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Revisar_Ventas, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Inventario, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        Contend.setBackground(new java.awt.Color(255, 255, 255));
        Contend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout ContendLayout = new javax.swing.GroupLayout(Contend);
        Contend.setLayout(ContendLayout);
        ContendLayout.setHorizontalGroup(
            ContendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
        );
        ContendLayout.setVerticalGroup(
            ContendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Contend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
            .addComponent(Contend, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        ShowJPanel(new Principal());
    }//GEN-LAST:event_InicioActionPerformed

    private void VentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentaActionPerformed
        ShowJPanel(new Sale());
    }//GEN-LAST:event_VentaActionPerformed

    private void Agregar_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Agregar_pActionPerformed
        ShowJPanel(new Add_Product());
    }//GEN-LAST:event_Agregar_pActionPerformed

    private void Modificar_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modificar_pActionPerformed
        ShowJPanel(new Edit_Product());
    }//GEN-LAST:event_Modificar_pActionPerformed

    private void Eliminar_pActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Eliminar_pActionPerformed
        ShowJPanel(new Delete_Product());
    }//GEN-LAST:event_Eliminar_pActionPerformed

    private void Revisar_VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Revisar_VentasActionPerformed
        ShowJPanel(new Show_Sales());
    }//GEN-LAST:event_Revisar_VentasActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        FlatMaterialLighterIJTheme.setup();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar_p;
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Contend;
    private javax.swing.JButton Eliminar_p;
    private javax.swing.JButton Inicio;
    private javax.swing.JButton Inventario;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton Modificar_p;
    private javax.swing.JButton Modificar_v;
    private javax.swing.JButton Revisar_Ventas;
    private javax.swing.JButton Venta;
    // End of variables declaration//GEN-END:variables
}
