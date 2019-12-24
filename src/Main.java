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
        System.out.println(add(treeSet1 , treeSet2));
        System.out.println("---------------------------------------------");
        System.out.println(like(treeSet1 , treeSet2));
    }
    public static Set<Character> add(Set<Character> treeSet , Set<Character> treeSet2)
    {
        Set<Character> add = new TreeSet<>(treeSet);
        add.addAll(treeSet2);
        return add;
    }
    public static void create(Set<Character>  treeSet, int a)
    {
        Random random = new Random();
        while (treeSet.size()<10)
        {
            treeSet.add((char) (random.nextInt(26) + 'a'));
        }
    }
    public static Set<Character> like (Set<Character> treeSet , Set<Character> treeSet2)
    {
        Set<Character> like = new TreeSet<>(treeSet);
        like.retainAll(treeSet2);
        return like;
    }
}
