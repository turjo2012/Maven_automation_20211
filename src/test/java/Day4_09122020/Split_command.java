package Day4_09122020;

public class Split_command {
    public static void main(String[] args) {

        //declare and define a string variable
        String message = "My name is jhon";

        //print out only the word jhon from the string message
        //by using split command
        String[] result = message.split(" ");
        //now print out the index for jhon
        System.out.println("my result is" +  result[3]);



    }//end of main method
}//end of java class
