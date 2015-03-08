// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1735.RecycleRush2015.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc1735.RecycleRush2015.Robot;
import org.usfirst.frc1735.RecycleRush2015.RobotMap;

/**
 *
 */
public class  LifterGotoDrop extends Command {

    public LifterGotoDrop() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.lifter);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }


    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(2.0); // Sanity measure in case the pot goes crazy so we will eventually break out of the command...
    	
    	m_setpoint = 9.59;
    	// Determine our direction of movement based on current position and setpoint.
    	m_requiredDirectionMagnitude = Robot.lifter.calculateMagnitudeDirection(m_setpoint);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	// Direction is precalculated based on whether are above or below the desired setpoint.
    	Robot.lifter.liftWithLimits(m_requiredDirectionMagnitude, timeSinceInitialized()); // magnitude, currentTime
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	// Query the Tape Pot to see if we have reached our predetermined limit yet
    	// 9 is lowest height, 3 is highest.
    	double currentPosition = RobotMap.lifterLiftHeightPot.get();
    	// We are finished if...
    	return (isTimedOut() || Robot.lifter.lifterTargetReached(m_setpoint, currentPosition, m_requiredDirectionMagnitude));

    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.lifter.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
    
    // Command local variables
    double m_setpoint; // Desired position to reach
    double m_requiredDirectionMagnitude; // Desired direction (calculated based on setpoint and current position at start of command)
    
}
