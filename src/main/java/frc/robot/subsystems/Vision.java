// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import org.photonvision.PhotonCamera;
import org.photonvision.targeting.PhotonPipelineResult;
import org.photonvision.targeting.PhotonTrackedTarget;

import edu.wpi.first.math.util.Units;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.wpilibj2.command.SubsystemBase;



public class Vision extends SubsystemBase {

  private PhotonCamera camera;
  private PhotonPipelineResult result;
  private PhotonTrackedTarget target;
  private boolean hasTargets;
  private double yaw;
  private double pitch;
  private double area;
  private double skew;
  private int id;

  /** Creates a new Vision. */
  public Vision() {

    camera = new PhotonCamera("photonvison");
    result = camera.getLatestResult();
    target = result.getBestTarget();
    hasTargets = result.hasTargets();
    yaw = target.getYaw();
    pitch = target.getPitch();
    area = target.getArea();
    skew = target.getSkew();
    id = target.getFiducialId();
  }

  @Override
  public void periodic() {
    if(id==7){
      yaw = target.getYaw();
    }
  }
}
