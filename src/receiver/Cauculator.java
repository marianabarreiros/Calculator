/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package receiver;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public class Cauculator {
    private ArrayList result;
    
    public void somar(double x, double y){
        result.add(x + y);
    }
    public void subtrair(double x, double y){
        result.add(x - y);
    }
    public void multiplicar(double x, double y){
        result.add(x * y);
    }
    public void dividir(double x, double y){
        result.add(x/y);
    }
    
    public ArrayList getResult(){
        return result;
    }
    
}
