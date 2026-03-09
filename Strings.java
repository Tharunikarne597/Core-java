public class Java_Strings {

	public static void main(String[] args) {
		//string
		//Strings are used for storing text
		// A string variable contains a collection of characters surrounded by double quotes("");
		
		String name = "hello";
		System.out.println(name);
		
	// String in Java is actually an object which means it contains methods that can perform certain operations on strings
        
		String txt = "abcdefghijklmnopqrstuvwxyz";
       	System.out.println("the length of String is:" + txt.length());
        
       	//More String methods
      //the toUpperCase() method converts a string to upper case letters
      // the toLowerCase() method converts a string to lower case letters
       	 
        String xt = "hello world";
        System.out.println(xt.toUpperCase());
        System.out.println(xt.toLowerCase());
        
        //Finding a character in a String
       //indexOf() method returns the index(the position) of the frist occurrence of a specified text in a String(includingwhitespace)
       
        String txt1 = "please locate where 'locate' occurs!";
        System.out.println(txt1.indexOf("locate"));
        System.out.println(txt1.indexOf("where"));
        System.out.println(txt1.indexOf("please"));
       
        name = name + "reddy";
        System.out.println("hello world");  
	}

}
