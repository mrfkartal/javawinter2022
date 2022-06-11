package day33_Varargs_StringBuilder;

public class C03_StringBuilder {
    public static void main(String[] args) {


        StringBuilder sb1= new StringBuilder(); //lenght i 0 iken capasitesi 16 dir

        StringBuilder sb2= new StringBuilder("Java cok guzel"); //
        //sb2 nin  lenght i 14 iken capasitesi 30 dur.
        StringBuilder sb3= new StringBuilder(10);

        System.out.println("sb1 length : "+ sb1.length()); // 0
        System.out.println("sb1 capacity : " + sb1.capacity()); // 16

        System.out.println("sb2 length : "+ sb2.length()); // 14
        System.out.println("sb2 capacity : " + sb2.capacity()); // 30

        System.out.println("sb3 length : "+ sb3.length()); // 0
        System.out.println("sb3 capacity : " + sb3.capacity()); // 10
        // append method'u ile sb'a ekleme yapabiliriz
        sb1.append("Java").append(" ").append("cok").append(" ").append("guzel");
        System.out.println("sb1 length : "+ sb1.length()); // 14
        System.out.println("sb1 capacity : " + sb1.capacity()); // 16

        sb1.append(3);
        System.out.println(sb1); // Java cok guzel3 * concat deki gibi direk ekliyor

        sb1.append(true);
        System.out.println(sb1); // Java cok guzel3true *concat deki gibi booleni true
        //ekliyor

        System.out.println("sb1 length : "+ sb1.length()); // 19
        System.out.println("sb1 capacity : " + sb1.capacity()); // 34

        sb1.append("tum dersler java olsa");
        System.out.println("sb1 length : "+ sb1.length()); // 40
        System.out.println("sb1 capacity : " + sb1.capacity()); // 70


        sb1.trimToSize();  //length ile capasite arasindaki farki atiyot dengeliyor
        System.out.println("sb1 length : "+ sb1.length()); // 40
        System.out.println("sb1 capacity : " + sb1.capacity()); // 40
    }
}
