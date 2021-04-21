package arrays;

/**
 * @author arun on 4/19/21
 */
public class DeleteAnArray {
    public void deleteAnElementAtASpecifiedIndex(int index, String[] data) {

        //1. get the size of the array
        //2. and move all the elements from end of the index till the deleted index one by one.

        final int length = data.length;
        for (int i = index; i < data.length; i++) {
            data[i - 1] = data[i];
        }

        data[length - 1] = null;
    }
}
