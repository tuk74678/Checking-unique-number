import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

//        int[] nums = new int[] {1,5,1,6,7,6,8,6,2};
//        System.out.println("The sum of this array is: " + sumOfUnique(nums));
//
//        System.out.println("Input any String you want to look for vowel: ");
//
//        String input = new String("Hello World");
//
//        System.out.println("The number of vowel in this String is: " + countVowel(kb.nextLine()));
        int[] nums = new int[]{56,56};
        System.out.println("Check array 1: " + sorted(nums) );

    }
    public static boolean sorted(int[] nums){

        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] > nums[i+1]){
                    return false;
            }
        }
        return true;
    }
    public static int sumOfUnique(int[] nums){

        int sum = 0;

        for (int i = 0; i < nums.length; i++){

            int count = 0;

            for (int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1){
                sum = sum + nums[i];
            }
        }

        return sum;
    }
    public static int countVowel(String word){

        int vowelCount = 0;
        word = word.toLowerCase();

        String vowel = "aeiou";

        for(int i = 0; i < word.length(); i++){
            char c = word.charAt(i);
            if(vowel.contains(String.valueOf(c))){
                vowelCount++;
            }
        }

        return vowelCount;

    }
}