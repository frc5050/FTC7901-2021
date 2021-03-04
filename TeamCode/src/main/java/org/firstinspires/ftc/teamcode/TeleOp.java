package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@com.qualcomm.robotcore.eventloop.opmode.TeleOp
public class TeleOp extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException {
        Robot robot = new Robot();
        robot.init(hardwareMap);
        waitForStart();

        while (opModeIsActive()) {

            double leftPower;
            double rightPower;
            boolean intakePower = false;
            boolean loaderPower;
            boolean reverseLoaderPower;
            boolean shooterPower;
            boolean reverseIntakePower;


            leftPower = -gamepad1.left_stick_y;
            rightPower = -gamepad1.right_stick_y;
            intakePower = gamepad2.a;
            loaderPower = gamepad2.b;
            reverseIntakePower = gamepad2.y;
            reverseLoaderPower = gamepad2.x;
            shooterPower = gamepad2.left_bumper;

            if (intakePower == true) {
                robot.frontIntake.setPower(1);
            } else {
                robot.frontIntake.setPower(0);
            }

            if (loaderPower == true) {
                robot.loader.setPower(1);
            } else {
                robot.loader.setPower(0);
            }

            if (reverseLoaderPower == true) {
                robot.loader.setPower(-1);
            } else {
                robot.loader.setPower(0);
            }

            if (reverseIntakePower == true) {
                robot.frontIntake.setPower(-1);
            } else {
                robot.frontIntake.setPower(0);
            }

            if (shooterPower == true) {
                robot.leftShooter.setPower(.65);
                robot.rightShooter.setPower(.65);
            } else {
                robot.rightShooter.setPower(0);
                robot.leftShooter.setPower(0);
            }
            robot.frontLeftMotor.setPower(leftPower);
            robot.backLeftMotor.setPower(leftPower);
            robot.frontRightMotor.setPower(rightPower);
            robot.backRightMotor.setPower(rightPower);
            idle();
        }
    }
}