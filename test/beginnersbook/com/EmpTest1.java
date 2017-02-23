package beginnersbook.com;

//import static org.junit.Assert.*;

//import org.junit.Test;

import junit.framework.TestCase;

public class EmpTest1 extends TestCase {
	private Emp p;
	private Emp q;
	protected  void setup()throws Exception
	{
		p=new Emp(1234,4567);
		q=new Emp("kaira","maira");
		
	
	}
	 public void testGeteId() throws Exception {
		    assertEquals(1234, p.geteId());
		    assertEquals(4567, q.geteId());
	 }
	 public void testGeteNmae() throws Exception {
		    assertEquals("kaira", p.geteName());
		    assertEquals("maira", q.geteName());
		  }

		  public void testSeteId() throws Exception {
		    p.seteId(1236);
		    assertEquals(1236, p.geteId());

		   // eName.seteId(101);
		   // assertEquals(101, q.getX());
		  }

		  public void testSeteName() throws Exception {
		    p.seteName("kaira");
		    assertEquals("kaira", p.geteName());

		    q.seteName("maira");
		    assertEquals("maira", q.geteName());
		  }
	

	
}
