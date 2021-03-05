package day04_List;

import java.util.*;

class Test30
{
	public static void main(String[] args){
		Set<Emp> set = new TreeSet<>();
		set.add(new Emp("a",1,1,1));
		set.add(new Emp("b",1,1,2));
		set.add(new Emp("c",1,2,1));
		set.add(new Emp("d",1,2,3));
//		myComparator30 mc = new myComparator30();
		
		System.out.println(set);

	}
}


class myComparator30 implements Comparator<Emp>{
	public int compare(Emp emp1,Emp emp2){
		int num1 = emp1.getAge() - emp2.getAge();
		int num2 = emp2.getWorkingYear() - emp1.getWorkingYear();		
		int num3 = emp2.getSal() - emp1.getSal();
		return  num1 == 0? (num2 == 0 ? num3:num2):num1;
	}
}
class Emp implements Comparable<Emp>
{
	private String name;
	private int age;
	private int workingYear;
	private int sal;
	Emp(){}
	Emp(String name,int age,int workingYear,int sal){
		this.name = name;
		this.age = age;
		this.workingYear = workingYear;
		this.sal = sal;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public int getAge(){
		return age;
	}


	public void setWorkingYear(int workingYear){
		this.workingYear = workingYear;
	}
	public int getWorkingYear(){
		return workingYear;
	}

	public void setSal(int sal){
		this.sal = sal;
	}
	public int getSal(){
		return sal;
	}

	public String toString(){
		return name + "," + age + "," + workingYear + "," + sal;
	}

	@Override
	public int compareTo(Emp emp2) {
		// TODO Auto-generated method stub
		int num1 = this.getAge() - emp2.getAge();
		int num2 = emp2.getWorkingYear() - this.getWorkingYear();		
		int num3 = emp2.getSal() -this.getSal();
		return  num1 == 0? (num2 == 0 ? num3:num2):num1;
	}
	
}