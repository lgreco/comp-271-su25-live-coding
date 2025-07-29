public class alt_DynamicArray_Implementation {
    public static void main(String[] args) {
        alt_DynamicArray<String> dynamicArray1 = new alt_DynamicArray<>();
        alt_DynamicArray<Integer> dynamicArray2 = new alt_DynamicArray<>();
        dynamicArray1.add("A");
        dynamicArray1.add("B");
        dynamicArray1.add("C");
        dynamicArray1.add("D");
        dynamicArray1.add("E");
        dynamicArray1.add("F");
        System.out.println(dynamicArray1);
        // System.out.println(dynamicArray2);
        System.out.println(dynamicArray1.remove(0));
        System.out.println(dynamicArray1.remove(0));
        System.out.println(dynamicArray1.remove(0));
        System.out.println(dynamicArray1.remove(0));
        System.out.println(dynamicArray1.remove(0));
        System.out.println(dynamicArray1.remove(0));
        System.out.println(dynamicArray1.remove(0));
    }
}
