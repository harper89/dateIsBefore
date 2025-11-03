public class Main {
   public static void main(String[] args) {
   
   System.out.println(dateIsBefore(6, 3, 9, 20));
   System.out.println(dateIsBefore(10, 1, 2, 25));
   System.out.println(dateIsBefore(8, 15, 8, 15));
   System.out.println(dateIsBefore(8, 15, 8, 16));
   
   }
   public static boolean dateIsBefore(int month1, int day1, int month2, int day2) {
      if (!(month1>0 && month1<13) || !(month2>0 && month1<13)) {
         throw new IllegalArgumentException("Bad Month");    
      }
      int monthDays[] = {31,29,31,30,31,30,31,31,30,31,30,31};
      if (!(day1>0 && day1 <= monthDays[month1-1]) || !(day2>0 && day2 <= monthDays[month2-1])) {
         throw new IllegalArgumentException("Bad Day");
      }
      
      
      
      if (month1<month2){
         return true;
      } else if (month1>month2) {
         return false;
      } else  {
         if (day1<day2) {
         return true;
         } else {
         return false;
         }
      }
   
   }

}