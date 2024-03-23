package com.dragon.pattern.command.second;


import com.dragon.pattern.command.first.Command;

/**
 * @date: 2024/3/23 17:31
 * @author: ybl
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }
}
