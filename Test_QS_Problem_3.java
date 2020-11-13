import java.util.LinkedList;
import java.util.Queue;
import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int bridge_weight = 0;
        int tw_index = 0;
        Queue<Integer> bridge = new LinkedList<>();

        for (int i = 0; i < bridge_length; i++) {
			bridge.add(0);
        }

        while (!bridge.isEmpty()) {
        	bridge_weight -= bridge.peek();
        	if(tw_index>=truck_weights.length){

        	}else if (bridge_weight+truck_weights[tw_index]<=weight) {
        		bridge.add(truck_weights[tw_index]);
        		bridge_weight += truck_weights[tw_index];
        		tw_index++;
        	}else{
        		bridge.add(0);
        	}
        	answer++;

        	bridge.poll();
        }

        return answer;
    }

    public static void main(String[] args) {
    	int bridge_length = 100;
    	int weight = 100;
    	int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};

    	Solution result = new Solution();

    	System.out.println(result.solution(bridge_length,weight,truck_weights));
    }
}