/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author Lenovo
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.String.valueOf;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javaapplication12.NewJFrame.a;
import static javaapplication12.NewJFrame.b;
import static javaapplication12.NewJFrame.c;
import static javaapplication12.NewJFrame.cells1;
import static javaapplication12.NewJFrame.cells2;
import static javaapplication12.NewJFrame.cells3;
import static javaapplication12.NewJFrame.cells4;
import static javaapplication12.NewJFrame.cells5;
import static javaapplication12.NewJFrame.d;
import static javaapplication12.NewJFrame.e;
import static javaapplication12.NewJFrame.j;
import static javaapplication12.NewJFrame.i;
import static javaapplication12.NewJFrame.h;
import static javaapplication12.NewJFrame.f;
import static javaapplication12.NewJFrame.g;
import static javaapplication12.NewJFrame.model1;
import static javaapplication12.NewJFrame.model12;
import static javaapplication12.NewJFrame.model22;
import static javaapplication12.NewJFrame.model2;
import static javaapplication12.NewJFrame.model3;
import static javaapplication12.NewJFrame.model32;
import static javaapplication12.NewJFrame.model4;
import static javaapplication12.NewJFrame.model42;
import static javaapplication12.NewJFrame.model5;
import static javaapplication12.NewJFrame.model52;
import static javaapplication12.NewJFrame.startTime;
import static javaapplication12.NewJFrame.startTime1;
import static javaapplication12.NewJFrame.startTime2;
import static javaapplication12.NewJFrame.startTime3;
import static javaapplication12.NewJFrame.startTime4;
import static javaapplication12.NewJFrame.startTime5;


/**
 *
 * @author Lenovo
 */
public class MyThread implements Runnable {
    public static int[] süreler=new int[5];
    public static int[] süreler2=new int[5];

  public  PrintWriter myWriter;
  public  PrintWriter myWriter2;
  public  PrintWriter myWriter3;
  public  PrintWriter myWriter4;
  public  PrintWriter myWriter5;
   public  PrintWriter myWriter0;
  public  PrintWriter myWriter20;
  public  PrintWriter myWriter30;
  public  PrintWriter myWriter40;
  public  PrintWriter myWriter50;
  public  PrintWriter myWriterall;
   public  PrintWriter myWriterall0;
  
     int[][] sudoku;
    int row;
    int col;
    String direction;
    
