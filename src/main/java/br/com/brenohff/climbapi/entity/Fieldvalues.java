package br.com.brenohff.climbapi.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "phpvms_fieldvalues")
public class Fieldvalues implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", insertable = false, nullable = false)
  private Integer id;

  @Column(name = "fieldid", nullable = false)
  private Integer fieldid;

  @Column(name = "pilotid", nullable = false)
  private Integer pilotid;

  @Column(name = "value", nullable = false)
  private String value;

  
}