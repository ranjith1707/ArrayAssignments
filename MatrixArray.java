import java.util.*;
public class MatrixArray{
    public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.println("Enter row in matrix");
int first=input.nextInt();
System.out.println("Enter the comumn in Matrix");
int second=input.nextInt();
int[][] firstArr=new int[first][second];
int number;
for(int i=0; i<first; i++){
    for (int j=0; j<second; j++){
        number=input.nextInt();
        firstArr[i][j]=number;
    }
}

System.out.println("enter the row in second Matrix");
int fi=input.nextInt();
System.out.println("Enter the column in second Matrix");
int se=input.nextInt();
int[][] secondArr=new int[fi][se];
for(int i=0; i<fi; i++){
    for (int j=0; j<se; j++){
        number=input.nextInt();
        secondArr[i][j]=number;
    }
}
System.out.println("First Matrix is  "+Arrays.deepToString(firstArr)+"\n");
System.out.println("Second Matrix is  "+Arrays.deepToString(secondArr)+"\n");
int[][] output=new int[first][se];
if(second==fi){
    int value=0;
for(int k=0; k<first; k++){
  for (int i=0;  i<se;i++){
    for(int j=0; j<second; j++){
       int mul=firstArr[k][j] * secondArr[j][i];
       value+=mul;
     
    }
    output[k][i]=value;
    value=0;
  }

}
}
else{
    System.out.println("Enter the correct Matrix ");
}
System.out.println("Final outputMatrix is   "+Arrays.deepToString(output));
}
}
