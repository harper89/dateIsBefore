public class Grader {
   public static void main(String[] args) {
   
   System.out.println(grade("EasyPeasy", "black"));
   System.out.println(grade("APeace", "white")	);
   System.out.println(grade("WhirledPeas", "white"));
   System.out.println(grade("Oscar", "red"));
   System.out.println(grade("Amy", "white"));
   System.out.println(grade("Ben", "blue"));

   
   }
   public static int grade(String username, String shoeColor) {
      int score = 0;
      String[] vowels = {"A","E","I","O","U","Y"};
      boolean contains = contains(vowels,username.substring(0,1));    
      int lastChar = (int) username.charAt(username.length()-1);
      if (contains && !(shoeColor.equals("white"))) {
       score+=50;
      } 
      if (lastChar<105 || !(shoeColor.equals("white"))) {
       score+=3000;
      }   
      return score;
   }
   public static boolean contains(String[] arr, String targetValue) {
    for (String s: arr) {
        if (s.equals(targetValue))
            return true;
    }
    return false;
}

}