package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.DeviceId;

public class IntakeSubsystem extends SubsystemBase {
    private CANSparkMax motor = new CANSparkMax(DeviceId.ControllMotor.INTAKE_MOTOR, MotorType.kBrushless);

    public IntakeSubsystem() {
        this.motor = new CANSparkMax(DeviceId.ControllMotor.INTAKE_MOTOR, MotorType.kBrushless);
        this.motor.setSmartCurrentLimit(30);
        this.motor.setInverted(true);
    }

    public void move(double speed) {
        this.motor.set(speed);
    }

    public void stop() {
        this.motor.stopMotor();
    }
}

