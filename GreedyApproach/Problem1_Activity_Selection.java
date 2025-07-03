import java.util.*;

public class Problem1_Activity_Selection {

    static class Activity {
        int start, end;

        Activity(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    public static void ActivitySelection(Activity[] activities) {
        Arrays.sort(activities, Comparator.comparingInt(a -> a.end));

        int count = 1; 
        int lastEnd = activities[0].end;

        for (int i = 1; i < activities.length; i++) {
            if (activities[i].start >= lastEnd) {
                count++;
                lastEnd = activities[i].end;
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of activities:");
        int n = sc.nextInt();

        Activity[] activities = new Activity[n];

        System.out.println("Enter start and end times of each activity:");
        for (int i = 0; i < n; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            activities[i] = new Activity(start, end);
        }

        ActivitySelection(activities);
        
    }
}
