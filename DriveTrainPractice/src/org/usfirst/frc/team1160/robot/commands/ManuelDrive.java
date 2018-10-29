package org.usfirst.frc.team1160.robot.commands;

import org.usfirst.frc.team1160.robot.Robot;
import org.usfirst.frc.team1160.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;

//Yo Zach if you're reading this, what's the automatic way of getting all that fun command stuff again ty
//I just copy pasted from ExampleCommand for this one

public class ManuelDrive extends Command{
	public ManuelDrive() {
		// Use requires() here to declare subsystem dependencies
		requires(Robot.dt);
	}

	// Called just before this Command runs the first time
	@Override
	protected void initialize() {
	}

	// Called repeatedly when this Command is scheduled to run
	@Override
	protected void execute() {
		Robot.dt.manuelDrive();
		// "The method manuelDrive() is undefined for the type Subsystem"
		// Resolved but not understood - see Robot.java
	}

	// Make this return true when this Command no longer needs to run execute()
	@Override
	protected boolean isFinished() {
		return false;
	}

	// Called once after isFinished returns true
	@Override
	protected void end() {
	}

	// Called when another command which requires one or more of the same
	// subsystems is scheduled to run
	@Override
	protected void interrupted() {
	}
}
