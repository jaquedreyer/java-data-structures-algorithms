package java101;

/* Multidimensional Arrays
Is an array of arrays by using two or more sets of brackets [][]
Is an array whose components are themselves arrays
*/

class MultiDimensionalArray {
    public static void main(String[] args) {
        String[][] names = {
                {"Mr. ", "Mrs. ", "Ms. "},
                {"Smith", "Jones"}
        };

        System.out.println(names[0][0] + names[1][0]); // Mr. Smith
        System.out.println(names[0][2] + names[1][1]); // Ms. Jones
        System.out.println(names.length); // 2
    }
}