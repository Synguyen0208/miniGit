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
public abstract class Animal{
   private String name;
   private float height;
   private float weight;
   
   public Animal (){
       
   }
   public Animal (String name, float height, float weight){
       this.name = name;
       this.height = height;
       this.weight = weight;
   }
   public abstract void nameOfAnimal();
   
   public void setName(String name){
       this.name = name;
   }
   public String getName(){
       return name;
   }
   public void setHeight(float height){
       this.height = height;
   }
   public float getHeight(){
       return height;
   }
   public void setWeight(float weight){
       this.weight = weight;
   }
   public float getWeight(){
       return weight;
   }
   @Override
   public String toString(){
       return "Name of this animal is : "+name+" "+"Height: "+height+" "+"Weight: "+weight;
       
   }
}
