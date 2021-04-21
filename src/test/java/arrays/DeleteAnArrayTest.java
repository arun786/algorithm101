package arrays;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author arun on 4/19/21
 */
public class DeleteAnArrayTest {
    DeleteAnArray deleteAnArray = new DeleteAnArray();

    @Test
    public void testDeleteAnElementAtSecondPlace() {
        String[] name = {"Arun", "Arav", "Sudha", "Adwiti", "Pushpa"};

        deleteAnArray.deleteAnElementAtASpecifiedIndex(2, name);
        assertEquals(name[1], "Sudha");
        System.out.println(Arrays.toString(name));
    }

    @Test
    public void testDeleteAnElementAtFirstPlace() {
        String[] name = {"Arun", "Arav", "Sudha", "Adwiti", "Pushpa"};

        deleteAnArray.deleteAnElementAtASpecifiedIndex(1, name);
        assertEquals(name[0], "Arav");
        System.out.println(Arrays.toString(name));
    }

    @Test
    public void testDeleteAnElementAtThirdPlace() {
        String[] name = {"Arun", "Arav", "Sudha", "Adwiti", "Pushpa"};

        deleteAnArray.deleteAnElementAtASpecifiedIndex(3, name);
        assertEquals(name[2], "Adwiti");
        System.out.println(Arrays.toString(name));
    }

    @Test
    public void testDeleteAnElementAtFourthPlace() {
        String[] name = {"Arun", "Arav", "Sudha", "Adwiti", "Pushpa"};

        deleteAnArray.deleteAnElementAtASpecifiedIndex(4, name);
        assertEquals(name[3], "Pushpa");
        System.out.println(Arrays.toString(name));
    }

    @Test
    public void testDeleteAnElementAtFifthPlace() {
        String[] name = {"Arun", "Arav", "Sudha", "Adwiti", "Pushpa"};

        deleteAnArray.deleteAnElementAtASpecifiedIndex(5, name);
        assertEquals(name[3], "Adwiti");
        System.out.println(Arrays.toString(name));
    }
}