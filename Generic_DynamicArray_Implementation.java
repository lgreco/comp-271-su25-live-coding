public class Generic_DynamicArray_Implementation {
    public static void main(String[] args) {
        nfs_GenericDynamicArray <String> dynamicArray1 = new nfs_GenericDynamicArray<>();
        nfs_DynamicArray<Integer> dynamicArray2 = new nfs_GenericDynamicArray<>();
        dynamicArray1.add("Hello");
        dynamicArray1.add("world");
        System.out.println(dynamicArray1);
        System.out.println(dynamicArray2);
    }
}
