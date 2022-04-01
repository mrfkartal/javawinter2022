package day14_stringManipulation;

public class C01_Trim {
    public static void main(String[] args) {
        String str="  Siz ne derseniz deyin, Java bildigini okur.  ";

        str.trim();

        System.out.println(str);  // boşluklarla birlikte yazdırır çünkü atama yapmadım
        System.out.println(str.length());
        str=str.trim();
        System.out.println(str);

        System.out.println(str.length());

        str="ali okula git \ngit ali git";
        System.out.println(str.trim());
        System.out.println(str.length());
    }
}
