import java.util.*;
public class ArrayListTests {
    public static void main(String[] args){
        ArrayListHW x = new ArrayListHW();
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        x.reverse(a);
        System.out.println(a);
        a = new ArrayList<>(Arrays.asList(1,2,4,4,5,6));
        x.reverse(a);
        System.out.println(a);
        a = new ArrayList<>(Arrays.asList(1));
        x.reverse(a);
        System.out.println(a);
        a = new ArrayList<>(Arrays.asList(1,2,4,4,5,6));
        x.remove(a,4);
        System.out.println(a);
        a = new ArrayList<>(Arrays.asList(1,2,4,4,5,6));
        x.remove(a,3);
        System.out.println(a);
        a = new ArrayList<>(Arrays.asList(1,2,4,4,5,6));
        x.remove(a,6);
        System.out.println(a);
        a = new ArrayList<>(Arrays.asList(1,2,4,4,5,6));
        x.remove(a,1);
        System.out.println(a);
        a = new ArrayList<>(Arrays.asList(1,1,1,1));
        x.remove(a,1);
        System.out.println(a);
    }
}
