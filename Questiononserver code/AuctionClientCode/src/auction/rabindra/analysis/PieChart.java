package auction.rabindra.analysis;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.ui.ApplicationFrame;
import java.awt.Toolkit;

public class PieChart extends ApplicationFrame {
    
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PieChart(String title,int i,int j) {
      super(title); 
      setIconImage(Toolkit.getDefaultToolkit().getImage(""));
      setTitle("Analysis of Auction Survey");
      
      setContentPane(createDemoPanel(i,j));
   }
   
   public static PieDataset createDataset(int i,int j) {
      DefaultPieDataset dataset = new DefaultPieDataset( );
      dataset.setValue( "Yes" , new Double(i));  
      dataset.setValue( "No" , new Double(j) ); 
      return dataset;         
   }
   public static PieDataset createData(int k,int l) {
	      DefaultPieDataset data = new DefaultPieDataset( );
	      data.setValue( "Daily" , new Double(k));  
	      data.setValue( "Monthly" , new Double(l) );  
	      return data;         
	   }

	   
   public JFreeChart createChart(PieDataset dataset) {
      JFreeChart chart = ChartFactory.createPieChart(      
         "Auction Survey Analysis",   // chart title 
         dataset,          // data    
         false,             // include legend   
         true, 
         false);

      return chart;
   }
   
   public JPanel createDemoPanel(int i, int j) {
       PieDataset pd = createDataset(i, j);
      JFreeChart chart = createChart(pd);  
      return new ChartPanel(chart); 
   }

}
