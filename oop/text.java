package oop;

public class text {
    public static void main(String[] args) {
        Teacher teacher1; // object declare
        teacher1 = new Teacher(); // object create
        teacher1.name ="Tamim Ahmded";
        teacher1.gender="male";
        teacher1.phone=301103482;

        System.out.println("Name : "+teacher1.name);
        System.out.println("Gender : "+teacher1.gender);
        System.out.println("Phone : "+teacher1.phone);

    }
    
}
