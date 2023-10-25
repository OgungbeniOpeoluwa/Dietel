package liangExcersise;

public class CheckPassword {

    public static boolean passwordValidity(String words) {
        String word = words.toLowerCase();
        int result = check(word);
        boolean answer = false;
        if(results) {
            if (result >= 2 && word.length() >= 8) {
                answer = true;
            }
        }
        return answer;
    }
        public static int check(String password){
        int result = 0;
        for(int count = 0;count < password.length();count++){
            if(String.valueOf(password.charAt(count)).matches("\\d++")){
                result++;
            }
        }
        return result;

        }

    public static void main(String[] args) {

        System.out.println(check("opemip125"));
    }

}
