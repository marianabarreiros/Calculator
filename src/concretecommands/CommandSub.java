/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concretecommands;

import interfaces.Command;
import javax.sound.midi.Receiver;
import view.CalculatorView;

/**
 *
 * @author aluno
 */
public class CommandSub implements Command {
    private CalculatorView calc;
    
    public CommandSub(CalculatorView calc){
        this.calc = calc;
    } 
    @Override
    public void redo(){
        
    }

    @Override
    public void undo() {
        
    }
    
}
