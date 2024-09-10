// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import org.photonvision.PhotonCamera;

import edu.wpi.first.math.util.Units;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Vision extends SubsystemBase {
  /** Creates a new Vision. */
  public Vision() {
    final double CAMERA_HEIGHT_METERS = Units.inchesToMeters(24);
    final double TARGET_HEIGHT_METERS = Units.feetToMeters(5);
    final double CAMERA_PITCH_RADIANS = Units.degreesToRadians(0);

    PhotonCamera camera = new PhotonCamera("103Cybersonics");

     double latencyMillis = 0;
     boolean hasTarget = false;
    double targetPitch = 0;
     double targetYaw = 0;
     double targetArea = 0;
     double targetSkew = 0;
     double targetPose = 0;
     double targetPixelsX = 0;
     double targetPixelsY = 0;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
