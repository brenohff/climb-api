package br.com.brenohff.climbapi.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Table(name = "phpvms_customfields")
@Data
@Entity
public class Customfields implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "fieldid", insertable = false, nullable = false)
  private Integer fieldid;

  @Column(name = "title", nullable = false)
  private String title;

  @Column(name = "fieldname", nullable = false)
  private String fieldname;

  @Column(name = "value", nullable = false)
  private String value;

  @Column(name = "type", nullable = false)
  private String type = "text";

  @Column(name = "public", nullable = false)
  private Integer publi = 0;

  @Column(name = "showonregister", nullable = false)
  private Integer showonregister = 0;

  @Column(name = "required", nullable = false)
  private Integer required = 0;

  
}