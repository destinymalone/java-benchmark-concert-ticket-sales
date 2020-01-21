public class Available {
    String time;

    void setTime(String t) {
        time = t;
    }

    String getTime() {
        return time;
    }
}

class ClockTestDrive {
    public static void main(String[] args) {
        Available c = new Available();

        c.setTime("12:45");

        String tod = c.getTime();
        System.out.println("time: " + tod);
    }
}