package lab;


class Sports{

    String getName(){

       return " Genric Sports";

    }

    void getNumberOfTeamMembers(){
    	 System.out.println( getName() );

        System.out.println( "Each team has n players in " + getName() );
    }

}
class Soccer extends Sports{

   

    String getName(){

        return "Soccer Class";
        

    }
    void getNumberOfTeamMembers() {
    	  System.out.println( getName() );
        System.out.println( "Each team has 11 players in " + getName() );
 
    }

}
public class Test_lab {
public static void main(String[] args) {
	 Sports s = new Sports() ;
	s.getNumberOfTeamMembers();
	s.getName();
	
	Soccer r = new Soccer() ;
	r.getName();
	r.getNumberOfTeamMembers();

	
	
	
}
}
