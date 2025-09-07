package org.firstinspires.ftc.teamcode.teamcodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp(name = "teleOp")
public class teleOp extends LinearOpMode {
    public void runOpMode() throws InterruptedException {
        DriveTrain driveTrain = new DriveTrain(this);
        Mechanisms mech = new Mechanisms(this);

    }

}
