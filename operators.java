//operators in java
 // operator is a symbol that perform operations on variables and values
/*  Arithmetic operators
    unary operators 
    relational operators
    Conditional operators
     Assignment operators
    */
public class OperatorsPractice {
  public static void main(String[] args){
    int i = 20;
    int j = 10
      //arithmetic operators
    System.out.println(i+j);
    System.out.println(i-j);
    System.out.println(i*j);
    System.out.println(i/j);
    System.out.println(i%j);
    //unary operators
    // ++ increment
    // -- decrement
    System.out.println(i);   //20
    System.out.println(++i);  //21
    System.out.println(i++);  //21
    System.out.println(i);    //22
     
    System.out.println(i); //20
    System.out.println(--i); //19
    System.out.println(i--);  //19
    System.out.println(i);  //18

    //Relational operators or comparision operators
    /* ==(equal to)
      !=(not equal to)
      >(greater than)
      <(less than)
      >= (greater than or equal to)
      <=(lessthan or equal to)
      */
     System.out.println(i==j); 
     System.out.println(i!=j); 
     System.out.println(i<j); 
     System.out.println(i>j); 
     System.out.println(i<=j); 
     System.out.println(i>=j);

    // Conditional statements
     /* And table
       true -true -> true
       true - false -> false
       false -true ->false
       false - false -> false
       */
    System.out.println(i<j &&i==j);
    
    /* or table
        true -true -> true
       true - false -> true
       false -true -> true
       false - false -> false
      */
    System.out.println(i<j || i==j);
  }
}
//Assignment operators
/*
Operator	      Example	     Same as	
+=	          x += 3   	     x = x + 3	
-=	          x -= 3     	   x = x - 3	
*=	          x *= 3	         x = x * 3	
/=	          x /= 3     	   x = x / 3	
%=  	        x %= 3	         x = x % 3	
&=	          x &= 3	         x = x & 3	
|=	          x |= 3	          x = x | 3	
^=	          x ^= 3	         x = x ^ 3	
>>=	          x >>= 3	        x = x >> 3	
<<=   	      x <<= 3  	      x = x << 3
*/
i += 5; 
System.out.println(i);
i %=5;
System.out.println(i);
