package datastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Queue0509 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringTokenizer risk = new StringTokenizer(br.readLine(), " ");
        Queue<Person> queue = new LinkedList<>();

        int result = 0;

        for(int i = 0; i < n; i++){
            queue.offer(new Person(i, Integer.parseInt(risk.nextToken())));
        }

        while (!queue.isEmpty()){
            Person temp = queue.poll();
            for (Person p : queue) {
                if(p.getRisk() > temp.getRisk()){
                    queue.offer(temp);
                    temp = null;
                    break;
                }
            }
            if(temp != null){
                result++;
                if(m == temp.getId()){
                    System.out.println(result);
                    break;
                }
            }
        }
    }

    /**
     * 환자의 순서를 식별하기 위한 Class
     */
    static class Person {
        public Integer id;
        public Integer risk;

        public Person(Integer id, Integer risk) {
            this.id = id;
            this.risk = risk;
        }

        public Integer getId() {
            return id;
        }

        public Integer getRisk() {
            return risk;
        }
    }
}
