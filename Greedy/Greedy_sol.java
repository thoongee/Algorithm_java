import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Solution {

    public static int findMinGasStation(List<GasStation> gasStationList, int distanceToHome,
        int currentFuel) {

        PriorityQueue<GasStation> stations = new PriorityQueue<>(gasStationList);
        PriorityQueue<Integer> fuels = new PriorityQueue<>(Collections.reverseOrder());
        int answer = 0;

        while (currentFuel < distanceToHome) {
            while (!stations.isEmpty() && stations.peek().dist <= currentFuel) {
                fuels.add(stations.poll().fuel);
            }

            if (fuels.isEmpty()) {
                return -1;
            }

            answer++;
            currentFuel += fuels.poll();
        }

        return answer;

//        int answer = 0;
//        // please write your code
//        return answer;
    }

    public static class GasStation implements Comparable<GasStation> {

        int dist;
        int fuel;

        public GasStation(int dist, int fuel) {
            this.dist = dist;
            this.fuel = fuel;
        }

        @Override
        public int compareTo(GasStation o) {
            return this.dist - o.dist;
        }
    }
}