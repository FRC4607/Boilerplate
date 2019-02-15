package frc.robot;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.robot.subsystems.Elevator;
import frc.robot.subsystems.Drivetrain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Robot extends TimedRobot {
  public static Drivetrain mDrivetrain = new Drivetrain();
  public static Elevator mElevator = Elevator.create();
  public static OI mOI = new OI();
  private final Logger mLogger = LoggerFactory.getLogger(Robot.class);

  @Override
  public void robotInit() {
    // Create the slave motors and brake mode of the Drivetrain
    Drivetrain.initDefaultSetup();
  }

  @Override
  public void robotPeriodic() {
  }

  @Override
  public void disabledInit() {
  }

  @Override
  public void disabledPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void teleopInit() {
    mLogger.info("Teleop Start");
  }
  

  // @Override
  public void teleopPeriodic() {
    Scheduler.getInstance().run();
  }

  @Override
  public void testPeriodic() {
  }
}
