import java.util.ArrayList;

///
/// Contents: City class for Euclidean TSP.
/// Author:   John Aronis
/// Date:     October 2019
///

public class City {

  public String name ;
  public ArrayList<City> adjacent = new ArrayList<City>(10000);
  public double x, y ;

  public City(String name, double x, double y) {
    this.name = name ;
    this.x = x ;
    this.y = y ;
  }

  public double distance(City c) {
    return Math.sqrt((this.x-c.x)*(this.x-c.x)+(this.y-c.y)*(this.y-c.y)) ;
  }

  public String toString() {
    return name ;
  }

  public void addAdjacent(City c){


      adjacent.add(c);


  }

}

/// End-of-File
