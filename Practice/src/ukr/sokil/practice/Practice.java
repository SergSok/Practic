package ukr.sokil.practice;

import java.io.*;
import java.util.*;




public class Practice {
	
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Fixed(555,"Nic Roving",3000));
		Thread t2 = new Thread(new Hourly(777,"Mike Sadovskiy",15));
        t1.start();
		t2.start();
		
		List<Employees> cl = new ArrayList<Employees>();
		cl.add(new Employees(5,"Nic Roving", 3000.0));
		cl.add(new Employees(8,"Wike Sadovskiy", 2800.0));
		cl.add(new Employees(7,"Mike Sadovskiy", 2800.0));
		cl.add(new Employees(3,"Tash Loving", 3200.0));
		cl.add(new Employees(9,"Margaryta Sokil", 3328));
		cl.add(new Employees(2,"Serhiy Sokil", 3500));
		cl.add(new Employees(112,"Jeck Vorobei", 1900));
		for(Employees e : cl)
		System.out.println( e);
		Collections.sort(cl,Employees.EmplSalary);
		System.out.println(cl);
		System.out.println(cl.subList(0, 5));
		System.out.println(cl.size());
		System.out.println(cl.subList(4,7));
		System.out.println(cl.set(5, new Employees (11,"Margaryta Sokil", 3328.0)));
		System.out.println(cl);
	
		try {
			ObjectOutputStream out = new ObjectOutputStream( new FileOutputStream("serial"));
			out.writeObject(cl);
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("Файл не найдено" + e);
		} catch (IOException e) {
			System.out.println("Исключение сериализации" + e);
			
		}
		
		try {
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("serial"));
			
				System.out.println(in.readObject());
				in.close();
		} catch (FileNotFoundException e) {
			System.out.println("Файл не найдено" + e);
		} catch (IOException e) {
			System.out.println("Исключение сериализации" + e);
			System.exit(0);
		} catch (ClassNotFoundException e) {
			System.out.println("Класс не найдено" + e);
			System.exit(0);
		}	 
			 
		}
}