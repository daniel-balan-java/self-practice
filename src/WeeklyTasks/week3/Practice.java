package WeeklyTasks.week3;

import java.util.InputMismatchException;

public class Practice {

   public static int reverseNegativeNumber(int negativeNumber){
       if (negativeNumber>=0){
           throw new InputMismatchException("Invalid Nr");
       }
       String revere = "";
       String strReverse = Integer.toString(negativeNumber);
       for (int i = strReverse.length()-1; i >= 1; i++){
           revere += strReverse.charAt(i);
           negativeNumber = Integer.parseInt("-"+revere);
       }
       return negativeNumber;
   }


}