  public MyThread(){
  
  }
    public MyThread(int[][] sudoku,int row,int col,String direction) throws FileNotFoundException{
        myWriter = new PrintWriter("çözüm.txt");
         myWriter2 = new PrintWriter("çözüm2.txt");
          myWriter3 = new PrintWriter("çözüm3.txt");
           myWriter4 = new PrintWriter("çözüm4.txt");
            myWriter5 = new PrintWriter("çözüm5.txt");
             myWriter0 = new PrintWriter("çözüm0.txt");
         myWriter20 = new PrintWriter("çözüm20.txt");
          myWriter30 = new PrintWriter("çözüm30.txt");
           myWriter40 = new PrintWriter("çözüm40.txt");
            myWriter50 = new PrintWriter("çözüm50.txt");
            myWriterall0 = new PrintWriter("çözümall0.txt");
            myWriterall = new PrintWriter("çözümall.txt");
          
        this.sudoku=sudoku;
        this.row=row;
        this.col=col;
        this.direction=direction;
    }
    protected synchronized void writetofile(int sudoku[][]) throws FileNotFoundException{

 
        if (sudoku == model1) {
           
             myWriter.print("model1\n");
             
         for (int row1 = 0; row1 < 9; row1++) {
                for (int col1 = 0; col1 < 9; col1++) {
                myWriter.print(model1[row1][col1]);
            
               
                }
             myWriter.print("\n");
            }
            
                  myWriter.println();
               }
        
      else  if (sudoku == model2) {
             myWriter2.print("model2\n");
         for (int row2 = 0; row2 < 9; row2++) {
                for (int col2 = 0; col2 < 9; col2++) {
                myWriter2.print(model2[row2][col2]);
             
               
                }
             myWriter2.print("\n");
            }
            
                  myWriter2.println();
             }
       else if (sudoku == model3) {
            myWriter3.print("model3\n");
         for (int row3 = 0; row3 < 9; row3++) {
                for (int col3 = 0; col3 < 9; col3++) {
                myWriter3.print(model3[row3][col3]);
             
               
                }
             myWriter3.print("\n");
            }
            
                  myWriter3.println();
               }
       else if (sudoku == model4) {
                    myWriter4.print("model4\n");
         for (int row4 = 0; row4 < 9; row4++) {
                for (int col4 = 0; col4 < 9; col4++) {
                myWriter4.print(model4[row4][col4]);
             
               
                }
             myWriter4.print("\n");
            }
            
                  myWriter4.println();
               }
      else if (sudoku == model5) {
                    myWriter5.print("model5\n");
         for (int row5 = 0; row5 < 9; row5++) {
                for (int col5 = 0; col5 < 9; col5++) {
                myWriter5.print(model5[row5][col5]);
             
               
                }
             myWriter5.print("\n");
            }
            
                  myWriter5.println();
               }
        else if (sudoku == model12) {
           
             myWriter0.print("model1\n");
             
         for (int row1 = 0; row1 < 9; row1++) {
                for (int col1 = 0; col1 < 9; col1++) {
                myWriter0.print(model12[row1][col1]);
            
               
                }
             myWriter0.print("\n");
            }
            
                  myWriter0.println();
               }
        
      else  if (sudoku == model22) {
             myWriter20.print("model2\n");
         for (int row2 = 0; row2 < 9; row2++) {
                for (int col2 = 0; col2 < 9; col2++) {
                myWriter20.print(model22[row2][col2]);
             
               
                }
             myWriter20.print("\n");
            }
            
                  myWriter20.println();
             }
       else if (sudoku == model32) {
            myWriter30.print("model3\n");
         for (int row3 = 0; row3 < 9; row3++) {
                for (int col3 = 0; col3 < 9; col3++) {
                myWriter30.print(model32[row3][col3]);
             
               
                }
             myWriter30.print("\n");
            }
            
                  myWriter30.println();
               }
       else if (sudoku == model42) {
                    myWriter40.print("model4\n");
         for (int row4 = 0; row4 < 9; row4++) {
                for (int col4 = 0; col4 < 9; col4++) {
                myWriter40.print(model42[row4][col4]);
             
               
                }
             myWriter40.print("\n");
            }
            
                  myWriter40.println();
               }
      else if (sudoku == model52) {
                    myWriter50.print("model5\n");
         for (int row5 = 0; row5 < 9; row5++) {
                for (int col5 = 0; col5 < 9; col5++) {
                myWriter50.print(model52[row5][col5]);
             
               
                }
             myWriter50.print("\n");
            }
            
                  myWriter50.println();
               }
    }
    
