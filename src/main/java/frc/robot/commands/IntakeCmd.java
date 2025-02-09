package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import frc.robot.Constants;
import frc.robot.subsystems.IntakeSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

public class IntakeCmd extends Command {
	public final IntakeSubsystem intakeSubsystem;
	private final XboxController controller;

	public IntakeCmd(IntakeSubsystem intakeSubsystem, XboxController controller) {
		this.intakeSubsystem = intakeSubsystem;
		this.controller = controller;
		this.addRequirements(this.intakeSubsystem);
	}

	@Override
	public void initialize() {
	}

	@Override
	public void execute() {
		if (this.controller.getAButton()) {
			this.intakeSubsystem.move(Constants.Controll.INTAKE_MAX_SPEED);
		} else {
			this.intakeSubsystem.stop();
		}

	}

	@Override
	public void end(boolean interrupted) {
		this.intakeSubsystem.stop();
	}

	@Override
	public boolean isFinished() {
		return false;
	}
}
