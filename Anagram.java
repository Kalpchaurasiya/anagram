import java.util.*;
public class Anagram {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String A=sc.next();
        String rev ="";
        for(int i = A.length()-1;i>=0;i--){
            rev = rev + A.charAt(i);
        }
        if(rev.equals(A)){
            System.out.println("Yes, the word an anagram");
        }
        else{
        System.out.println("No , it's not an anagram");
        }
    }
}