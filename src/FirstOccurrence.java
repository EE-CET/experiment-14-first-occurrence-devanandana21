import java.util.Scanner;

public class FirstOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] Arr = new int[N];

        for (int i = 0; i < N; i++) {
            Arr[i] = sc.nextInt();
        }
        sc.close();

        int position = -1;

        for (int i = 0; i < N; i++) {
            if (Arr[i] == K) {
                position = i + 1; // 1-based index
                break;
            }
        }

        System.out.println(position);
    }
}
