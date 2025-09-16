public class Institute {
    String instu_name;
    String course_name;
    String stu_name;
    int fees;

    public static void main(String[] args) {
        Institute ins = new Institute();
        Institute info =new Institute();
        Institute info1 = new Institute();
        ins.instu_name = "vtu";
        ins.course_name = "IT";
        info.stu_name = "Sanjay";
        info1.stu_name = "surya";
        System.out.println("Institute name: " + ins.instu_name);
        System.out.println("Course name: " + ins.course_name);
        System.out.println("Student name: " + info.stu_name);
        System.out.println("Student name: " + info1.stu_name);
    }
}