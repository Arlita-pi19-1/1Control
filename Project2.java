public class Project2 {
    public static void main(String[] args) {
        System.out.println("\r\n2 - задание");
        int[] arr2 = new int[8];
        for (int i = 1, j = 0; i < arr2.length; i++) arr2[i] = j += 3;
        for (int x : arr2) System.out.print(x + " ");
    }

}
