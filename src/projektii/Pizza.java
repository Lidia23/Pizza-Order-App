package projektii;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.WindowConstants;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import javax.swing.UIManager;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.SwingConstants;
import java.awt.Dimension;

public class Pizza extends  JFrame {

	/**
     * Krijon një form të re Porosia
     */
    public Pizza() {  // konstruktori
        initComponents();
    }

                           
    private void initComponents() {// metodë -> janë krijuar të gjitha elemntet që do të mbaj frame-i me specifikat përkatëse si: pozicioni, lloji dhe madhësia e shkrimit, ngjyra, etj

        jLabel1 = new  JLabel();
        jLabel2 = new  JLabel();
        jLabel3 = new  JLabel();
        jLabel4 = new  JLabel();
        jLabel5 = new  JLabel();
        jLabel6 = new  JLabel();
        jLabel7 = new  JLabel();
        jLabel8 = new  JLabel();
        jLabel9 = new  JLabel();
        jLabel10 = new  JLabel();
        jLabel11 = new  JLabel();
        jLabel12 = new  JLabel();
        jLabel13 = new  JLabel();
        jLabel14 = new  JLabel();
        jLabel15 = new  JLabel();
        jLabel16 = new  JLabel();
        jLabel17 = new  JLabel();
        jLabel18 = new  JLabel();
        jLabel19 = new  JLabel();
        jLabel20 = new  JLabel();
        jButtonNext = new  JToggleButton();
        jLabel22 = new  JLabel();
        jLabel23 = new  JLabel();
        jLabel24 = new  JLabel();
        jLabel25 = new  JLabel();
        jLabel26 = new  JLabel();
        jLabel27 = new  JLabel();
        jLabel28 = new  JLabel();
        jLabel21 = new  JLabel();
        jLabel29 = new  JLabel();

        setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE);
        setBackground(new  Color(255, 153, 0));
        setForeground(new  Color(255, 153, 0));

        jLabel1.setFont(new  Font("Brush Script MT", 0, 40)); // NOI18N
        jLabel1.setForeground(new  Color(138, 200, 107));
        jLabel1.setHorizontalAlignment( SwingConstants.CENTER);
        jLabel1.setText("Menu");
        jLabel1.setMaximumSize(new  Dimension(60, 16));

