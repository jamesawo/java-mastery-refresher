public class ContinueDemo {
    public static void main(String[] args) {
        String searchString = "peter piper picked a peck of pickled peppers";
        int numberOfOccurrence = 0;

        for (int i = 0; i < searchString.length(); i++) {
            if (searchString.charAt(i) != 'p')
                continue;

            // increment
            numberOfOccurrence++;
        }
        System.out.println("Found  " + numberOfOccurrence + "p's in the search string");
    }
}
