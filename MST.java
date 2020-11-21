import java.util.ArrayList;

public class MST {

    private double  MAX_DIST = Double.MAX_VALUE;
    private double weight;
    private ArrayList<City> MST;
    private boolean[] visited;
   

 

    public MST(ArrayList<City> cities){

      weight = 0;
      visited = new boolean[cities.size()];
      MST = new ArrayList<City>(cities.size());
      MST.add(cities.get(0));
      visited[0] = true;
      minTree(cities);

    }


    public void minTree(ArrayList<City> cities){

        while(MST.size() != cities.size()){
            
            int toAdd = minDist(cities);
            visited[toAdd] = true;
            MST.add(cities.get(toAdd));


        }
      
    }



    public int minDist(ArrayList<City> cities){

        double min = MAX_DIST;
        int minIndex = 0;
        for(City here : MST){

            for(int i = 0; i < cities.size(); i++){
                if(!visited[i] && here.distance(cities.get(i)) < min){
                            minIndex = i;
                            min = here.distance(cities.get(i));
                        }
            }
        }

        this.weight += min;
        return minIndex;

    }

    public double weight(){return weight;}



    public ArrayList<City> tour(ArrayList<City> cities)
    {
        ArrayList<City> tour = new ArrayList<>(cities.size());
        //tour.add(start);
        
        //MSTWalk();


        return tour;




    }



    private ArrayList<City> MSTWalk(){
        return null;
    }
}