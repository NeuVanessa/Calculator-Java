package Base;


public class Calculadora extends javax.swing.JFrame {

    // Variáveis 
    double num1, num2;
    String operation = "operadoradd";

    public Calculadora() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldBox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButtonseven = new javax.swing.JButton();
        jButtoneigth = new javax.swing.JButton();
        jButtonnine = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButtonfour = new javax.swing.JButton();
        jButtonfive = new javax.swing.JButton();
        jButtonsix = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButtonOne = new javax.swing.JButton();
        jButtonTwo = new javax.swing.JButton();
        jButtonThree = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButtonzero = new javax.swing.JButton();
        jButtonpoint = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Calculadora Funcional");
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldBox.setBackground(new java.awt.Color(204, 255, 255));
        jTextFieldBox.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextFieldBox.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextFieldBox.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jTextFieldBox.setDisabledTextColor(new java.awt.Color(255, 0, 0));
        jTextFieldBox.setEnabled(false);
        jTextFieldBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBoxActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 290, 50));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("=");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 50, 64));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("<-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 70, 64));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton3.setText("%");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 70, 64));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton4.setText("C");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 70, 64));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("-");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 50, 64));

        jButtonseven.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonseven.setText("7");
        jButtonseven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsevenActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonseven, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 70, 64));

        jButtoneigth.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtoneigth.setText("8");
        jButtoneigth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtoneigthActionPerformed(evt);
            }
        });
        getContentPane().add(jButtoneigth, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 70, 64));

        jButtonnine.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonnine.setText("9");
        jButtonnine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonnineActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonnine, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 150, 70, 64));

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton9.setText("x");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 50, 64));

        jButtonfour.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonfour.setText("4");
        jButtonfour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonfourActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonfour, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 70, 64));

        jButtonfive.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonfive.setText("5");
        jButtonfive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonfiveActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonfive, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 70, 64));

        jButtonsix.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonsix.setText("6");
        jButtonsix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonsixActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonsix, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 70, 64));

        jButton13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton13.setText("/");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 50, 70));

        jButtonOne.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonOne.setText("1");
        jButtonOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOneActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 70, 70));

        jButtonTwo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonTwo.setText("2");
        jButtonTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTwoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 67, 70));

        jButtonThree.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonThree.setText("3");
        jButtonThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThreeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonThree, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 70, 70));

        jButton17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton17.setText("+");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 50, 64));

        jButtonzero.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonzero.setText("0");
        jButtonzero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonzeroActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonzero, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 70, 64));

        jButtonpoint.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonpoint.setText(".");
        jButtonpoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonpointActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonpoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, 70, 64));

        jButton20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton20.setText("+/-");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 70, 64));

        jMenu1.setText("Sobre");

        jMenuItem2.setText("Information");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opção");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Sair");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(325, 530));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Botão =
        num2 = Double.parseDouble(jTextFieldBox.getText());
        switch (operation) {
            case "operadoradd":
                double t = num1 + num2;
                jTextFieldBox.setText(Double.toString(t));
                break;
            case "operadorsubtracao":
                double q = num1 - num2;
                jTextFieldBox.setText(Double.toString(q));
                break;
            case "operadordivisao":
                double x = num1 / num2;
                jTextFieldBox.setText(Double.toString(x));
                break;
            case "operadormultiplicacao":
                double y = num1 * num2;
                jTextFieldBox.setText(Double.toString(y));
                break;

            case "porcentagem":
                double z = num1 * (num2 / 100);
                jTextFieldBox.setText(Double.toString(z));
                break;
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThreeActionPerformed
        jTextFieldBox.setText(jTextFieldBox.getText() + jButtonThree.getText());
    }//GEN-LAST:event_jButtonThreeActionPerformed

    private void jButtonfourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonfourActionPerformed
        jTextFieldBox.setText(jTextFieldBox.getText() + jButtonfour.getText());
    }//GEN-LAST:event_jButtonfourActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//botao C - APAGAR

        jTextFieldBox.setText("");
        num1 = 0;
        num2 = 0;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        //Botão +
        num1 = Double.parseDouble(jTextFieldBox.getText());
        operation = "operadoradd";
        jTextFieldBox.setText("");

    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButtonzeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonzeroActionPerformed
        jTextFieldBox.setText(jTextFieldBox.getText() + jButtonzero.getText());
    }//GEN-LAST:event_jButtonzeroActionPerformed

    private void jButtonpointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonpointActionPerformed
        // Ponto Já que os valores são utilizados como Double 
        jTextFieldBox.setText(jTextFieldBox.getText() + jButtonpoint.getText());

    }//GEN-LAST:event_jButtonpointActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        double dados = Double.parseDouble(jTextFieldBox.getText());
        dados = dados * (-1);
        jTextFieldBox.setText(String.valueOf(dados));

    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // botao x
        num1 = Double.parseDouble(jTextFieldBox.getText());
        operation = "operadormultiplicacao";
        jTextFieldBox.setText("");


    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButtonOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOneActionPerformed
        jTextFieldBox.setText(jTextFieldBox.getText() + jButtonOne.getText());
    }//GEN-LAST:event_jButtonOneActionPerformed

    private void jButtonTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTwoActionPerformed
        jTextFieldBox.setText(jTextFieldBox.getText() + jButtonTwo.getText());
    }//GEN-LAST:event_jButtonTwoActionPerformed

    private void jButtonfiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonfiveActionPerformed
        jTextFieldBox.setText(jTextFieldBox.getText() + jButtonfive.getText());
    }//GEN-LAST:event_jButtonfiveActionPerformed

    private void jButtonsixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsixActionPerformed
        jTextFieldBox.setText(jTextFieldBox.getText() + jButtonsix.getText());
    }//GEN-LAST:event_jButtonsixActionPerformed

    private void jButtonsevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonsevenActionPerformed

        String enter = jTextFieldBox.getText() + jButtonseven.getText();
        jTextFieldBox.setText(enter);

