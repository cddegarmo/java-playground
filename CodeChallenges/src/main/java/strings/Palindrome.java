package strings;

public class Palindrome {

    public boolean isPalindrome(String word){
        char[] wordArray = word.toCharArray();
        int middle = (int) Math.ceil(wordArray.length / 2.0)-1;
        for(int i = 1 ; i < middle ; i++){
            if(wordArray[middle-1] != wordArray[middle+1]){
                return false;
            }
        }
        return true;
    }
}
