package com.dragon.pattern.command.third;


/**
 * @date: 2024/3/23 17:57
 * @author: ybl
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("no command");
    }

    @Override
    public void undo() {
        System.out.println("no command undo");
    }
}
