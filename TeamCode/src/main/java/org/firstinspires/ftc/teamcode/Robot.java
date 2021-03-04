package org.firstinspires.ftc.teamcode;


import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;


public class Robot {
    public DcMotor frontIntake;
    public DcMotor loader;
    public DcMotor leftShooter;
    public DcMotor rightShooter;
    public DcMotor frontLeftMotor;
    public DcMotor backLeftMotor;
    public DcMotor frontRightMotor;
    public DcMotor backRightMotor;


    public Robot (){
    }


    public void init(HardwareMap hwMap) {

        frontIntake  = hwMap.get(DcMotor.class, "frontIntake");
        loader  = hwMap.get(DcMotor.class, "backIntake");
        leftShooter  = hwMap.get(DcMotor.class, "leftShooter");
        rightShooter  = hwMap.get(DcMotor.class, "rightShooter");
        frontLeftMotor  = hwMap.get(DcMotor.class, "frontLeftMotor");
        backLeftMotor  = hwMap.get(DcMotor.class, "backLeftMotor");
        frontRightMotor  = hwMap.get(DcMotor.class, "frontRightMotor");
        backRightMotor  = hwMap.get(DcMotor.class, "backRightMotor");
        frontLeftMotor.setDirection(DcMotor.Direction.FORWARD);
        backLeftMotor.setDirection(DcMotor.Direction.FORWARD);
        frontRightMotor.setDirection(DcMotor.Direction.REVERSE);
        backRightMotor.setDirection(DcMotor.Direction.REVERSE);
        rightShooter.setDirection(DcMotor.Direction.REVERSE);
    }

    public void encoderDrive (double speed, double leftInches, double rightInches){
       final double COUNTS_PER_REV = 1024;
       final double WHEEL_DIAMETER_INCHES = 4;
       final double COUNTS_PER_INCHES = COUNTS_PER_REV / WHEEL_DIAMETER_INCHES;

       // TODO actually make a target variable int leftTarget = frontLeftMotor;
       //int rightTarget = frontRightMotor. ;


    }
}