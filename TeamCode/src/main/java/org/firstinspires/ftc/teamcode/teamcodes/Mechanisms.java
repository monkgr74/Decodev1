package org.firstinspires.ftc.teamcode.teamcodes;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Mechanisms {
    public ColorSensor colorSensor;
    public DcMotor ferrisWheel;

    public void initColorSensor(HardwareMap hardwareMap){
        colorSensor = hardwareMap.get(ColorSensor.class,"colorsensor");
    }

    public void initFerrisWheelMotor(HardwareMap hardwareMap){
        ferrisWheel = hardwareMap.get(DcMotor.class, "Ferris Wheel");
        ferrisWheel.setDirection(DcMotor.Direction.FORWARD);
        ferrisWheel.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        ferrisWheel.setMode(DcMotor.RunMode.RUN_WITHOUT_ENCODER);
    }

    public void spinFerrisWheel(){
        //if launch btn pressed. Then do these
        //check if sequence
        //if color is right in order let it enter the tube to get launched
        //keep on checking.


    }

    public void checkIfPurple(){
        int red = colorSensor.red();
        int green = colorSensor.green();
        int blue = colorSensor.blue();

        int total = red+green + blue;
        double rNorm = (double) red / total;
        double gNorm = (double) green / total;
        double bNorm = (double) blue / total;

        boolean isPurplish = (rNorm > 0.3 && bNorm > 0.3 && gNorm < 0.25);

        if(isPurplish){
            //let ball enter through the pipe
        } else {
            //spin ferris wheeel
        }
    }

    public void checkIfGreen(){
        int red = colorSensor.red();
        int green = colorSensor.green();
        int blue = colorSensor.blue();

        int total = red+green+blue;
        double rNorm = (double) red / total;
        double gNorm = (double) green / total;
        double bNorm = (double) blue / total;

        boolean isGreenish = (gNorm > 0.4 && rNorm < 0.3 && bNorm < 0.3);

        if(isGreenish){
            //let ball enter through pipe
        } else {
            //spin ferris wheel
        }
    }
}
