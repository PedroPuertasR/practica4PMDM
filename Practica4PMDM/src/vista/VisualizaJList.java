/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.ComparadorNumCuenta;
import controlador.GestionFicheros;
import controlador.Lista;
import controlador.Nodo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import modelo.Cuenta;
import modelo.CuentaAhorro;
import modelo.CuentaCorriente;
import modelo.CuentaInversion;

/**
 *
 * @author inmar
 */
public class VisualizaJList extends javax.swing.JPanel {

    private Lista listaNodos;
    private List <Nodo> listaCopia;
    private int indiceCuentaActual;

    /**
     * Creates new form VisualizaJList1
     */
    public VisualizaJList(Lista lista) {
        initComponents();
        this.listaNodos = lista;
    }
    
    public void cargarDatosJlist() {
        DefaultListModel model = new DefaultListModel();
        for (int i = 0; i < listaNodos.getArrayNodos().length; i++) {
            if (listaNodos.getArrayNodos()[i] == null) {
                break;
            }
            Cuenta cuenta = (Cuenta) listaNodos.getArrayNodos()[i].getTypo();
            model.addElement(cuenta.toStringJlist());
        }
        this.jList1.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        txtSaldoMinimo = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        txtTipo1 = new javax.swing.JTextField();
        txtTipo2 = new javax.swing.JTextField();
        lbSaldoMinimo = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        lbTipo1 = new javax.swing.JLabel();
        lbTipo2 = new javax.swing.JLabel();
        jButtonOrdenar = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        lbSaldoMinimo.setText("Saldo");

        lbFecha.setText("Fecha");

        lbTipo1.setText("tipo1");

        lbTipo2.setText("tipo2");

        jButtonOrdenar.setText("Ordenar");
        jButtonOrdenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrdenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbTipo2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTipo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbSaldoMinimo, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtFecha)
                    .addComponent(txtSaldoMinimo)
                    .addComponent(txtTipo1)
                    .addComponent(txtTipo2, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jButtonOrdenar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSaldoMinimo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSaldoMinimo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTipo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTipo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTipo2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonOrdenar)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        if (evt.getClickCount() == 1) {
            JList target = (JList) evt.getSource();
            int index = target.locationToIndex(evt.getPoint());
            if (index >= 0) {
                Object item = target.getModel().getElementAt(index);
                String[] valores = item.toString().replace(" ", "").split("---");
                this.indiceCuentaActual = Integer.valueOf(valores[0]);
                mostrarCuentaSeleccionada();

            }
        }
    }//GEN-LAST:event_jList1MouseClicked

    private void jButtonOrdenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrdenarActionPerformed
        
        long total;
        long inicio;
        long fin;
        
        copiarLista();
        
        inicio = System.nanoTime();
        //ordenarLista(listaCopia);
        fin = System.nanoTime();
        
        total = (fin - inicio) / 1000000000;
        
        for(int i = 0; i < listaCopia.size(); i++){
            System.out.println("Nº ");
        }
        
        System.out.printf("Tiempo en ordenar la lista: %.2f segundos.", total);     
        
    }//GEN-LAST:event_jButtonOrdenarActionPerformed

    private void mostrarCuentaSeleccionada() {
        for (int i = 0; i < listaNodos.getArrayNodos().length; i++) {

            if (listaNodos.getArrayNodos()[i] == null) {
                break;
            }
            if ((listaNodos.getArrayNodos()[i]).getIndice() == indiceCuentaActual) {
                Cuenta cuenta = (Cuenta) listaNodos.getArrayNodos()[i].getTypo();
                txtSaldoMinimo.setText(String.valueOf(cuenta.getSaldo()));
                txtFecha.setText(GestionFicheros.formateaFecha(cuenta.getFecha()));
                if (cuenta.getTipoCuenta().equals(Cuenta.tipoCuenta.AHORRO)) {
                    CuentaAhorro cuentaAhorro = (CuentaAhorro) listaNodos.getArrayNodos()[i].getTypo();
                    lbTipo1.setText("Interés Mensual");
                    lbTipo2.setText("¿Bloqueada?");
                    txtTipo1.setText(String.valueOf(cuentaAhorro.getInteresMensual()));
                    txtTipo2.setText(String.valueOf(cuentaAhorro.isBloqueada()));

                }else if(cuenta.getTipoCuenta().equals(Cuenta.tipoCuenta.INVERSION)) {
                    CuentaInversion cuentaInversion = (CuentaInversion) listaNodos.getArrayNodos()[i].getTypo();
                    lbTipo1.setText("Beneficio");
                    lbTipo2.setText("Total invertido");
                    txtTipo1.setText(String.valueOf(cuentaInversion.getBeneficio()));
                    txtTipo2.setText(String.valueOf(cuentaInversion.getTotalInvertido()));
                    
                }else {

                    CuentaCorriente cuentaCorriente = (CuentaCorriente) listaNodos.getArrayNodos()[i].getTypo();
                    lbTipo1.setText("Comsión de Mantenimiento");
                    lbTipo2.setText("Tipo de Comisión");
                    txtTipo1.setText(String.valueOf(cuentaCorriente.getComisionMantenimiento()));
                    txtTipo2.setText(String.valueOf(cuentaCorriente.getTipoComision()));

                }
            }
        }
    }

    public void copiarLista(){
        listaCopia = new ArrayList <Nodo>();
        
        for(Nodo n : listaNodos.getArrayNodos()){
            listaCopia.add(n);
        }
    }
    
    public void ordenarLista(List <Nodo> lista){
        Collections.sort(lista, new ComparadorNumCuenta());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOrdenar;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbSaldoMinimo;
    private javax.swing.JLabel lbTipo1;
    private javax.swing.JLabel lbTipo2;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtSaldoMinimo;
    private javax.swing.JTextField txtTipo1;
    private javax.swing.JTextField txtTipo2;
    // End of variables declaration//GEN-END:variables
}
