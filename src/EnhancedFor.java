
import java.util.ArrayList;
import java.util.Collection;

public class EnhancedFor {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        //int后要加中括号，才能表示是数组
        for(int i:arr) {
            System.out.println(i);

        }

        Collection c = new ArrayList();
        System.out.println("");

        c.add(new String("aaa"));
        c.add(new String("bbb"));
        c.add(new String("ccc"));
        for (Object o:c){
            //object,类型要放在里面
            System.out.println(o);
        }

    }
}
