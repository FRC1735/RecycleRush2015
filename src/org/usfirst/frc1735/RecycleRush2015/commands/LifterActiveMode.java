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
import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class LifterActiveMode extends CommandGroup {
    
    public LifterActiveMode() {
    	this(1); // 1 = 1tote as the default.
    }
    public  LifterActiveMode(int type) {  
    	// Send an "armed" indication to the SmartDashboard
        SmartDashboard.putBoolean("Auto-Lift Armed", true);

    	//TODO: fix to handle multiple button presses asking for the LifterActive command.
    	// Normally a button press starts a command.  any previously running command using the same
    	// subsystem gets interrupted/aborted.
    	// In this case, since the command is long-running, the operator could press the button a second (or multiple)
    	// times and cause the previously executing command loop to be aborted.  This would cause the lifter
    	// to be re-activated to move to the position it's already at, which could churn the system and cause
    	// the ratchet/pawl system to engage/disengage unnecessarily.
    	// 
    	// For this command, we do want it to be interrupted if the operator needs to override the system to do
    	// something else... but we don't want two copies of this particular command running.
    	// I think the answer is to look at the command queue to determine if a command of the same type is running,
    	// and if it is... abort this instance (or have it exit without doing anything)
    	
    	// The idea is to drive around with the "tote in place" sensor active.
    	// Wait until that sensor fires, and then drop the lifter to grab the tote on the fly...
    	// Start by getting the lifter into place to grab a single tote.  or container.  depending on the arg...
    	if (type == 1) {
    		addSequential(new Lifter1ToteSetpointGo());
    	}
    	if (type == 2) {
    		addSequential(new Lifter2ToteSetpointGo());
    	}
    	else {// if (type == 3) {
    		addSequential(new LifterContainerSetpointGo());
    	}
    	
    	
    	// Next, start polling the banner sensor until it fires
    	// FIXME:  There must be a way to do this with interrupts...??
    	addSequential(new WaitForToteSensor());
    	
    	// if we get this far, we have found a tote.  Drop around it...
    	addSequential(new LifterDropOrPickStackSetpointGo());
    	
    	// ... and pick it up
    	if (type == 1) {
    		addSequential(new Lifter1ToteSetpointGo());
    	}
    	if (type == 2) {
    		addSequential(new Lifter2ToteSetpointGo());
    	}
    	else {// if (type == 3) {
    		addSequential(new LifterContainerSetpointGo());
    	}
    	
    	// At the end of this state, we are holding a tote and are in position to go do the sequence again
    	// Right now, force the operator to manually trigger the 'wait' state again...
    	// ... Although it might be possible for a commandGroup to reset and start over.  Hmmm.
    	// TODO:  Investigate if CommandGroups can reset and start over without having to terminate and re-invoke.
    }
}
