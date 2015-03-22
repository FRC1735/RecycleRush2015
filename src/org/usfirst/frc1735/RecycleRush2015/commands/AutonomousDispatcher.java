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

import org.usfirst.frc1735.RecycleRush2015.commands.AutonomousRobotSet;
import org.usfirst.frc1735.RecycleRush2015.Robot;

/**
 *
 */
public class  AutonomousDispatcher extends Command {
    // We need a baseclass pointer to the command we choose so we can cancel it later
    Command main_p;

    public AutonomousDispatcher() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	// "Option 0" is to "do nothing" in the list.  Handled by falling through the 'if' statements and doing none of them.
    	
    	// "Option 1" is to drive forward into the Auto Zone and then stop (a "Robot Set")
        if (Robot.AutoMode.getSelected().toString().equals("1")) {
            AutonomousRobotSet main = new AutonomousRobotSet();
            main_p = main;
            main.start();
        }
        // "Option 2" is to collect our container, our tote, and deliver both to the auto zone
        // (Scoring our part of a robot set, a tote set, and a container set)
        else if (Robot.AutoMode.getSelected().toString().equals("2")) {
            Autonomous1TotePlusContainer main = new Autonomous1TotePlusContainer();
            main_p = main;
            main.start();
        }
        // "Option 3" is to collect our container, our tote, and the other two alliance totes, deliver all to the auto zone
        // (Scoring our part of a robot set and a container set, plus all three totes as a tote stack set)
        // Note:  This mode assumes the other alliance robots successfully moved the containers out of the way somehow
        else if (Robot.AutoMode.getSelected().toString().equals("3")) {
            Autonomous3TotePlusContainer main = new Autonomous3TotePlusContainer();
            main_p = main;
            main.start();
        }
        // "Option 4" is to collect our container, our tote, and the other two alliance totes,
        //            move the other alliance containers "out of the way" and then deliver 3 totes + our container to the auto zone
        // (Scoring our part of a robot set and a container set, plus all three totes as a tote stack set)
        // Note:  This mode assumes the other alliance robots can't do anything but perhaps their part of the robot set.
        else if (Robot.AutoMode.getSelected().toString().equals("4")) {
            Autonomous3TotePlusContainerPlusMove2Container main = new Autonomous3TotePlusContainerPlusMove2Container();
            main_p = main;
            main.start();
        }
        // "Option 5" is to do absolutely everything ourselves:
        //            collect our container, our tote, and the other two alliance totes,
        //            plus move the other alliance totes INTO SCORING POSITION and then finally delivering 3 totes + our container to the auto zone
        // (Scoring our part of a robot set, plus a full container set, plus all three totes as a tote stack set)
        // Note:  This mode assumes the other alliance robots can't do anything but perhaps their part of the robot set.
        else if (Robot.AutoMode.getSelected().toString().equals("5")) {
            AutonomousGrandSlam main = new AutonomousGrandSlam();
            main_p = main;
            main.start();
        }
        // "Option 6" is to lift a tote a little bit, and drive forward into the Auto Zone
        else if (Robot.AutoMode.getSelected().toString().equals("6")) {
            AutonomousCarryTote main = new AutonomousCarryTote();
            main_p = main;
            main.start();
        }
        // "Option 7" is to lift a container a little bit, and drive forward into the Auto Zone
        else if (Robot.AutoMode.getSelected().toString().equals("7")) {
            AutonomousCarryContainer main = new AutonomousCarryContainer();
            main_p = main;
            main.start();
        }
        // "Option 8" is to drive backwards into the Auto Zone pushing the container but not touching the yellow tote.
        else if (Robot.AutoMode.getSelected().toString().equals("8")) {
            AutonomousBackwards main = new AutonomousBackwards();
            main_p = main;
            main.start();
        }
        else {
                // Again, if we select '0' as an option we fall through the 'if' statements and do nothing.
        }
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        // Leave the dispatcher around until the underlying command has completed.
        // That way, the dispatcher sticks around until Autonomous is done
        // This will enable any cancellation of the command to be caught and forwarded to the underlying command.
        // isFinished() would be ideal, but it is a protected member.  Thus, we will try to use isRunning() instead.
        return main_p.isRunning(); 
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        // When cancelled, we need to cancel the command we initiated!
        main_p.cancel();
    }
}
