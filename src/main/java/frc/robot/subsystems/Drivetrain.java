package frc.robot.subsystems;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class Drivetrain extends SubsystemBase {

    public Talon FL,FR,RL,RR; 
    public MotorControllerGroup leftSide,rightSide;
    public static DifferentialDrive drive;


    public Drivetrain(){
        FL = new Talon(Constants.DRIVETRAIN_FRONT_LEFT_TALON);
        FR =new Talon(Constants.DRIVETRAIN_FRONT_RIGHT_TALON);
        RL=new Talon(Constants.DRIVETRAIN_REAR_LEFT_TALON);
        RR = new Talon(Constants.DRIVETRAIN_REAR_RIGHT_TALON);

        leftSide = new MotorControllerGroup(FL, RL);
        rightSide = new MotorControllerGroup(FR, RR); 

        drive = new DifferentialDrive(leftSide,rightSide); 
    }

    public static void arcadeDrive(double speedLeft, double speedRight,double mod){
        drive.tankDrive(speedLeft*mod, speedRight*mod);
    }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
