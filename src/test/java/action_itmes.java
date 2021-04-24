public class action_itmes {
    public static void main(String[] args) {

        //if student grade is 90 t0 100 its A
        //if student grade is 80 to below then its B
        //if student grade is 70 to below then its C
        //if student grade is below 60 its failure (F)
        //define a variable which will represent grade number
        int grade = 89;

        if(grade >=90 && grade <= 100){
            System.out.println("student grade is A");
        }else if(grade >=80 && grade < 90){
            System.out.println("student grade is B");
        }else if(grade >=70 && grade < 80){
            System.out.println("student grade is C");
        }else{
            System.out.println("student grade is F");

        }//end of else condition

    }//end of maid method
}//end of java class
