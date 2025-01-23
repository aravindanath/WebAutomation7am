package day4;

public class Books {

    // NON COnstructor
   public  Books() {
        System.out.println("Non Parm Constructor");
    }

    // PaRM Construct
    public Books(String author, String title){
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
    }

    public static void main(String[] args) {
        new Books("Automation","Arvind");
       Books book =  new Books();
       book.publisher();
    }

    // Method
    public void publisher(){
        System.out.println("Publisher");
    }

}
