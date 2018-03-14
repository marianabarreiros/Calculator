/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concretecommands;

import interfaces.Command;
import javax.sound.midi.Receiver;

/**
 *
 * @author aluno
 */
public class CommandSub implements Command {
    private Receiver receiver;
    
    public CommandSub(Receiver rec){
        this.receiver = rec;
    } 
    @Override
    public void redo() {
        
    }

    @Override
    public void undo() {
        
    }
    
}
