package build;

import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Cost {
	private static final Logger LOGGER=LogManager.getLogger(Cost.class);
	public void co()
	{
		   Scanner sc = new Scanner(System.in); 
		   LOGGER.info("Enter the area of in square feet : ");
		         
		         
		         float area = sc.nextFloat();
		         LOGGER.info("\nEnter \n 1.standard material \n 2.high quality material \n Enter the no. :" );
		         int ch1= sc.nextInt();
		         LOGGER.info("\nEnter \n 1.simple house \n 2.automated house \n Enter the no.:" );
		         int ch2 = sc.nextInt();
		         if (ch1 == 1 && ch2 == 1) {
		           area = area * 1200;
		           LOGGER.info("\n Estimated cost for simple house with standard material "+ "is" + " " + area + "INR");
		         } 
		         else if (ch1 == 1 && ch2 == 2) {
		           area = area * 1500;
		           LOGGER.info("\n Estimated cost for automated house with standard material is " + area + "INR");
		         } 
		         else if (ch1 == 2 && ch2 == 1) {
		           area = area * 1800;
		           LOGGER.info("\n Estimated cost for simple house with high quality material is "+ area + "INR");
		         } 
		         else if (ch1 == 2 && ch2 == 2) {
		           area = area * 2500;
		           LOGGER.info("\n Estimated cost for automated house with high quality material is "+ "is " + area + "INR");
		         } 
		         else {
		        	 LOGGER.info(" INVALID OPTION ");
		         }
		         sc.close();
		         
		       } 


}
