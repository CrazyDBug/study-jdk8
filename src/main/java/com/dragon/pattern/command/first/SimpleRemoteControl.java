package com.dragon.pattern.command.first;

/**
 * @date: 2024/3/23 16:26
 * @author: ybl
 */
public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(Command command) {
        this.slot = command;
    }

    public void buttonWasPressed() {
        this.slot.execute();
    }
}
