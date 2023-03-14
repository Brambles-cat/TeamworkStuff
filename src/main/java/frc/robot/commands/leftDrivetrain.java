package frc.robot.commands;

import frc.robot.subsystems.drivetrainLeft;
import edu.wpi.first.wpilibj2.command.CommandBase;

/** An example command that uses an example subsystem. */
public class leftDrivetrain extends CommandBase {
  double value1;
  drivetrainLeft driveL;
  
  public leftDrivetrain (drivetrainLeft driveL, double value2) {
    addRequirements(driveL);
    value1 = value2;
    this.driveL = driveL;
  }
  
  
  
  
  
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})

  
 

  
  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    driveL.setOutput(value1);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean placeholder) {
    driveL.setOutput(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}