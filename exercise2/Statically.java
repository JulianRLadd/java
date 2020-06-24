public class Statically {
    //fix this code, so all of the instantiation and console.logs() work.  Try not to change the signature of the class, unless absolutely necessary.
    private static String glue = "Epoxy";
    public String jello = "Jello";

    public static void moveAndShake() {
        System.out.println("Never stagnate in life.  Be agile, change, and improve...");
    }

    public static void stubborn() {
        moveAndShake();
        System.out.println("Please don't make me change... I just don't like it...");
    }

    public static void glue() {
        System.out.println(glue);
    }

    public static void explain() {
        stubborn();
        glue();
        //write an explanation for how the keyword static behaves differently in javascript vs. java.
        System.out.println(
                "Static in java is for attributes and methods that belong to the class and not an instance of the class."
        );
        System.out.println(
                "Static in javascript is for methods that will be the same no matter which class runs them."
        );
    }

//get the below code to run correctly without errors:  Make sure you explain what you did in the the explain()
//method, defined in the class.  Do NOT remove the 'static' keyword from the explain() method.
public static void main(String[] args) {

Statically stats = new Statically();

        moveAndShake();
        stubborn();
        explain();

        glue();
    System.out.println(stats.jello);

}
//Once you have finished getting statistically.js to run, refactor the code here in Java.
}
