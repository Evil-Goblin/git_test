import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;

        Queue<Integer> print_list = new LinkedList<>();

        Iterator<Integer> it = null;

        for (int i = 0; i < priorities.length; i++) {
        	print_list.add(priorities[i]);
        }

        Arrays.sort(priorities);

        // for (int i = priorities.length-1; i >=0 ; i--) {
        // 	System.out.print(priorities[i]+" ");
        // }
        // System.out.println();

        for (int i = priorities.length-1; i >=0 ; i--) {
        	
        	while (print_list.peek()!=priorities[i]) {
        		print_list.add(print_list.poll());
        		// System.out.println(location);
        		location--;
        		if (location<0) {
        			location = print_list.size()-1;
        		}
        	}
        	// it = print_list.iterator();
        	// while(it.hasNext()){
        	// 	System.out.print(it.next()+" ");
        	// }
        	// System.out.println("   location : "+location+"  size : "+print_list.size());
        	print_list.poll();
        	answer++;

        	System.out.println("location : "+location+"  answer : "+answer);
        	if (location == 0) {
        		return answer;
        	}
        	location--;
        }

        return answer;
    }

    public static void main(String[] args) {

    	int[] priorities = {2, 1, 3, 2};
    	int location = 2;

    	Solution result = new Solution();

    	System.out.println(result.solution(priorities,location));
    }
}