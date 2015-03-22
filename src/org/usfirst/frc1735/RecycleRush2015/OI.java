// RobotBuilder Version: 1.5
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc1735.RecycleRush2015;

import org.usfirst.frc1735.RecycleRush2015.Robot;
import org.usfirst.frc1735.RecycleRush2015.commands.AntiAntiPokerExtend;
import org.usfirst.frc1735.RecycleRush2015.commands.AntiAntiPokerRetract;
import org.usfirst.frc1735.RecycleRush2015.commands.Autonomous1TotePlusContainer;
import org.usfirst.frc1735.RecycleRush2015.commands.Autonomous3TotePlusContainer;
import org.usfirst.frc1735.RecycleRush2015.commands.Autonomous3TotePlusContainerPlusMove2Container;
import org.usfirst.frc1735.RecycleRush2015.commands.AutonomousCarryContainer;
import org.usfirst.frc1735.RecycleRush2015.commands.AutonomousCommand;
import org.usfirst.frc1735.RecycleRush2015.commands.AutonomousDispatcher;
import org.usfirst.frc1735.RecycleRush2015.commands.AutonomousGrandSlam;
import org.usfirst.frc1735.RecycleRush2015.commands.AutonomousRobotSet;
import org.usfirst.frc1735.RecycleRush2015.commands.CollectRollerIn;
import org.usfirst.frc1735.RecycleRush2015.commands.CollectRollerOut;
import org.usfirst.frc1735.RecycleRush2015.commands.CollectRollerStop;
import org.usfirst.frc1735.RecycleRush2015.commands.CollectorGraspIn;
import org.usfirst.frc1735.RecycleRush2015.commands.CollectorGraspOut;
import org.usfirst.frc1735.RecycleRush2015.commands.DriveWithLimits;
import org.usfirst.frc1735.RecycleRush2015.commands.Lifter1ToteDeadReckoning;
import org.usfirst.frc1735.RecycleRush2015.commands.Lifter1ToteSetpointGo;
import org.usfirst.frc1735.RecycleRush2015.commands.Lifter2ToteSetpointGo;
import org.usfirst.frc1735.RecycleRush2015.commands.LifterActiveDisable;
import org.usfirst.frc1735.RecycleRush2015.commands.LifterActiveMode;
import org.usfirst.frc1735.RecycleRush2015.commands.LifterContainerDeadReckoning;
import org.usfirst.frc1735.RecycleRush2015.commands.LifterContainerSetpointGo;
import org.usfirst.frc1735.RecycleRush2015.commands.LifterDropDeadReckoning;
import org.usfirst.frc1735.RecycleRush2015.commands.LifterDropOrPickStackSetpointGo;
import org.usfirst.frc1735.RecycleRush2015.commands.LifterDropStack;
import org.usfirst.frc1735.RecycleRush2015.commands.LifterGoto1Tote;
import org.usfirst.frc1735.RecycleRush2015.commands.LifterGoto1ToteStep;
import org.usfirst.frc1735.RecycleRush2015.commands.LifterGoto2Tote;
import org.usfirst.frc1735.RecycleRush2015.commands.LifterGoto2ToteStep;
import org.usfirst.frc1735.RecycleRush2015.commands.LifterGoto3ToteStep;
import org.usfirst.frc1735.RecycleRush2015.commands.LifterGotoCarryContainer;
import org.usfirst.frc1735.RecycleRush2015.commands.LifterGotoCarryTote;
import org.usfirst.frc1735.RecycleRush2015.commands.LifterGotoContainer;
import org.usfirst.frc1735.RecycleRush2015.commands.LifterGotoDrop;
import org.usfirst.frc1735.RecycleRush2015.commands.LifterGotoDropStep;
import org.usfirst.frc1735.RecycleRush2015.commands.LifterRatchetDisengage;
import org.usfirst.frc1735.RecycleRush2015.commands.LifterRatchetEngage;
import org.usfirst.frc1735.RecycleRush2015.commands.PokeExtend;
import org.usfirst.frc1735.RecycleRush2015.commands.PokeRetract;
import org.usfirst.frc1735.RecycleRush2015.commands.TurnDownfield;
import org.usfirst.frc1735.RecycleRush2015.commands.TurnInfield;
import org.usfirst.frc1735.RecycleRush2015.commands.WaitForToteSensor;
import org.usfirst.frc1735.RecycleRush2015.commands.WallDriveLeft;
import org.usfirst.frc1735.RecycleRush2015.commands.WallDriveRight;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.DriverStation.Alliance;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton graspInwards;
    public JoystickButton graspOutwards;
    public Joystick leftJoystick;
    public JoystickButton rollerIn;
    public JoystickButton rollerOut;
    public JoystickButton rollerStop;
    public JoystickButton crabLeft;
    public JoystickButton crabRight;
    public Joystick rightJoystick;
    public JoystickButton dropStack;
    public JoystickButton liftAbove1Tote;
    public JoystickButton liftAbove2Tote;
    public JoystickButton liftContainerAbove1Tote;
    public JoystickButton dropStackOnStep;
    public JoystickButton liftAboveStepAnd1Tote;
    public JoystickButton liftAboveStepand3Tote;
    public JoystickButton extendPoker;
    public JoystickButton retractPoker;
    public JoystickButton extendAntiAntiPoker;
    public JoystickButton retractAntiAntiPoker;
    public Joystick accessoryJoystick;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        accessoryJoystick = new Joystick(2);
        
        retractAntiAntiPoker = new JoystickButton(accessoryJoystick, 10);
        retractAntiAntiPoker.whenPressed(new AntiAntiPokerRetract());
        extendAntiAntiPoker = new JoystickButton(accessoryJoystick, 11);
        extendAntiAntiPoker.whenPressed(new AntiAntiPokerExtend());
        retractPoker = new JoystickButton(accessoryJoystick, 6);
        retractPoker.whenPressed(new PokeRetract());
        extendPoker = new JoystickButton(accessoryJoystick, 7);
        extendPoker.whenPressed(new PokeExtend());
        liftAboveStepand3Tote = new JoystickButton(accessoryJoystick, 9);
        liftAboveStepand3Tote.whenPressed(new LifterGoto3ToteStep());
        liftAboveStepAnd1Tote = new JoystickButton(accessoryJoystick, 8);
        liftAboveStepAnd1Tote.whenPressed(new LifterGoto1ToteStep());
        dropStackOnStep = new JoystickButton(accessoryJoystick, 2);
        dropStackOnStep.whenPressed(new LifterGotoDropStep());
        liftContainerAbove1Tote = new JoystickButton(accessoryJoystick, 5);
        liftContainerAbove1Tote.whenPressed(new LifterGotoContainer());
        liftAbove2Tote = new JoystickButton(accessoryJoystick, 3);
        liftAbove2Tote.whenPressed(new LifterGoto2Tote());
        liftAbove1Tote = new JoystickButton(accessoryJoystick, 4);
        liftAbove1Tote.whenPressed(new LifterGoto1Tote());
        dropStack = new JoystickButton(accessoryJoystick, 1);
        dropStack.whenPressed(new LifterGotoDrop());
        rightJoystick = new Joystick(1);
        
        crabRight = new JoystickButton(rightJoystick, 5);
        crabRight.whileHeld(new WallDriveRight());
        crabLeft = new JoystickButton(rightJoystick, 4);
        crabLeft.whileHeld(new WallDriveLeft());
        rollerStop = new JoystickButton(rightJoystick, 2);
        rollerStop.whenPressed(new CollectRollerStop());
        rollerOut = new JoystickButton(rightJoystick, 3);
        rollerOut.whileHeld(new CollectRollerOut());
        rollerIn = new JoystickButton(rightJoystick, 1);
        rollerIn.whileHeld(new CollectRollerIn());
        leftJoystick = new Joystick(0);
        
        graspOutwards = new JoystickButton(leftJoystick, 4);
        graspOutwards.whileHeld(new CollectorGraspOut());
        graspInwards = new JoystickButton(leftJoystick, 5);
        graspInwards.whileHeld(new CollectorGraspIn());

	    
        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous 1Tote Plus Container", new Autonomous1TotePlusContainer());

        SmartDashboard.putData("Autonomous 3Tote Plus Container", new Autonomous3TotePlusContainer());

        SmartDashboard.putData("Autonomous 3Tote Plus Container Plus Move2Container", new Autonomous3TotePlusContainerPlusMove2Container());

        SmartDashboard.putData("Autonomous Grand Slam", new AutonomousGrandSlam());

        SmartDashboard.putData("Autonomous Carry Container", new AutonomousCarryContainer());

        SmartDashboard.putData("Lifter Active Mode", new LifterActiveMode());

        SmartDashboard.putData("Lifter Active Disable", new LifterActiveDisable());

        SmartDashboard.putData("Lifter Ratchet Engage", new LifterRatchetEngage());

        SmartDashboard.putData("Lifter Ratchet Disengage", new LifterRatchetDisengage());

        SmartDashboard.putData("Lifter Goto Carry Container", new LifterGotoCarryContainer());

        SmartDashboard.putData("Lifter Goto Carry Tote", new LifterGotoCarryTote());

        SmartDashboard.putData("Lifter Goto 2Tote Step", new LifterGoto2ToteStep());


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        // This code adds a selectable object to select which Autonomous mode we wish to invoke:
        Robot.AutoMode.addObject("Do Nothing", "0"); 		   // In the rare case we want/need to disable Autonomous operation
        Robot.AutoMode.addObject("Robot Set", "1");           // DEFAULT: Perform a Robot Set by driving forward to the Auto zone
        Robot.AutoMode.addDefault("1Tote Plus Container", "2"); // Score our tote plus our container plus ourselves
        Robot.AutoMode.addObject("3Tote Plus Container", "3"); // Score all three totes plus our container plus ourselves
        Robot.AutoMode.addObject("3Tote Plus Container Plus Move 2Container", "4"); // Score all three totes plus our container plus ourselves, and also move the other containers out of the way
        Robot.AutoMode.addObject("Grand Slam", "5");           // Score all three totes plus all three containers plus ourselves
        Robot.AutoMode.addObject("Carry Tote and Go", "6");       // Lift tote a tiny bit and they drive forward to the Auto Zone.
        Robot.AutoMode.addObject("Carry Container and Go", "7");  // Lift container a tiny bit and they drive forward to the Auto Zone.
        Robot.AutoMode.addObject("Go Backwards", "8");          // Drive backwards into the Auto Zone.  Used to push the recycling container without touching the yellow tote.
        SmartDashboard.putData("Automode", Robot.AutoMode);
        
        
        // Extract our alliance color for this match (just in case it becomes useful later... like for lights.  Or asymmetrical fields.
        Alliance m_alliance = DriverStation.getInstance().getAlliance();
        System.out.println("Our alliance color is: " + m_alliance.toString()); //Alliance.Red  or Blue or Invalid
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getLeftJoystick() {
        return leftJoystick;
    }

    public Joystick getRightJoystick() {
        return rightJoystick;
    }

    public Joystick getAccessoryJoystick() {
        return accessoryJoystick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

