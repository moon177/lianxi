import java.util.*;
import java.util.List;

/**
 * @author
 * @Description:
 * @date 2018/7/25 9:40
 */
public class sort {

    public static void main(String[] args) {
//        List<Name> ll = new LinkedList<>();
//        ll.add(new Name("Karl","M"));
//        ll.add(new Name("Steven", "Lee"));
//        ll.add(new Name("John", "O"));
//        ll.add(new Name("Tom", "M"));
        List<String> l = new ArrayList<>();
        l.add("Karl");
        l.add("Steven");
        l.add("John");
        l.add("Tu");
        l.add("Tom");
        System.out.println(l);
        Collections.sort(l, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);
            }
        });
        System.out.println(l);
    }

    /**
     * @author XueXianlei
     * @Description:
     * @date 2018/7/25 10:30
     */
    public static class Name {
        private String familyName;
        private String givenName;

        public Name(String familyName, String givenName) {
            this.familyName = familyName;
            this.givenName = givenName;
        }

        public String getFamilyName() {
            return familyName;
        }

        public void setFamilyName(String familyName) {
            this.familyName = familyName;
        }

        public String getGivenName() {
            return givenName;
        }

        public void setGivenName(String givenName) {
            this.givenName = givenName;
        }

        @Override
        public String toString() {
            return familyName + givenName;
        }
    }
}
