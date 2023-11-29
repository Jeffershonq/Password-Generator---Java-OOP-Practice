package Emailapp;

public class EmailApp {
    public static void main(String[] args){
        Email em1 = new Email("John", "Smith");

        // Implement the Setter Getter
        // em1.setAlternativeEmail("js@gmail.com");
        //System.out.println("Your Alternative Email: " + em1.getAlternativeEmail());

        System.out.println(em1.showInfo());
    }
}
