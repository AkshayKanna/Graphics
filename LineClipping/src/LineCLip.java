
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siva
 */
public class LineCLip extends javax.swing.JFrame {

    /**
     * Creates new form LineCLip
     */
    public LineCLip() {
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

        jPanel1 = new javax.swing.JPanel();
        crtHexagonBtn = new javax.swing.JButton();
        clipwindowLbl = new javax.swing.JLabel();
        xminLbl = new javax.swing.JLabel();
        xmaxLbl = new javax.swing.JLabel();
        yminLbl = new javax.swing.JLabel();
        ymaxLbl = new javax.swing.JLabel();
        xmaxTxt = new javax.swing.JTextField();
        ymaxTxt = new javax.swing.JTextField();
        xminTxt = new javax.swing.JTextField();
        yminTxt = new javax.swing.JTextField();
        clipWIndowBtn = new javax.swing.JButton();
        clipBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 198, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 181, Short.MAX_VALUE)
        );

        crtHexagonBtn.setText("Create Hexagon");
        crtHexagonBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crtHexagonBtnMouseClicked(evt);
            }
        });

        clipwindowLbl.setText("Clipping Window");

        xminLbl.setText("xmin");

        xmaxLbl.setText("xmax");

        yminLbl.setText("ymin");

        ymaxLbl.setText("ymax");

        clipWIndowBtn.setText("Draw clipping window");
        clipWIndowBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clipWIndowBtnMouseClicked(evt);
            }
        });

        clipBtn.setText("Clip");
        clipBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clipBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(clipwindowLbl)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(yminLbl)
                                        .addGap(35, 35, 35)
                                        .addComponent(yminTxt))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(xminLbl)
                                        .addGap(35, 35, 35)
                                        .addComponent(xminTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(67, 67, 67)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(xmaxLbl)
                                    .addComponent(ymaxLbl))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(xmaxTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                                    .addComponent(ymaxTxt)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(crtHexagonBtn)
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(clipWIndowBtn)
                                .addGap(42, 42, 42)
                                .addComponent(clipBtn))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(clipwindowLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(xminLbl)
                    .addComponent(xmaxLbl)
                    .addComponent(xmaxTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(xminTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yminLbl)
                    .addComponent(ymaxLbl)
                    .addComponent(ymaxTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yminTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clipWIndowBtn)
                            .addComponent(clipBtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(crtHexagonBtn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crtHexagonBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crtHexagonBtnMouseClicked
        // TODO add your handling code here
         Polygon hexagon = new Polygon();
        x=50;
        y=50;
        h=50;
        double a;
        for (int i=0; i < 7; i++)
        {
           a = Math.PI / 3.0 * i;
           hexagon.addPoint((int)(Math.round(x + Math.sin(a) * h)), (int)(Math.round(y + Math.cos(a) * h)));
        }
        g = jPanel1.getGraphics();
        g2 = (Graphics2D)g;
        g.translate(0, 181);
        g2.scale(1,-1);
        g.drawPolygon(hexagon);
    }//GEN-LAST:event_crtHexagonBtnMouseClicked

    private void clipWIndowBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clipWIndowBtnMouseClicked
        // TODO add your handling code here:
        g = jPanel1.getGraphics();
        g2 = (Graphics2D)g;
        g.translate(0, 181);
        g2.scale(1,-1);
        //g.drawRect(10, 10, 30, 30);
        xmin = Integer.parseInt(xminTxt.getText());
        ymin = Integer.parseInt(yminTxt.getText());
        xmax = Integer.parseInt(xmaxTxt.getText());
        ymax = Integer.parseInt(ymaxTxt.getText());
        
        g.drawLine(xmin,ymin,xmin,ymax);
        g.drawLine(xmin,ymin,xmax,ymin);
        g.drawLine(xmax,ymin,xmax,ymax);
        g.drawLine(xmin,ymax,xmax,ymax);
        
        
    }//GEN-LAST:event_clipWIndowBtnMouseClicked

    private void clipBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clipBtnMouseClicked
        // TODO add your handling code here:
        x=50;
        y=50;
        h=50;
        double a;
        double b;
        int x1cord;
        int y1cord;
        int x2cord;
        int y2cord;
        int p1regcode;
        int p2regcode;
        for (int i=0; i < 6; i++)
        {
           a = Math.PI / 3.0 * i;
           x1cord = (int)(Math.round(x + Math.sin(a) * h));
           y1cord = (int)(Math.round(y + Math.cos(a) * h));
           b = Math.PI / 3.0 * ((i+1)%6);
           x2cord = (int)(Math.round(x + Math.sin(b) * h));
           y2cord = (int)(Math.round(y + Math.cos(b) * h));
           calculate(x1cord,y1cord,x2cord,y2cord);
        }
    }//GEN-LAST:event_clipBtnMouseClicked
    private void calculate(int x1cord,int y1cord,int x2cord,int y2cord)
    {
        int p1regcode,p2regcode;
        p1regcode = calculateRegionCode(x1cord,y1cord,xmin,xmax,ymin,ymax);
           p2regcode = calculateRegionCode(x2cord,y2cord,xmin,xmax,ymin,ymax);
           if(p1regcode == 0 && p2regcode == 0)
           {
               g.setColor(Color.red);
               g.drawLine(x1cord,y1cord,x2cord,y2cord);
               return;
               
           }
           else if((p1regcode & p2regcode) !=0)
           {
               return;
           }
           else
           {
               if(p1regcode == 0)
               {
                   float xtemp = 0;
                   float ytemp = 0;
                   float y=y2cord-y1cord;
                   float x = x2cord - x1cord;
                   float m = y/x;
                   if((p2regcode & top) == top)
                   {
                       
                       ytemp = ymax;
                       //float c = y1cord - (x1cord * m);
                       xtemp = ytemp/m - (y1cord/m - x1cord );
                   }
                   if((p2regcode & bottom) == bottom)
                   {
                       ytemp = ymin;
                       System.out.println(ytemp);
                       //float c = y1cord - (x1cord * m);
                       xtemp = ytemp/m - (y1cord/m - x1cord );
                   }
                   if((p2regcode & left) == left)
                   {
                       xtemp = xmin;
                       float c = y1cord - (x1cord * m);
                       ytemp = m * xtemp + c;
                   }
                   if((p2regcode & right) == right)
                   {
                       xtemp = xmax;
                       float c = y1cord - (x1cord * m);
                       ytemp = m * xtemp + c;
                   }
                   
                   g.setColor(Color.red);
                   g.drawLine(x1cord,y1cord,(int)xtemp,(int)ytemp);
               }
               else if(p2regcode == 0)
               {
                   float xtemp = 0;
                   float ytemp = 0;
                   float y=y2cord-y1cord;
                   float x = x2cord - x1cord;
                   float m = y/x;
                   if((p1regcode & top) == top)
                   {
                       ytemp = ymax;
                       //float c = y1cord - (x1cord * m);
                       xtemp = ytemp/m - (y1cord/m - x1cord );
                   }
                   if((p1regcode & bottom) == bottom)
                   {
                       ytemp = ymin;
                       float c = y1cord - (x1cord * m);
                       xtemp = ytemp/m - (y1cord/m - x1cord );
                   }
                   if((p1regcode & left) == left)
                   {
                       xtemp = xmin;
                       float c = y1cord - (x1cord * m);
                       ytemp = m * xtemp + c;
                   }
                   if((p1regcode & right) == right)
                   {
                       xtemp = xmax;
                       float c = y1cord - (x1cord * m);
                       ytemp = m * xtemp + c;
                   }
                  
                   g.setColor(Color.red);
                   g.drawLine(x2cord,y2cord,(int)xtemp,(int)ytemp);
               }
               else
               {
                   float xtemp1 = 0;
                   float ytemp1 = 0;
                   float y=y2cord-y1cord;
                   float x = x2cord - x1cord;
                   float m = y/x;
                   if(p1regcode != 0)
                   {
                       if((p1regcode & bottom) ==  bottom)
                       {
                           ytemp1 = ymin;
                           //float c = y1cord - (x1cord * m);
                           xtemp1 = ytemp1/m - (y1cord/m - x1cord );
                       }
                       if((p1regcode & top) ==  top)
                       {
                           ytemp1 = ymax;
                           //float c = y1cord - (x1cord * m);
                            xtemp1 = ytemp1/m - (y1cord/m - x1cord );
                       }
                       if((p1regcode & left) ==  left)
                       {
                           xtemp1 = xmin;
                           float c = y1cord - (x1cord * m);
                           ytemp1 = m * xtemp1 + c;
                       }
                       if((p1regcode & right) ==  right)
                       {
                           xtemp1 = xmax;
                           float c = y1cord - (x1cord * m);
                           ytemp1 = m * xtemp1 + c;
                       }
                       
                   }
                   calculate((int)xtemp1,(int)ytemp1,x2cord,y2cord);
               }
           }
    }
    private int calculateRegionCode(int x,int y,int xmin,int xmax,int ymin,int ymax)
    {
        int regioncode = 0;
        if(x < xmin)
            regioncode = regioncode | left;
        if(x > xmax)
            regioncode = regioncode | right;
        if(y < ymin)
            regioncode = regioncode | bottom;
        if(y > ymax)
            regioncode = regioncode | top;
        System.out.println("reg: "+regioncode);
        return regioncode;
    }
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
            java.util.logging.Logger.getLogger(LineCLip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LineCLip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LineCLip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LineCLip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LineCLip().setVisible(true);
                
            }
        });
    }
    private int xmin;
    private int xmax;
    private int ymin;
    private int ymax;
    private int x;
    private int y;
    private int h;
    private int left = 1;
    private int right = 2;
    private int top = 8;
    private int bottom = 4;
    private Graphics g;
    private Graphics2D g2;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton clipBtn;
    private javax.swing.JButton clipWIndowBtn;
    private javax.swing.JLabel clipwindowLbl;
    private javax.swing.JButton crtHexagonBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel xmaxLbl;
    private javax.swing.JTextField xmaxTxt;
    private javax.swing.JLabel xminLbl;
    private javax.swing.JTextField xminTxt;
    private javax.swing.JLabel ymaxLbl;
    private javax.swing.JTextField ymaxTxt;
    private javax.swing.JLabel yminLbl;
    private javax.swing.JTextField yminTxt;
    // End of variables declaration//GEN-END:variables
}