package com.dragon.pattern.command.third;

/**
 * @date: 2024/3/23 17:52
 * @author: ybl
 */
public class LightOnCommand implements Command {
    Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
