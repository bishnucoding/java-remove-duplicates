import java.util.HashMap;
import java.util.Map;

/**
 * RemoveDuplicates
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] input = new int[]{1,3,54,6,3,2,5,4,2,55, 55,55,55};

        Map<Integer, Boolean> map = new HashMap<Integer, Boolean>();

        for(int i : input){
            map.put(i, true);
        }

        System.out.println(map.keySet());
    }
}

//Time complexity: O(n) because all the n elements are iterated once and inserted to map. For map insertion time is constant.
//Space complexity: O(n) because additional map is used. At max the map can contain n elements.
