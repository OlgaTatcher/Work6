public class Palindrome {
    public static void main(String[] args) {
        Palindrome palindrome =new Palindrome();
        String firstStringInput="A man, a plan, a canal: Panama";
        String secondStringInput="race a car";
        String thirdStringInput=" ";
        boolean firstResult= palindrome.isPalindrome(firstStringInput);
        boolean secondResult= palindrome.isPalindrome(secondStringInput);
        boolean thirdResult= palindrome.isPalindrome(thirdStringInput);
        System.out.println(firstResult);
        System.out.println(secondResult);
        System.out.println(thirdResult);
    }
    public boolean isPalindrome(String startLine){

        if (startLine.isEmpty()){
            return true;
        }
        startLine=startLine.toLowerCase().replaceAll("[^a-zA-Z0-9]","");

        int leftChar=0;
        int rightChar=startLine.length()-1;
        while (leftChar<rightChar){
            if(startLine.charAt(leftChar)!=startLine.charAt(rightChar)){
                return false;
            }
            leftChar++;
            rightChar--;
        }
        return true;
    }

}