package greedy;

public class FindContentChildren {
    public static int findContentChildren(int[] g, int[] s) {
        quickSort(g, 0, g.length - 1);
        quickSort(s, 0, s.length - 1);
        int i = 0, j =0;
        int sum = 0;
        while(i < g.length && j < s.length) {
            if(g[i] <= s[j]) {
                i++;
                j++;
                sum++;
            }else {
                j++;
            }
        }
        return sum;
    }
    public static void quickSort(int[] arr, int left, int right) {
        if(left < right) {
            int i = left;
            int j = right;
            int temp = arr[left];
            while(i < j) {
                while(i < j && arr[j] > temp) {
                    j--;
                }
                if(i < j) {
                    arr[i] = arr[j];
                    i++;
                }
                while(i < j && arr[i] < temp) {
                    i++;
                }
                if(i < j) {
                    arr[j] = arr[i];
                    j--;
                }
            }
            arr[i] = temp;
            quickSort(arr, left, i-1);
            quickSort(arr, i + 1, right);
        }
    }

    public static void main(String[] args) {
        int[] g = {1};
        int[] s = {0};
        System.out.println(findContentChildren(g,s));
    }
}
