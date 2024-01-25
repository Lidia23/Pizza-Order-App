package projektii;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
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

public class Porosia extends JFrame {
	/**
     * Krijon një form të re Porosia
     */
    public Porosia() { // konstruktori 
        initComponents();  
    }
                            
    private void initComponents() { // metodë -> janë krijuar të gjitha elemntet që do të mbaj frame-i me specifikat përkatëse si: pozicioni, lloji dhe madhësia e shkrimit, ngjyra, etj
       
    	this.setLocation(411 , 0);
        buttonGroup1 = new ButtonGroup();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jLabel5 = new JLabel();
        jTextField1 = new JTextField();
        jTextField2 = new JTextField();
        jTextField3 = new JTextField();
        jTextField4 = new JTextField();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jButton8 = new JButton();
        jLabel1 = new JLabel();
        add = new JButton();
        jButtonReset = new JButton();
        jButtonCheckout = new JButton();
        small = new JRadioButton();
        medium = new JRadioButton();
        large = new JRadioButton();
        jLabel6 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(255, 204, 0));
        
        jButton1.setEnabled(false);
        jButton2.setEnabled(false);
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton6.setEnabled(false);
        jButton7.setEnabled(false);
        jButton8.setEnabled(false);
        jButtonCheckout.setEnabled(false);
        jButtonReset.setEnabled(false);

        jLabel2.setFont(new Font("Lucida Calligraphy", 1, 12));
        jLabel2.setForeground(new Color(255, 255, 255));
        jLabel2.setText("Kerpudha");

        jLabel3.setFont(new Font("Lucida Calligraphy", 1, 12));
        jLabel3.setForeground(new Color(255, 255, 255));
        jLabel3.setText("Cheese");

        jLabel4.setFont(new Font("Lucida Calligraphy", 1, 12)); 
        jLabel4.setForeground(new Color(255, 255, 255));
        jLabel4.setText("Pepperon");

        jLabel5.setFont(new Font("Lucida Calligraphy", 1, 12));
        jLabel5.setForeground(new Color(255, 255, 255));
        jLabel5.setText("Ullinj");

        jTextField1.setEditable(false);
        jTextField1.setText("0");
        jTextField1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setText("0");

        jTextField3.setEditable(false);
        jTextField3.setText("0");

        jTextField4.setEditable(false);
        jTextField4.setText("0");

