package demo;

public class Homework {
    //create our methods here
    //  |access modifier | returnDataType | nameOfMethod (Parameter){
    //
    //  }
    static double start; // 4
    public static double add(double input){
        start = start + input;
        return start;  //5
    }
    public static double subtract(double input){
        start = start - input;
        return start;  //5
    }
    public static double multiply(double input){
        start = start * input;
        return start;



    }
    public static double divide(double input){
        start = start / input;
        return start;


    }
    public static double sqr(){
        start = start * start;
        return start;

    }
    public static double squareRoot(double input){
        return start = Math.sqrt(input);

    }
    public static double exponent(double input){
        return start = Math.pow(start,input);

    }
    public static double clear(){
       return start = 0;

    }
    public static double current(){
        return start = start;
    }
    public static double invert(){
        return start = start * -1;

    }
    public static double inverse(){
        return start = 1/start;
    }





    public static void main(String[] args) {
        System.out.println(add(4));
        System.out.println(add(1)); //5
        System.out.println(subtract(1));
        System.out.println(multiply(10));
        System.out.println(divide(5));
        System.out.println(sqr());
        System.out.println(squareRoot(100));
        System.out.println(exponent(3));
        System.out.println(current());
        System.out.println(clear());
        System.out.println(invert());
        System.out.println(invert());
        System.out.println(add(4));
        System.out.println(inverse());
    }
}



