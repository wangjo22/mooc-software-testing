package tudelft.countletters;

/*
    Given a sentence, you should count the number of words that
    end with either an "s" or an "r". A word ends when a non-letter
    appears.
    For Example)
        "cat" = 0
        "cats" = 1
        "cats!dogs" = 2
        "cats!dog = 1
 */
public class CountLetters {

    public int count(String str) {
        int words = 0;
        char last = ' ';
        for(int i = 0; i < str.length(); i++) {
            if(!Character.isLetter(str.charAt(i)) && (last == 'r' || last == 's')) {
                words++;
            }

            last = str.charAt(i);
        }

        if(last == 'r' || last == 's')
            words++;

        return words;
    }

}