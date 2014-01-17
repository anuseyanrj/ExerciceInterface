package Direction;

public class Point implements InterfacePoint 
{
	int ord;
	int abs;
	
	@Override
	public int getOrd() {
		// TODO Auto-generated method stub
		return ord;
	}

	@Override
	public int getAbs() {
		// TODO Auto-generated method stub
		return abs;
	}

	@Override
	public void setOrd(int ord) {
		// TODO Auto-generated method stub
		this.ord = ord;
	}

	@Override
	public void setAbs(int abs) {
		// TODO Auto-generated method stub
		this.abs = abs;
	}

	@Override
	public InterfacePoint add(InterfacePoint p) {
		// TODO Auto-generated method stub
		InterfacePoint pA = new Point();
		pA.setAbs(this.getAbs() + p.getAbs());
		pA.setOrd(this.getOrd() + p.getOrd());
		return pA;
	}

}
