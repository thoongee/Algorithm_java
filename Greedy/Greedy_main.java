import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        List<Solution.GasStation> gasStationList = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int dist = Integer.parseInt(st.nextToken());
            int fuel = Integer.parseInt(st.nextToken());

            gasStationList.add(new Solution.GasStation(dist, fuel));
        }

        st = new StringTokenizer(br.readLine());
        int distanceToHome = Integer.parseInt(st.nextToken());
        int currentFuel = Integer.parseInt(st.nextToken());

        Solution solution = new Solution();
        System.out.println(solution.findMinGasStation(gasStationList, distanceToHome, currentFuel));
    }
}