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
public class LiteratureStuff {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Essay myEssay=new Essay();
        myEssay.setWords(3232);
        System.out.println("Your essay is "+myEssay.getWords()+" words long\n"
                + "and it has "+myEssay.calculatePages()+" pages");
        if(myEssay.validLength()){
            System.out.println("it's valid");
        }else{
            System.out.println("it's not valid");
        }
    }
    
}
