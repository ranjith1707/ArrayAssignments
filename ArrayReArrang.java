import java.util.*;
public class ArrayReArrang{
    public static void main(String[] args){
      Scanner input=new Scanner(System.in);
      System.out.println("Enter the length of the an Array");
      int length=input.nextInt();
      int[] arr=new int[length];
      int number;
      for(int i=0; i<length; i++){
        number=input.nextInt();
        arr[i]=number;
      }
      Arrays.sort(arr);
      System.out.println("---------------------------------");
      int siz;
      int sis;
      if(length%2==0){
        sis=(length/2)-1;
        siz=(length/2)-1;
      }
      else{
         siz=(length/2);
         sis=siz;
      }
      
      for(int i=0; i<length; i++){
        if(i%2==0){
         System.out.println(arr[siz]);
         siz--;
        }
        else{
          sis++;
         System.out.println(arr[sis]);
         
        }
      }
    }
}
