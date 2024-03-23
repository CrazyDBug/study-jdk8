package com.dragon.pattern.command.second;

import com.dragon.pattern.command.first.Command;

/**
 * @date: 2024/3/23 17:34
 * @author: ybl
 */
public class NoCommand implements Command {
    @Override
    public void execute() {
        System.out.println("no command");
    }
}
