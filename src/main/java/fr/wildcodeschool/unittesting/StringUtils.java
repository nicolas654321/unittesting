package fr.wildcodeschool.unittesting;

public class StringUtils {

    private static final String ALL_VOWELS = "aeiouyAEIOUY";

    /**
     * Renvoie la chaine formée par les voyelles d'une chaine de caractères
     * @return Chaine avec uniquement des voyelles
     */
    public static String vowels(String candidate) {
        String vowels = "";
        char[] letters = candidate.toCharArray();
        for (int i = 0; i < candidate.length(); i++) {
            if (ALL_VOWELS.indexOf(letters[i]) >= 0) {
                vowels += letters[i];
            }
        }
        System.out.println(vowels);
        return vowels;
    }
    public static String uniqueVowels(String stringToConvert) {
        String vowels = "";
        char[] letters = stringToConvert.toCharArray();
        for (int i = 0; i < stringToConvert.length(); i++) {
            if (ALL_VOWELS.indexOf(letters[i]) > 0)  {
                if (!(vowels.contains(String.valueOf(letters[i])))) {
                    vowels += letters[i];
                }
            }
        }
        return vowels;
    }
}