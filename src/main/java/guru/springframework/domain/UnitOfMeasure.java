package guru.springframework.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author NickVeremeichyk
 * @since 2019-01-28.
 */
@Entity
public class UnitOfMeasure {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String unitOfMeasure;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }
}
