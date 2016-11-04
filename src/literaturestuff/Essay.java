/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package literaturestuff;

/**
 *
 * @author jihua5758
 */
public class Essay extends Document{
    private final int  MIN_WORDS=1500 , MAX_WORDS=3000;
    /**
    * constructor
    * pre: none
    * post: An Essay object created. Words initialized to 0.
    */
    /** 
    * Determines if the essay is valid.
    * pre: none
    * post: return true if the essay is valid and false if not.
    */
    public boolean validLength(){
        if(super.words>MIN_WORDS&&super.words<MAX_WORDS){
            return true;
        }else{
            return false;
        }
    }
}
