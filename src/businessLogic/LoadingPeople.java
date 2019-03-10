package businessLogic;

import data.Administrative;
import data.ByContract;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import data.Employee;
import data.FullTime;
import data.Grad;
import data.PartialTime;
import data.Undergrad;

public class LoadingPeople {

	public static Undergrad readUndergrad(Scanner sc) {
		Undergrad newUndergrad = null;
		
		String id = sc.next().trim();
		String name = sc.next().trim();
		String hd = sc.next().trim();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
		String dp = sc.next().trim();
		String hours = sc.next().trim();
		int h = Integer.parseInt(hours);	

		Date hiringDate;
		try {
			hiringDate = ft.parse(hd);
			newUndergrad = new Undergrad(id, name,hiringDate,dp,h);
		} catch (ParseException e) {
			System.out.println("Unparseable using " + ft);
			e.printStackTrace();
		}
		return newUndergrad;
	}

	public static Grad readGrad(Scanner sc) {
		Grad newGrad = null;
		
		String id = sc.next().trim();
		String name = sc.next().trim();
		String hd = sc.next().trim();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
		String dp = sc.next().trim();
		String courses = sc.next().trim();
		int c = Integer.parseInt(courses);	

		Date hiringDate;
		try {
			hiringDate = ft.parse(hd);
			newGrad = new Grad(id, name,hiringDate,dp,c);
		} catch (ParseException e) {
			System.out.println("Unparseable using " + ft);
			e.printStackTrace();
		}
		return newGrad;
	}
        
        public static FullTime readFullTime(Scanner sc) {
		FullTime newFullTime = null;
		
		String id = sc.next().trim();
		String name = sc.next().trim();
		String hd = sc.next().trim();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
		String school = sc.next().trim();
		String dp = sc.next().trim();
                String salary = sc.next().trim();
		float s = Float.parseFloat(salary);	

		Date hiringDate;
		try {
			hiringDate = ft.parse(hd);
			newFullTime = new FullTime(id, name,hiringDate,school,dp,s);
		} catch (ParseException e) {
			System.out.println("Unparseable using " + ft);
			e.printStackTrace();
		}
		return newFullTime;
	}
        
        public static PartialTime readPartialTime(Scanner sc) {
		PartialTime newPartialTime = null;
		
		String id = sc.next().trim();
		String name = sc.next().trim();
		String hd = sc.next().trim();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
		String school = sc.next().trim();
		String dp = sc.next().trim();
                String category = sc.next().trim();
                String classHours = sc.next().trim();
		int c = Integer.parseInt(classHours);	

		Date hiringDate;
		try {
			hiringDate = ft.parse(hd);
			newPartialTime = new PartialTime(id, name,hiringDate,school,dp,category,c);
		} catch (ParseException e) {
			System.out.println("Unparseable using " + ft);
			e.printStackTrace();
		}
		return newPartialTime;
	}
        
        public static Administrative readAdministrative(Scanner sc) {
		Administrative newAdministrative = null;
		
		String id = sc.next().trim();
		String name = sc.next().trim();
		String hd = sc.next().trim();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
                String category = sc.next().trim();
                String salary = sc.next().trim();
		float s = Float.parseFloat(salary);	

		Date hiringDate;
		try {
			hiringDate = ft.parse(hd);
			newAdministrative = new Administrative(id, name,hiringDate,category,s);
		} catch (ParseException e) {
			System.out.println("Unparseable using " + ft);
			e.printStackTrace();
		}
		return newAdministrative;
	}
        
        public static ByContract readByContract(Scanner sc) {
		ByContract newByContract = null;
		
		String id = sc.next().trim();
		String name = sc.next().trim();
		String hd = sc.next().trim();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd"); 
                String months = sc.next().trim();
                String value = sc.next().trim();
                int m = Integer.parseInt(months);
                float v = Float.parseFloat(value);

		Date hiringDate;
		try {
			hiringDate = ft.parse(hd);
			newByContract = new ByContract(id, name,hiringDate,m,v);
		} catch (ParseException e) {
			System.out.println("Unparseable using " + ft);
			e.printStackTrace();
		}
		return newByContract;
	}
        
	public static Employee readEmployee(Scanner sc) {
		String type = sc.next().trim();
                switch(type){
                    case "Undergrad":
                        return readUndergrad(sc);
                    case "Grad":
                        return readGrad(sc);
                    case "FullTime":
                        return readFullTime(sc);
                    case "PartialTime":
                        return readPartialTime(sc);
                    case "Administrative":
                        return readAdministrative(sc);
                    case "ByContract":
                        return readByContract(sc);
                }
                return null;
	}
	
	public static ArrayList<Employee> readStaff(String fileName) {
		ArrayList<Employee> people = new ArrayList<Employee>();
		Scanner sc;
		try {
			sc = new Scanner(new File(fileName));
			sc.useDelimiter(",");
			while (sc.hasNext()) {
				people.add(readEmployee(sc));
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found -- " + fileName);
			e.printStackTrace();
		}
		return people;
	}
}
