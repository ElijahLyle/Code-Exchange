/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_project;

import acm.graphics.GCanvas;
import acm.program.Program;

/**
 *
 * @author Rivera
 */
public class CodeExchange extends Program{
    
    public void run(){
        GCanvas canvas = new GCanvas();
        add(canvas);
    }
    
    
    public static void main(String[] args){
        new CodeExchange().start();
        
    }
}
