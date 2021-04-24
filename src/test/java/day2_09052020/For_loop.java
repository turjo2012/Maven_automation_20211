package day2_09052020;

public class For_loop {
    public static void main(String[] args) {
        //dynamic array example with String data
        String[]  zipCode = new String[5]; //defining and setting boundary for array values
        zipCode[0] = "11218";
        zipCode[1] = "11219";
        zipCode[2] = "10001";
        zipCode[3] = "11201";
        zipCode[4] = "11217";

        //interate through all of zipcode data and print each one

        for (int i = 0;i < 5;i++){
        //code goes here
        System.out.println("My zipcode is "+ zipCode[i]);

        //i = i+1; //this is to skip specific index(s) from arry

        }//end of for loop


    }//end of main method

}//end of class
