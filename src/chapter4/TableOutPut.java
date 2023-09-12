package chapter4;

public class TableOutPut {
    public static void main(String[] args) {
        int number =1;
        int sum = 1;

while(number <= 5) {
    for(int row = 1 ;row<= 2 ;row++){
        sum *= number;
    number++;

    System.out.println(sum);
}
   //for(int row = 1 ;row<= 5 ;row++){
}


    }
}
