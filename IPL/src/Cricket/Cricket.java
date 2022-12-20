package Cricket;

public class Cricket  {
	String teamName;
	int  points;
	char[] lastFiveGames;

	Cricket(String teamName,int points, char lastFiveGames[]){
		this.teamName=teamName;
		this.points=points;
		this.lastFiveGames = lastFiveGames;	
	}
	void consecutiveTeamLoss(Cricket[]t){
		System.out.println("Consecutive Team Loss");
		for (int i = 0; i < t.length; i++) {
			int a=0;
			int s=1;
			for(int j=0;j<4;j++) 
			{
				if(s==6) {	
				}
				if ((t[i].lastFiveGames[j]=='L' && t[i].lastFiveGames[s]=='L')) 
				{
					a++;	
				}
				else {
					s++;
				}
			}
			if(a>=1){
				System.out.println(t[i].teamName);
			}
		}
	}void nConsecutiveTeamLoss(Cricket[]t){
		int	averagePointsofFilteredTeam=0;
		double avg=0;
		System.out.println("N Consecutive Team Loss/Win");
		for (int i = 0; i < t.length; i++) {
			int a=0;
			int s=1;
			for(int j=0;j<4;j++) 
			{
				if(s==6) {	
				}
				if ((t[i].lastFiveGames[j]=='L' && t[i].lastFiveGames[s]=='L')||(t[i].lastFiveGames[j]=='W' && t[i].lastFiveGames[s]=='W')) 
				{
					a++;	
				}
				else {
					s++;
				}
			}
			if(a>=1){
				System.out.println(t[i].teamName);
				averagePointsofFilteredTeam=averagePointsofFilteredTeam+t[i].points;
				avg++;
			}

		}
		System.out.println("Average Points of Filtered Team = "+averagePointsofFilteredTeam/avg);
	}
	public static void main(String[] args) {
		char a[]= {'W','W','L','L','W'};
		char b[]= {'W','L','L','W','W'};
		char c[]= {'W','L','W','L','L'};
		char d[]= {'W','W','L','W','L'};
		char e[]= {'L','W','W','L','L'};
		char f[]= {'L','W','W','L','W'};
		char g[]= {'L','W','L','W','L'};
		char h[]= {'W','L','L','L','L'};
		char i[]= {'L','L','W','L','W'};
		char j[]= {'L','W','L','W','W'};


		Cricket p1=new Cricket("GT" , 20, a);
		Cricket p2=new Cricket("LSG" , 18,b);
		Cricket p3 =new Cricket("RR" , 16,c);
		Cricket p4 =new Cricket("DC" , 14,d);
		Cricket p5=new Cricket("RCB" , 14,e);
		Cricket p6 =new Cricket("KKR" , 12,f);
		Cricket p7 =new Cricket("PBKS" , 12,g);
		Cricket p8 =new Cricket("SRH" , 12,h);
		Cricket p9 =new Cricket("CSK" , 8,i);
		Cricket p10 =new Cricket("MI" , 6,j);

		Cricket [] T= {p1,p2,p3,p4,p5,p6,p7,p8,p9,p10};

		p10.consecutiveTeamLoss(T);
		p10.nConsecutiveTeamLoss(T);	
	}
}