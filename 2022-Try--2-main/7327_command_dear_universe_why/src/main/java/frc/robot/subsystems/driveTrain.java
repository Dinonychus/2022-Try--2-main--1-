// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.util.sendable.SendableRegistry;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import frc.robot.commands.arcadeDriveCMD;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Constants;


public class driveTrain extends SubsystemBase {



  //Left motors(individual)
private CANSparkMax northWest = new CANSparkMax(Constants.northWest_ID, MotorType.kBrushless);
private CANSparkMax southWest = new CANSparkMax(Constants.southWest_ID, MotorType.kBrushless);


//Right motors(individual)
private CANSparkMax northEast = new CANSparkMax(Constants.northEast_ID, MotorType.kBrushless);
private CANSparkMax southEast = new CANSparkMax(Constants.southEast_ID, MotorType.kBrushless);

//Motor Controller Groups
public final MotorControllerGroup m_Left = new MotorControllerGroup(northWest, southWest);
public final MotorControllerGroup m_Right = new MotorControllerGroup(northEast, southEast);


public final DifferentialDrive drive = new DifferentialDrive(m_Left, m_Right);

  
  public driveTrain() {
    SendableRegistry.add(drive, "drive");

    this.setDefaultCommand(new arcadeDriveCMD(this));
  }

  public void arcadeDrive(double moveSpeed, double rotateSpeed){
    drive.arcadeDrive(moveSpeed, rotateSpeed);
    }

  public void stop(){
    drive.stopMotor();
  }

  

  @Override
  public void periodic() {

  }

  @Override
  public void simulationPeriodic() {

  }
}
