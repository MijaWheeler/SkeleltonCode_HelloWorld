// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants 
{

/* MOTOR CONTROLER ASSIGNMENTS */

    // SparkMax Motor Controller- CanBus ID number
    // Used for Dr
    public static int SparkMax_0 = 0;
    public static int SparkMax_1 = 1;
    public static int SparkMax_2 = 2;
    public static int SparkMax_3 = 3;
    public static int SparkMax_4 = 4;



    // Old Spark & Talon Motor Controller - PWM Port
    public static int PWM_0 = 0;
    public static int PWM_1 = 1;
    public static int PWM_2 = 2;
    public static int PWM_3 = 3;




/* BUTTON ASSIGNMENTS */

    //Joystick port
     public static int JoystickPort = 0;

    //letter buttons on right
    public static int ButtonA = 1;
    public static int ButtonB = 2;
    public static int ButtonX = 3;
    public static int ButtonY = 4;

    //trigger IDs
    public static int LTrigger = 2;
    public static int RTrigger = 3;

    //LB and RB on back
    public static int LBumper = 5;
    public static int RBumper = 6;

    //back and start on remote
    public static int LMiddle = 7;
    public static int RMiddle = 8;

    //left and right joystick ID and left and right joystick button ID
    public static int LJoystickBtn = 9;
    public static int RJoystickBtn = 10;
    public static int LeftJoystickID = 1;  
    public static int RightJoystickID = 5;    

}
