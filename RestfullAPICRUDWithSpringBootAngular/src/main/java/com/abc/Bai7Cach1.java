package com.abc;
public class Bai7Cach1 {
public static void main(String [] args) {
		Student[] students= new Student[3];
		for (int i = 0; i < 3; i++) {
			students[i] = new Student();
		}
		students[0].name="Tuan";
		students[0].age=24;
		students[1].name="Cuong";
		students[1].age=25;
		students[2].name="Duc";
		students[2].age=24;
		for(int i=0;i<3;i++) {
			students[i].display();
		}
	}
}
class Student {
	String name;
	int age;
	public void display() {
	System.out.print("Name:"+name +"Age"+age);
	}
	
}

