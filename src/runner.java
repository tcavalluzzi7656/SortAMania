public class runner {

    public static void main(String[] args) {
        SortCompetition team1 = new Team1SortCompetition();
        int[] randomIntArr = util.randIntArr(10000);
        String[] randStringArr = util.randStringArr(10000, 5);





        System.out . println("Unsorted");
        util.printArr(randomIntArr);

        long time = System.currentTimeMillis();
        int median = team1.challengeOne(randomIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.0001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("All Sorted!");
        util.printArr(randomIntArr);





    }

}
