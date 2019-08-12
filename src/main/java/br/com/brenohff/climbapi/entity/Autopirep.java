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
@Table(name = "phpvms_autopirep")
public class Autopirep implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", insertable = false, nullable = false)
  private Integer id;

  @Column(name = "criteria_description", nullable = false)
  private String criteriaDescription;

  @Column(name = "created_by", nullable = false)
  private Integer createdBy;

  @Column(name = "enabled", nullable = false)
  private Integer enabled = 1;

  @Column(name = "criteria_variable", nullable = false)
  private String criteriaVariable;

  @Column(name = "criteria_custom_message", nullable = false)
  private String criteriaCustomMessage;

  
}