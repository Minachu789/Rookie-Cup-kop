package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.DeviceId;

public class ShooterSubsystem extends SubsystemBase {
    private CANSparkMax motor = new CANSparkMax(DeviceId.ControllMotor.SHOOTER_MOTOR, MotorType.kBrushless);

    public ShooterSubsystem() {
        this.motor = new CANSparkMax(DeviceId.ControllMotor.SHOOTER_MOTOR, MotorType.kBrushless);
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

