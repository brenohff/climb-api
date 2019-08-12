package br.com.brenohff.climbapi.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "pireps_act")
@Entity
@Data
public class PirepsAct implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "pirepid", nullable = false)
  private Integer pirepid;

  @Column(name = "pilotid", nullable = false)
  private Integer pilotid;

  @Column(name = "link", nullable = false)
  private String link;

  @Column(name = "number", nullable = false)
  private Integer number;

  @Column(name = "date", nullable = false)
  private String date;

  @Column(name = "pirepn", nullable = false)
  private Integer pirepn;

  
}