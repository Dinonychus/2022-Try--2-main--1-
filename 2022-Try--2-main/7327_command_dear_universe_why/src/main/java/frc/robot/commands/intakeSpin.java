// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.intakeSubSystem;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class intakeSpin extends CommandBase {
  @SuppressWarnings({"PMD.intakeSubSystem", "PMD.SingularField"})
  private final intakeSubSystem intakeSubSystem;


  public intakeSpin(intakeSubSystem intakeSubSystem) {
    this.intakeSubSystem = intakeSubSystem;
    addRequirements(intakeSubSystem);
  }
  

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    double intakeSpinSpeed = RobotContainer.controller1.getRawAxis(Constants.RIGHT_STICK_X);
      intakeSubSystem.setIntakeSpeed(intakeSpinSpeed);

  }

  @Override
  public void end(boolean interrupted) {
    intakeSubSystem.setIntakeSpeed(0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
