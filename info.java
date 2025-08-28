public class info {
    static void personalinfo(String name, String address, int age , long phone){
        System.out.println("Personal Info: ");
        System.out.println("Name: "+name);
        System.out.println("Address: "+address);
        System.out.println("Age: "+age);
        System.out.println("Phone: "+phone);
    }
    static void collegeinfo(String name, int regno , String Dpt , int year){
        System.out.println("College Info: ");
        System.out.println("Name: "+name);
        System.out.println("Register no: "+regno);
        System.out.println("Department: "+Dpt);
        System.out.println("Year: "+year);
    }

    public static void main(String[] args) {
        personalinfo("Bala","Chennai", 21, 9486830394L);
        collegeinfo("Bala", 14735,"IT",4);
    }
}