     protected synchronized  void updateView(int sudoku[][]) throws IOException, InterruptedException {
        
        
        if (sudoku == model1) {
          
             //  Thread.sleep(50);
                   
        
       
                
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (model1[row][col] != 0) {
                        cells1[row][col].setText(String.valueOf(model1[row][col]));
                    } else {
                        cells1[row][col].setText("");
                    }
                }
            }}
      else   if (sudoku == model12) {
         
             // Thread.sleep(50);    
                   
        
       
                
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (model12[row][col] != 0) {
                        cells1[row][col].setText(String.valueOf(model12[row][col]));
                    } else {
                        cells1[row][col].setText("");
                    }
                }
            }}
        else if (sudoku == model2) {
         //    Thread.sleep(50);
      
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (model2[row][col ] != 0) {
                        cells2[row][col].setText(String.valueOf(model2[row][col]));
                    } else {
                        cells2[row][col ].setText("");
                    }
                }
            }
        } 
         else if (sudoku == model22) {
             // Thread.sleep(50);
      
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (model22[row][col ] != 0) {
                        cells2[row][col].setText(String.valueOf(model22[row][col]));
                    } else {
                        cells2[row][col ].setText("");
                    }
                }
            }
        } 
       /* else if (sudoku == model3) {
         
            for (int row = 6; row < 9; row++) {
                for (int col = 9; col < 12; col++) {
                    if (model3[row -6][col - 6] != 0) {
                        cells3[row][col].setLabel(String.valueOf(model3[row - 6][col - 6]));
                    } else {
                       cells3[row][col].setLabel("");
                    }
                }
            }
        for(int row=9;row<12;row++){
        for(int col=6;col<15;col++){
        if(model3[row-6][col-6]!=0){
        cells3[row][col].setLabel(String.valueOf(model3[row - 6][col - 6]));
                    } else {
                        cells3[row][col].setLabel("");
                    }
        }
        }
        for(int row=12;row<15;row++){
        for(int col=9;col<12;col++){
        if(model3[row-6][col-6]!=0){
         cells3[row][col].setLabel(String.valueOf(model3[row - 6][col - 6]));
                    } else {
                        cells3[row][col].setLabel("");
                    }
        }
        }
            
            
        }
        */
        else if (sudoku == model3) {
            // Thread.sleep(50);
             
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (model3[row ][col] != 0) {
                        cells3[row][col].setText(String.valueOf(model3[row][col]));
                    } else {
                        cells3[row][col].setText("");
                    }
                }
            }
        }
         else if (sudoku == model32) {
             // Thread.sleep(50);
             
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (model32[row ][col] != 0) {
                        cells3[row][col].setText(String.valueOf(model32[row][col]));
                    } else {
                        cells3[row][col].setText("");
                    }
                }
            }
        }
        else if (sudoku == model4) {
            // Thread.sleep(50);
             
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (model4[row ][col] != 0) {
                        cells4[row][col].setText(String.valueOf(model4[row][col]));
                    } else {
                        cells4[row][col].setText("");
                    }
                }
            }
        } 
         else if (sudoku == model42) {
            //  Thread.sleep(50);
             
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (model42[row ][col] != 0) {
                        cells4[row][col].setText(String.valueOf(model42[row][col]));
                    } else {
                        cells4[row][col].setText("");
                    }
                }
            }
        }else if (sudoku == model5) {
           //  Thread.sleep(50);
         
              
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (model5[row ][col ] != 0) {
                        cells5[row][col].setText(String.valueOf(model5[row][col]));
                    } else {
                        cells5[row][col].setText("");
                    }
                }
            }
        }
