
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main{
    public static void main(String[] args){
  String str = "cheese";
  String pal = "";
  str = str.toLowerCase();  
  boolean answer = false;
  for (int i = 0; i < str.length(); i++){
   pal = pal + str.charAt(i);

    
  }
  if (str.equals(pal)){
   System.out.println(str + " is palindrome.");
   }
   else {
       
   System.out.println(str + " is not palindrome.");
}
}
//piglatin
public static void main(String[] args) {
    String str = "Piggy";
    int space = 0;
   if (str.length() < 2) {
        return str;   
    }
    if (space == 0) {
    char first = str.substring(0, 1);
     System.out.println(str.substring(1, str.length()) + first +"ay");   
    }
   
}

boolean strictlyAscending(int num) {
    num = num/10;
    int lastnum = num%10;
    while ( num>0) {
        int numnow = num%10;
        if ( numnow >= lastnum){
            return false;
        }
        lastnum=numnow;
        num = num/10;
    }
    return true;
}
public void timesTables(int n) {
    for (int i = 1; i <= n; i++) {
        for (int x = 1; i <= n; x++)
        System.out.println(x*i); //printing product of multiplying values
    }
    System.out.println();  //next line after i reaches n
}
}
    


