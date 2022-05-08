package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Array0201 {

    public static void main(String[] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        List<Integer> list = new ArrayList<>();

        int value = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++){
            int temp = Integer.parseInt(st.nextToken());
            if(value < temp){
                value = temp;
                list.add(temp);
            }else {
                value = temp;
            }
        }

        for (Integer number : list) {
            System.out.print(number + " ");
        }
    }
}
