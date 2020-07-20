package logging;

import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
    	double pr, rate, t, sim,com;
        @SuppressWarnings("resource")
		Scanner sc=new Scanner (System. in);
        LOGGER.info("enter the amount:");
        pr=sc.nextDouble();
        LOGGER.info("Enter the No.of years:");
        t=sc.nextDouble();
        LOGGER.info("Enter the Rate of  interest:");
        rate=sc.nextDouble();
        sim=(pr * t * rate)/100;
        com=pr * Math.pow(1.0+rate/100.0,t) - pr;
        LOGGER.info("Simple Interest="+sim);
        LOGGER.info("Compound Interest="+com);
    }
}