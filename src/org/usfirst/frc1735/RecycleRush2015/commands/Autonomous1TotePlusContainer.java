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

/**
 *
 */
public class Autonomous1TotePlusContainer extends CommandGroup {
    
    public  Autonomous1TotePlusContainer() {
	    // The plan:
    	// 1) start with robot around our container (before match start)
    	// 2) lift container
    	addSequential(new LifterContainerSetpointGo());
    	// 3a) Arm lifter
    	addSequential(new LifterActiveMode());
    	// 3b) Roller in
    	addParallel(new CollectRollerIn());
    	// 3c) drive forward enough to grab tote (and auto-lift)
    	addParallel(new DriveWithLimits(3, 0.5, 0.75)); // Time, Distance, speed
	    // Now we have both our container and our tote.
    	// Turn and go to the auto zone to complete our mission
		// 4) Turn 90'
    	addSequential(new TurnDownfield());
		// 5) Go forward into the Auto Zone
    	addSequential(new DriveWithLimits(3, 9, 0.75)); // Time, Distance, speed   	
		// 6) Drop stack
    	addSequential(new LifterDropStack());
		// 7) Back up 2 feet
    	addSequential(new DriveWithLimits(3, 2, 0.75));  // Time, Distance, speed
    	// Done.
    	
    }
}
