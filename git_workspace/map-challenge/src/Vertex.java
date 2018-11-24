import java.util.HashMap;
import java.util.Map;

   public class Vertex implements Comparable<Vertex> {
      public final String name;
      public int dist = Integer.MAX_VALUE; // MAX_VALUE assumed to be infinity
      public Vertex previous = null;
      public final Map<Vertex, Integer> neighbours = new HashMap<>();
 
     
      
      public Vertex(String name) {
		this.name=name;
	}

	void printPath() {
         if (this == this.previous) {
          //  System.out.printf("%s", this.name);
            PalestineMap.cit.append(this.name);
         } else if (this.previous == null) {
            System.out.printf("%s(unreached)", this.name);
            
         } else {
            this.previous.printPath();
         //   System.out.printf(" -> %s(%d)", this.name, this.dist);
            PalestineMap.cit.append("--->"+this.name+"--->");
           // Digistra.CitiesNames.add(this.name);
         }
      }
 
      public int compareTo(Vertex other) {
         return Integer.compare(dist, other.dist);
      }
   }