import java.util.Scanner;
class Solution{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] dateOneArray = new int[3];
        int[] dateTwoArray = new int[3];

        String[] dateOne = scanner.nextLine().split(" ");

        for (int i = 0; i < dateOne.length; i++) {
            dateOneArray[i] = Integer.parseInt(dateOne[i]);
        }

        String[] dateTwo = scanner.nextLine().split(" ");

        for (int i = 0; i < dateTwo.length; i++) {
            dateTwoArray[i] = Integer.parseInt(dateTwo[i]);
        }
        int hackos = 0;

        // check days
        if (dateOneArray[0] >= dateTwoArray[0]) {
            hackos = (dateOneArray[0] - dateTwoArray[0]) * 15;
        }

        if (dateOneArray[1] > dateTwoArray[1]) {
            hackos = (dateOneArray[1] - dateTwoArray[1]) * 500;
        }else if(dateOneArray[1]<dateTwoArray[1]) {
            hackos=0;
        }

        if (dateOneArray[2] > dateTwoArray[2]) {
            hackos = 10000;
        }else if (dateOneArray[2]<dateTwoArray[2]){
            hackos=0;
        }

        System.out.println(hackos);
    }
}