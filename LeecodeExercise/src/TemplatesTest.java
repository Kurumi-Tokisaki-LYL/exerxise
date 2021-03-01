import java.util.ArrayList;

/**
 * @auther 李焱磊 (Created by Kurumi Tokisaki)
 * @date 2021-2-28 - 17:12:23.
 */
public class TemplatesTest {
    //模板一：psvm
    public static void main(String[] args) {
        //模板二：sout
        System.out.println();
        //变形：soutp(打印形参)/soutm(打印方法)/soutv（打印变量）/xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplatesTest.main");
        int num = 10;
        System.out.println("num = " + num);
        System.out.println(num);

        //模板三；fori
        String[] arr = new String[]{"Tom","Jerry","Lee"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }
        //变形：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(arr[i]);
        }

        //模板四：list.for
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        for (Object o : list) {
            
        }
        //变形：list.fori  正序遍历
        for (int i = 0; i < list.size(); i++) {
            
        }
        //变形：list.forr  逆序遍历
        for (int i = list.size() - 1; i >= 0; i--) {
            
        }

        //模板六：prsf  可生成 private static final

        //变形：psf

        //变形：psfi

        //变形：psfs

    }
    public void method(){
        //模板五：ifn
        ArrayList list = new ArrayList();
        list.add(123);
        list.add(456);
        list.add(789);

        if (list == null) {
            
        }
        //变形：inn
        if (list != null) {
            
        }
        //变形：xxx.nn / xxx.null
        if (list != null) {

        }
        if (list == null) {

        }
    }
}
