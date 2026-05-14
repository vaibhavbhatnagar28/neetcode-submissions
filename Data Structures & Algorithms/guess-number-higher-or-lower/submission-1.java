/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int left = 1; int right = n;

        while(left<=right){
            int pick = left + (right-left)/2;
            int gno = guess(pick);

            if(gno == 0){
                return pick;
            }
            else if(gno == -1){
                right = pick-1;
            }
            else{
                left = pick+1;
            }
        }
        return -1;
    }
}