package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous
public class ShooterAuto extends LinearOpMode {
   Robot robot = new Robot();

    public void runOpMode(){
       robot.init(hardwareMap);
       waitForStart();
   }
}
