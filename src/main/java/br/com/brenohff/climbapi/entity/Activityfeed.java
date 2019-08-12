package br.com.brenohff.climbapi.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "phpvms_activityfeed")
@Data
@Entity
public class Activityfeed implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", insertable = false, nullable = false)
  private Integer id;

  @Column(name = "pilotid", nullable = false)
  private Integer pilotid = 0;

  @Column(name = "refid", nullable = false)
  private Long refid = 0L;

  @Column(name = "type", nullable = false)
  private Integer type = 0;

  @Column(name = "message", nullable = false)
  private String message;

  @Column(name = "submitdate", nullable = false)
  private Date submitdate;

  
}