package beginnersbook.com;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class PointTest1 extends TestCase {


	
		
			  private Point p;
			  private Point q;

			  protected void setUp() throws Exception {
			    p = new Point(4, 5);
			    q = new Point(13, 14);
			  }

			  public void testGetX() throws Exception {
			    assertEquals(4, p.getX());
			    assertEquals(13, q.getX());
			  }

			  public void testGetY() throws Exception {
			    assertEquals(5, p.getY());
			    assertEquals(14, q.getY());
			  }

			  public void testSetX() throws Exception {
			    p.setX(55);
			    assertEquals(55, p.getX());

			    q.setX(101);
			    assertEquals(101, q.getX());
			  }

			  public void testSetY() throws Exception {
			    p.setY(1331);
			    assertEquals(1331, p.getY());

			    q.setY(90125);
			    assertEquals(90125, q.getY());
			  }
			}
	
	
