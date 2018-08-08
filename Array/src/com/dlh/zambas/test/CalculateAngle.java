package com.dlh.zambas.test;

public class CalculateAngle {
	  static int calcAngle(double h, double m)
	    {
		  double hourAngle;
		  double minuteAngle;
		  double angle;
		  
		  if(h==12)
			  h=0;
		  if(m==60){
			  m=0;
			  h=(h+1)%12;
		  }
		  
		  hourAngle = 0.5 * (60*h + m);
		  minuteAngle = 6*m;
		  
		  angle = Math.abs(hourAngle-minuteAngle);
		  return (int) Math.min(360 - angle, angle);
	    }
	     
	    // Driver program
	    public static void main (String[] args) 
	    {
	        System.out.println(calcAngle(9, 60)+" degree");
	        System.out.println(calcAngle(5, 30)+" degree");
	    }
}
