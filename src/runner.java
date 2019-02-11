public class runner {

    public static void main(String[] args) {
        SortCompetition team1 = new Team1SortCompetition();
        int[] randomIntArr = util.randIntArr(10000);
        String[] randStringArr = util.randStringArr(10000, 5);
        Comparable[] randThingyArr=util.randThingyArr(10000);
        String str = "abcde";
        Comparable thingy = new Thingy();
        long time;

        System.out . println("Unsorted");
        util.printArr(randomIntArr);

        long time = System.currentTimeMillis();
        int median = team1.challengeOne(randomIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge One Time Taken: " + time * 0.0001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("All Sorted!");
        util.printArr(randomIntArr);


        System.out . println("Unsorted");
        util.strprintArr(randStringArr);

        long time = System.currentTimeMillis();
        int strPos=team1.challengeTwo(randStringArr,str);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge Two Time Taken: " + time * 0.0001 + " Seconds");
        System.out.println("First index of given string: " + strPos);

        System.out.println("All Sorted!");
        util.printArr(randomIntArr);


        System.out . println("Unsorted");
        util.printArr(randomIntArr);

        long time = System.currentTimeMillis();
        int median = team1.challengeThree(randomIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge Three Time Taken: " + time * 0.0001 + " Seconds");
        System.out.println("Median equals: " + median);

        System.out.println("All Sorted!");
        util.printArr(randomIntArr);


        System.out . println("Unsorted");
        util.thingyprintArr(randThingyArr);

        time = System.currentTimeMillis();
        int thingyPos=team1.challengeFive(randThingyArr,thingy);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge Five Time Taken: " + time * 0.0001 + " Seconds");
        System.out.println("First index of given Thingy: " + thingyPos);

        System.out.println("All Sorted!");
        util.printArr(randomIntArr);


        System.out . println("Unsorted");
        util.thingyprintArr(randThingyArr);

        long time = System.currentTimeMillis();
        int thingyPos=team1.challengeFive(randIntArr);
        time = System.currentTimeMillis() - time;
        System.out.println("Challenge Four Time Taken: " + time * 0.0001 + " Seconds");
        System.out.println("Median equals: " + findMedian);

        System.out.println("All Sorted!");
        util.printArr(randomIntArr);



    }

}
