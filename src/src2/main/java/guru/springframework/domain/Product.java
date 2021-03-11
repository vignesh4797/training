package guru.springframework.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//import java.math.BigDecimal;


@Entity
public class Product {

    @Id
    @GeneratedValue
    private Long cityId;
    private String cityName;
    private String cityAbbrev;
    private String countryName;
    private String companyName;
	public Long getCityId() {
		return cityId;
	}
	public void setCityId(Long cityId) {
		this.cityId = cityId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCityAbbrev() {
		return cityAbbrev;
	}
	public void setCityAbbrev(String cityAbbrev) {
		this.cityAbbrev = cityAbbrev;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
    
}
