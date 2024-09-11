// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import org.photonvision.PhotonCamera;

import edu.wpi.first.math.util.Units;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class Vision extends SubsystemBase {
  /** Creates a new Vision. */
  public Vision() {

    PhotonCamera camera = new PhotonCamera("103Cybersonics");

     NetworkTable table = NetworkTableInstance.getDefault().getTable("limelight-fv");

     NetworkTableEntry rawBytes = table.getEntry("rawBytes");
     NetworkTableEntry latencyMillis = table.getEntry("latencyMillis");
     NetworkTableEntry targetPitch = table.getEntry("targetPitch");

     NetworkTableEntry targetYaw = table.getEntry("targetYaw");
     NetworkTableEntry targetArea = table.getEntry("targetArea");
     NetworkTableEntry targetSkew = table.getEntry("targetSkew");

     NetworkTableEntry targetPose = table.getEntry("targetPose");
     NetworkTableEntry tltargetPixelsXEntry = table.getEntry("targetPixelsX");
     NetworkTableEntry targetPixelsY = table.getEntry("targetPixelsY");

     NetworkTableEntry targetspaceEntry = table.getEntry("botpose_targetspace");
     double[] targetspaceCache = new double[6]; // array that will hold all the positions

     NetworkTableEntry botpose_wpiblueEntry = table.getEntry("botpose_wpiblue");
     double[] botpose_wpiblueCache = new double[7];
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
