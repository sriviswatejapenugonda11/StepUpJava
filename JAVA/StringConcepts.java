/* 
    Strings are used for storing text.
    A String variable contains a collection of characters surrounded by double quotes (""):
*/

public class StringConcepts {
    public static void main(String[] args) {
        
        // String literal (Static memory) 
        // (value stored string constant pool)
        String name = "Java" ;  
        System.out.println(name);

        // using new keywords (value stored heap memory only)
        String n = new String ("Welcome");
        System.out.println(n);

    // String methods 
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        
        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate")); // Outputs 7

        String t = "Hello";
        System.out.println(t.charAt(0));  // H
       
        String txt1 = "Hello";
        String txt2 = "Hello";
        System.out.println(txt1.equals(txt2)); // true 
        System.out.println(txt1 == txt2);  // true

        String txt3 = new String ("Hello");
        System.out.println(txt1 == txt3); // false
        System.out.println(txt1.equals(txt3)); // true

        // concatenation 
        String firstName = "Java" ;
        String lastName = "Developer" ;

        System.out.println (firstName + " " + lastName);

        // concat method 
        System.out.println(firstName.concat(lastName)) ;

        /* 
            String is an immutable class in Java, 
            which means that once a String object is created, its value cannot be changed. 
            If you want to modify a string a new String object is created and the original remains unchanged.
        */

    //    StringBuffer 
    // Synchronous step by step process , mutable strings and thread safe.
    StringBuffer greetings = new StringBuffer("Hello welcome");
    System.out.println(greetings) ;


    // StringBuilder 
    // non-Synchronous process , mutable strings and not thread safe .
    StringBuilder greetings1 = new StringBuilder("Hello welcome");
    System.out.println(greetings1);

    }

}
