package Week1;


public class NumFrequency {
    public static void main (String[] args) {
        int[] numbers = new int[100];
        for (int i=0; i < 100; i++) {
            numbers[i] = (int) (Math.random()*10);
        }

        int[] frequency = new int[10];
        for (int number : numbers) {
            frequency[number]++;
        }
        System.out.println("Number    Frequency");
        for (int i = 0; i < frequency.length; i++) {
            System.out.printf("  %d        %2d%n", i, frequency[i]);
        }
    }
}
