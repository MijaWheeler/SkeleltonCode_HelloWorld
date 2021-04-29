// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.ExampleCommand;
import frc.robot.subsystems.ExampleSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

//Additional Hardware Import Statements 
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.Constants;


/* IMPORT SUBSYSTEMS HERE */

/* IMPORT COMMANDS HERE */




/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
public class RobotContainer {
  
  // The robot's subsystems and commands are defined here...
  private final ExampleSubsystem m_exampleSubsystem = new ExampleSubsystem();
 // private final SubsystemFileName SystemInstance = new FileName(); // or is it new class
 
  private final ExampleCommand m_autoCommand = new ExampleCommand(m_exampleSubsystem);
//  private final CommmandFileName CommandInstanceName = new CommandFileName(SubsystemInstanceName);


  /* DEFINE SUBSYSTEMS & COMMANDS HERE */





  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();
    //public static int stick0 = new Joystick(Constants.JoystickPort);

  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {

    /*Given Button Configuration*/
    //stick0 = new Joystick(Constants.JoystickPort);
    
    /*Assign each button a value */
    final JoystickButton ButtonB = new JoystickButton(stick0, 2);
    final JoystickButton ButtonA = new JoystickButton(stick0, 1);
    final JoystickButton ButtonY = new JoystickButton(stick0, 4);


    //Determine what command is run when a button is interacted in a specific way
    //ButtonB.whileHeld(new CommandName );


    public static double getLeftStickY()
    {
      return (stick0.getRawAxis(Constants.LeftJoystickID));
    }
  
    public static double getRightStickY()
    {
      return (stick0.getRawAxis(Constants.RightJoystickID));
    }



  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    return m_autoCommand;
  }
}
