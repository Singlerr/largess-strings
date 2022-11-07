package io.github.singlerr.strings;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class AnimatedStrings {
    /***
     * Shift string for {@param amount} times
     * <p>
     *     e.g. for string s = "abcd",
     *     {@code shiftString(s, 1, true)} returns "bcda"
     *     and {@code shiftString(s, 1, false)} returns "cdab"
     * </p>
     * @param src string to shift
     * @param amount shift amount
     * @param shiftLeft to determine whether shift string left or right
     * @return shifted string
     */
    public static String shiftString(String src, int amount, boolean shiftLeft){
        int amountLeft = amount - src.length() * (amount / src.length());
        if(shiftLeft){
            return src.substring(amountLeft).concat(src.substring(0, amountLeft));
        }else{
            return src.substring(src.length() - amountLeft).concat(src.substring(0, src.length() - amountLeft));
        }
    }

    /***
     * Tracks string changes while rolling string one time.
     * <p>
     *     e.g. for string s = "abcd",
     *     {@code rollString(s, true)} returns {"abcd", "bcda","cdab","dabc"}
     *     and {@code rollString(s, false)} returns {"abcd", "dabc", "cdab","bcda"}
     * </p>
     * @param src string to roll
     * @param rollLeft to determine whether roll string left or right
     * @return tracks of string while rolling
     */
    public static String[] rollString(String src, boolean rollLeft){
        String[] result = new String[src.length()];
        for(int i = 0; i<result.length;i++){
            result[i] = shiftString(src, i, rollLeft);
        }
        return result;
    }
}
