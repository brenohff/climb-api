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

@Table(name = "points_log")
@Entity
@Data
public class PointsLog implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", insertable = false, nullable = false)
  private Integer id;

  @Column(name = "staff_id", nullable = false)
  private Integer staffId;

  @Column(name = "action", nullable = false)
  private String action;

  @Column(name = "at", nullable = false)
  private Date at;

  
}