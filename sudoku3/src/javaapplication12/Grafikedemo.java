package javaapplication12;

import java.awt.Dimension;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;
import org.jfree.ui.RefineryUtilities;

public class Grafikedemo extends ApplicationFrame{
 
    public Grafikedemo(final String title, Number ss, Number süreler2, Number süreler3, Number süreler4, Number süreler5,Number süreler6, Number süreler7,Number süreler8,Number süreler9,Number süreler10,String type1,String type2,String type3,String type4,String type5) {
        
        super(title);
        final CategoryDataset veriler = veriler(ss,süreler2,süreler3,süreler4,süreler5,süreler6,süreler7,süreler8,süreler9,süreler10,type1,type2,type3,type4,type5);
        final JFreeChart chart = grafikolustur(veriler);
        final ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(800, 450));
        setContentPane(chartPanel);
    }

    private CategoryDataset veriler(Number ss, Number süreler2, Number süreler3, Number süreler4, Number süreler5,Number süreler6, Number süreler7,Number süreler8,Number süreler9,Number süreler10,String type1,String type2,String type3,String type4,String type5) {
      
        final String eleman1 = "Tek başlangıç";
        final String eleman2 = "Çift başlangıç";
      
        final DefaultCategoryDataset veriler = new DefaultCategoryDataset();
         veriler.addValue(0, eleman1,"0");
        veriler.addValue(ss, eleman1,type1);
        veriler.addValue(süreler2, eleman1, type2);
        veriler.addValue(süreler3, eleman1, type3);
        veriler.addValue(süreler4, eleman1, type4);
        veriler.addValue(süreler5, eleman1, type5);
        veriler.addValue(0, eleman2, "0");
        veriler.addValue(süreler6, eleman2, type1);
        veriler.addValue(süreler7, eleman2, type2);
        veriler.addValue(süreler8, eleman2, type3);
        veriler.addValue(süreler9, eleman2, type4);
        veriler.addValue(süreler10, eleman2, type5);
          return veriler;
                }
    
   
    private JFreeChart grafikolustur(final CategoryDataset veriler) {
        
       final JFreeChart grafik = ChartFactory.createLineChart(
            "Geçen Süre-Bulduğu Kare Grafiği",       
            "Kare",                    
            "Süre",                   
            veriler );
        return grafik;
    }
   
    public static void main(final String[] args){ 
        final Grafikedemo demo = new Grafikedemo("Line Chart Demo",5,10,15,20,25,10,17,28,30,45,"11","22","33","44","55");
        demo.pack();
        RefineryUtilities.positionFrameOnScreen(demo, BOTTOM_ALIGNMENT, RIGHT_ALIGNMENT);
        demo.setVisible(true);}

}

