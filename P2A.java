import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] winner = new String[n + 1];
        int[] points = new int[n + 1];

        for (int k = 1; k <= n; k++) {
            winner[k] = sc.next();
            points[k] = sc.nextInt();
        }

        Set<String> players = new HashSet<>();
        for (int k = 1; k <= n; k++) {
            players.add(winner[k]);
        }

        Map<String, int[]> state = new HashMap<>();
        int[] zeroVec = new int[n + 1];
        for (String player : players) {
            state.put(player, zeroVec.clone());
        }

        for (int k = 1; k <= n; k++) {
            for (String player : players) {
                state.get(player)[k] = state.get(player)[k - 1];
            }
            state.get(winner[k])[k] += points[k];
        }

        int maxScore = 0;
        for (String player : players) {
            if (state.get(player)[n] > maxScore) {
                maxScore = state.get(player)[n];
            }
        }

        String finalWinner = "";
        outer:
        for (int k = 1; k <= n; k++) {
            for (String player : players) {
                if (state.get(player)[k] >= maxScore && state.get(player)[n] == maxScore) {
                    finalWinner = player;
                    break outer;
                }
            }
        }

        System.out.println(finalWinner);
    }
}
