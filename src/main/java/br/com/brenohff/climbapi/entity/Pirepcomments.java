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

@Table(name = "phpvms_pirepcomments")
@Data
@Entity
public class Pirepcomments implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", insertable = false, nullable = false)
  private Integer id;

  @Column(name = "pirepid", nullable = false)
  private Integer pirepid;

  @Column(name = "pilotid", nullable = false)
  private Integer pilotid;

  @Column(name = "comment", nullable = false)
  private String comment;

  @Column(name = "postdate", nullable = false)
  private Date postdate;

  
}