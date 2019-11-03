/*
Write a method that takes an array of names as input and return a string formatted in the followin way:
likes {} // must be "no one likes this"
likes {"Scott"} // must be "Scott likes this"
likes {"Scott", "Alex"} // must be "Scott and Alex like this"
likes {"Scott", "Alex", "Tom"} // must be "Scott, Alex and Tom like this"
likes {"Scott", "Alex", "Tom", "Sarah"} // must be "Scott, Alex and 2 others like this"
*/

class DisplayLikes {
    public static String whoLikesIt(String... names) {
        if (names.length == 0) {
            return "no one likes this";
        }
        else if (names.length == 1) {
            return names[0] + " likes this";
        }
        else if (names.length == 2) {
            return names[0] + " and " + names[1] + " like this";
        }
        else if (names.length == 3) {
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        }
        else {
            int count = names.length - 2;
            return names[0] + ", " + names[1] + " and " + count + " others like this";
        }
    }
    public static void main(String[] args) {
        String[] namesTest = new String[]{"Scott", "Camilla", "Nova", "Sarah"};

        System.out.println(whoLikesIt(namesTest));
    }
}