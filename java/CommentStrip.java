/*
Create a function that takes in a string that can contain multiple lines and multiple variations of comment symbols, which 
are also input as an array of string symbols.
All the text on a line following a comment symbol should be removed.
Return a string with all comments removed, but otherwise in it's original format.
*/  
public class CommentStrip {
    public static String strip(String text, String[] commentSymbols) {
        
        String[] textArray = text.split("\n");
        String[] resultArray = new String[textArray.length];

        for (int i = 0; i < textArray.length; i++) {
            if (indexOfComment(commentSymbols, textArray[i]) != -1) {
                String tempString = textArray[i].substring(0, indexOfComment(commentSymbols, textArray[i]));
                tempString = tempString.replaceAll("\\s+$", "");
                resultArray[i] = tempString;
            }
            else {
                String tempString = textArray[i].replaceAll("\\s+$", "");
                resultArray[i] = tempString;
            }
        }
        return String.join("\n", resultArray);
    }

    public static int indexOfComment(String[] stringArray, String item){
        int index = -1;
        for (int i = 0; i < stringArray.length; i++) {
            if (item.contains(stringArray[i])) {
                index = item.indexOf(stringArray[i]);
            }
        }
        return index;
    }
    public static void main(String[] args) {
        String testString = "apples, pears # and bananas\ngrapes\nbananas !apples";

        String[] symbolTest = new String[] {"#", "!"};

         System.out.println(strip(testString,symbolTest));
    }
}