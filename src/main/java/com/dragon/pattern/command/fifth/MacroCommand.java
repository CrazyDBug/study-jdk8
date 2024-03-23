package com.dragon.pattern.command.fifth;

/**
 * @date: 2024/3/23 18:33
 * @author: ybl
 */
public class MacroCommand implements Command {
    Command[] commands;
    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for(int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }


}
