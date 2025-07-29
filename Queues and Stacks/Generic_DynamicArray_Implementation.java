public class Generic_DynamicArray_Implementation {
    public static void main(String[] args) {
        alt_GenericDynamicArray <String> dynamicArray1 = new alt_GenericDynamicArray<>();
        alt_DynamicArray<Integer> dynamicArray2 = new alt_GenericDynamicArray<>();
        dynamicArray1.add("Hello");
        dynamicArray1.add("world");
        System.out.println(dynamicArray1);
        System.out.println(dynamicArray2);
    }
}
