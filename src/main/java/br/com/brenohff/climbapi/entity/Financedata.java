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
@Table(name = "phpvms_financedata")
@Entity
public class Financedata implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", insertable = false, nullable = false)
  private Integer id;

  @Column(name = "month", nullable = false)
  private Integer month;

  @Column(name = "year", nullable = false)
  private Integer year;

  @Column(name = "data", nullable = false)
  private String data;

  @Column(name = "total", nullable = false)
  private Float total;

  
}