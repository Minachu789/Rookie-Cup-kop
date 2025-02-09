package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkBase.IdleMode;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.DeviceId;

public class HopperSubsystem extends SubsystemBase {
    private CANSparkMax motor = new CANSparkMax(DeviceId.ControllMotor.HOPPER_MOTOR, MotorType.kBrushless);

    public HopperSubsystem() {
        this.motor = new CANSparkMax(DeviceId.ControllMotor.INTAKEARM_MOTOR, MotorType.kBrushless);
        this.motor.setSmartCurrentLimit(30);
        this.motor.setInverted(true);
    }

    public void move(double speed) {
        this.motor.set(Constants.Controll.HOPPER_MAX_SPEED);
    }

    public void stop() {
        this.motor.stopMotor();
    }
}

