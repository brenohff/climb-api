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
@Entity
@Table(name = "phpvms_pages")
public class Pages implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "pageid", insertable = false, nullable = false)
  private Integer pageid;

  @Column(name = "pagename", nullable = false)
  private String pagename = "";

  @Column(name = "filename", nullable = false)
  private String filename = "";

  @Column(name = "order", nullable = false)
  private Integer order = 0;

  @Column(name = "postedby", nullable = false)
  private String postedby = "";

  @Column(name = "postdate", nullable = false)
  private Date postdate;

  @Column(name = "public", nullable = false)
  private Integer publi = 0;

  @Column(name = "enabled", nullable = false)
  private Integer enabled = 1;

  
}