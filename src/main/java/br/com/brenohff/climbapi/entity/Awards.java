package br.com.brenohff.climbapi.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "phpvms_awards")
@Entity
@Data
public class Awards implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "awardid", insertable = false, nullable = false)
  private Integer awardid;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "descrip", nullable = false)
  private String descrip;

  @Column(name = "image", nullable = false)
  private String image;

  
}