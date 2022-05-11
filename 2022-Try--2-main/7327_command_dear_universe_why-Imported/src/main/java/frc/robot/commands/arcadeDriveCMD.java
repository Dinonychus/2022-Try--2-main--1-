// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.driveTrain;
import frc.robot.Constants;
import frc.robot.RobotContainer;


public class arcadeDriveCMD extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final driveTrain driveTrain;


  public arcadeDriveCMD(driveTrain driveTrain) {
    this.driveTrain = driveTrain;
    addRequirements(driveTrain);
  }

  @Override
  public void initialize() {


  }
  
  

  @Override
  public void execute() {
    double moveSpeed = -RobotContainer.controller0.getRawAxis(Math.abs(Constants.LEFT_STICK_Y*Constants.LEFT_STICK_Y));
    double rotateSpeed = RobotContainer.controller0.getRawAxis(Math.abs(Constants.RIGHT_STICK_X));

    driveTrain.arcadeDrive(moveSpeed, rotateSpeed);
  }

  @Override
  public void end(boolean interrupted) {
    driveTrain.arcadeDrive(0, 0);
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
