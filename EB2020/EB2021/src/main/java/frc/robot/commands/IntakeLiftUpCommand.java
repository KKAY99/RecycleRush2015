package frc.robot.commands;


import frc.robot.subsystems.IntakeLiftSubsystem;

import edu.wpi.first.wpilibj2.command.CommandBase;

public class IntakeLiftUpCommand extends CommandBase {
  @SuppressWarnings({"PMD.UnusedPrivateField", "PMD.SingularField"})
  private final IntakeLiftSubsystem m_subsystem;
  private final double m_targetSpeed;
  
  /**
    * @param targetSpeed The speed we are setting in execute
   */
  public IntakeLiftUpCommand(IntakeLiftSubsystem intakeLiftSubsytem,final double targetSpeed) {
    m_subsystem=intakeLiftSubsytem;
    m_targetSpeed = targetSpeed;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(m_subsystem);
  }
    // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    m_subsystem.resetUpperSwitch();
    m_subsystem.setSpeed(m_targetSpeed);

  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
   // m_subsystem.setSpeed(m_targetSpeed);

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(final boolean interrupted) {
    m_subsystem.setSpeed(0);
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {  
    System.out.println("Up Is Finished = " + m_subsystem.isUpperSwitchSet());
    return m_subsystem.isUpperSwitchSet();
  }
}

