package com.dragon.pattern.command.third;

/**
 * @date: 2024/3/23 17:51
 * @author: ybl
 */
public interface Command {
    public void execute();
    public void undo();
}
