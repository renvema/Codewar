public class TotalPoints {

    public static int points(String[] games) {
        int ourPoints = 0;
        for (int i = 0; i < games.length; i++) {
            String[] point = games[i].split(":");
            int x = Integer.parseInt(point[0]);
            int y = Integer.parseInt(point[1]);
            if (x > y) {
                ourPoints += 3;
            } else if (x == y) {
                ourPoints += 1;
            }
        }
        return ourPoints;
    }
}
