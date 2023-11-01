public class Main {
    public static void main(String[] args) {
        Complex a = new Complex(1, 3);
        Complex b = new Complex(1, 1);
        System.out.println(a.add(b).toString());
        System.out.println(a.substract(b).toString());
        System.out.println(a.multiplyScalar(5).toString());
        System.out.println(new Complex(0, 0));
        System.out.println(new Complex(5, 0));

        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = arr1.clone();
        arr2[1] = 500;
        System.out.println(arr1[1]);
//        int lo = 0;
//        int hi = arr1.length - 1;
//        while (lo < hi) {
//            int aux = arr1[lo];
//            arr1[lo] = arr1[hi];
//            arr1[hi] = aux;
//            lo++;
//            hi--;
//        }
//        System.out.println(Arrays.toString(arr1));

        char[] str = "ana are mere".toCharArray();
        int lo = 0;
        int hi = str.length - 1;
        while (lo < hi) {
            char aux = str[lo];
            str[lo] = str[hi];
            str[hi] = aux;
            lo++;
            hi--;
        }
        for (char c : str) {
            System.out.print(c);
        }
        System.out.println();

        ComplexMatrix complexMatrix1 = new ComplexMatrix(10, 10);
        for (int i = 0; i < complexMatrix1.height; i++) {
            for (int j = 0; j < complexMatrix1.width; j++) {
                complexMatrix1.matrix[i][j] = new Complex(i, j);
            }
        }
        complexMatrix1.print();
        ComplexMatrix complexMatrix2 = new ComplexMatrix(10, 10);
        for (int i = 0; i < complexMatrix2.height; i++) {
            for (int j = 0; j < complexMatrix2.width; j++) {
                complexMatrix2.matrix[i][j] = new Complex(j, i);
            }
        }
        complexMatrix2.print();
        ComplexMatrix complexMatrix3 = complexMatrix1.add(complexMatrix2);
        complexMatrix3.print();
        ComplexMatrix complexMatrix4 = complexMatrix1.substract(complexMatrix2);
        complexMatrix4.print();
        ComplexMatrix complexMatrix5 = complexMatrix1.multiplyScalar(5);
        complexMatrix5.print();
    }
}