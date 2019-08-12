package br.com.brenohff.climbapi.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "phpvms_airlines")
@Data
@Entity
public class Airlines implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", insertable = false, nullable = false)
  private Integer id;

  @Column(name = "code", nullable = false)
  private String code = "";

  @Column(name = "name", nullable = false)
  private String name = "";

  @Column(name = "enabled", nullable = false)
  private Integer enabled = 1;

  
}