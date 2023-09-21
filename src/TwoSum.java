import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum numbers=new TwoSum();
        int [] firstArray={2,7,11,15};
        int firstTarget=9;
        int [] result1=numbers.twoSum(firstArray,firstTarget);
        System.out.println(result1[0]+" "+result1[1]);

        int [] secondArray={3,2,4};
        int secondTarget=6;
        int [] result2=numbers.twoSum(secondArray,secondTarget);
        System.out.println(result2[0]+" "+result2[1]);

        int [] thirdArray={3,3};
        int thirdTarget=6;
        int [] result3=numbers.twoSum(thirdArray,thirdTarget);
        System.out.println(result3[0]+" "+result3[1]);

    }
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> result=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(result.containsKey(target-nums[i])){
                return new int[]{result.get(target-nums[i]), i};
            }
            result.put(nums[i],i);
        }
        return null;
    }
}
