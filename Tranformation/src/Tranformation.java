import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Arc2D;
import java.awt.geom.NoninvertibleTransformException;
import java.awt.geom.Rectangle2D;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AKSHAY KANNA
 */
public class Tranformation extends javax.swing.JFrame 
{
    private Graphics2D g2DResult;
    private Graphics2D g2DObject;
    private Graphics gResult;
    private Graphics gObject;
    private List<Shape> shapes = new ArrayList();
    
    public Tranformation() 
    {
        initComponents();
        gObject = jPanel1.getGraphics();
        g2DObject = (Graphics2D)gObject;
        g2DObject.translate(388/2,268/2);
        g2DObject.scale(1,-1);
        gResult = jPanel2.getGraphics();
        g2DResult = (Graphics2D)gResult;
        g2DResult.translate(388/2,268/2);
        g2DResult.scale(1,-1);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton7 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Draw Object");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 421, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jButton2.setText("Rotate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton3.setText("Translate");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setText("tx");

        jLabel2.setText("ty");

        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 396, Short.MAX_VALUE)
        );

        jButton5.setText("Reflect");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Shear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("XAxis");

        jCheckBox2.setText("YAxis");

        jButton7.setText("Scale");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel3.setText("Sx");

        jLabel4.setText("Sy");

        jCheckBox3.setText("XAxis");

        jCheckBox4.setText("YAxis");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setText("Y=X");

        jCheckBox6.setText("Y=-X");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jCheckBox5)
                                    .addComponent(jCheckBox3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jCheckBox4)
                                    .addComponent(jCheckBox6))
                                .addGap(44, 44, 44)
                                .addComponent(jCheckBox1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jCheckBox2)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(76, 76, 76)
                                .addComponent(jButton5)
                                .addGap(82, 82, 82)
                                .addComponent(jButton6)
                                .addGap(120, 120, 120)
                                .addComponent(jButton7)))
                        .addGap(43, 43, 43)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jCheckBox6))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1)
                                .addComponent(jButton2)
                                .addComponent(jButton3)
                                .addComponent(jButton5))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton6)
                                .addComponent(jButton7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jCheckBox3)
                                    .addComponent(jCheckBox4)
                                    .addComponent(jCheckBox1)
                                    .addComponent(jCheckBox2))
                                .addComponent(jCheckBox5))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public int[] x1= {-40,120,120,-40,-20,0,0,-20,20,40,40,20,60,80,80,60};
    public int[] y1= {-40,-40,80,80,30,30,80,80,30,30,80,80,30,30,80,80};
    public int[] x2= {120,120,-40,-40,0,0,-20,-20,40,40,20,20,80,80,60,60};
    public int[] y2= {-40,80,80,-40,30,80,80,30,30,80,80,30,30,80,80,30};
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        for(int i=0;i<16;i++)
        {
            g2DObject.drawLine(x1[i],y1[i],x2[i],y2[i]);
        }
        jPanel1.printComponents(g2DObject);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int angle;
        double ang;
        int xv1 = -40;
        int yv1 = -40;
        int[] newx1= new int[16];
        int[] newy1= new int[16];
        int[] newx2= new int[16];
        int[] newy2= new int[16];
        angle = Integer.parseInt(jTextField1.getText());
        ang = (angle * 3.14)/180;
        for(int i=0;i<16;i++)
        {
            newx1[i]=(int)(xv1+(x1[i]-xv1)*cos(ang)-(y1[i]-yv1)*sin(ang));
            newy1[i]=(int)(yv1+(x1[i]-xv1)*sin(ang)+(y1[i]-yv1)*cos(ang));
            newx2[i]=(int)(xv1+(x2[i]-xv1)*cos(ang)-(y2[i]-yv1)*sin(ang));
            newy2[i]=(int)(yv1+(x2[i]-xv1)*sin(ang)+(y2[i]-yv1)*cos(ang));
        }
        for(int i=0;i<16;i++){
            g2DResult.drawLine(newx1[i],newy1[i],newx2[i],newy2[i]);
        }
        jPanel2.printComponents(g2DResult);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        jPanel2.removeAll();
        jPanel2.updateUI();
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        /*AffineTransform tx = new AffineTransform();
        tx.translate(Integer.parseInt(jTextField2.getText()),Integer.parseInt(jTextField3.getText()));
        for(Shape shape:shapes)
        {
            g2DResult.draw(tx.createTransformedShape(shape));
        }
        jPanel2.printComponents(g2DResult);*/
        int[] newx1= new int[16];
        int[] newx2= new int[16];
        int[] newy1= new int[16];
        int[] newy2= new int[16];
        int xv1 = Integer.parseInt(jTextField2.getText());
        int yv1 = Integer.parseInt(jTextField3.getText());
        for(int i=0;i<16;i++)
        {
            newx1[i]=x1[i]+xv1;
            newy1[i]=y1[i]+yv1;
            newx2[i]=x2[i]+xv1;
            newy2[i]=y2[i]+yv1;
        }
        for(int i=0;i<16;i++){
            g2DResult.drawLine(newx1[i],newy1[i],newx2[i],newy2[i]);
        }
        jPanel2.printComponents(g2DResult);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int[] newx1=new int[25];
        int[] newy1=new int[25];
        int[] newx2=new int[25];
        int[] newy2=new int[25];
        if(jCheckBox3.isSelected())
        {
            for(int i=0;i<16;i++)
            {
                newx1[i]=x1[i];
                newy1[i]=-1*y1[i];
                newx2[i]=x2[i];
                newy2[i]=-1*y2[i];
            }
        }
        else if(jCheckBox4.isSelected())
        {
            for(int i=0;i<16;i++)
            {
                newx1[i]=-1*x1[i];
                newy1[i]=y1[i];
                newx2[i]=-1*x2[i];
                newy2[i]=y2[i];
            }
        }
        else if(jCheckBox5.isSelected())
        {
             for(int i=0;i<16;i++)
            {
                newx1[i]=x1[i];
                newy1[i]=y1[i];
                newx2[i]=x2[i];
                newy2[i]=y2[i];
            }
            int temp1,temp2;
            for(int i=0;i<16;i++)
            {
                temp1=newx1[i];
                newx1[i]=newy1[i];
                newy1[i]=temp1;
                temp2=newx2[i];
                newx2[i]=newy2[i];
                newy2[i]=temp2;
            }
        }
        else if(jCheckBox6.isSelected())
        {
             for(int i=0;i<16;i++)
            {
                newx1[i]=-1*x1[i];
                newy1[i]=-1*y1[i];
                newx2[i]=-1*x2[i];
                newy2[i]=-1*y2[i];
            }
            int temp1,temp2;
            for(int i=0;i<24;i++)
            {
                temp1=newx1[i];
                newx1[i]=newy1[i];
                newy1[i]=temp1;
                temp2=newx2[i];
                newx2[i]=newy2[i];
                newy2[i]=temp2;
            }
        }
        
        for(int i=0;i<25;i++){
            g2DResult.drawLine(newx1[i],newy1[i],newx2[i],newy2[i]);
        }
        jPanel2.printComponents(g2DResult);
		
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int[] newx1= new int[16];
        int[] newy1= new int[16];
        int[] newx2= new int[16];
        int[] newy2= new int[16];
        int xv1 = 2;
        int yv1 =2;
        if(jCheckBox1.isSelected() && !jCheckBox2.isSelected())
        {
            for(int i=0;i<16;i++){
             newx1[i]=x1[i]+xv1*y1[i];
             newy1[i]=y1[i];
             newx2[i]=x2[i]+xv1*y2[i];
             newy2[i]=y2[i];
           }
        }
        else if(!jCheckBox1.isSelected() && jCheckBox2.isSelected())
        {
             for(int i=0;i<16;i++){
             newx1[i]=y1[i]+yv1*x1[i];
             newy1[i]=x1[i];
             newx2[i]=y2[i]+yv1*x2[i];
             newy2[i]=x2[i];
           }
        }
        for(int i=0;i<16;i++){
            g2DResult.drawLine(newx1[i],newy1[i],newx2[i],newy2[i]);
        }
        jPanel2.printComponents(g2DResult);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        int[] newx1= new int[16];
        int[] newy1= new int[16];
        int[] newx2= new int[16];
        int[] newy2= new int[16];
        int xv1 = Integer.parseInt(jTextField4.getText());
        int yv1 = Integer.parseInt(jTextField5.getText());
        for(int i=0;i<16;i++)
        {
            newx1[i]=x1[i]*xv1;
            newy1[i]=y1[i]*yv1;
            newx2[i]=x2[i]*xv1;
            newy2[i]=y2[i]*yv1;
        }
        for(int i=0;i<16;i++){
            g2DResult.drawLine(newx1[i],newy1[i],newx2[i],newy2[i]);
        }
        jPanel2.printComponents(g2DResult);
		
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

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
            java.util.logging.Logger.getLogger(Tranformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tranformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tranformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tranformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tranformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
