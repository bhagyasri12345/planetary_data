import java.util.ArrayList;
public class plantery_data {

	

	
		private String Planet;
		private ArrayList<String> gases = new ArrayList<String>();
		private int moons;
		private String Rings;
		
		public void Rigns() {
			if(this.Rings.equals("yes")) {
				System.out.println(Planet+" has Rings");
			}
			else {
				System.out.println(Planet+" has no Rings");
			}
		}
		public void gases() {
			if(gases.size()>0) {
				System.out.println(Planet+" has gases");
				
			}
			else {
				System.out.println(Planet+" has no gases");
			}
		}
		
		

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			plantery_data p1 = new plantery_data();
			p1.Planet = "Mercury";
			p1.moons = 0;
			p1.Rings = "No";
			p1.gases();
			p1.Rigns();
			plantery_data p2 = new plantery_data();
			p2.Planet = "Venus";
			p2.gases.add("carbon Dioxide");
			p2.gases.add("Nitrogen");
			p2.moons = 0;
			p2.Rings = "No";
			p2.gases();
			p2.Rigns();
			
			

		}

	}