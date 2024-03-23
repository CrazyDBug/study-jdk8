package com.dragon.pattern.command.fourth;


/**
 * @date: 2024/3/23 17:57
 * @author: ybl
 */
public class RemoteControlWithUndo {
    private Command[] onCommands;
    private Command[] offCommands;

    Command undoCommand;

    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPushed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\n------Remote Control With Undo-------\n");
        for (int i = 0; i < onCommands.length; i++) {
            result.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "    " + offCommands[i].getClass().getName() + "\n");
        }
        result.append("[undo] " + undoCommand.getClass().getName() + "\n");
        return result.toString();
    }

}
