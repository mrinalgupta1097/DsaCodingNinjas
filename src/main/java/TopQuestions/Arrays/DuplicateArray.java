package TopQuestions.Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class DuplicateArray {
    public boolean containsDuplicate(int[] nums) {
        AtomicBoolean flag = new AtomicBoolean(true);
        //hashing
        Map<Integer,Integer> map = new HashMap<>();
        //iterate to capture the occurrance
        for(int i = 0; i<=nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }else{
                map.put(nums[i], 1);
            }
        }
        map.forEach((k,v) ->{
            if(v == 1){
                flag.set(false);
            }
        });
        return flag.get();
    }
}
