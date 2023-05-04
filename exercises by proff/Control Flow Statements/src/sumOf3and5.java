public class sumOf3and5 {
    // for statement (range 1 - 1000)
    //find numbers diviisble by both 3 & 5
    //make another variable where each number is stored and next comes and make sum with it
    //count = 0, increment count till it reaches 5 and then jump ut of loop with break

    public static void main (String [] args){
        int count = 0;
        int sumNumbers = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                    count++;
                    System.out.println("Number: " + i);
                    sumNumbers = sumNumbers + i;
                    if (count >= 5){
                        break;
                    }
                }
        }

        System.out.println("Sum of numbers divisible by 3 & 5 is: " + sumNumbers);
    }

}
