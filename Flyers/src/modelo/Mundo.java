package modelo;

public class Mundo 
{
	private Airplane a;
	private Bird b;
	private Helicopter h;
	private Kryptonian k;
	private SeaPlane s;
	private Superman sman;
	
	public Mundo()
	{
		a = new Airplane();
		b = new Bird();
		h = new Helicopter();
		k = new Kryptonian();
		s = new SeaPlane();
		sman = new Superman();
	}

	public Airplane getA() {
		return a;
	}

	public void setA(Airplane a) {
		this.a = a;
	}

	public Bird getB() {
		return b;
	}

	public void setB(Bird b) {
		this.b = b;
	}

	public Helicopter getH() {
		return h;
	}

	public void setH(Helicopter h) {
		this.h = h;
	}

	public Kryptonian getK() {
		return k;
	}

	public void setK(Kryptonian k) {
		this.k = k;
	}

	public SeaPlane getS() {
		return s;
	}

	public void setS(SeaPlane s) {
		this.s = s;
	}

	public Superman getSman() {
		return sman;
	}

	public void setSman(Superman sman) {
		this.sman = sman;
	}
}
