import java.time.LocalTime;

public class TimeBasedGreeting {
    public static void main(String[] args) {
        // Get the current hour
        int currentHour = LocalTime.now().getHour();

        // Determine the appropriate greeting based on the time
        if (currentHour >= 5 && currentHour < 12) {
            morningGreeting();
        } else if (currentHour >= 12 && currentHour < 17) {
            afternoonGreeting();
        } else if (currentHour >= 17 && currentHour < 21) {
            eveningGreeting();
        } else {
            nightGreeting();
        }
    }

    // Function for morning greeting
    public static void morningGreeting() {
        System.out.println("Good Morning! Have a wonderful day ahead!");
    }

    // Function for afternoon greeting
    public static void afternoonGreeting() {
        System.out.println("Good Afternoon! Hope you're having a productive day!");
    }

    // Function for evening greeting
    public static void eveningGreeting() {
        System.out.println("Good Evening! Relax and enjoy your evening!");
    }

    // Function for night greeting
    public static void nightGreeting() {
        System.out.println("Good Night! Sleep well and sweet dreams!");
    }
}

