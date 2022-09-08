import java.util.*;
public class FindOutWeight{
    public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.println("Enter the length of the Array");
int length=input.nextInt();
int[] arr=new int[length];
int number;
for(int i=0; i<length; i++){
    number=input.nextInt();
    arr[i]=number;
    }
    int count=0;

    System.out.println(Arrays.toString(arr));
    ArrayList<Integer> weight=new ArrayList<Integer>();
    for (int i=0; i<length; i++){
        count=0;
        if((Math.sqrt(arr[i])-Math.floor(Math.sqrt(arr[i]))==0)){
           count+=5;
        }
        if((arr[i]%4==0)&&(arr[i]%6==0)){
            count+=4;
        }
        if(arr[i]%2==0){
            count+=3;
        }
        weight.add(count);
    }   
    int min; 
    
    for (int i=0; i<length; i++){
        min=0;
        for(int j=0; j<length; j++){
            if(weight.get(j)!=-1){
                min=Math.max(min,weight.get(j));
            }
        }
        System.out.print("<"+arr[weight.indexOf(min)]+","+min+"> ");
        weight.set(weight.indexOf(min),-1);
    }
}
}
