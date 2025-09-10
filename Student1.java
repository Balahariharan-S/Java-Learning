class Student1 {
    private String name;
    private int age;
    private double marks;
    public Student1(String name, int age, double marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    public void displaydetails(){
        System.out.println("Name: "+name+" Age: "+age+" Marks: "+marks);
    }
}
