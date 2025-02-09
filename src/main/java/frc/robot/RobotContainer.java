package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.commands.DriveCmd;
import frc.robot.commands.HopperCmd;
import frc.robot.commands.IntakeArmCmd;
import frc.robot.commands.IntakeCmd;
import frc.robot.commands.ShooterCmd;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.HopperSubsystem;
import frc.robot.subsystems.IntakeArmSubsystem;
import frc.robot.subsystems.IntakeSubsystem;
import frc.robot.subsystems.ShooterSubsystem;

public class RobotContainer {
    private final GamepadJoystick driver = new GamepadJoystick(GamepadJoystick.DRIVER_PORT);
    private final GamepadJoystick controller = new GamepadJoystick(GamepadJoystick.CONTROLLER_PORT);

    private final DriveSubsystem driveMotorSubsystem = new DriveSubsystem();
    private final IntakeSubsystem intakeSubsystem = new IntakeSubsystem();
    private final HopperSubsystem hopperSubsystem = new HopperSubsystem();
    private final IntakeArmSubsystem intakeArmSubsystem = new IntakeArmSubsystem();
    private final ShooterSubsystem shooterSubsystem = new ShooterSubsystem();

    private final DriveCmd driveJoystickCmd = new DriveCmd(driveMotorSubsystem, driver);
    private final ShooterCmd shooterCmd = new ShooterCmd(shooterSubsystem, controller);
    private final IntakeArmCmd intakeArmCmd = new IntakeArmCmd(intakeArmSubsystem, controller);
    private final HopperCmd hopperCmd = new HopperCmd(hopperSubsystem, controller);
    private final IntakeCmd intakeCmd = new IntakeCmd(intakeSubsystem, controller);

    public RobotContainer() {
        this.driveMotorSubsystem.setDefaultCommand(this.driveJoystickCmd);
        this.shooterSubsystem.setDefaultCommand(this.shooterCmd);
        this.intakeSubsystem.setDefaultCommand(this.intakeCmd);
        this.intakeArmSubsystem.setDefaultCommand(this.intakeArmCmd);
        this.hopperSubsystem.setDefaultCommand(this.hopperCmd);

    }

    public Command getAutonomousCommand() {
        return null;
    }
}
