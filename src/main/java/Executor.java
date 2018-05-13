/***
 * @author : macbeth
 * @date   : 2018/5/11 18:59
 * @mail   : madmacbeth@163.com
 */
public class Executor {
    private String name = "macbeth";

    public void test(){
        String name = "chenwei";
    }
    public static void main(String[] args) {
        String name = "chenwei";
        String[] strs = new String[10];
        int[] ints = new int[10];
        for (String str : strs){
            System.out.println(str);
        }
        for (int i : ints){
            System.out.println(i);
        }
    }
}
