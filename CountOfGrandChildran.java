import java.util.*;
public class CountOfGrandChildran{
  public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.println("Enter the length of main Array");
   int length=input.nextInt();
   String[][] relation=new String[length][2];
   String data;
for(int i=0; i<length; i++){
    System.out.println("Enter the numbets  for "+i+ " th index Array");
    for (int j=0; j<2; j++){
        data=input.next();
        relation[i][j]=data;
    }
   }
   System.out.println("Enter name for find the grandChildran");
   String parant=input.next();
   String temp;
   int count=0;
    for(int i=0; i<relation.length; i++){
        for(int j=0; j<2; j++){
            temp=relation[i][1];
            if(parant.equals(temp)){
                   temp=relation[i][0];
                   for(int k=0; k<relation.length; k++){
                   if(temp.equals(relation[k][1])){
                    count++;
                   }
                   }
                   break;
            }
        }
    }
    System.out.println(parant+"  has "+count+" grandChildran");
  }
}