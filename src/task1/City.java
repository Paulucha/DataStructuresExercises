package task1;

public class City {
private Country country;
    private String city;
    private String province;
    private Integer population;
    private String president;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public String getPresident() {
        return president;
    }

    public void setPresident(String president) {
        this.president = president;
    }


    public City(String city, String province, Integer population, String president) {
        this.city = city;
        this.province = province;
        this.population = population;
        this.president = president;


    }
}
