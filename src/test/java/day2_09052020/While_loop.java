package day2_09052020;

public class While_loop {
    public static void main(String[] args) {
        //dynamic array example with String data
        String[]  zipCode = new String[6]; //defining and setting boundary for array values
        zipCode[0] = "11218";
        zipCode[1] = "11219";
        zipCode[2] = "10001";
        zipCode[3] = "11201";
        zipCode[4] = "11217";
        zipCode[5] = "11216";

        //first initialize the starting point before while loop
        int i = 0;
        //define the while loop with your end point execuition
        while (i < zipCode.length) {

            System.out.println("My zipcode is " + zipCode[1]);

            //increment goes here
            i = i + 1; // same as i++

        }

    }//end of while loop
}//end of main method
