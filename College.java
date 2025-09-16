public class College {
    static void stu_info(String name, int roll_no, String dept,int year){
        System.out.println("Student Name: "+name);
        System.out.println("Register Number: "+roll_no);
        System.out.println("Department: "+dept);
        System.out.println("Year: "+year+"yr");
        System.out.println("____________________________");
    }
    public void college_info(String clg_name, String loc, int courses, String number){
        System.out.println("College Name: "+clg_name);
        System.out.println("College Location: "+loc);
        System.out.println("Number of Courses: "+courses);
        System.out.println("Contact Number: "+number);
    }

    public static void main(String[] args) {
        stu_info("Hari", 101,"CSE",3);
        College info = new College();
        info.college_info("SRM","Chennai",8,"04364-288512");
    }
}