// jTextFieldBox.setText(jTextFieldBox.getText() + jButtonseven.getText());

    }//GEN-LAST:event_jButtonsevenActionPerformed

    private void jButtoneigthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtoneigthActionPerformed
        jTextFieldBox.setText(jTextFieldBox.getText() + jButtoneigth.getText());
    }//GEN-LAST:event_jButtoneigthActionPerformed

    private void jButtonnineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonnineActionPerformed
        jTextFieldBox.setText(jTextFieldBox.getText() + jButtonnine.getText());
    }//GEN-LAST:event_jButtonnineActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //Botão -
        num1 = Double.parseDouble(jTextFieldBox.getText());
        operation = "operadorsubtracao";
        jTextFieldBox.setText("");

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // Botao /
        num1 = Double.parseDouble(jTextFieldBox.getText());
        operation = "operadordivisao";
        jTextFieldBox.setText("");

    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        num1 = Double.parseDouble(jTextFieldBox.getText());
        operation = "porcentagem";
        jTextFieldBox.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String back = null;
        if (jTextFieldBox.getText().length() > 0) {
            StringBuilder voltar = new StringBuilder(jTextFieldBox.getText());
            voltar.deleteCharAt(jTextFieldBox.getText().length() - 1);
            back = voltar.toString();
            jTextFieldBox.setText(back);

        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

        NewJFrame sobre = new NewJFrame();
        sobre.setVisible(true);
        dispose();

    }//GEN-LAST:event_jMenuItem2ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton9;
    private javax.swing.JButton jButtonOne;
    private javax.swing.JButton jButtonThree;
    private javax.swing.JButton jButtonTwo;
    private javax.swing.JButton jButtoneigth;
    private javax.swing.JButton jButtonfive;
    private javax.swing.JButton jButtonfour;
    private javax.swing.JButton jButtonnine;
    private javax.swing.JButton jButtonpoint;
    private javax.swing.JButton jButtonseven;
    private javax.swing.JButton jButtonsix;
    private javax.swing.JButton jButtonzero;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JTextField jTextFieldBox;
    // End of variables declaration//GEN-END:variables
}
