import java.util.*;
public class StringPatten{
    public static void main(String[] args){
Scanner input=new Scanner(System.in);
String str=input.next();
if(str.length()%2==0){
    System.out.println("O");

}
else{
    for(int i=1;i<=str.length(); i++ ){
        for (int j=1; j<=str.length();j++){
            if(j==i||j==str.length()-i+1){
                System.out.print(str.charAt(j-1));
            }
            System.out.print(" ");
        }
        System.out.println();
    }
}
}
}