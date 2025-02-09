package frc.robot;

public class Constants {
  public static final class Drive {
    public static final double MAX_SPEED = 0.1;
    public static final double MAX_TURN_SPEED = 0.2;
    public static final double DEAD_BAND = 0.05;
    public static final double MAX_DRIVE_SPEED = 0.5;
  }

  public static final class Controll {
    public static final double INTAKEARM_MAX_SPEED = 0.3;
    public static final double INTAKE_MAX_SPEED = 0.8;
    public static final double HOPPER_MAX_SPEED = 0.2;
    public static final double SHOOTER_MAX_SPEED = 3;
  }

  public static final class MotorReverse {
    public static final boolean FRONT_LEFT = false;
    public static final boolean FRONT_RIGHT = true;
    public static final boolean BACK_LEFT = false;
    public static final boolean BACK_RIGHT = true;
    public static final boolean HOPPER_MOTOR = true;
    public static final boolean INTAKEARM_MOTOR = false;
    public static final boolean INTAKE_MOTOR = false;
    public static final boolean SHOOTERARM_MOTOR = false;
    public static final boolean SHOOTER_FRONT_MOTOR = true;
    public static final boolean SHOOTERARM_BACK_MOTOR = false;
  }

}
