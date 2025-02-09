package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ShooterSubsystem;

public class ShooterCmd extends Command {
    private final ShooterSubsystem shooterSubsystem;
    private final XboxController controller;

    public ShooterCmd(ShooterSubsystem shootersubsystem, XboxController controller) {
        this.shooterSubsystem = shootersubsystem;
        this.controller = controller;
        this.addRequirements(this.shooterSubsystem);
    }

    @Override
    public void initialize() {
    }

    @Override
    public void execute() {
        if (this.controller.getBButton()) {
            this.shooterSubsystem.move(0.3);
        } else if (this.controller.getYButton()) {
            this.shooterSubsystem.move(-0.3);
        } else {
            this.shooterSubsystem.stop();
        }
    }

    @Override
    public void end(boolean interrupted) {
        this.shooterSubsystem.stop();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}