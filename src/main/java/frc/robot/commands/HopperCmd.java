package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import frc.robot.Constants;
import frc.robot.subsystems.HopperSubsystem;
import edu.wpi.first.wpilibj2.command.Command;

public class HopperCmd extends Command {
	public final HopperSubsystem hopperSubsystem;
	private final XboxController controller;

	public HopperCmd(HopperSubsystem hopperSubsystem, XboxController controller) {
		this.hopperSubsystem = hopperSubsystem;
		this.controller = controller;
		this.addRequirements(this.hopperSubsystem);
	}

	@Override
	public void initialize() {
	}

	@Override
	public void execute() {
		if (this.controller.getAButton()) {
			this.hopperSubsystem.move(Constants.Controll.HOPPER_MAX_SPEED);
		} else {
			this.hopperSubsystem.stop();
		}

	}

	@Override
	public void end(boolean interrupted) {
		this.hopperSubsystem.stop();
	}
}

