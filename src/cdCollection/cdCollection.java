/* 09/05/2018
 * CD Collection editor
 */

package cdCollection;
import java.util.*;

/**
 * @author fedie2562
 */
public class cdCollection extends javax.swing.JFrame {

    /**
     * Creates new form cdCollection
     */
    ArrayList <String> cdCollection = new ArrayList();
    public cdCollection() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        display = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        outputField = new javax.swing.JTextArea();
        inputField = new javax.swing.JTextField();
        removeButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        initialize = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Title - Artist");

        display.setText("Display");
        display.setEnabled(false);
        display.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayActionPerformed(evt);
            }
        });

        outputField.setEditable(false);
        outputField.setColumns(20);
        outputField.setRows(5);
        jScrollPane1.setViewportView(outputField);

        removeButton.setText("Remove");
        removeButton.setEnabled(false);
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.setEnabled(false);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        initialize.setText("Initialize");
        initialize.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                initializeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(display)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(initialize)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(addButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(inputField)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(display)
                    .addComponent(removeButton)
                    .addComponent(addButton)
                    .addComponent(initialize))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void initializeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_initializeActionPerformed
        Collections.addAll(cdCollection, "All Star - Smash Mouth","Shooting Stars - Bag Raiders","Roundabout - Yes",
        "Take On Me - aha","Africa - Toto");
        outputField.setText(outputField.getText()+"Unsorted List \n");
        for(int i=0;i<cdCollection.size();i++){
            outputField.setText(outputField.getText()+cdCollection.get(i)+"\n");
        }
        Collections.sort(cdCollection);
        outputField.setText(outputField.getText()+"\n"+"Sorted List \n");
        for(int i=0;i<cdCollection.size();i++){
            outputField.setText(outputField.getText()+cdCollection.get(i)+"\n");
        }
        initialize.setEnabled(false);
        display.setEnabled(true);
        addButton.setEnabled(true);
        removeButton.setEnabled(true);
    }//GEN-LAST:event_initializeActionPerformed

    private void displayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayActionPerformed
        outputField.setText("");
        Collections.sort(cdCollection);
        outputField.setText(outputField.getText()+"Sorted List \n");
        for(int i=0;i<cdCollection.size();i++){
            outputField.setText(outputField.getText()+cdCollection.get(i)+"\n");
        }
    }//GEN-LAST:event_displayActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        cdCollection.add(inputField.getText());
        outputField.setText("");
        Collections.sort(cdCollection);
        outputField.setText(outputField.getText()+"Sorted List \n");
        for(int i=0;i<cdCollection.size();i++){
            outputField.setText(outputField.getText()+cdCollection.get(i)+"\n");
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int index = Collections.binarySearch(cdCollection, inputField.getText());
        if(index > -1){
            cdCollection.remove(inputField.getText());
            Collections.sort(cdCollection);
            outputField.setText("");
            outputField.setText(outputField.getText()+"Sorted List \n");
            for(int i=0;i<cdCollection.size();i++){
                outputField.setText(outputField.getText()+cdCollection.get(i)+"\n");
            }
        }
        else {
            outputField.setText(inputField.getText()+" \n does not seem to be on the list");
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(cdCollection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cdCollection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cdCollection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cdCollection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cdCollection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton display;
    private javax.swing.JButton initialize;
    private javax.swing.JTextField inputField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea outputField;
    private javax.swing.JButton removeButton;
    // End of variables declaration//GEN-END:variables
}
