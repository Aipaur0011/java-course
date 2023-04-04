package JAVABatch15.class32.class20;

public class Sport {

    String name;
    String county;
                                                                  //instance

    Sport(String name, String country){
        this.name=name;
        this.county=country;

    }

 public void display(){
     System.out.println(name+ " is play in "+county);
 }
}

class Cricket extends Sport{

    String helmet;

    Cricket(String name, String country,String helmet){

        super(name, country);//makes a call to the immediate super class constructor
        //super();=> ALWAYS must be on the first line
        this.helmet=helmet;
    }

}

class Soccer extends Sport{

    String team;
    int numberOfPlayers;

    Soccer (String name, String country,String team, int numberOfPlayers){
        super(name, country);

        this.team=team;
        this.numberOfPlayers=numberOfPlayers;
    }

    void displayTeam(){
        System.out.println(team+" consist of "+numberOfPlayers+" players ");
    }
}
