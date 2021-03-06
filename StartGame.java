/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package millionaires.gui;

import millionaires.model.Player;

/**
 *
 * @author datqu
 */
public class StartGame extends javax.swing.JFrame {

    /**
     * Creates new form startGame
     * @param name
     * @param age
     * @param nationality
     */
    public StartGame(Player p) {
        initComponents();
        NameLabel.setText("Name: " + p.getName());
        AgeLabel.setText( "Age: " + Integer.toString(p.getAge()) );
        NationalityLabel.setText("From: " + p.getNationality());
        player = p;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AvatarLabel = new javax.swing.JLabel();
        AgeLabel = new javax.swing.JLabel();
        NameLabel = new javax.swing.JLabel();
        NationalityLabel = new javax.swing.JLabel();
        StartButton = new javax.swing.JButton();
        javax.swing.JLabel avatar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        AgeLabel.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N

        NameLabel.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N

        NationalityLabel.setFont(new java.awt.Font("sansserif", 0, 24)); // NOI18N

        StartButton.setBackground(new java.awt.Color(153, 153, 153));
        StartButton.setFont(new java.awt.Font("sansserif", 3, 36)); // NOI18N
        StartButton.setText("Start Game!!!");
        StartButton.setBorder(null);
        StartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartButtonActionPerformed(evt);
            }
        });

        avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/millionaires/gui/avatar.png"))); // NOI18N
        avatar.setIconTextGap(6);
        avatar.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(411, Short.MAX_VALUE)
                .addComponent(StartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(376, 376, 376))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(AvatarLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(NameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
                    .addComponent(AgeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(NationalityLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AvatarLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(NameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(AgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(NationalityLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(avatar, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(StartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartButtonActionPerformed
        setVisible(false);
        gamePlay = new GamePlay(player);
        gamePlay.setVisible(true);
        gamePlay.runGame();
    }//GEN-LAST:event_StartButtonActionPerformed

    private GamePlay gamePlay;
    private Player  player;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AgeLabel;
    private javax.swing.JLabel AvatarLabel;
    private javax.swing.JLabel NameLabel;
    private javax.swing.JLabel NationalityLabel;
    private javax.swing.JButton StartButton;
    // End of variables declaration//GEN-END:variables
}