        jLabel2.setFont(new  Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel2.setForeground(new  Color(255, 255, 255));
        jLabel2.setText("Kerpudha");

        jLabel3.setFont(new  Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel3.setForeground(new  Color(255, 255, 255));
        jLabel3.setText("Cheese");

        jLabel4.setFont(new  Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel4.setForeground(new  Color(255, 255, 255));
        jLabel4.setText("Pepperon");

        jLabel5.setFont(new  Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel5.setForeground(new  Color(255, 255, 255));
        jLabel5.setText("Ullinj");

        jLabel6.setFont(new  Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel6.setForeground(new  Color(255, 51, 51));
        jLabel6.setText("Small");

        jLabel7.setFont(new  Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel7.setForeground(new  Color(255, 51, 51));
        jLabel7.setText("Medium");

        jLabel8.setFont(new  Font("Lucida Calligraphy", 1, 14)); // NOI18N
        jLabel8.setForeground(new  Color(255, 51, 51));
        jLabel8.setText("Large");

        jLabel9.setFont(new  Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setForeground(new  Color(255, 255, 255));
        jLabel9.setText("10");

        jLabel10.setFont(new  Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setForeground(new  Color(255, 255, 255));
        jLabel10.setText("20");

        jLabel11.setFont(new  Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setForeground(new  Color(255, 255, 255));
        jLabel11.setText("30");

        jLabel12.setFont(new  Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setForeground(new  Color(255, 255, 255));
        jLabel12.setText("40");

        jLabel13.setFont(new  Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setForeground(new  Color(255, 255, 255));
        jLabel13.setText("100");

        jLabel14.setFont(new  Font("Times New Roman", 1, 12)); // NOI18N
        jLabel14.setForeground(new  Color(255, 255, 255));
        jLabel14.setText("200");

        jLabel15.setFont(new  Font("Times New Roman", 1, 12)); // NOI18N
        jLabel15.setForeground(new  Color(255, 255, 255));
        jLabel15.setText("300");

        jLabel16.setFont(new  Font("Times New Roman", 1, 12)); // NOI18N
        jLabel16.setForeground(new  Color(255, 255, 255));
        jLabel16.setText("400");

        jLabel17.setFont(new  Font("Times New Roman", 1, 12)); // NOI18N
        jLabel17.setForeground(new  Color(255, 255, 255));
        jLabel17.setText("1000");

        jLabel18.setFont(new  Font("Times New Roman", 1, 12)); // NOI18N
        jLabel18.setForeground(new  Color(255, 255, 255));
        jLabel18.setText("2000");

        jLabel19.setFont(new  Font("Times New Roman", 1, 12)); // NOI18N
        jLabel19.setForeground(new  Color(255, 255, 255));
        jLabel19.setText("3000");

        jLabel20.setFont(new  Font("Times New Roman", 1, 12)); // NOI18N
        jLabel20.setForeground(new  Color(255, 255, 255));
        jLabel20.setText("4000");

        jButtonNext.setBackground(new  Color(237, 155, 54));
        jButtonNext.setFont(new  Font("Times New Roman", 3, 12)); // NOI18N
        jButtonNext.setText("Vazhdo");
        jButtonNext.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        jLabel22.setFont(new  Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel22.setForeground(new  Color(255, 255, 255));
        jLabel22.setText("My pizza");

        jLabel23.setFont(new  Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel23.setForeground(new  Color(255, 255, 255));
        jLabel23.setText("Normal");

        jLabel24.setFont(new  Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel24.setForeground(new  Color(255, 255, 255));
        jLabel24.setText("Olive pizza");

        jLabel25.setFont(new  Font("Lucida Calligraphy", 1, 12)); // NOI18N
        jLabel25.setForeground(new  Color(255, 255, 255));
        jLabel25.setText("Bulku");

        jLabel26.setFont(new  Font("Times New Roman", 1, 12)); // NOI18N
        jLabel26.setForeground(new  Color(255, 255, 255));
        jLabel26.setText("Zgjidhini ju përbërisit");

        jLabel27.setFont(new  Font("Times New Roman", 1, 12)); // NOI18N
        jLabel27.setForeground(new  Color(255, 255, 255));
        jLabel27.setText("Kërpudh dhe cheese");

        jLabel28.setFont(new  Font("Times New Roman", 1, 12)); // NOI18N
        jLabel28.setForeground(new  Color(255, 255, 255));
        jLabel28.setText("Kërpudhë, Cheese dhe Pepperon");

        jLabel21.setForeground(new  Color(255, 255, 255));
        jLabel21.setIcon(new  ImageIcon("C:\\Users\\Admin\\Desktop\\Java\\Untitled-1.jpg")); // NOI18N
        jLabel21.setText("jLabel21");

        jLabel29.setBackground(new  Color(0, 0, 0));
        jLabel29.setFont(new  Font("Times New Roman", 1, 12)); // NOI18N
        jLabel29.setForeground(new  Color(255, 255, 255));
        jLabel29.setText("Kërpudhë, Chesse, Pepperon, Ullinj");

         GroupLayout layout = new  GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel29))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel24))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel22))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel7,  GroupLayout.PREFERRED_SIZE, 80,  GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel14,  GroupLayout.PREFERRED_SIZE, 43,  GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel27))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel10,  GroupLayout.PREFERRED_SIZE, 43,  GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel12,  GroupLayout.PREFERRED_SIZE, 43,  GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(jLabel6,  GroupLayout.PREFERRED_SIZE, 60,  GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel13,  GroupLayout.PREFERRED_SIZE, 43,  GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4,  GroupLayout.PREFERRED_SIZE, 69,  GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel9,  GroupLayout.PREFERRED_SIZE, 37,  GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel23))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel17,  GroupLayout.PREFERRED_SIZE, 43,  GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel26,  GroupLayout.PREFERRED_SIZE, 140,  GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jButtonNext,  GroupLayout.PREFERRED_SIZE, 80,  GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(jLabel8,  GroupLayout.PREFERRED_SIZE, 60,  GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel11,  GroupLayout.PREFERRED_SIZE, 43,  GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel20,  GroupLayout.PREFERRED_SIZE, 43,  GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel25))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel18,  GroupLayout.PREFERRED_SIZE, 43,  GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel15,  GroupLayout.PREFERRED_SIZE, 43,  GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel16,  GroupLayout.PREFERRED_SIZE, 43,  GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel28))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel19,  GroupLayout.PREFERRED_SIZE, 43,  GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5,  GroupLayout.PREFERRED_SIZE, 48,  GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3,  GroupLayout.PREFERRED_SIZE, 60,  GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel21,  GroupLayout.PREFERRED_SIZE, 410,  GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1,  GroupLayout.PREFERRED_SIZE, 169,  GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup( GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel29))
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel24))
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel22))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel7))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel14))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel27))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel10))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel12))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel6))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel13))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel4))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel9))
            .addGroup(layout.createSequentialGroup()
                .addGap(260, 260, 260)
                .addComponent(jLabel23))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel17))
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel26))
            .addGroup(layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jButtonNext))
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel8))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel11))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel20))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel25))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel18))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel15))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel16))
            .addGroup(layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel28))
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(jLabel19))
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel5))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(jLabel3))
            .addComponent(jLabel21,  GroupLayout.PREFERRED_SIZE, 600,  GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1,  GroupLayout.PREFERRED_SIZE, 30,  GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }
    
    private void jButtonNextActionPerformed( ActionEvent evt) {// butoni i cili kur të shtypet do të hapi ngjitur me frame-in Pizza, frame-in Porosia 
        
        Porosia check = new Porosia();
        check.setVisible(true);
        
    }                                           

    /**
     * @param args argumentet e linjës komanduese
     */

    public static void main(String args[]) {
      
        try {
            for ( UIManager.LookAndFeelInfo info :  UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                     UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
             Logger.getLogger(Pizza.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
             Logger.getLogger(Pizza.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
             Logger.getLogger(Pizza.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
             Logger.getLogger(Pizza.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Krijon dhe shfaqen frame-in */
         EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pizza().setVisible(true);
                
            }
        });
    }
    
    
    

 // Deklarimi i variablave                                        
    private  JToggleButton jButtonNext;
    private  JLabel jLabel1;
    private  JLabel jLabel10;
    private  JLabel jLabel11;
    private  JLabel jLabel12;
    private  JLabel jLabel13;
    private  JLabel jLabel14;
    private  JLabel jLabel15;
    private  JLabel jLabel16;
    private  JLabel jLabel17;
    private  JLabel jLabel18;
    private  JLabel jLabel19;
    private  JLabel jLabel2;
    private  JLabel jLabel20;
    private  JLabel jLabel21;
    private  JLabel jLabel22;
    private  JLabel jLabel23;
    private  JLabel jLabel24;
    private  JLabel jLabel25;
    private  JLabel jLabel26;
    private  JLabel jLabel27;
    private  JLabel jLabel28;
    private  JLabel jLabel29;
    private  JLabel jLabel3;
    private  JLabel jLabel4;
    private  JLabel jLabel5;
    private  JLabel jLabel6;
    private  JLabel jLabel7;
    private  JLabel jLabel8;
    private  JLabel jLabel9;                  
}
