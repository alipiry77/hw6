import java.util.Random;
import java.util.Set;
import java.util.TreeSet;
public class Main {
    public static void main(String[] args) {

        Set<Character> treeSet1 = new TreeSet<>();
        Set<Character> treeSet2 = new TreeSet<>();
        create( treeSet1,10);
        create(treeSet2 , 10);
        System.out.println(treeSet1);
        System.out.println(treeSet2);
        System.out.println("---------------------------------------------");
    }
    public static void add(Set<Character> treeSet , Set<Character> treeSet2)
    {

    }
    public static void create(Set<Character>  treeSet, int a)
    {
        Random random = new Random();
        while (treeSet.size()<10)
        {
            treeSet.add((char) (random.nextInt(26) + 'a'));
        }
    }
}
