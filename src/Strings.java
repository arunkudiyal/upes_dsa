public class Strings {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30};
        char[] chars = {'H', 'i', '!'};

        String name = new String("Arun");
        String name2 = "Arun";
        System.out.println(name2.charAt(2));
        System.out.println(name2);
        name2 = "Arun";
        System.out.println(name);
        System.out.println(name2);

        System.out.println( name.equals(name2) );

        System.out.println(chars);                  //
        System.out.println(nums);
        System.out.println(name);                   //
    }
}