else if (sudoku == model52) {
   //  Thread.sleep(50);
         
              
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (model52[row ][col ] != 0) {
                        cells5[row][col].setText(String.valueOf(model52[row][col]));
                    } else {
                        cells5[row][col].setText("");
                    }
                }
            }
        }
    }
  protected synchronized  boolean  row(int sudoku[][], int row, int num) {
     
        for (int col = 0; col < 9; col++) {
            if (sudoku[row][col] == num) {
                return false;
            }
        }

        return true;
    }

    /**
     * Checks if num is an acceptable value for the given column
     */
    protected synchronized  boolean column(int sudoku[][], int col, int num) {
        
        for (int row = 0; row < 9; row++) {
            if (sudoku[row][col] == num) {
                return false;
            }
        }

        return true;
    }

    /**
     * Checks if num is an acceptable value for the box around row and col
     */
    protected synchronized   boolean box(int sudoku[][], int row, int col, int num) {
     
        row = (row / 3) * 3;
        col = (col / 3) * 3;

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                if (sudoku[row + r][col + c] == num) {
                    return false;
                }
            }
        }

        return true;
    }
    
    protected synchronized boolean isValid(int sudoku[][], int row, int col, int num) {
        
        return (row(sudoku, row, num)
                && column(sudoku, col, num)
                && box(sudoku, row, col, num));
    }

 
 public  void run() {
      //   MyThread ja = null;
        try {

            solve(sudoku, row, col, direction);

        } catch (Exception ex) {
            Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
        }
}

       
    
 
   public synchronized void solve(int sudoku[][], int row, int col, String direction) throws Exception {

       writetofile(sudoku);
        // Throw an exception to stop the process if the puzzle is solved
    
       switch (direction) {
            case "ileri":
        if (row > 8) {
            System.out.println("a="+a+"b="+b+"c="+c+"d="+d+"e="+e+"f="+f+"h="+h+"i="+i+"j="+j+"g="+g);
 
         if(sudoku==model1 || sudoku==model12){
              myWriter.close();
             System.out.println("model1 solve1 bitti");
      a = 1;
      if(sudoku==model1){
         long endTime1 = System.nanoTime();
 long timeElapsed1 = endTime1 - startTime1;
süreler[0]=   (int) (timeElapsed1/1000000000);}
      else if(sudoku==model12){
       long endTime12 = System.nanoTime();
 long timeElapsed12 = endTime12 - startTime1;
süreler2[0]=   (int) (timeElapsed12/1000000000);
      
      
      }
      
             System.out.println(süreler[0]);

         
         }
      if(sudoku==model2 || sudoku==model22){
          myWriter2.close();
             if(sudoku==model2){
         long endTime1 = System.nanoTime();
 long timeElapsed1 = endTime1 - startTime1;
süreler[1]=   (int) (timeElapsed1/1000000000);}
      else if(sudoku==model22){
       long endTime12 = System.nanoTime();
 long timeElapsed12 = endTime12 - startTime1;
süreler2[1]=   (int) (timeElapsed12/1000000000);
      
      
      }
      System.out.println(süreler[1]);
     b = 1;
}
     if(sudoku==model3 || sudoku==model32){
         myWriter3.close();
              if(sudoku==model3){
         long endTime1 = System.nanoTime();
 long timeElapsed1 = endTime1 - startTime1;
süreler[2]=   (int) (timeElapsed1/1000000000);}
      else if(sudoku==model32){
       long endTime12 = System.nanoTime();
 long timeElapsed12 = endTime12 - startTime1;
süreler2[2]=   (int) (timeElapsed12/1000000000);
      
      
      }
   System.out.println(süreler[2]);
       c = 1;
               }
        if(sudoku==model4 || sudoku==model42){
            myWriter4.close();
          d = 1;
          if(sudoku==model4){
         long endTime1 = System.nanoTime();
 long timeElapsed1 = endTime1 - startTime1;
süreler[3]=   (int) (timeElapsed1/1000000000);}
      else if(sudoku==model42){
       long endTime12 = System.nanoTime();
 long timeElapsed12 = endTime12 - startTime1;
süreler2[3]=   (int) (timeElapsed12/1000000000);
      
      
      }
   System.out.println(süreler[3]);
      
         }
        if(sudoku==model5 || sudoku==model52){
            myWriter5.close();
              e = 1;
        if(sudoku==model5){
         long endTime1 = System.nanoTime();
 long timeElapsed1 = endTime1 - startTime1;
süreler[4]=   (int) (timeElapsed1/1000000000);}
      else if(sudoku==model52){
       long endTime12 = System.nanoTime();
 long timeElapsed12 = endTime12 - startTime1;
süreler2[4]=   (int) (timeElapsed12/1000000000);
      
      
      }
  System.out.println(süreler[4]);
                  }
        if(a+b+c+d+e+f+h+i+j+g>=5){
              BufferedReader br = new BufferedReader(new FileReader("çözüm.txt"));
          String line = br.readLine();
      
        while (line != null)
        {
            myWriterall.println(line);
            line = br.readLine();
        }  
         BufferedReader br2 = new BufferedReader(new FileReader("çözüm2.txt"));
          
        String line2 = br2.readLine();
       
        while (line2 != null)
        {
            myWriterall.println(line2);
            line2 = br2.readLine();
        }     
         BufferedReader br3 = new BufferedReader(new FileReader("çözüm3.txt"));
          
        String line3 = br3.readLine();
       
        while (line3 != null)
        {
            myWriterall.println(line3);
            line3 = br3.readLine();
        }     
         BufferedReader br4 = new BufferedReader(new FileReader("çözüm4.txt"));
          
        String line4 = br4.readLine();
        
        while (line4 != null)
        {
            myWriterall.println(line4);
            line4 = br4.readLine();
        }     
         BufferedReader br5 = new BufferedReader(new FileReader("çözüm5.txt"));
          
        String line5 = br5.readLine();
          
     
        while (line5 != null)
        {
            myWriterall.println(line5);
            line5 = br5.readLine();
        }     
        myWriterall.flush();
        br.close();
        br2.close();
        br3.close();
        br4.close();
        br5.close();
        
             myWriterall.close();
              long endTime = System.nanoTime();
 long timeElapsed = endTime - startTime;
     
       //  System.exit(0);
         }
         
            throw new Exception("Solution found");}
        break;
       
       case "geri":
 if (row < 0) {
     System.out.println("a="+a+"b="+b+"c="+c+"d="+d+"e="+e+"f="+f+"h="+h+"i="+i+"j="+j+"g="+g);
          if(sudoku==model12){
           myWriter0.close();
      f = 1;
         long endTime12 = System.nanoTime();
 long timeElapsed12 = endTime12 - startTime1;
süreler2[0]=   (int) (timeElapsed12/1000000000);
        
         }
         if(sudoku==model22){
               myWriter20.close();
     g = 1;
      long endTime12 = System.nanoTime();
 long timeElapsed12 = endTime12 - startTime1;
süreler2[1]=   (int) (timeElapsed12/1000000000);

}
         if(sudoku==model32){
               myWriter30.close();
        long endTime12 = System.nanoTime();
 long timeElapsed12 = endTime12 - startTime1;
süreler2[2]=   (int) (timeElapsed12/1000000000);
      h = 1;
           }
         if(sudoku==model42){
               myWriter40.close();
      long endTime12 = System.nanoTime();
 long timeElapsed12 = endTime12 - startTime1;
süreler2[3]=   (int) (timeElapsed12/1000000000);
  i = 1;
             
         }
         if(sudoku==model52){
               myWriter50.close();
        long endTime12 = System.nanoTime();
 long timeElapsed12 = endTime12 - startTime1;
süreler2[4]=   (int) (timeElapsed12/1000000000);
      j = 1; 
         }
         if(a+b+c+d+e+f+h+i+j+g>=5){
             
               long endTime = System.nanoTime();
 long timeElapsed = endTime - startTime;
  BufferedReader br = new BufferedReader(new FileReader("çözüm0.txt"));
          
        String line = br.readLine();
     
        while (line != null)
        {
            myWriterall0.println(line);
            line = br.readLine();
        }  
         BufferedReader br2 = new BufferedReader(new FileReader("çözüm20.txt"));
          
        String line2 = br2.readLine();
      
        while (line2 != null)
        {
            myWriterall0.println(line2);
            line2 = br2.readLine();
        }     
         BufferedReader br3 = new BufferedReader(new FileReader("çözüm30.txt"));
          
        String line3 = br3.readLine();

        while (line3 != null)
        {
            myWriterall0.println(line3);
            line3 = br3.readLine();
        }     
         BufferedReader br4 = new BufferedReader(new FileReader("çözüm40.txt"));
          
        String line4 = br4.readLine();
   
        while (line4 != null)
        {
            myWriterall0.println(line4);
            line4 = br4.readLine();
        }     
         BufferedReader br5 = new BufferedReader(new FileReader("çözüm50.txt"));
          
        String line5 = br5.readLine();
          
     
        while (line5 != null)
        {
            myWriterall0.println(line5);
            line5 = br5.readLine();
        }     
        myWriterall0.flush();
        br.close();
        br2.close();
        br3.close();
        br4.close();
        br5.close();
        
             myWriterall0.close();
        // System.exit(0);
         }
            System.out.println("a="+a+"b="+b+"c="+c+"d="+d);
         
         throw new Exception("Solution found");
           
        }
    break;
        }

        // If the cell is not empty, continue with the next cell
        
        if (sudoku[row][col] != 0) {
        if ("ileri".equals(direction)) {
                if (col < 8) {

                    solve(sudoku, row, col + 1, direction);
       
        } else {
                    solve(sudoku, row + 1, 0, direction);   }
            } else if("geri".equals(direction)) {
                if (col > 0) {

                    solve(sudoku, row, col - 1, direction);
                } else {

                    solve(sudoku, row - 1, 8, direction);
                }
            }
        } else {
            // Find a valid number for the empty cell
            for (int num = 1; num < 10; num++) {
                if (isValid(sudoku,row,col,num)) {
                    sudoku[row][col] = num;
                    
                    updateView(sudoku);

                    // Let the observer see it
                // Thread.sleep(3);

                    // Delegate work on the next cell to a recursive call
                  if ("ileri".equals(direction)) {
                        if (col < 8) {

                            solve(sudoku, row, col + 1, direction);
                        } else {

                            solve(sudoku, row + 1, 0, direction);
                        }
                    } else if("geri".equals(direction)){
                        if (col > 0) {

                            solve(sudoku, row, col - 1, direction);
                        } else {

                            solve(sudoku, row - 1, 8, direction);
                        }
                    } 
                }
            }

            // No valid number was found, clean up and return to caller
            sudoku[row][col] = 0;
            updateView(sudoku);
        }
   }
}
    
 /*public synchronized   void solve2(int sudoku[][], int row2, int col2) throws Exception {
    writetofile(sudoku);
        // Throw an exception to stop the process if the puzzle is solved
        if (row2 < 0) {
            System.out.println("j="+j+"f="+f+"h="+h+"i="+i+"g="+g);
          if(sudoku==model12){
           myWriter0.close();
      f = 1;
         long endTime1 = System.nanoTime();
 long timeElapsed1 = endTime1 - startTime1;
        
         }
         if(sudoku==model22){
               myWriter20.close();
     g = 1;
       long endTime1 = System.nanoTime();
 long timeElapsed1 = endTime1 - startTime1;

}
         if(sudoku==model32){
               myWriter30.close();
       long endTime1 = System.nanoTime();
 long timeElapsed1 = endTime1 - startTime1;
      h = 1;
           }
         if(sudoku==model42){
               myWriter40.close();
       long endTime1 = System.nanoTime();
 long timeElapsed1 = endTime1 - startTime1;
  i = 1;
             
         }
         if(sudoku==model52){
               myWriter50.close();
       long endTime1 = System.nanoTime();
 long timeElapsed1 = endTime1 - startTime1;
      j = 1;  }
         if(a+b+c+d+e+f+h+i+j+g==5){
             System.out.println("girdiiiiiiiiiiiiii");
               long endTime = System.nanoTime();
 long timeElapsed = endTime - startTime;
  BufferedReader br = new BufferedReader(new FileReader("çözüm0.txt"));
          
        String line = br.readLine();
     
        while (line != null)
        {
            myWriterall0.println(line);
            line = br.readLine();
        }  
         BufferedReader br2 = new BufferedReader(new FileReader("çözüm20.txt"));
          
        String line2 = br2.readLine();
      
        while (line2 != null)
        {
            myWriterall0.println(line2);
            line2 = br2.readLine();
        }     
         BufferedReader br3 = new BufferedReader(new FileReader("çözüm30.txt"));
          
        String line3 = br3.readLine();

        while (line3 != null)
        {
            myWriterall0.println(line3);
            line3 = br3.readLine();
        }     
         BufferedReader br4 = new BufferedReader(new FileReader("çözüm40.txt"));
          
        String line4 = br4.readLine();
   
        while (line4 != null)
        {
            myWriterall0.println(line4);
            line4 = br4.readLine();
        }     
         BufferedReader br5 = new BufferedReader(new FileReader("çözüm50.txt"));
          
        String line5 = br5.readLine();
          
     
        while (line5 != null)
        {
            myWriterall0.println(line5);
            line5 = br5.readLine();
        }     
        myWriterall0.flush();
        br.close();
        br2.close();
        br3.close();
        br4.close();
        br5.close();
        
             myWriterall0.close();
        // System.exit(0);
         }
            System.out.println("a="+a+"b="+b+"c="+c+"d="+d);
         
         throw new Exception("Solution found");
           
        }

        // If the cell is not empty, continue with the next cell
        if (sudoku[row2][col2] != 0) {
           
            next2(sudoku, row2, col2);
        } else {
            // Find a valid number for the empty cell
            for (int num = 1; num < 10; num++) {
                if (checkRow(sudoku, row2, num) && checkCol(sudoku, col2, num) && checkBox(sudoku, row2, col2, num)) {
                    sudoku[row2][col2] = num;
                    updateView(sudoku);

                    // Let the observer see it
                  Thread.sleep(5);

                    // Delegate work on the next cell to a recursive call
                    next2(sudoku, row2, col2);
                }
            }

            // No valid number was found, clean up and return to caller
            sudoku[row2][col2] = 0;
            updateView(sudoku);
        }
    }
   /** Calls solve for the next cell */
   /* public void next(int sudoku[][], int row, int col) throws Exception {
     
        if (col < 8) {
             
            solve(sudoku, row, col + 1);
        } else {
          
            solve(sudoku, row + 1, 0);
        }
    }
   public  void  next2(int sudoku[][], int row, int col) throws Exception {
      
        if (col > 0) {
          
            solve2(sudoku, row, col -1);
        } else {
           
            solve2(sudoku, row -1, 8);
        }
    }*/
 

   
    


