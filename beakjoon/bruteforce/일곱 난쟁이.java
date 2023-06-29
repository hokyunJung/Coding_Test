package beakjoon.bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SevenDwarf {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] heights = new int[] {10, 20, 30, 40, 50, 60, 70, 80, 90};
        
        // Read the heights of the dwarfs
        //for (int i = 0; i < 9; i++) {
        //    heights[i] = Integer.parseInt(br.readLine());
        //}
        
        // Find the combination of seven dwarfs whose heights sum up to 100
        findSevenDwarfs(heights);
    }

    public static void findSevenDwarfs(int[] heights) {
        Arrays.sort(heights);
        int sum = Arrays.stream(heights).sum();

        for(int i = 0; i < heights.length - 1; i++) {
            for(int j = i + 1; j < heights.length; j++) {
                if(sum - heights[i] - heights[j] == 100) {
                    for(int k = 0; k < heights.length; k++) {
                        if(i != k && j != k) {
                            System.out.println(heights[k]);
                        }
                    }
                }
            }
        }
    }
}
