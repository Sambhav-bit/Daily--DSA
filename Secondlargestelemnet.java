class Secondlargestelemnet {
    public int getSecondLargest(int[] arr) {
        if (arr == null || arr.length < 2) {
            return -1;
        }
        int largest = Integer.MIN_VALUE;
        int selar = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                selar = largest;
                largest = num;
            } else if (num > selar && num != largest) {
                selar = num;
            }
        }
        return selar == Integer.MIN_VALUE ? -1 : selar;
    }

    public static void main(String[] args) {
        Secondlargestelemnet obj = new Secondlargestelemnet();
        int[] arr = {12, 35, 1, 10, 34, 1};
        System.out.println("Second Largest Element: " + obj.getSecondLargest(arr));
    }
}
