package practise;

public class AutoPolicy {
    public static void main(String[] args) {
        int count = 1;
        while (count <= 10){
            if (count == 5){
                continue;
            }
            System.out.println(count);
            count++;
    }

    }
}
