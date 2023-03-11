// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class drivetrainLeft extends SubsystemBase {
  TalonFX frontLeft = new TalonFX(0);
  TalonFX backLeft = new TalonFX(0);
  /** Creates a new ExampleSubsystem. */
  public drivetrainLeft() {}

    public void setOutput (double value1) {
      frontLeft.set(ControlMode.PercentOutput, value1);
      backLeft.set(ControlMode.PercentOutput, value1);
    }
  /**
   * Example command factory method.
   *
   * @return a command
   */

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
  

  
}
