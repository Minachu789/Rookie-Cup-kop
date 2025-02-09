package frc.robot.commands;

import edu.wpi.first.math.MathUtil;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Constants;
import frc.robot.subsystems.IntakeArmSubsystem;

public class IntakeArmCmd extends Command {
	private final IntakeArmSubsystem intakeArmSubsystem;
	private final XboxController controller;

	public IntakeArmCmd(IntakeArmSubsystem intakeArmSubsystem, XboxController controller) {
		this.intakeArmSubsystem = intakeArmSubsystem;
		this.controller = controller;
		this.addRequirements(this.intakeArmSubsystem);
	}

	@Override
	public void initialize() {
	}

	@Override
	public void execute() {
		double intakeArmspeed = -MathUtil.applyDeadband(this.controller.getLeftY(), Constants.Drive.DEAD_BAND);
		if (this.controller.getLeftBumper()) {
			this.intakeArmSubsystem.move(Constants.Controll.INTAKEARM_MAX_SPEED);
		} else if (this.controller.getRightBumper()) {
			this.intakeArmSubsystem.move(-Constants.Controll.INTAKEARM_MAX_SPEED);
		} else if (intakeArmspeed > 0.05 && intakeArmspeed < -0.05) {
			this.intakeArmSubsystem.move(intakeArmspeed);
		} else {
			this.intakeArmSubsystem.stop();
		}
	}

	@Override
	public void end(boolean interrupted) {
		this.intakeArmSubsystem.stop();
	}

	@Override
	public boolean isFinished() {
		return false;
	}
}
