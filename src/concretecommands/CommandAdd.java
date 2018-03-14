/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concretecommands;

import interfaces.Command;
import view.CalculatorView;


/**
 *
 * @author aluno
 */
public class CommandAdd implements Command{
    private CalculatorView calc;
    
    public CommandAdd(CalculatorView calc){
        this.calc = calc;
    }
    
    @Override
    public void redo() {
        calc.arithimetic_operation();
    }

    @Override
    public void undo() {
        calc.arithimetic_operation();
    }
    
}
