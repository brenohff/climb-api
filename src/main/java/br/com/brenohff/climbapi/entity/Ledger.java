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

@Data
@Table(name = "phpvms_ledger")
@Entity
public class Ledger implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", insertable = false, nullable = false)
  private Integer id;

  @Column(name = "pilotid", nullable = false)
  private Integer pilotid;

  @Column(name = "pirepid", nullable = false)
  private Integer pirepid = 0;

  @Column(name = "paysource", nullable = false)
  private Integer paysource;

  @Column(name = "paytype", nullable = false)
  private Integer paytype = 3;

  @Column(name = "amount", nullable = false)
  private Float amount = 0.00F;

  @Column(name = "submitdate", nullable = false)
  private Date submitdate;

  @Column(name = "modifieddate", nullable = false)
  private Date modifieddate;

  
}