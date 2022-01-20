import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(8);
        arrayList.add(10);
        arrayList.add(13);
        arrayList.add(19);
        arrayList.add(22);
        arrayList.add(26);
        arrayList.add(34);
        arrayList.add(37);

        arrayList.stream().sorted();

        System.out.print("Mảng: ");
        arrayList.forEach(value -> System.out.print(value + "\t"));
        System.out.println();

        int value = 34;
        int index = binarySearch(arrayList, value);
        System.out.println("Tìm kiếm giá trị value=" + value + ": index=" + index);


    }

    public static int binarySearch(ArrayList<Integer> arrayList, int value) {
        // arrayList must be sorted
        int index = -1;
        int left = 0;
        int right = arrayList.size();

        while (left < right) {
            int mid = (right + left) / 2;

            if (value == arrayList.get(mid)) {
                index = mid;
                break;
            }

            if (value < arrayList.get(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return index;
    }

}
