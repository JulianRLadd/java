import java.util.*;

//renamed class because it was preventing me from using the Array.asList function.
class ArrayExercise {
    //Take the arrays.js file, and refactor the code into Java in this file.
     static void printNums(Integer[] nums){
        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.addAll(Arrays.asList(nums));
        numList.forEach(i -> System.out.println(i));
    };
     static void printGreetings(String[] greetings){
        ArrayList<String> greetList = new ArrayList<String>();
        greetList.addAll(Arrays.asList(greetings));
        greetList.forEach(i -> System.out.println(i));
    };
     static void printBinaries(Boolean[] binaries){
        ArrayList<Boolean> binariesList = new ArrayList<Boolean>();
        binariesList.addAll(Arrays.asList(binaries));
        binariesList.forEach(i -> System.out.println(i));
    };

    public static void main(String[] args) {

    Integer[] nums = {10,23,3,4,5,2,1};
    String[] greetings = {"hello","howdy","hallo","hola","bonjour","ciao","أهلا"};
    Boolean[] binaries = {false,true,true,true,false,false,false,true,true,true,true,true,false,true,false,false,true,false};

    printNums(nums);
   printGreetings(greetings);
    printBinaries(binaries);
    }
}







