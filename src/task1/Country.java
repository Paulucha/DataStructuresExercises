package task1;

import java.util.Arrays;

public class Country {

    private String name;
    private City cities[]; //tablica miast



    // | konstruktor przekazującu informacje
    public Country (String name){
        this.name = name;
        this.cities = cities;

    }

    public String getName() {
        return name;
    }

    public City[] getCities() {
        return cities;
    }

    @Override
            public String toString() {
      return "Country" + "name = " + name + '\'' + ", cities=" + Arrays.toString(cities) +".";
    }


//    {
//        String[][] cityArray = new String[][]{{"miasto1", "miasto2", "miasto3"}, {"panstwo1", "panstwo2", "panstwo3"}};
//    }

}
