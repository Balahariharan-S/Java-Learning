public class Company {
    static void emp_info(String emp_name, int emp_id,String city, String ph_no){
        System.out.println("Employee Name : "+emp_name);
        System.out.println("Employee ID: "+emp_id);
        System.out.println("employee Location: "+city);
        System.out.println("Phone Number: "+ph_no);
        System.out.println("-------------------------------");
    }
    public void comp_info(String comp_name, int revenue, int workers){
        System.out.println("Company Name: "+comp_name);
        System.out.println("Company Revenue: "+revenue);
        System.out.println("No.Of Workers: "+workers);
    }

    public static void main(String[] args) {
        emp_info("Sandeep",111,"Chennai","9486830394");
        Company comp = new Company();
        comp.comp_info("ZOHO",1000000,300);
    }
}
