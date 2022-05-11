// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.commands.shooterSpin;

public class shooterSubSystem extends SubsystemBase {

  private CANSparkMax shooterSpark = new CANSparkMax(Constants.shooter_ID, MotorType.kBrushless);

  public shooterSubSystem() {
    this.setDefaultCommand(new shooterSpin(this));
  } 

  public void setSpeed(double shooterSpeed){
    shooterSpark.set(shooterSpeed);
  }

  @Override
  public void periodic() {
  }

  @Override
  public void simulationPeriodic() {
  }
}
