// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.shooterSubSystem;
import frc.robot.Constants;
import frc.robot.RobotContainer;

/** An example command that uses an example subsystem. */
public class shooterSpin extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final shooterSubSystem shooterSubSystem;


  
  public shooterSpin(shooterSubSystem shooterSubSystem) {
    this.shooterSubSystem = shooterSubSystem;
    addRequirements(shooterSubSystem);
  }

  @Override
  public void initialize() {

  }

  @Override
  public void execute() {

    double spinSpeed = RobotContainer.controller1.getRawAxis(Constants.RIGHT_TRIGGER);

    shooterSubSystem.setSpeed(spinSpeed);

  }

  @Override
  public void end(boolean interrupted) {
    shooterSubSystem.setSpeed(0);
    
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
