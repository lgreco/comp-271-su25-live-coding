public class DynamicArray_Implementation {
    public static void main(String[] args) {
        nfs_DynamicArray<String> dynamicArray1 = new nfs_DynamicArray<>();
        nfs_DynamicArray<Integer> dynamicArray2 = new nfs_DynamicArray<>();
        dynamicArray1.add("Hello");
        dynamicArray1.add("world");
        System.out.println(dynamicArray1);
        System.out.println(dynamicArray2);
    }
}
