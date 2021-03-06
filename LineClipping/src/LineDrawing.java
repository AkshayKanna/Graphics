
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Point2D;
import javafx.scene.shape.Line;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class LineDrawing extends javax.swing.JFrame {

    /**
     * Creates new form LineDrawing
     */
    private Graphics g;
    private Graphics2D g2D;
    
    public LineDrawing() {
        initComponents();
        g = objPanel.getGraphics();
        g2D = (Graphics2D) g;
        g2D.translate(0,168);
        g2D.scale(1,-1);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        drawBtn = new javax.swing.JButton();
        objPanel = new javax.swing.JPanel();
        clearbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        drawBtn.setText("Draw Object");
        drawBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drawBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout objPanelLayout = new javax.swing.GroupLayout(objPanel);
        objPanel.setLayout(objPanelLayout);
        objPanelLayout.setHorizontalGroup(
            objPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 228, Short.MAX_VALUE)
        );
        objPanelLayout.setVerticalGroup(
            objPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );

        clearbtn.setText("Clear");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(drawBtn)
                        .addGap(31, 31, 31)
                        .addComponent(clearbtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(objPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(drawBtn)
                    .addComponent(clearbtn))
                .addGap(50, 50, 50)
                .addComponent(objPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void drawLine(int X1,int Y1,int X2, int Y2)
    {
       // g2D.drawLine(20,20,20,20);
        int dy = Y2 - Y1;
        int dx = X2 - X1;
        int d = 2*dy - dx;
        int x = X1;
        int y = Y1;
        g2D.drawLine( x, y, x,y);
        objPanel.printComponents(g2D);
        if(Math.abs(dx) > Math.abs(dy))
        {
             System.out.println("in");
            while(x < X2)
            {
                x++;
                if(d < 0)
                {
                   d = d+dy;
                }
                else
                {
                   System.out.println("in");
                   d = d + dy - dx;
                   y++;
                }
                g2D.drawLine(x, y, x, y);
            }
            while(x > X2)
            {
                x--;
                if(d < 0)
                {
                   d = d+dy;
                }
                else
                {
                   System.out.println("in");
                   d = d + dy - dx;
                   y++;
                }
                g2D.drawLine(x, y, x, y);
            }
            objPanel.printComponents(g2D);
        }
        else
        {
            while(y < Y2)
            {
                y++;
                if(d < 0)
                {
                    d = d+dx;
                }
                else
                {
                    d = d + dx - dy;
                    x++;
                }
                g2D.drawLine(x, y, x, y);
            }
            while(y > Y2)
            {
                y--;
                if(d < 0)
                {
                    d = d+dx;
                }
                else
                {
                    d = d + dx - dy;
                     x++;
                   
                }
                g2D.drawLine(x, y, x, y);
            }
            objPanel.printComponents(g2D);
        }
    }
    private void drawBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drawBtnActionPerformed
        // TODO add your handling code here:
        drawLine(25,10,50,60);
        drawLine(25,10,75,10);
        drawLine(50,60,75,10);
        drawLine(50,10,50,60);
        //g2D.drawLine(50,60,75,10);
        //g2D.drawLine(25,10,50,60);
        //g2D.drawLine(25,10,75,10);
        //g2D.drawLine(75,10,50,60);
        objPanel.printComponents(g2D);
    }//GEN-LAST:event_drawBtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        // TODO add your handling code here:
        objPanel.removeAll();
        objPanel.updateUI();
    }//GEN-LAST:event_clearbtnActionPerformed

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
            java.util.logging.Logger.getLogger(LineDrawing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LineDrawing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LineDrawing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LineDrawing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LineDrawing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton drawBtn;
    private javax.swing.JPanel objPanel;
    // End of variables declaration//GEN-END:variables
}
