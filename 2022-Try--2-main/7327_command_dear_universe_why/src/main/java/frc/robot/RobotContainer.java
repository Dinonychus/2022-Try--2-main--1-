// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.arcadeDriveCMD;
import frc.robot.commands.autoMoonwalk;
import frc.robot.commands.shooterSpin;
import frc.robot.subsystems.driveTrain;
import frc.robot.subsystems.intakeSubSystem;
import frc.robot.subsystems.shooterSubSystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;


public class RobotContainer {

  private final shooterSubSystem shooterSubSystem = new shooterSubSystem();
  private final driveTrain driveTrain = new driveTrain();
  private final intakeSubSystem intakeSubSystem = new intakeSubSystem();

  //controllers
  public final static XboxController controller0 = new XboxController(Constants.driverController_ID);
  public final static  XboxController controller1 = new XboxController(Constants.mechanismController_ID);

  public double GetDriverRawAxis(int axis){
    return controller0.getRawAxis(axis);
   

  }

  public RobotContainer() {
    driveTrain.setDefaultCommand(new arcadeDriveCMD(driveTrain));
    shooterSubSystem.setDefaultCommand(new shooterSpin(shooterSubSystem));
    configureButtonBindings();
  }


  private void configureButtonBindings() {

  }
  

   public Command getAutonomousCommand() {
    return new SequentialCommandGroup(
      new autoMoonwalk(driveTrain));
    
    

    
    }

}

