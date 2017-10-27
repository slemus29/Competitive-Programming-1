import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * 
 * @author Sebastián Lemus.
 * veredict: accepted.
 */
public class CuttingSticks {
	
	private static int optimizeCuts(int[] cuts, int b, int e, HashMap<String, Integer> memory) {
		if(b == e - 1) {
			return 0;
		}
		String key = b + "-" + e;
		if(memory.containsKey(key)) {
			return memory.get(key);
		}
		int currentPrice = cuts[e] - cuts[b];
		int min = Integer.MAX_VALUE;
		for (int i = b + 1; i < e; i++) {
			int current = optimizeCuts(cuts, b, i, memory) + optimizeCuts(cuts, i, e, memory);
			if(current < min) {
				min = current;
			}
		}
		int result = currentPrice + min;
		memory.put(key, result);
		return result;
	}
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int stickLength = Integer.parseInt(br.readLine());
		
		while(stickLength != 0) {
			int numCuts = Integer.parseInt(br.readLine());
            String c = br.readLine();
            int r = 0;
            if(numCuts > 0){
                int[] cuts = new int[numCuts + 2];
                cuts[0] = 0;
                cuts[cuts.length -1] = stickLength;
                int i = 1;
                for(String s: c.split(" ")) {
                    cuts[i++] = Integer.parseInt(s);
                }
                r = optimizeCuts(cuts, 0, cuts.length - 1, new HashMap<String, Integer>());
            }
			System.out.println("The minimum cutting is " + r + ".");
			stickLength = Integer.parseInt(br.readLine());
		}
	}
}
