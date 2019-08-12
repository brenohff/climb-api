package br.com.brenohff.climbapi.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "smartcars_charteredflights")
public class SmartcarsCharteredflights implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "routeid", insertable = false, nullable = false)
  private Integer routeid = 0;

  @Column(name = "dbid")
  private Integer dbid;

  @Column(name = "bidid")
  private Integer bidid;

  
}