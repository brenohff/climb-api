package br.com.brenohff.climbapi.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "phpvms_expenselog")
@Entity
@Data
public class Expenselog implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "dateadded", nullable = false)
  private Integer dateadded;

  @Column(name = "name", nullable = false)
  private String name;

  @Column(name = "type", nullable = false)
  private String type;

  @Column(name = "cost", nullable = false)
  private Float cost;

  
}