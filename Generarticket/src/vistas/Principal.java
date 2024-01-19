package vistas;
import vistas.Clientes;
import vistas.Pedidos;
import vistas.Ticket;
import vistas.Asientos;
/**
 *
 * @author Kevin Acuña and Marcos Rojas
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form FrmPrincipal
     */
    public Principal() {
        initComponents();
        setTitle("Formulario Principal");
        setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        mClientes = new javax.swing.JMenuItem();
        mProductos = new javax.swing.JMenuItem();
        mPedidos = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        mTerminar = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo (2).jpeg"))); // NOI18N

        fileMenu.setMnemonic('f');
        fileMenu.setText("Fichero");

        mClientes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clasificacion.png"))); // NOI18N
        mClientes.setMnemonic('o');
        mClientes.setText("Clientes");
        mClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mClientesActionPerformed(evt);
            }
        });
        fileMenu.add(mClientes);

        mProductos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/productos.png"))); // NOI18N
        mProductos.setMnemonic('s');
        mProductos.setText("Productos");
        mProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mProductosActionPerformed(evt);
            }
        });
        fileMenu.add(mProductos);

        mPedidos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mPedidos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pedido-en-linea.png"))); // NOI18N
        mPedidos.setMnemonic('a');
        mPedidos.setText("Pedidos");
        mPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mPedidosActionPerformed(evt);
            }
        });
        fileMenu.add(mPedidos);

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/asiento-de-cine (1).png"))); // NOI18N
        jMenuItem1.setText("Asientos");
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem1);

        mTerminar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        mTerminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cerrar-sesion.png"))); // NOI18N
        mTerminar.setMnemonic('x');
        mTerminar.setText("Terminar");
        mTerminar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mTerminarActionPerformed(evt);
            }
        });
        fileMenu.add(mTerminar);

        menuBar.add(fileMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Ayuda");

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("Acerca de");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mTerminarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mTerminarActionPerformed

    private void mClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mClientesActionPerformed
        new Clientes().setVisible(true);
    }//GEN-LAST:event_mClientesActionPerformed

    private void mProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mProductosActionPerformed
        new Ticket().setVisible(true);
    }//GEN-LAST:event_mProductosActionPerformed

    private void mPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mPedidosActionPerformed
        new Pedidos().setVisible(true);
    }//GEN-LAST:event_mPedidosActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       new Asientos().setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem mClientes;
    private javax.swing.JMenuItem mPedidos;
    private javax.swing.JMenuItem mProductos;
    private javax.swing.JMenuItem mTerminar;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
