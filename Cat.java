/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git;

public class Cat extends Animal implements Sound {
    String name ;
    String color;
    public Cat(){}
    public Cat(String name,String color){
        this.name = name;
        this.color = color;
        
        
    }
    @Override
    public String say(){
        String soundCat = "MEOOOOOO MEOOOO";
        return soundCat;
    }
    
}
