package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ReconstructQueue {
    public static int[][] reconstructQueue(int[][] people) {
        if (people == null || people.length == 0 || people.length == 1) {
            return people;
        }
        Arrays.sort(people,(o1, o2) -> (o1[0] == o2[0] ? o1[1] - o2[1] : o2[0] - o1[0]));
        List<int[]> list = new ArrayList<int[]>();
        for (int[] person : people) {
            list.add(person[1], person);
        }
        int[][] result = list.toArray(new int[people.length][2]);
        return result;
    }

    public static void main(String[] args) {
        int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        people = reconstructQueue(people);
        System.out.println(Arrays.toString(people[0]));
        System.out.println(Arrays.toString(people[1]));
        System.out.println(Arrays.toString(people[2]));
        System.out.println(Arrays.toString(people[3]));
        System.out.println(Arrays.toString(people[4]));
        System.out.println(Arrays.toString(people[5]));

    }
}
