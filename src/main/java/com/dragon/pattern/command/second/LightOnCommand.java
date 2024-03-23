package com.dragon.pattern.command.second;


import com.dragon.pattern.command.first.Command;

/**
 * @date: 2024/3/23 16:25
 * @author: ybl
 */
public class LightOnCommand implements Command {
    Light light;
    public LightOnCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        light.on();
    }
}
