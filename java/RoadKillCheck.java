/*
Input:

"photo"

Output:

The detected animal name, or "??"" if unknown.

Sample input:
=====r=rrr=rra=====eee======bb====b=======

Sample output: 
bear
*/

public class RoadKillCheck {
    static String roadKill(final String photo) {
        String[] ANIMALS = {"hyena", "penguin", "bear", "sheep", "baboon", "turkey", "monkey", "quoll", "quoaa", "moose", "ibis", "alligator"};

        String noEquals = photo.replaceAll("=","");
        String reversed = new StringBuilder(noEquals).reverse().toString();
            
        for (String animal : ANIMALS){
            String regex = animal.replaceAll("","+").replaceFirst(".","");
            if (noEquals.matches(regex) || reversed.matches(regex))
                return animal;
            }
            return "??";  
          }
    public static void main(String[] args) {
        String animalPhoto = "===p==ee=e=n==g=u====i===n";
        System.out.println(roadKill(animalPhoto));
    }
}