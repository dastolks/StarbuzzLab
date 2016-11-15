/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.exercise;

/**
 *
 * @author Alec
 */
public class RedShapeDecorator extends ShapeDecorator{
    private Shape origShape;
    
    public RedShapeDecorator(Shape s){
        origShape = s;
    }
    
    public void draw(){
        origShape.draw();
        System.out.println("Border Color: Red");
    }
}
