package com.dragon.pattern.command.fourth;

/**
 * @date: 2024/3/23 18:12
 * @author: ybl
 */
public class CeilingFanMediumCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanMediumCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    @Override
    public void undo() {
        if(prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if(prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if(prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if(prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
