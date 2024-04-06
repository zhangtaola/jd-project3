package com.cykj.pojo;

import lombok.Data;

@Data
public class CyAdmin {

  private long adminId;
  private String adminAccount;
  private String adminPwd;
  private String adminName;
  private String adminFace;
  private long adminRoleId;
  private long adminDepartmentId;
  private long adminStatus;
  private long adminIsDelete;
  private java.sql.Timestamp adminCreateTime;
  private java.sql.Timestamp adminUpdateTime;
}
