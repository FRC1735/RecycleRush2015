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

/**
 *
 */
public class  CollectDeployUp extends Command {
	public CollectDeployUp(){
		this(3); // if called without args (as with a button press) default timeout to 0.5 sec
	}
	

    public CollectDeployUp(double timeout) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.collectorDeployer);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        setTimeout(timeout); // Deploy for no longer than this amount of seconds
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.collectorDeployer.deployMove(0.75, true); //Assume that positive is upwards.  second arg true=ignore limit switches
   }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	// This function is for manual override only.  Ignore the limits in case the pot gets messed up!!!
    	///boolean reachedLimit = Robot.collectorDeployer.reachedUpLimit();
    	///boolean finished = (isTimedOut() || reachedLimit);
        ///return finished;
    	return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
        Robot.collectorDeployer.stop();
   }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
