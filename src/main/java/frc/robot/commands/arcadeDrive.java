package frc.robot.commands;
import frc.robot.RobotContainer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;


public class arcadeDrive extends CommandBase{

    public arcadeDrive(){
        addRequirements(RobotContainer.m_drivetrain);
        double rightSide = -RobotContainer.driverController.getRawAxis(Constants.DRIVER_CONTROLLER_MOVE_AXIS);
        double leftSide = RobotContainer.driverController.getRawAxis(Constants.DRIVER_CONTROLLER_ROTATE_AXIS);
        RobotContainer.m_drivetrain.arcadeDrive(1, 0, 1);
    }
    
}
