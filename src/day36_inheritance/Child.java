package day36_inheritance;

public class Child extends Parent{


    Child(){
        System.out.println("child cons calisti");
    }

    //tum cclassalarda bir gormesek bile
    //javanin olustrudugu defaut contructor vardir

    //extend keyword kullanan classlardaki
    //tum CONTSTUCTORLARIN ILK SATIRINDA
    //biz gormesek bile super() constroctur call vardir

    //yani parent class in parametresiz constructoru call
    //parent =super      child=sub
    public static void main(String[] args) {

        Child child=new Child();
    }
}
