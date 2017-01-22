/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

import java.awt.event.ActionEvent;
import javax.swing.JTable;

/**
 *
 * @author Ambrizal
 */
public class DataView extends java.awt.Dialog {

    /**
     * Creates new form DataView1
     */
    public DataView(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        OOPPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("OOPPU").createEntityManager();
        pesertaQuery = java.beans.Beans.isDesignTime() ? null : OOPPUEntityManager.createQuery("SELECT p FROM Peserta p");
        pesertaList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : pesertaQuery.getResultList();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabeldata = new javax.swing.JTable();

        setTitle("Lihat Data");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, pesertaList, tabeldata);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataId}"));
        columnBinding.setColumnName("Data Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataNama}"));
        columnBinding.setColumnName("Data Nama");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataAsal}"));
        columnBinding.setColumnName("Data Asal");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataLahir}"));
        columnBinding.setColumnName("Data Lahir");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding.setEditable(false);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dataAlamat}"));
        columnBinding.setColumnName("Data Alamat");
        columnBinding.setColumnClass(String.class);
        columnBinding.setEditable(false);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        tabeldata.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                tabeldataComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(tabeldata);
        if (tabeldata.getColumnModel().getColumnCount() > 0) {
            tabeldata.getColumnModel().getColumn(0).setResizable(false);
            tabeldata.getColumnModel().getColumn(1).setResizable(false);
            tabeldata.getColumnModel().getColumn(2).setResizable(false);
            tabeldata.getColumnModel().getColumn(3).setResizable(false);
            tabeldata.getColumnModel().getColumn(4).setResizable(false);
        }

        add(jScrollPane1, java.awt.BorderLayout.CENTER);

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void tabeldataComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_tabeldataComponentShown
        // TODO add your handling code here:

    }//GEN-LAST:event_tabeldataComponentShown

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DataView dialog = new DataView(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager OOPPUEntityManager;
    private javax.swing.JScrollPane jScrollPane1;
    private java.util.List<Tugas4.Peserta> pesertaList;
    private javax.persistence.Query pesertaQuery;
    private javax.swing.JTable tabeldata;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

    private void closeDialog(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}