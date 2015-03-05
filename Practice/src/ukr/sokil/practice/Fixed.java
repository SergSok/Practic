package ukr.sokil.practice;

public class Fixed extends Employees implements Runnable {

	double fixed; 
		
    Fixed(int i,String str,double d){
    	super(i,str,d);
    	fixed=d;}
    
    	
    public void run(){
    	try{
    	Thread.sleep(500);
    	System.out.println("average monthly salary with fixed payment" + "  "+ "ID"+getID()+ " " + getName()+"  "+fixed+"$");
	 
    	}catch(InterruptedException e){
    		System.out.println("Ошибка прерывания"+ e);
    	}
	
    }
    }
