package br.com.brenohff.climbapi.Entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "pireps_hist")
public class PirepsHist implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "pirepid", nullable = false)
  private Integer pirepid;

  @Column(name = "pilotid", nullable = false)
  private Integer pilotid;

  @Column(name = "link", nullable = false)
  private String link;

  @Column(name = "date", nullable = false)
  private String date;

  
}