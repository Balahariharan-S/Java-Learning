class Book {
    private String title;
    private String author;
    private boolean issued;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
        this.issued = false;
    }
    public void issueBook(){
        if(!issued){
            issued = true;
            System.out.println(title+ " has been issued.");
        }else{
            System.out.println(title+ " is already issued.");
        }
    }
    public void returnBook(){
        issued = false;
        System.out.println(title+ " has been returned.");
    }
}
