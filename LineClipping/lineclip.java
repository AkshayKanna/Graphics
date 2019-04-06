**************
Name: Sivaanandh M
Roll : 15bcs120
Ex: 2
*************
public class LineCLip extends javax.swing.JFrame {

    /**
     * Creates new form LineCLip
     */
    public LineCLip() {
        initComponents();
    }

    private void crtHexagonBtnMouseClicked(java.awt.event.MouseEvent evt) {                                           
        // TODO add your handling code here
         Polygon hexagon = new Polygon();
        x=50;
        y=50;
        h=50;
        double a;
        for (int i=0; i < 7; i++)
        {
            a = Math.PI / 3.0 * i;
           hexagon.addPoint((int)(Math.round(x + Math.sin(a) * h)), (int)(Math.
           round(y + Math.cos(a) * h)));
        }
        g = jPanel1.getGraphics();
        g2 = (Graphics2D)g;
        g.translate(0, 181);
        g2.scale(1,-1);
        g.drawPolygon(hexagon);
    }                                          

    private void clipWIndowBtnMouseClicked(java.awt.event.MouseEvent evt) {                                           
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
        
        
    }                                          

    private void clipBtnMouseClicked(java.awt.event.MouseEvent evt) {                                     
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
    }                                    
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
    private int calculateRegionCode(int x,int y,int xmin,int xmax,int ymin,int 
    ymax)
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
    // Variables declaration - do not modify                     
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
    // End of variables declaration                   
}
