/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import static java.lang.Character.getNumericValue;
import java.text.AttributedCharacterIterator;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaapplication12.MyThread.süreler;
import static javaapplication12.MyThread.süreler2;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author Lenovo
 */
public class NewJFrame extends javax.swing.JFrame {

    public static int[][] model1 = new int[9][9];
    public static int[][] model12 = new int[9][9];

    public static int[][] model2 = new int[9][9];
    public static int[][] model22 = new int[9][9];
    public static int[][] model3 = new int[9][9];
    public static int[][] model32 = new int[9][9];
    public static int[][] model4 = new int[9][9];
    public static int[][] model5 = new int[9][9];
    public static int[][] model42 = new int[9][9];
    public static int[][] model52 = new int[9][9];
    public static int[][] matris1 = new int[9][9];
    public static int[][] matris2 = new int[9][9];
    public static int[][] matris3 = new int[9][9];
    public static int[][] matris4 = new int[9][9];
    public static int[][] matris5 = new int[9][9];

    public static JTextField[][] cells1 = new JTextField[model1.length][model1.length];
    public static JTextField[][] cells12 = new JTextField[model1.length][model1.length];
    public static JTextField[][] cells2 = new JTextField[model2.length][model2.length];
    public static JTextField[][] cells3 = new JTextField[model2.length][model2.length];
    public static JTextField[][] cells4 = new JTextField[model1.length][model1.length];
    public static JTextField[][] cells5 = new JTextField[model1.length][model1.length];
    public static JTextField[][] cells22 = new JTextField[model2.length][model2.length];
    public static JTextField[][] cells32 = new JTextField[model2.length][model2.length];
    public static JTextField[][] cells42 = new JTextField[model1.length][model1.length];
    public static JTextField[][] cells52 = new JTextField[model1.length][model1.length];
    public static int a, b, c, d, e, f, g, h, i, j;
    public static long startTime = System.nanoTime();
    public static long startTime1 = System.nanoTime();
    public static long startTime2 = System.nanoTime();
    public static long startTime3 = System.nanoTime();
    public static long startTime4 = System.nanoTime();
    public static long startTime5 = System.nanoTime();

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

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(102, 102, 255));
        setForeground(new java.awt.Color(102, 102, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel1.setLayout(new java.awt.GridLayout(9, 9));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 200));

        jPanel5.setBackground(new java.awt.Color(153, 255, 255));
        jPanel5.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel5.setLayout(new java.awt.GridLayout(9, 9));
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 210, 190));

        jPanel4.setBackground(new java.awt.Color(255, 204, 204));
        jPanel4.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel4.setLayout(new java.awt.GridLayout(9, 9));
        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 200, 190));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel3.setLayout(new java.awt.GridLayout(9, 9));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 200, 190));

        jPanel2.setBackground(new java.awt.Color(204, 153, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(200, 200));
        jPanel2.setLayout(new java.awt.GridLayout(9, 9));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 210, 200));

        jButton1.setBackground(new java.awt.Color(153, 255, 204));
        jButton1.setText("TEK BAŞLANGIÇ NOKTASI");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 180, 50));

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setText("İKİ BAŞLANGIÇ NOKTASI");
        jButton2.setBorder(new javax.swing.border.MatteBorder(null));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, 180, 50));

        jButton4.setText("GRAFİK GÖSTER");
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 460, 150, 50));

        jLabel1.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 157, 124));
        jLabel1.setText("      SUDOKU");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 200, 110));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws FileNotFoundException, IOException, InterruptedException {

        Reader reader = new FileReader("sudoku.txt");
        BufferedReader br = new BufferedReader(reader);
        String st;

        int a = 0;
        int j;

        for (j = 0; j < 9; j++) {
            st = br.readLine();
            st = replaceString(st);
            for (int i = 0; i < 9; i++) {
                a = getNumericValue(st.charAt(i));
                model1[j][i] = a;
                model12[j][i] = a;
                matris1[j][i] = a;
            }
        }

        br.close();
        reader.close();
        Reader reader2 = new FileReader("sudoku.txt");
        BufferedReader br2 = new BufferedReader(reader2);
        String st2;

        for (j = 0; j < 6; j++) {
            st2 = br2.readLine();
            st2 = replaceString(st2);
            for (int i = 9; i < 18; i++) {
                a = getNumericValue(st2.charAt(i));
                model2[j][i - 9] = a;
                model22[j][i - 9] = a;
                matris2[j][i - 9] = a;
            }
        }
        for (j = 6; j < 9; j++) {
            st2 = br2.readLine();
            st2 = replaceString(st2);
            for (int i = 12; i < 21; i++) {
                a = getNumericValue(st2.charAt(i));
                model2[j][i - 12] = a;
                model22[j][i - 12] = a;
                matris2[j][i - 12] = a;
            }
        }

        br2.close();
        reader2.close();
        Reader reader3 = new FileReader("sudoku.txt");
        BufferedReader br3 = new BufferedReader(reader3);
        String st3;

        st3 = br3.readLine();
        st3 = br3.readLine();
        st3 = br3.readLine();
        st3 = br3.readLine();
        st3 = br3.readLine();
        st3 = br3.readLine();

        for (j = 6; j < 9; j++) {
            st3 = br3.readLine();
            st3 = replaceString(st3);
            for (int i = 6; i < 15; i++) {
                a = getNumericValue(st3.charAt(i));
                model3[j - 6][i - 6] = a;
                model32[j - 6][i - 6] = a;
                matris3[j - 6][i - 6] = a;
            }
        }
        for (j = 9; j < 12; j++) {
            st3 = br3.readLine();
            st3 = replaceString(st3);
            for (int i = 0; i < 9; i++) {
                a = getNumericValue(st3.charAt(i));
                model3[j - 6][i] = a;
                model32[j - 6][i] = a;
                matris3[j - 6][i] = a;
            }
        }
        for (j = 12; j < 15; j++) {
            st3 = br3.readLine();
            st3 = replaceString(st3);
            for (int i = 6; i < 15; i++) {
                a = getNumericValue(st3.charAt(i));
                model3[j - 6][i - 6] = a;
                model32[j - 6][i - 6] = a;
                matris3[j - 6][i - 6] = a;
            }
        }

        br3.close();
        reader3.close();
        Reader reader4 = new FileReader("sudoku.txt");
        BufferedReader br4 = new BufferedReader(reader4);
        String st4;

        st4 = br4.readLine();
        st4 = br4.readLine();
        st4 = br4.readLine();
        st4 = br4.readLine();
        st4 = br4.readLine();
        st4 = br4.readLine();
        st4 = br4.readLine();
        st4 = br4.readLine();
        st4 = br4.readLine();
        st4 = br4.readLine();
        st4 = br4.readLine();
        st4 = br4.readLine();
        for (j = 0; j < 3; j++) {
            st4 = br4.readLine();
            st4 = replaceString(st4);
            for (int i = 0; i < 9; i++) {
                a = getNumericValue(st4.charAt(i));
                model4[j][i] = a;
                model42[j][i] = a;
                matris4[j][i] = a;
            }
        }
        for (j = 3; j < 9; j++) {
            st4 = br4.readLine();
            st4 = replaceString(st4);
            for (int i = 0; i < 9; i++) {
                a = getNumericValue(st4.charAt(i));
                model4[j][i] = a;
                model42[j][i] = a;
                matris4[j][i] = a;
            }
        }

        br4.close();
        reader4.close();
        Reader reader5 = new FileReader("sudoku.txt");
        BufferedReader br5 = new BufferedReader(reader5);
        String st5;

        st5 = br5.readLine();
        st5 = br5.readLine();
        st5 = br5.readLine();
        st5 = br5.readLine();
        st5 = br5.readLine();
        st5 = br5.readLine();
        st5 = br5.readLine();
        st5 = br5.readLine();
        st5 = br5.readLine();
        st5 = br5.readLine();
        st5 = br5.readLine();
        st5 = br5.readLine();
        for (j = 0; j < 3; j++) {
            st5 = br5.readLine();
            st5 = replaceString(st5);
            for (int i = 12; i < 21; i++) {
                a = getNumericValue(st5.charAt(i));
                model5[j][i - 12] = a;
                matris5[j][i - 12] = a;
                model52[j][i - 12] = a;
            }
        }
        for (j = 3; j < 9; j++) {
            st5 = br5.readLine();
            st5 = replaceString(st5);
            for (int i = 9; i < 18; i++) {
                a = getNumericValue(st5.charAt(i));
                model5[j][i - 9] = a;
                model5[j][i - 9] = a;
                model52[j][i - 9] = a;
            }
        }

        br5.close();
        reader5.close();
        draw(model1, cells1, jPanel1);
        draw(model2, cells2, jPanel2);
        draw(model3, cells3, jPanel3);
        draw(model4, cells4, jPanel4);
        draw(model5, cells5, jPanel5);
        String ileri = "ileri";
        String geri = "geri";

        MyThread m1 = new MyThread(model1, 0, 0, ileri);
        Thread t1 = new Thread(m1);
        MyThread m11 = new MyThread(model12, 0, 0, ileri);
        Thread t11 = new Thread(m11);

        MyThread m12 = new MyThread(model12, 8, 8, geri);
        Thread t12 = new Thread(m12);

        MyThread m2 = new MyThread(model2, 0, 0, ileri);
        Thread t2 = new Thread(m2);
        MyThread m21 = new MyThread(model22, 0, 0, ileri);
        Thread t21 = new Thread(m21);

        MyThread m22 = new MyThread(model22, 8, 8, geri);
        Thread t22 = new Thread(m22);

        MyThread m3 = new MyThread(model3, 0, 0, ileri);
        Thread t3 = new Thread(m3);
        MyThread m31 = new MyThread(model32, 0, 0, ileri);
        Thread t31 = new Thread(m31);

        MyThread m32 = new MyThread(model32, 8, 8, geri);
        Thread t32 = new Thread(m32);

        MyThread m4 = new MyThread(model4, 0, 0, ileri);
        Thread t4 = new Thread(m4);
        MyThread m41 = new MyThread(model42, 0, 0, ileri);
        Thread t41 = new Thread(m41);

        MyThread m42 = new MyThread(model42, 8, 8, geri);
        Thread t42 = new Thread(m42);

        MyThread m5 = new MyThread(model5, 0, 0, ileri);
        Thread t5 = new Thread(m5);
        MyThread m51 = new MyThread(model52, 0, 0, ileri);
        Thread t51 = new Thread(m51);

        MyThread m52 = new MyThread(model52, 8, 8, geri);
        Thread t52 = new Thread(m52);

        jButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.start();
                t2.start();
                t3.start();
                t4.start();
                t5.start();
            }

        });
        jButton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                t31.start();
                t41.start();
                t51.start();
                t12.start();
                t22.start();
                t32.start();
                t42.start();
                t52.start();
                t11.start();
                t21.start();
            }

        });
        jButton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int counter1 = 0;
                int counter2 = 0;
                int counter3 = 0;
                int counter4 = 0;
                int counter5 = 0;

                for (int i = 0; i < matris1.length; i++) {
                    for (int k = 0; k < matris1.length; k++) {
                        if (matris1[i][k] == 0) {
                            counter1++;
                        }
                    }
                }
                for (int i = 0; i < matris2.length; i++) {
                    for (int k = 0; k < matris2.length; k++) {
                        if (matris2[i][k] == 0) {
                            counter2++;
                        }
                    }
                }
                for (int i = 0; i < matris3.length; i++) {
                    for (int k = 0; k < matris3.length; k++) {
                        if (matris3[i][k] == 0) {
                            counter3++;
                        }
                    }
                }
                for (int i = 0; i < matris4.length; i++) {
                    for (int k = 0; k < matris4.length; k++) {
                        if (matris4[i][k] == 0) {
                            counter4++;
                        }
                    }
                }
                for (int i = 0; i < matris5.length; i++) {
                    for (int k = 0; k < matris5.length; k++) {
                        if (matris5[i][k] == 0) {
                            counter5++;
                        }
                    }
                }
                System.out.println("c1=" + counter1 + "c2=" + counter3 + "c3=" + counter3 + "c4=" + counter4 + "c5=" + counter5);
                Arrays.sort(süreler);
                Arrays.sort(süreler2);
                int i = süreler[0];
                int i2 = süreler[1];
                int i3 = süreler[2];
                int i4 = süreler[3];
                int i5 = süreler[4];
                int i6 = süreler2[0] - süreler[4];
                int i7 = süreler2[1] - süreler[4];
                int i8 = süreler2[2] - süreler[4];
                int i9 = süreler2[3] - süreler[4];
                int i10 = süreler2[4] - süreler[4];
                String s1 = Integer.toString(counter1);
                String s2 = Integer.toString(counter1 + counter2);
                String s3 = Integer.toString(counter1 + counter2 + counter3);
                String s4 = Integer.toString(counter1 + counter2 + counter3 + counter4);
                String s5 = Integer.toString(counter1 + counter2 + counter3 + counter4 + counter5);
                System.out.println("süre=" + süreler[0] + "süre=" + süreler[1] + "süre=" + süreler[2] + "süre=" + süreler[3] + "süre=" + süreler[4]);
                System.out.println("süre=" + i6 + "süre=" + i7 + "süre=" + i8 + "süre=" + i9 + "süre=" + i10);
                
             /*   int time[]={i,i2,i3,i4,i5,i6,i7,i8,i9,i10};
                int cells[]={counter1,counter2,counter3,counter4,counter5};
                Graphic m =new Graphic(time,cells);
               // m.getData(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, s1, s2, s3, s4, s5);
                JFrame f = new JFrame();
                f.add(m);
                f.setSize(850, 480);
                //f.setLayout(null);  
                f.setVisible(true);
                */

                 final Grafikedemo demo = new Grafikedemo("Line Chart Demo", i, i2, i3, i4, i5, i6, i7, i8, i9, i10, s1, s2, s3, s4, s5);
                 demo.pack();
                 RefineryUtilities.centerFrameOnScreen(demo);
                 demo.setVisible(true);
            }
        });
        /* Set the Nimbus look and feel 
           
        
         */
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

    public static void draw(int[][] board, JTextField[][] cells, JPanel JPanel1) {

        //JPanel1.setVisible(false);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                cells[i][j] = new JTextField();
                JPanel1.add(cells[i][j]);
                cells[i][j].setEditable(false);
                if (board[i][j] == 0) {
                    cells[i][j].setText("");
                } else {
                    cells[i][j].setText(String.valueOf(board[i][j]));
                }
                cells[i][j].setBackground(Color.darkGray);
                cells[i][j].setForeground(Color.CYAN);

                cells[i][j].setHorizontalAlignment(JTextField.CENTER);
                cells[i][j].setFont(new Font("Courier", Font.BOLD, 20));
            }

        }

    }

    public static String replaceString(String str) {
        return str.replaceAll("\\*", "0");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static final javax.swing.JButton jButton1 = new javax.swing.JButton();
    private static final javax.swing.JButton jButton2 = new javax.swing.JButton();
    private static final javax.swing.JButton jButton4 = new javax.swing.JButton();
    private javax.swing.JLabel jLabel1;
    public static final javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
    public static final javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
    public static final javax.swing.JPanel jPanel3 = new javax.swing.JPanel();
    public static final javax.swing.JPanel jPanel4 = new javax.swing.JPanel();
    protected static final javax.swing.JPanel jPanel5 = new javax.swing.JPanel();
    // End of variables declaration//GEN-END:variables
}