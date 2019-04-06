
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Graphics2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class NewJFrame extends javax.swing.JFrame {
    
    public int xMin,xMax,yMin,yMax;
    public final int left = 1;
    public final int right = 2;
    public final int bottom = 4;
    public final int top = 8;

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        
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

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setText("xMin");

        jLabel2.setText("xMax");

        jLabel3.setText("yMax");

        jLabel4.setText("yMin");

        jButton1.setText("Clip");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );

        jButton2.setText("Draw");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Reset");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                    .addComponent(jTextField1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addComponent(jButton2)))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jButton1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE)
                                    .addComponent(jTextField4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jButton3))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        clip2D(150,100,100,200);
        clip2D(100,200,200,200);
        clip2D(200,200,150,100);
        clip2D(100,125,200,125);
        clip2D(100,125,150,225);
        clip2D(150,225,200,125);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Graphics g = jPanel1.getGraphics();
       g.drawLine(150,100,100,200);
       g.drawLine(100,200,200,200);
       g.drawLine(200,200,150,100);
       g.drawLine(100,125,200,125);
       g.drawLine(100,125,150,225);
       g.drawLine(150,225,200,125);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jPanel1.removeAll();
        jPanel1.updateUI();
        
    }//GEN-LAST:event_jButton3ActionPerformed
   public int regionCode(int x,int y){
       int regionCode=0;
       //System.out.println("x: "+x+" y:"+y);
       if(x<xMin)
           regionCode = regionCode | left;
       if(x>xMax)
           regionCode = regionCode | right;
       if(y<yMin)
           regionCode = regionCode | bottom;
       if(y>yMax)
           regionCode = regionCode | top;
       
       return regionCode;
   }
   
   public void clip2D(int x1,int y1,int x2,int y2){
        xMin = Integer.parseInt(jTextField1.getText());
        xMax = Integer.parseInt(jTextField3.getText());
        yMin = Integer.parseInt(jTextField2.getText());
        yMax = Integer.parseInt(jTextField4.getText());
       Graphics g = jPanel1.getGraphics();
       Graphics2D gb2 ;
       //g.setColor(Color.red);
       g.drawLine(xMin,yMin,xMax,yMin);
       g.drawLine(xMax,yMin,xMax,yMax);
       g.drawLine(xMax,yMax,xMin,yMax);
       g.drawLine(xMin,yMax,xMin,yMin);
       int xx1 = 0,yy1=0,xx2=0,yy2=0;
       
       int p1,p2;
       p1 = regionCode(x1,y1);
       p2 = regionCode(x2,y2);
       float m = (y2-y1)/(x2-x1);
       System.out.println("OP :"+p1+"  "+p2);
       if(p1 == 0 && p2 == 0)
           {
               g.setColor(Color.red);
               g.drawLine(x1,y1,x2,y2);
               
           }
           else if((p1 & p2) !=0)
           {
               
           }
           else
           {
               if(p1 == 0)
               {
                   float xtemp = 0;
                   float ytemp = 0;
                   float y=y2-y1;
                   float x = x2 - x1;
                   //float m = y/x;
                   System.out.println(" x1:"+x1+" y1:"+y1+" x2:"+x2+" y2:"+y2);
                   
                   if((p2 & top) == top)
                   {
                       
                       ytemp = yMin;
                       float c = y1 - (x1 * m);
                       xtemp = ytemp/m - y1/m + x1;
                                              //xtemp = (ytemp - c)/m;
                   }
                   if((p2 & bottom) == bottom)
                   {
                       ytemp = yMax;
                       System.out.println(ytemp);
                       float c = y1 - (x1 * m);
                           xtemp = ytemp/m - y1/m + x1;
 //                      xtemp = (ytemp - c)/m;
                   }
                   
                   if((p2 & left) == left)
                   {
                       xtemp = xMin;
                       float c = y1 - (x1 * m);
                       ytemp = m * xtemp + c;
                   }
                   if((p2 & right) == right)
                   {
                       xtemp = xMax;
                       float c = y1 - (x1 * m);
                       ytemp = m * xtemp + c;
                   }
                   
                   g.setColor(Color.red);
                   g.drawLine(x1,y1,(int)xtemp,(int)ytemp);
               }
               else if(p2 == 0)
               {
                   float xtemp = 0;
                   float ytemp = 0;
                   float y=y2-y1;
                   float x = x2 - x1;
                   //float m = y/x;
                   if((p1 & top) == top)
                   {
                       ytemp = yMin;
                       float c = y1 - (x1 * m);
                       xtemp = ytemp/m - y1/m + x1;

                   }
                   if((p1 & bottom) == bottom)
                   {
                       ytemp = yMax;
                       float c = y1 - (x1 * m);
                           xtemp = ytemp/m - y1/m + x1;
                       //xtemp = (ytemp - c)/m;
                   }
                   
                   if((p1 & left) == left)
                   {
                       xtemp = xMin;
                       float c = y1 - (x1 * m);
                       ytemp = m * xtemp + c;
                   }
                   if((p1 & right) == right)
                   {
                       xtemp = xMax;
                       float c = y1 - (x1 * m);
                       ytemp = m * xtemp + c;
                   }
                   
                   g.setColor(Color.red);
                   g.drawLine(x2,y2,(int)xtemp,(int)ytemp);
               }
               else
               {
                   float xtemp1 = 0;
                   float ytemp1 = 0;
                   float xtemp2 = 0;
                   float ytemp2 = 0;
                   float y=y2-y1;
                   float x = x2 - x1;
                   //float m = y/x;
                   if(p1 != 0)
                   {
                       
                        if((p1 & top) ==  top)
                       {
                           ytemp1 = yMin;
                           xtemp1 = ytemp1/m - y1/m + x1;
                       }
                        if((p1 & bottom) ==  bottom)
                       {
                           ytemp1 = yMax;
                           //float c = y1 - (x1 * m);
                           xtemp1 = ytemp1/m - y1/m + x1;
                           //xtemp1 = (ytemp1 - c)/m;
                       }
                        
                        
                        if((p1 & right) ==  right)
                       {
                           xtemp1 = xMax;
                           float c = y1 - (x1 * m);
                           ytemp1 = m * xtemp1 + c;
                       }
                        
                        if((p1 & left) ==  left)
                       {
                           System.out.println("in Left");
                           xtemp1 = xMin;
                           float c = y1 - (x1 * m);
                           ytemp1 = m * xtemp1 + c;
                       }
                       
                   }
                   if(p2 != 0)
                   {
                       
                       
                       if((p2 & top) ==  top)
                       {
                           ytemp2 = yMin;
                           float c = y1 - (x1 * m);
                           xtemp2 = ytemp2/m - y1/m + x1;
                           //xtemp2 = (ytemp2 - c)/m;
                       }
                       
                       if((p2 & bottom) ==  bottom)
                       {
                           ytemp2 = yMax;
                           float c = y1 - (x1 * m);
                           //xtemp2 = (ytemp2 - c)/m;
                           xtemp2 = ytemp2/m - y1/m + x1;
                       }
                       
                       if((p2 & right) ==  right)
                       {
                           //xtemp2 = xMax;
                           //float c = y1 - (x1 * m);
                           //ytemp2 = m * xtemp2 + c;
                           
                           xtemp2 = xMax;
                           ytemp2 = y1+(m*(xtemp2-x1));
                       }
                       
                       if((p2 & left) == left)
                       {
                           xtemp2 = xMin;
                           float c = y2 - (x2 * m);
                           ytemp2 = m * xtemp2 + c;
                       }
                   }
                   g.setColor(Color.red);
                   g.drawLine((int)xtemp2,(int)ytemp2,(int)xtemp1,(int)ytemp1);
               }
           }
   }
 //*********************************************************      
       
 /*      if(p1 == p2 && p2 == 0)
       {
           g.setColor(Color.RED);
           g.drawLine(x1,y1,x2,y2);
              
       }
       else if(p1 != 0 && p2 !=0)
       {
           if((p1 & p2)==0)
           {
               
           }
       }
       else
       {
           if((p1 & left)==left)
           {
               xx1 = xMin;
               yy1 = y1+(m*(xx1-x1));
               
           }
           if((p1 & right)==right)
           {
               xx1 = xMax;
               yy1 = y1+(m*(xx1-x1));
           }
           if((p1 & bottom)==bottom)
           {
               yy1 = yMax;
               xx1 = x1+((yy1-y1)/m);
               
           }
           if((p1 & top)==top)
           {
               yy1 = yMin;
               xx1 = x1+((yy1-y1)/m);
           }
           
           
           if((p2 & left)==left)
           {
               xx2 = xMin;
               yy2 = y2+(m*(xx2-x2));
               
           }
           if((p2 & right)==right)
           {
               xx2 = xMax;
               yy2 = y2+(m*(xx2-x2));
           }
           if((p2 & bottom)==bottom)
           {
               yy2 = yMax;
               xx2 = x2+((yy2-y2)/m);
           }
           if((p2 & top)==top)
           {
               yy2 = yMin;
               xx2 = x2+((yy2-y2)/m);
           }
        }
         g.setColor(Color.RED);
         g.drawLine(xx1,yy1,xx2,yy2);
   }*/
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
