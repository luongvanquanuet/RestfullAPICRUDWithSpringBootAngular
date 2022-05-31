package com.abc;

public class Tes1 {
    int rollno;
    String name;
    static String college = "Bưu Chính Viễn Thông";
    int arr [] =new int[10];
    int arr1 []= {1,2,3,5};
    //arr1[4]=5;
 
    static void change() {
        // Thay đổi thuộc tính static (thuộc tính chung của tất cả các đối tượng)
        college = "Đại Học Công Nghệ";
        //System.out.print(name);
    }
	/*
	 * Tes1(){ System.out.print("skfsf"); }
	 * 
	 * Tes1(int r, String n) { rollno = r; name = n; }
	 */
 
    void display() {
        System.out.println(rollno + " - " + name + " - " + college);
    }
 
    public static void main(String args[]) {
        Tes1.change();
        Tes1 a =new Tes1();
        
        a.display();

        System.out.print(college);

    }
}