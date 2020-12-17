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
public class Bird extends Animal implements Sound {
    private String type;
    
    public Bird (){
        
    }
    
    public Bird(String name, float height, float weight, String type){
        super(name,height,weight);
        this.type = type;
    }
    
}
