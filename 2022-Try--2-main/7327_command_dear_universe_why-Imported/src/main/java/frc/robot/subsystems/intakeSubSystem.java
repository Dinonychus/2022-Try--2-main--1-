// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.commands.intakeSpin;

public class intakeSubSystem extends SubsystemBase {

  private CANSparkMax intakeSpark = new CANSparkMax(Constants.intake_ID, MotorType.kBrushless);


  public intakeSubSystem() {
    this.setDefaultCommand(new intakeSpin(this));
  }

  public void setIntakeSpeed(double intakeSpeed){
   intakeSpark.set(intakeSpeed);
  }

  @Override
  public void periodic() {

  }

  @Override
  public void simulationPeriodic() {

  }
}
