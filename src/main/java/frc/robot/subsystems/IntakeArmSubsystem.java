package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj.DutyCycleEncoder;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.DeviceId;

public class IntakeArmSubsystem extends SubsystemBase {
    private CANSparkMax motor = new CANSparkMax(DeviceId.ControllMotor.INTAKEARM_MOTOR, MotorType.kBrushless);

    public IntakeArmSubsystem() {
        this.motor = new CANSparkMax(DeviceId.ControllMotor.INTAKEARM_MOTOR, MotorType.kBrushless);
        this.motor.setSmartCurrentLimit(30);
        this.motor.setInverted(true);
    }

    public void move(double speed) {
        this.motor.set(speed);
    }

    public void up(double speed) {
        this.motor.set(Constants.Controll.INTAKEARM_MAX_SPEED);
    }

    public void down(double speed) {
        this.motor.set(-(Constants.Controll.INTAKEARM_MAX_SPEED));
    }

    public void stop() {
        this.motor.stopMotor();
    }

}
