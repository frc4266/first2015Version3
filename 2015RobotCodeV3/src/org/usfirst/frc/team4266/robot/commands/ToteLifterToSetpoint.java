package org.usfirst.frc.team4266.robot.commands;

import org.usfirst.frc.team4266.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class ToteLifterToSetpoint extends Command {
	private double setpoint;
    public ToteLifterToSetpoint(double setpoint) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	 this.setpoint = setpoint;
         requires(Robot.toteLifter);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.toteLifter.enable();
        Robot.toteLifter.setSetpoint(setpoint);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return  Robot.toteLifter.onTarget();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
