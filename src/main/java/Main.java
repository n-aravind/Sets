import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("one");
        System.out.println(list);

        Set<String> set = new HashSet<String>(list);
        System.out.println(set);
        System.out.println("######## ADD ########");
        set.add("four");
        System.out.println(set);

        Set<String> newSet =  new HashSet<String>();
        newSet.add("five");
        newSet.add("six");
        System.out.println(newSet);
        System.out.println("######## ADD ALL ########");
        set.addAll(newSet);
        System.out.println(set);
        System.out.println("######## CONTAINS ########");
        System.out.println(set.contains("four"));
        System.out.println("######## CONTAINS ALL ########");
        System.out.println(set.containsAll(newSet));
        System.out.println("######## REMOVE ALL ########");
        System.out.println(set.removeAll(newSet));
        System.out.println("######## CLEAR ########");
        newSet.clear();
        System.out.println("######## IS EMPTY ########");
        System.out.println(newSet.isEmpty());
        System.out.println("######## HASHCODE ########");
        System.out.println(set.hashCode());

        System.out.println("######## TO ARRAY ########");
        Object[] numbers = set.toArray();
        System.out.println("######## SIZE ########");
        System.out.println(set.size());

        System.out.println("######## ITERATOR ########");
        System.out.println(set);
        Iterator it = set.iterator();
        while(it.hasNext()){
            if(it.next().equals("two")){
                it.remove();
            }
        }
        System.out.println(set);
    }
}
