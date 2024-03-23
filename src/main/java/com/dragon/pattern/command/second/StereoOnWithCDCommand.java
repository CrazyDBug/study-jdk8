package com.dragon.pattern.command.second;

import com.dragon.pattern.command.first.Command;

/**
 * @date: 2024/3/23 17:33
 * @author: ybl
 */
public class StereoOnWithCDCommand implements Command {

    Stero stereo;

    public StereoOnWithCDCommand(Stero stereo) {
        this.stereo = stereo;
    }
    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(10);
    }
}
