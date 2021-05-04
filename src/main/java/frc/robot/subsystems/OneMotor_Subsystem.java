// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import frc.robot.Constants;
//Added Imports
import edu.wpi.first.wpilibj.Spark; //Regular Spark
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class OneMotor_Subsystem extends SubsystemBase {
  /** Creates a new OneMotor_Subsystem. */
  private CANSparkMax motorTest;

  public OneMotor_Subsystem() {
    //declare motors
    motorTest = new CANSparkMax(Constants.SparkMax_11, MotorType.kBrushless);

  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
