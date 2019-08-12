package br.com.brenohff.climbapi.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "phpvms_groups")
@Data
public class Groups implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(insertable = false, name = "groupid", nullable = false)
  private Integer groupid;

  @Column(name = "name", nullable = false)
  private String name = "";

  @Column(name = "permissions", nullable = false)
  private String permissions = "";

  @Column(name = "core", nullable = false)
  private Integer core = 0;

  
}