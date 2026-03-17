public class UsefulStringMethods {
    public static void main(String[]args){
        String name = " Bro coding   ";
        int countDigits = name.length();
        char letter = name.charAt(7);
        int index = name.indexOf("o");
        int lastIndex = name.lastIndexOf("n");
        String nameTrimmed = name.trim();
        String nameReplaced = name.replace("o","t");
        String upper = name.toUpperCase();
        String lower = name.toLowerCase();

        boolean isEmpty = name.isEmpty();
        boolean haveSpaces = name.contains(" ");
        boolean isEqual = name.equals(name);
        boolean isEqualIgnore = name.equalsIgnoreCase(name);
    }
}
