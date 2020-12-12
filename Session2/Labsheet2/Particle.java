public class Particle {
	// declare instance variables
	double x, y, z;
	
	Particle() {
		// generate random numbers between 0 and 100
		// assign generated values to instance variables;
		this.x = Math.random() * 100;
		this.y = Math.random() * 100;
		this.z = Math.random() * 100;
	}
	
	// constructor overloading
	Particle(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	// construct a separate method to display particle coordinates
	void displayParticle() {
		System.out.println("(" +x +", " +y +", " +z +")");
		System.out.println();
	}
	
	// locate the current position of the particle
	void locateParticlePosition(double x_dist, double y_dist, double z_dist) {
		this.x = this.x + x_dist;
		this.y = this.y + y_dist;
		this.z = this.z + z_dist;
	}

	public static void main(String[] args) {
		// define a new instance by calling the Particle() constructor
		Particle p1 = new Particle();
		
		// call displayParticle method
		p1.displayParticle();
		
		// define a new particle instance by calling the overloading constructor
		Particle p2 = new Particle(10.34, 20.22, 30.56);
		
		// call displayParticle method
		p2.displayParticle();

		// call locateParticlePosition method to find out the current location of a particle
		p2.locateParticlePosition(10, 5, -5);
		
		// call displayParticle method to display the current coordinates of p2 particle
		System.out.println("--- After moving the particle ---");
		p2.displayParticle();	
	}

}
