package frc.robot.commands.Cargo;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;

public class CargoPodStop extends Command {

  public CargoPodStop() {
    requires(Robot.mCargo);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    Robot.mCargo.CargoStop();

  }

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
  }

  @Override
  protected void interrupted() {
  }
}
