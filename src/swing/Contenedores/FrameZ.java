/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing.Contenedores;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Point;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author admin
 */
public class FrameZ extends javax.swing.JFrame {

    String title = "";
    int x = 0, y = 0, width, height;
    boolean isMax = false;

    /**
     * Creates new form FramePrincipal
     */
    public FrameZ() {

        initComponents();

    }

    public FrameZ(String title) {
        this.title = title;
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
        java.awt.GridBagConstraints gridBagConstraints;

        pToolBar = new javax.swing.JPanel();
        lTitle = new javax.swing.JLabel();
        bCerrar = new javax.swing.JButton();
        bMaximizar = new javax.swing.JButton();
        bMinimizar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("FrameZ");
        setBackground(new java.awt.Color(0, 0, 204));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pToolBar.setBackground(new java.awt.Color(0, 102, 255));
        pToolBar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 204)));
        pToolBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pToolBarMouseDragged(evt);
            }
        });
        pToolBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pToolBarMousePressed(evt);
            }
        });
        pToolBar.setLayout(new java.awt.GridBagLayout());

        lTitle.setText("Texto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        pToolBar.add(lTitle, gridBagConstraints);

        bCerrar.setBackground(new java.awt.Color(0, 102, 255));
        bCerrar.setToolTipText("");
        bCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bCerrarMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bCerrarMouseEntered(evt);
            }
        });
        bCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCerrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pToolBar.add(bCerrar, gridBagConstraints);

        bMaximizar.setBackground(new java.awt.Color(0, 102, 255));
        bMaximizar.setToolTipText("");
        bMaximizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bMaximizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bMaximizarMouseExited(evt);
            }
        });
        bMaximizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMaximizarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pToolBar.add(bMaximizar, gridBagConstraints);

        bMinimizar.setBackground(new java.awt.Color(0, 102, 255));
        bMinimizar.setToolTipText("");
        bMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bMinimizarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bMinimizarMouseExited(evt);
            }
        });
        bMinimizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMinimizarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        pToolBar.add(bMinimizar, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        getContentPane().add(pToolBar, gridBagConstraints);

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 102, 204)));

        jButton1.setText("jButton1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.8;
        gridBagConstraints.weighty = 0.8;
        getContentPane().add(jPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        getContentPane().setBackground(new Color(0, 0, 204));
        //creando iconos 
        ImageIcon iconoCerrar, iconoMinimizar, iconoMaximizar;
        URL ruta = getClass().getClassLoader().getResource("img//close.png");
        iconoCerrar = new ImageIcon(new ImageIcon(ruta).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
        bCerrar.setIcon(iconoCerrar);
        ruta = getClass().getClassLoader().getResource("img//minimize.png");
        iconoMinimizar = new ImageIcon(new ImageIcon(ruta).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
        bMinimizar.setIcon(iconoMinimizar);
        ruta = getClass().getClassLoader().getResource("img//maximizar.png");
        iconoMaximizar = new ImageIcon(new ImageIcon(ruta).getImage().getScaledInstance(25, 25, Image.SCALE_DEFAULT));
        bMaximizar.setIcon(iconoMaximizar);
//escribiendo título
        if ("".equals(title)) {
            title = "Nueva Ventana";
        }
        lTitle.setText(title);

    }//GEN-LAST:event_formWindowOpened

    private void bCerrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCerrarMouseEntered
        //[0,153,255]
        bCerrar.setBackground(new Color(0, 153, 255));
    }//GEN-LAST:event_bCerrarMouseEntered

    private void bCerrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bCerrarMouseExited
        bCerrar.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_bCerrarMouseExited

    private void bMaximizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMaximizarMouseExited
        bMaximizar.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_bMaximizarMouseExited

    private void bMaximizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMaximizarMouseEntered
        bMaximizar.setBackground(new Color(0, 153, 255));
    }//GEN-LAST:event_bMaximizarMouseEntered

    private void bMinimizarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMinimizarMouseEntered
        bMinimizar.setBackground(new Color(0, 153, 255));
    }//GEN-LAST:event_bMinimizarMouseEntered

    private void bMinimizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bMinimizarMouseExited
        bMinimizar.setBackground(new Color(0, 102, 255));
    }//GEN-LAST:event_bMinimizarMouseExited

    private void bCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCerrarActionPerformed
        System.out.println("Cerrar Ventana");
        System.exit(0);
    }//GEN-LAST:event_bCerrarActionPerformed

    private void pToolBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pToolBarMousePressed

        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_pToolBarMousePressed

    private void pToolBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pToolBarMouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
    }//GEN-LAST:event_pToolBarMouseDragged

    private void bMinimizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMinimizarActionPerformed
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_bMinimizarActionPerformed

    private void bMaximizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMaximizarActionPerformed
        if (isMax) {
            this.setExtendedState(NORMAL);
            isMax = false;
        } else {
            this.setExtendedState(MAXIMIZED_BOTH);
            isMax = true;
        }
    }//GEN-LAST:event_bMaximizarActionPerformed

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
            java.util.logging.Logger.getLogger(FrameZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameZ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        System.out.println("Hola mundo, Rony");
        System.out.println("Hola mundo, Axel");
     
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameZ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCerrar;
    private javax.swing.JButton bMaximizar;
    private javax.swing.JButton bMinimizar;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lTitle;
    private javax.swing.JPanel pToolBar;
    // End of variables declaration//GEN-END:variables
}
