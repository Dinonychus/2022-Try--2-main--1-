// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.util.sendable.SendableRegistry;
import edu.wpi.first.wpilibj.CAN;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.commands.shooterSpin;

public class shooterSubSystem extends SubsystemBase {

  private CANSparkMax shooterSpark = new CANSparkMax(Constants.shooter_ID, MotorType.kBrushless);

  public void setSpeed(double shooterSpeed){
    shooterSpark.set(shooterSpeed);

  }
  public shooterSubSystem() {} 
  @Override
  public void periodic() {
  }

  @Override
  public void simulationPeriodic() {
  }
}
