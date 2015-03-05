package ukr.sokil.practice;

public class Hourly extends Employees{
    
	
	double rate;
	double day = 20.8;
	double hour = 8;  
	double p;//average monthly salary  with hourly wage
	
    Hourly (int i,String str,double d){
    	super(i,str,d);
    	 rate = d;}
    	 
  
    public void run(){
	try {
		Thread.sleep(200);
	
    	 p =day*hour*rate;
    	 System.out.println("average monthly salary  with hourly wage"+ "  "+ "ID"+getID()+ " " + getName()+"  "+p+"$");
    } catch (InterruptedException e) {
    	System.out.println("Ошибка прерывания"+ e);
	}
}

}