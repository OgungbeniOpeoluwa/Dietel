package ceaser_cipher;

public class Encrypt {
    public static String [] alphabet(){
        String [] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N",
                "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
        return letters;
    }

    public static String[] encryptFunction(int key) {
        String [] letters = alphabet();
        int count = 0;
        String [] result = new String [letters.length];
        for(int counter = key; counter < letters.length;counter++){
            result[counter] = letters[count];
            count++;
            if(counter == letters.length-1){
                encryptFunction(result,key,count,letters);
            }
        }
        return result;
    }
    public static void encryptFunction(String [] returns, int key, int count, String[] letters){
        for(int start = 0; start < key;start++){
            returns[start] = letters[count];
            count++;
        }
    }

    public static String encryptedLetter(String letter,int key) {
        String user_input = letter.toUpperCase();
        String [] letters = alphabet();
        String result = "";
        for(int count = 0 ; count < user_input.length();count++){
            for(int numb = 0; numb< letters.length;numb++){
                if(String.valueOf(user_input.charAt(count)).equals(letters[numb])){
                    result += encryptedLetter(numb,key);
                }
            }

        }
        return  result;
    }
    public static String encryptedLetter(int letter,int key){
        String [] result = encryptFunction(key);
        return result[letter];
    }

    public static String decryptLetter(String letter, int key) {
        String userInput  = letter.toUpperCase();
        String [] letters = alphabet();
        String [] encryptedLetter = encryptFunction(key);
        String result = "";
        for(int count = 0;count < userInput.length();count++){
            for(int counter = 0;counter < encryptedLetter.length;counter++){
                if(String.valueOf(userInput.charAt(count)).equals(encryptedLetter[counter])){
                    result += letters[counter];
                }
            }
        }
        return result;
    }
}
