/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

/**
 *
 * @author admin
 */
public class Dog extends Animal implements Sound{
    protected String nameDog;
    
    public Dog(){}
    public Dog(String nameDog){
        this.nameDog = nameDog;
    }
    public String Say(){
        return "Gau Gau";
    }
}
