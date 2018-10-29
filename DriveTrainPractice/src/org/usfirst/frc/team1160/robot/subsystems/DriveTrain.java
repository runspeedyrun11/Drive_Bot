package org.usfirst.frc.team1160.robot.subsystems;

import org.usfirst.frc.team1160.robot.OI;
import org.usfirst.frc.team1160.robot.RobotMap;
import org.usfirst.frc.team1160.robot.commands.ManuelDrive;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem{
	static Talon leftTalon;
	static Talon rightTalon;
	private static DriveTrain instance;
	
	public DriveTrain() {
		leftTalon = new Talon(RobotMap.leftTalon);
		rightTalon = new Talon(RobotMap.rightTalon);
	}
	
	private DriveTrain getInstance() {
		if (instance == null) new DriveTrain();
		return instance;
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new ManuelDrive());
	}
	
	public void manuelDrive() {
		leftTalon.set(OI.getInstance().getStick().getX() - OI.getInstance().getStick().getY());
		rightTalon.set(OI.getInstance().getStick().getX()+ OI.getInstance().getStick().getY());
	}
}
