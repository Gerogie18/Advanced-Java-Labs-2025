public class LargestInteger {
    public static void main(String[] args) {
        int[] integers = new int[5];
        System.out.println("Integer Pool:");
        for (int i = 0; i <5; i++) {
            integers[i] = (int) (Math.random() * 100)+1;
            System.out.println(integers[i]);
        }

        int largest = integers[0];
        for (int i = 1; i < 5; i++) {
            if (integers[i] > largest) {
                largest = integers[i];
            }
        }

        System.out.print("Largest Integer: ");
        System.out.print(largest);
    }
}
