public class action_item2 {
    public static void main(String[] args) {

        String[] city = new String[4];
        city[0] = " Brooklyn";
        city[1] = " Manhattan";
        city[2] = " staten Island";
        city[3] = " Queens";
        
        for (int i = 0; i < city.length; i++) {

            if (city[1] == "Brooklyn") {
                System.out.println("My city is " + city[i] );
            } else if (city[i] == "Manhattan") {
                System.out.println("My city is " + city [i]);

            }//end of conditional statement
        }//end of for loop

    }//end of main method

}//end of java class
