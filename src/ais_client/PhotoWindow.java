package ais_client;

import javax.swing.ImageIcon;

public class PhotoWindow extends javax.swing.JFrame {
    private byte[] photo;
    
    public PhotoWindow(byte[] givenPhoto) {
        this.photo = givenPhoto;
        initComponents();
        photoLabel.setText("");
        photoLabel.setIcon(new ImageIcon(this.photo));        
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        photoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        photoLabel.setText("photoLabel");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(photoLabel)
                .addContainerGap(331, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(photoLabel)
                .addContainerGap(275, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel photoLabel;
    // End of variables declaration//GEN-END:variables
}
