import java.util.HashSet;
import java.util.Set;

public class DuplicateInArray {
    public static void main(String[] args) {
        DuplicateInArray duplicate=new DuplicateInArray();
        int[] firstArray={1,2,3,1};
        int[] secondArray={1,2,3,4};
        int[] thirdArray={1,1,1,3,3,4,3,2,4,2};
        boolean result1=duplicate.containsDuplicate(firstArray);
        boolean result2=duplicate.containsDuplicate(secondArray);
        boolean result3=duplicate.containsDuplicate(thirdArray);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet=new HashSet<>();
        for(int number:nums){
            if(numSet.contains(number)){
                return true;
            }else{
                numSet.add(number);
            }
        }
        return false;
    }
}
