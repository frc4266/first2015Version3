package org.usfirst.frc.team4266.robot;

import org.usfirst.frc.team4266.robot.commands.LoadNextTote;
import org.usfirst.frc.team4266.robot.commands.ToteLifterToSetpoint;
import org.usfirst.frc.team4266.robot.commands.UnloadTotes;
import org.usfirst.frc.team4266.robot.commands.UserCanLiftOff;
import org.usfirst.frc.team4266.robot.commands.UserCanLiftOn;
import org.usfirst.frc.team4266.robot.commands.UserClawOff;
import org.usfirst.frc.team4266.robot.commands.UserClawMover;
import org.usfirst.frc.team4266.robot.commands.UserScissorLiftOff;
import org.usfirst.frc.team4266.robot.commands.UserScissorLiftOn;
import org.usfirst.frc.team4266.robot.commands.UserToteLifterOff;
import org.usfirst.frc.team4266.robot.commands.UserToteLifterOn;
import org.usfirst.frc.team4266.robot.commands.UserTurnOffConveyor;
import org.usfirst.frc.team4266.robot.commands.UserTurnOnConveyor;
import org.usfirst.frc.team4266.robot.subsystems.ScissorLifter;
import org.usfirst.frc.team4266.robot.subsystems.ToteLifter;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(st ick, buttonNumber);
    
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
    public static final Joystick driveStick = new Joystick(RobotMap.driveStick);
    public static final Joystick liftStick = new Joystick(RobotMap.joystick2);
    
    
  
    
    public OI (){
    	
    //DRIVER JOYSTICK INTERACTIONS
    	
    	//Driver Button 6 turns conveyor IN
    	new JoystickButton(driveStick, 6).whenPressed(new UserTurnOnConveyor(1));//conveyor to load
    	new JoystickButton(driveStick, 6).whenReleased(new UserTurnOffConveyor());
    	
    	//DriverButton 7 turns conveyor out
    	new JoystickButton(driveStick, 7).whenPressed(new UserTurnOnConveyor(-1));//conveyor to unload
    	new JoystickButton(driveStick, 7).whenReleased(new UserTurnOffConveyor());
    	
    	//Driver Button 8 Lowers the Scissor Lifter
    	new JoystickButton(driveStick, 8).whenPressed(new UserScissorLiftOn(-0.7));//scissor lift down
    	new JoystickButton(driveStick, 8).whenReleased(new UserScissorLiftOff());
    	
    	//Driver Button 9 Raises the Scissor Lifter
    	new JoystickButton(driveStick, 9).whenPressed(new UserScissorLiftOn(0.7));//scissor lift up
    	new JoystickButton(driveStick, 9).whenReleased(new UserScissorLiftOff());
    	
	//TOTE LIFTER JOYSTICK INTERACTIONS
    	
    	//ToteLifter Button 6 Raises the CanLifter
    	new JoystickButton(liftStick, 6).whenPressed(new UserCanLiftOn(0.7));//tote lifter up
    	new JoystickButton(liftStick, 6).whenReleased(new UserCanLiftOff());
    	
    	//ToteLifter Button 7 Lowers the CanLifter
    	new JoystickButton(liftStick, 7).whenPressed(new UserCanLiftOn(-0.2));//tote lifter down
    	new JoystickButton(liftStick, 7).whenReleased(new UserCanLiftOff());
    	
    	
    	//ToteLifter Button 8 Rotates Claw One Direction
    	new JoystickButton(liftStick, 8).whenPressed(new UserClawMover(0.3));//positive power one way
    	new JoystickButton(liftStick, 8).whenReleased(new UserClawOff());
    	
    	//ToteLifter Button 8 Rotates Claw The Other Direction
    	new JoystickButton(liftStick, 9).whenPressed(new UserClawMover(-0.3));//negative power the otherp
    	new JoystickButton(liftStick, 9).whenReleased(new UserClawOff());
    	

    	new JoystickButton(liftStick, 11).whenPressed(new UserToteLifterOn(0.3));//tote lifter up
    	new JoystickButton(liftStick, 11).whenReleased(new UserToteLifterOff());
    	
    	new JoystickButton(liftStick, 10).whenPressed(new UserToteLifterOn(-0.3));//tote lifter down
    	new JoystickButton(liftStick, 10).whenReleased(new UserToteLifterOff());

    }
    
    /*
     * Three light sensors
     * Encoders - two new, two old encoders already on gear boxes
     * Six magnetic switches
     * 
     * 
     * 9 micro switches
     * 
     * 
     * 
     */
}

