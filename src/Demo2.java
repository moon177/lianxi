import netscape.security.Privilege;

import static netscape.security.Privilege.add;

/**
 * @author XueXianlei
 * @Description:
 * @date 2018/8/24 17:35
 */
public class Demo2 {

    public static void main(String[] args) {

        System.out.println(1);
        int sum = add(10,20);
        System.out.println(2);
    }


    public static int add(int a,int b){
        System.out.println(3);
        int sum = a+b;
        return sum ;
    }

}