        jButton1.setText("-");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("-");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("-");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("-");
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("+");
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("+");
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("+");
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("+");
        jButton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new Font("Lucida Calligraphy", 0, 12)); // NOI18N
        jLabel1.setForeground(new Color(255, 255, 255));
        jLabel1.setText("Zgjidh madhesine e pices: ");

        add.setText("Add");
        add.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jButtonReset.setText("Reset");
        jButtonReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jButtonCheckout.setText("Checkout");
        jButtonCheckout.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButtonCheckoutActionPerformed(evt);
            }
        });

        buttonGroup1.add(small);
        small.setForeground(new Color(255, 255, 255));
        small.setText("Small");
        small.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                smallActionPerformed(evt);
            }
        });

        buttonGroup1.add(medium);
        medium.setForeground(new Color(255, 255, 255));
        medium.setText("Medium");

        buttonGroup1.add(large);
        large.setForeground(new Color(255, 255, 255));
        large.setText("Large");

        jLabel6.setIcon(new ImageIcon("C:\\Users\\Admin\\Desktop\\Java\\pngtree-gourmet-pizza-creative-simple-business-poster-design-picture-image_1112635.jpg")); // NOI18N
        jLabel6.setText("jLabel6");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jButton2)
                .addGap(176, 176, 176)
                .addComponent(small))
            .addGroup(layout.createSequentialGroup()
                .addGap(406, 406, 406)
                .addComponent(medium))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel5, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(add, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel3, GroupLayout.PREFERRED_SIZE, 60, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel4, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(jButton6))
            .addGroup(layout.createSequentialGroup()
                .addGap(406, 406, 406)
                .addComponent(large))
            .addGroup(layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(jButton8))
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jButtonReset, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jButton3))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 69, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 170, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jButton4))
            .addGroup(layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(jButton5))
            .addGroup(layout.createSequentialGroup()
                .addGap(303, 303, 303)
                .addComponent(jButton7))
            .addGroup(layout.createSequentialGroup()
                .addGap(255, 255, 255)
                .addComponent(jButtonCheckout))
            .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 570, GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton2))
                    .addComponent(small))
                .addGap(16, 16, 16)
                .addComponent(medium)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(jTextField4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addComponent(add))
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jLabel3))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel4))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jButton6))
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(large))
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jButton8))
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jTextField3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jButtonReset))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton1))
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jButton3))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jTextField2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addGap(177, 177, 177)
                .addComponent(jButton4))
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jButton5))
            .addGroup(layout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jButton7))
            .addGroup(layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jButtonCheckout))
            .addComponent(jLabel6, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }
                          

    private void jButton1ActionPerformed(ActionEvent evt) { //butoni minus, i cili do te zvogëloj me 1 njësi nr e racioneve të kërpudhës sa herë që shtypet (nuk shkon asnjëherë nën zeros)
        int a;                                              
        a=Integer.parseInt(this.jTextField1.getText());
        if(a<=0){ 
            a=0;
        }
        else{
            a=a-1;
        }
        this.jTextField1.setText(String.format("%d", a));
        pizzaHolder.get(count).ingredient[0]--;
    }                                        

    private void jButton5ActionPerformed(ActionEvent evt) { //butoni plus, i cili do te shtoj me 1 njësi nr e racioneve të kërpudhës sa herë që shtypet
        int a;        
        a=Integer.parseInt(this.jTextField1.getText())+1;
        this.jTextField1.setText(String.format("%d", a));
        pizzaHolder.get(count).ingredient[0]++;
    }                                        

    private void jTextField1ActionPerformed(ActionEvent evt) {}                                           

    private void jButton6ActionPerformed(ActionEvent evt) { //butoni plus, i cili do te shtoj me 1 njësi nr e racioneve të cheese sa herë që shtypet
        int a;
        a=Integer.parseInt(this.jTextField2.getText())+1;
        this.jTextField2.setText(String.format("%d", a));
        pizzaHolder.get(count).ingredient[1]++;
    }                                        

    private void jButton7ActionPerformed(ActionEvent evt) {//butoni plus, i cili do te shtoj me 1 njësi nr e racioneve të pepperoni sa herë që shtypet
        int a;        
        a=Integer.parseInt(this.jTextField3.getText())+1;
        this.jTextField3.setText(String.format("%d", a));
        pizzaHolder.get(count).ingredient[2]++;
    }                                        

    private void jButton8ActionPerformed(ActionEvent evt) { //butoni plus, i cili do te shtoj me 1 njësi nr e racioneve të ullinjve sa herë që shtypet
        int a;
        a=Integer.parseInt(this.jTextField4.getText())+1;
        this.jTextField4.setText(String.format("%d", a));
        pizzaHolder.get(count).ingredient[3]++;
    }                                        

    private void jButton2ActionPerformed(ActionEvent evt) {//butoni minus, i cili do te zvogëloj me 1 njësi nr e racioneve të cheese sa herë që shtypet (nuk shkon asnjëherë nën zeros)
        int a;
        a=Integer.parseInt(this.jTextField2.getText());
        if(a<=0){
            a=0;
        }
        else{
            a=a-1;
        }
        this.jTextField2.setText(String.format("%d", a));
        pizzaHolder.get(count).ingredient[1]--;
    }                                        

    private void jButton3ActionPerformed(ActionEvent evt) {//butoni minus, i cili do te zvogëloj me 1 njësi nr e racioneve të pepperoni sa herë që shtypet (nuk shkon asnjëherë nën zeros)
        int a;
        a=Integer.parseInt(this.jTextField3.getText());
        if(a<=0){
            a=0;
        }
        else{
            a=a-1;
        }
        this.jTextField3.setText(String.format("%d", a));
        pizzaHolder.get(count).ingredient[2]--;
    }                                        

    private void jButton4ActionPerformed(ActionEvent evt) { //butoni minus, i cili do te zvogëloj me 1 njësi nr e racioneve të ullinjve sa herë që shtypet (nuk shkon asnjëherë nën zeros)
        int a;
        a=Integer.parseInt(this.jTextField4.getText());
        if(a<=0){
            a=0;
        }
        else{
            a=a-1;
        }
        this.jTextField4.setText(String.format("%d", a));
        pizzaHolder.get(count).ingredient[3]--;     
    }                                        

    private void addActionPerformed(ActionEvent evt) { //butoni add, shton picën që është përzgjedhur nga Klienti me anë të një dritareje dialoguese dhe përditëson sasinë e secilit përbërës në TextField-et përkatëse. Gjithashtu do të bëj të mundur që gjithë butonat e tjerë "të ndizen"/ të bëhen funksional
      String choice = JOptionPane.showInputDialog(null, "What type of pizza do you want");
      count++;
      pizzaHolder.add(count, new Pica(choice));
      System.out.println("The pizza is added");
      this.jTextField1.setText(pizzaHolder.get(count).getIngridiends(0));
      this.jTextField2.setText(pizzaHolder.get(count).getIngridiends(1));
      this.jTextField3.setText(pizzaHolder.get(count).getIngridiends(2));
      this.jTextField4.setText(pizzaHolder.get(count).getIngridiends(3));
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jButton3.setEnabled(true);
        jButton4.setEnabled(true);
        jButton5.setEnabled(true);
        jButton6.setEnabled(true);
        jButton7.setEnabled(true);
        jButton8.setEnabled(true);
        jButtonCheckout.setEnabled(true);
        jButtonReset.setEnabled(true);
      
    }                                   

    private void jButtonResetActionPerformed(ActionEvent evt) { // butoni që fshin gjithë të dhënat për picën që kemi shtuar
        this.jTextField1.setText(String.format("%d", 0));
        this.jTextField2.setText(String.format("%d",0));
        this.jTextField3.setText(String.format("%d", 0));
        this.jTextField4.setText(String.format("%d", 0));
        pizzaHolder.get(count).resetPizza();
        buttonGroup1.clearSelection();
    }                                            

    private void jButtonCheckoutActionPerformed(ActionEvent evt) { //butoni i cili do të kryej llogaritjen e cmimit të picës dhe do të printoj faturën me anë të një dritareje dialoguese
      if(small.isSelected()==true){
           pizzaHolder.get(count).size = 's';
      }
      if(medium.isSelected()==true){
          pizzaHolder.get(count).size = 'm';
      }
      if(large.isSelected()==true){
          pizzaHolder.get(count).size = 'l';
      }
      double sum = 0;
      for(int i = 0; i < pizzaHolder.size(); i++)
             sum = sum + pizzaHolder.get(i).llogaritShumen();
      System.out.println("Kostoja totale eshte: " + sum);    
      JOptionPane.showMessageDialog(null, "The total is " + sum);  
    }                                               

    private void smallActionPerformed(ActionEvent evt) {}                                     

    /**
     * @param argumentet e linjës komanduese
     */
    public static void Porosi() {
        
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Porosia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Porosia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Porosia.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Porosia.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Krijon dhe shfaqen frame-in */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Porosia().setVisible(true);
            }
            
        });
    }

    // Deklarimi i variablave 
    ArrayList<Pica> pizzaHolder = new ArrayList<>(); 
    int count = -1;
    boolean cond = true;                    
    private JButton add;
    private ButtonGroup buttonGroup1;
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JButton jButtonCheckout;
    private JButton jButtonReset;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JTextField jTextField1;
    private JTextField jTextField2;
    private JTextField jTextField3;
    private JTextField jTextField4;
    private JRadioButton large;
    private JRadioButton medium;
    private JRadioButton small;                 
}
