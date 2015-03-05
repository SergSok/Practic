package ukr.sokil.practice;
import java.io.Serializable;
import java.util.Comparator;


class Employees implements Comparator<Employees>, Serializable,Runnable {

	int ID;
    String name;
    double salary; //average monthly salary
   
    Employees(int i,String str,double d){
    	ID=i;
    	name=str;
    	salary=d;
    }
	public int getID(){
		return ID;
	}
	/*public void setID(int ID){
	    this.ID=ID;
	    }*/
	public String getName(){
		return name;
	}
	/*public void setName(String name){
		this.name=name;
	}*/
	
	public double getSalary() {
		return salary;
	}
	/*public void setSalary(double salary) {
		this.salary = salary;
	}*/
	
	public static Comparator<Employees> EmplSalary = new Comparator<Employees>(){
		public int compare(Employees o1, Employees o2){
			int i = (int) (o1.salary - o2.salary);
			if(i ==0){
				i = o1.name.compareTo(o2.name);
				
			}
			return i;
		}
	};
	
  
	
	 @Override
	    //this is overriden to print the user friendly information about the Employee
	    public String toString() {
	        return  "\n"+ "id=" + getID() + ", name=" + getName() + " , salary=" +
	                getSalary()+"$";
}
	 
}