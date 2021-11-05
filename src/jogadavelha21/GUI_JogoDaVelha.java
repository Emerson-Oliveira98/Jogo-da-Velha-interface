/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogadavelha21;

import javax.swing.JLabel;

/**
 *
 * @author Emerson
 */
public class GUI_JogoDaVelha extends javax.swing.JFrame {

    /**
     * Creates new form GUI_JogoDaVelha
     */
    public GUI_JogoDaVelha() {
        initComponents();
        jogo1.setJogadorDaVez(1);
        jogo1.setJogadorVencedor(0);
    }


    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jb_12 = new javax.swing.JButton();
        jb_02 = new javax.swing.JButton();
        jb_10 = new javax.swing.JButton();
        jb_11 = new javax.swing.JButton();
        jb_01 = new javax.swing.JButton();
        jb_00 = new javax.swing.JButton();
        jb_20 = new javax.swing.JButton();
        jb_21 = new javax.swing.JButton();
        jb_22 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jl_Vencedor = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jl_JogadorDaVez = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 42)); // NOI18N
        jLabel1.setText("Jogo Da Velha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jb_12.setBackground(new java.awt.Color(153, 255, 204));
        jb_12.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jb_12.setPreferredSize(new java.awt.Dimension(100, 100));
        jb_12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_12ActionPerformed(evt);
            }
        });

        jb_02.setBackground(new java.awt.Color(153, 255, 204));
        jb_02.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jb_02.setPreferredSize(new java.awt.Dimension(100, 100));
        jb_02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_02ActionPerformed(evt);
            }
        });

        jb_10.setBackground(new java.awt.Color(153, 255, 204));
        jb_10.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jb_10.setPreferredSize(new java.awt.Dimension(100, 100));
        jb_10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_10ActionPerformed(evt);
            }
        });

        jb_11.setBackground(new java.awt.Color(153, 255, 204));
        jb_11.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jb_11.setPreferredSize(new java.awt.Dimension(100, 100));
        jb_11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_11ActionPerformed(evt);
            }
        });

        jb_01.setBackground(new java.awt.Color(153, 255, 204));
        jb_01.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jb_01.setPreferredSize(new java.awt.Dimension(100, 100));
        jb_01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_01ActionPerformed(evt);
            }
        });

        jb_00.setBackground(new java.awt.Color(153, 255, 204));
        jb_00.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jb_00.setPreferredSize(new java.awt.Dimension(100, 100));
        jb_00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_00ActionPerformed(evt);
            }
        });

        jb_20.setBackground(new java.awt.Color(153, 255, 204));
        jb_20.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jb_20.setPreferredSize(new java.awt.Dimension(100, 100));
        jb_20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_20ActionPerformed(evt);
            }
        });

        jb_21.setBackground(new java.awt.Color(153, 255, 204));
        jb_21.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jb_21.setPreferredSize(new java.awt.Dimension(100, 100));
        jb_21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_21ActionPerformed(evt);
            }
        });

        jb_22.setBackground(new java.awt.Color(153, 255, 204));
        jb_22.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jb_22.setPreferredSize(new java.awt.Dimension(100, 100));
        jb_22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jb_20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jb_22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jb_00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jb_01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jb_02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jb_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jb_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jb_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_02, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_01, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_00, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jb_20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton7.setBackground(new java.awt.Color(0, 153, 204));
        jButton7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("RESET");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Jogadores:"));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Jogador 1:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Jogador 2:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("O");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("X");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(82, 82, 82))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "QUEM GANHOU:"));
        jPanel6.setMinimumSize(new java.awt.Dimension(250, 250));

        jl_Vencedor.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jl_Vencedor.setForeground(new java.awt.Color(255, 102, 102));
        jl_Vencedor.setText("Verificando Jogador");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jl_Vencedor)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jl_Vencedor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "Jogador da Vez:"));

        jl_JogadorDaVez.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jl_JogadorDaVez.setText("Jogador 1");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_JogadorDaVez)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jl_JogadorDaVez)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_12ActionPerformed
                    // solucao pelo modelo matematico
        if (jogo1.getJogo(1, 2) == 0){
            if (jogo1.getJogadorDaVez() == 1){
                jogo1.setJogo(1, 2, 1);
                jogo1.setJogadorDaVez(2);
                jb_12.setText("O");
                jl_JogadorDaVez.setText("Jogador 2");
                
            } else {
                jogo1.setJogo(1, 2, 2);
                jogo1.setJogadorDaVez(1);
                jb_12.setText("X");
                jl_JogadorDaVez.setText("Jogador 1");
            }
            
                        // verificr quem ganhou 
            jogo1.verificaQuemGanhou2();
            if (jogo1.getJogadorVencedor() != 0) {
                if (jogo1.getJogadorVencedor() == 1) {
                    jl_Vencedor.setText("JOGADOR 1");
                    jogo1.CalcularJogo2();
                } else {
                    jl_Vencedor.setText("JOGADOR 2");
                    jogo1.CalcularJogo2();
                }
            }

}
    }//GEN-LAST:event_jb_12ActionPerformed

    private void jb_22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_22ActionPerformed
                    // solucao pelo modelo matematico
        if (jogo1.getJogo(2, 2) == 0){
            if (jogo1.getJogadorDaVez() == 1){
                jogo1.setJogo(2, 2, 1);
                jogo1.setJogadorDaVez(2);
                jb_22.setText("O");
                jl_JogadorDaVez.setText("Jogador 2");
                
            } else {
                jogo1.setJogo(2, 2, 2);
                jogo1.setJogadorDaVez(1);
                jb_22.setText("X");
                jl_JogadorDaVez.setText("Jogador 1");
            }
            
                        // verificr quem ganhou 
            jogo1.verificaQuemGanhou2();
            if (jogo1.getJogadorVencedor() != 0) {
                if (jogo1.getJogadorVencedor() == 1) {
                    jl_Vencedor.setText("JOGADOR 1");
                    jogo1.CalcularJogo2();
                } else {
                    jl_Vencedor.setText("JOGADOR 2");
                    jogo1.CalcularJogo2();
                }
            }

}
    }//GEN-LAST:event_jb_22ActionPerformed

    private void jb_00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_00ActionPerformed
    // solucao pelo modelo matematico
        if (jogo1.getJogo(0, 0) == 0){
            if (jogo1.getJogadorDaVez() == 1){
                jogo1.setJogo(0, 0, 1);
                jogo1.setJogadorDaVez(2);
                jb_00.setText("O");
                jl_JogadorDaVez.setText("Jogador 2");
                
            } else {
                jogo1.setJogo(0, 0, 2);
                jogo1.setJogadorDaVez(1);
                jb_00.setText("X");
                jl_JogadorDaVez.setText("Jogador 1");
            }
            // verificr quem ganhou 
            jogo1.verificaQuemGanhou2();
            if (jogo1.getJogadorVencedor() != 0) {
                if (jogo1.getJogadorVencedor() == 1) {
                    jl_Vencedor.setText("JOGADOR 1");
                    jogo1.CalcularJogo2();
                } else {
                    jl_Vencedor.setText("JOGADOR 2");
                    jogo1.CalcularJogo2();
                }
            }

}
    }//GEN-LAST:event_jb_00ActionPerformed

    private void jb_01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_01ActionPerformed
                if (jogo1.getJogo(0, 1) == 0){
            if (jogo1.getJogadorDaVez() == 1){
                jogo1.setJogo(0, 1, 1);
                jogo1.setJogadorDaVez(2);
                jb_01.setText("O");
                jl_JogadorDaVez.setText("Jogador 2");
            } else {
                jogo1.setJogo(0, 1, 2);
                jogo1.setJogadorDaVez(1);
                jb_01.setText("X");
                jl_JogadorDaVez.setText("Jogador 1");
            }
            
                        // verificr quem ganhou 
            jogo1.verificaQuemGanhou2();
            if (jogo1.getJogadorVencedor() != 0) {
                if (jogo1.getJogadorVencedor() == 1) {
                    jl_Vencedor.setText("JOGADOR 1");
                    jogo1.CalcularJogo2();
                } else {
                    jl_Vencedor.setText("JOGADOR 2");
                    jogo1.CalcularJogo2();
                }
            }

}
    }//GEN-LAST:event_jb_01ActionPerformed

    private void jb_02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_02ActionPerformed
            // solucao pelo modelo matematico
        if (jogo1.getJogo(0, 2) == 0){
            if (jogo1.getJogadorDaVez() == 1){
                jogo1.setJogo(0, 2, 1);
                jogo1.setJogadorDaVez(2);
                jb_02.setText("O");
                jl_JogadorDaVez.setText("Jogador 2");
                
            } else {
                jogo1.setJogo(0, 2, 2);
                jogo1.setJogadorDaVez(1);
                jb_02.setText("X");
                jl_JogadorDaVez.setText("Jogador 1");
            }
            
                        // verificr quem ganhou 
            jogo1.verificaQuemGanhou2();
            if (jogo1.getJogadorVencedor() != 0) {
                if (jogo1.getJogadorVencedor() == 1) {
                    jl_Vencedor.setText("JOGADOR 1");
                    jogo1.CalcularJogo2();
                } else {
                    jl_Vencedor.setText("JOGADOR 2");
                    jogo1.CalcularJogo2();
                }
            }

}
    }//GEN-LAST:event_jb_02ActionPerformed

    private void jb_10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_10ActionPerformed
                    // solucao pelo modelo matematico
        if (jogo1.getJogo(1, 0) == 0){
            if (jogo1.getJogadorDaVez() == 1){
                jogo1.setJogo(1, 0, 1);
                jogo1.setJogadorDaVez(2);
                jb_10.setText("O");
                jl_JogadorDaVez.setText("Jogador 2");
                
            } else {
                jogo1.setJogo(1, 0, 2);
                jogo1.setJogadorDaVez(1);
                jb_10.setText("X");
                jl_JogadorDaVez.setText("Jogador 1");
            }
            
                        // verificr quem ganhou 
            jogo1.verificaQuemGanhou2();
            if (jogo1.getJogadorVencedor() != 0) {
                if (jogo1.getJogadorVencedor() == 1) {
                    jl_Vencedor.setText("JOGADOR 1");
                    jogo1.CalcularJogo2();
                } else {
                    jl_Vencedor.setText("JOGADOR 2");
                    jogo1.CalcularJogo2();
                }
            }

}
    }//GEN-LAST:event_jb_10ActionPerformed

    private void jb_11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_11ActionPerformed
                    // solucao pelo modelo matematico
        if (jogo1.getJogo(1, 1) == 0){
            if (jogo1.getJogadorDaVez() == 1){
                jogo1.setJogo(1, 1, 1);
                jogo1.setJogadorDaVez(2);
                jb_11.setText("O");
                jl_JogadorDaVez.setText("Jogador 2");
                
            } else {
                jogo1.setJogo(1, 1, 2);
                jogo1.setJogadorDaVez(1);
                jb_11.setText("X");
                jl_JogadorDaVez.setText("Jogador 1");
            }
            
                        // verificr quem ganhou 
            jogo1.verificaQuemGanhou2();
            if (jogo1.getJogadorVencedor() != 0) {
                if (jogo1.getJogadorVencedor() == 1) {
                    jl_Vencedor.setText("JOGADOR 1");
                    jogo1.CalcularJogo2();
                } else {
                    jl_Vencedor.setText("JOGADOR 2");
                    jogo1.CalcularJogo2();
                }
            }

}
    }//GEN-LAST:event_jb_11ActionPerformed

    private void jb_20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_20ActionPerformed
                    // solucao pelo modelo matematico
        if (jogo1.getJogo(2, 0) == 0){
            if (jogo1.getJogadorDaVez() == 1){
                jogo1.setJogo(2, 0, 1);
                jogo1.setJogadorDaVez(2);
                jb_20.setText("O");
                jl_JogadorDaVez.setText("Jogador 2");
                
            } else {
                jogo1.setJogo(2, 0, 2);
                jogo1.setJogadorDaVez(1);
                jb_20.setText("X");
                jl_JogadorDaVez.setText("Jogador 1");
            }
            
                        // verificr quem ganhou 
            jogo1.verificaQuemGanhou2();
            if (jogo1.getJogadorVencedor() != 0) {
                if (jogo1.getJogadorVencedor() == 1) {
                    jl_Vencedor.setText("JOGADOR 1");
                    jogo1.CalcularJogo2();
                } else {
                    jl_Vencedor.setText("JOGADOR 2");
                    jogo1.CalcularJogo2();
                }
            }

}
    }//GEN-LAST:event_jb_20ActionPerformed

    private void jb_21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_21ActionPerformed
                    // solucao pelo modelo matematico
        if (jogo1.getJogo(2, 1) == 0){
            if (jogo1.getJogadorDaVez() == 1){
                jogo1.setJogo(2, 1, 1);
                jogo1.setJogadorDaVez(2);
                jb_21.setText("O");
                jl_JogadorDaVez.setText("Jogador 2");
                
            } else {
                jogo1.setJogo(2, 1, 2);
                jogo1.setJogadorDaVez(1);
                jb_21.setText("X");
                jl_JogadorDaVez.setText("Jogador 1");
                   }
            
                        // verificr quem ganhou 
            jogo1.verificaQuemGanhou2();
            if (jogo1.getJogadorVencedor() != 0) {
                if (jogo1.getJogadorVencedor() == 1) {
                    jl_Vencedor.setText("JOGADOR 1");
                    jogo1.CalcularJogo2();
                } else {
                    jl_Vencedor.setText("JOGADOR 2");
                    jogo1.CalcularJogo2();
                }
            }

}
    

    }//GEN-LAST:event_jb_21ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        jb_00.setText("");
        jb_01.setText("");
        jb_02.setText("");
        jb_10.setText("");
        jb_11.setText("");
        jb_12.setText("");
        jb_20.setText("");
        jb_21.setText("");
        jb_22.setText("");
        jl_Vencedor.setText("Verificando Jogador");
        
        jogo1.CalcularJogo();

    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI_JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_JogoDaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton jb_00;
    private javax.swing.JButton jb_01;
    private javax.swing.JButton jb_02;
    private javax.swing.JButton jb_10;
    private javax.swing.JButton jb_11;
    private javax.swing.JButton jb_12;
    private javax.swing.JButton jb_20;
    private javax.swing.JButton jb_21;
    private javax.swing.JButton jb_22;
    private javax.swing.JLabel jl_JogadorDaVez;
    private javax.swing.JLabel jl_Vencedor;
    // End of variables declaration//GEN-END:variables
     CalcularJogo jogo1 = new CalcularJogo();
}
