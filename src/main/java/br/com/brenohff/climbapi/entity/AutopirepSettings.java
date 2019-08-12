package br.com.brenohff.climbapi.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "phpvms_autopirep_settings")
@Data
@Entity
public class AutopirepSettings implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "setting_id", insertable = false, nullable = false)
  private Integer settingId;

  @Column(name = "enabled", nullable = false)
  private String enabled;

  @Column(name = "landing_rate", nullable = false)
  private String landingRate;

  @Column(name = "sendmail_to_admin", nullable = false)
  private Integer sendmailToAdmin = 1;

  @Column(name = "sendmail_to_pilot", nullable = false)
  private Integer sendmailToPilot;

  @Column(name = "admin_rejecting", nullable = false)
  private String adminRejecting;

  
}