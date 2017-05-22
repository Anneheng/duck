package duck;
import org.junit.Test;
import cumt.ec.duck.Duck;
import cumt.ec.DuckImpl.MallardDuck;
import cumt.ec.DuckImpl.RedHeadDuck;
import cumt.ec.DuckImpl.RubberDuck;
public class ducktest {

	@Test
	public void test() {
		
		Duck rubber=new RubberDuck();
		rubber.display();
		rubber.performFly();
		rubber.performQuack();
		rubber.swim();
		System.out.println("——————我是分割线————————");
		
		
		Duck redHead=new RedHeadDuck();
		redHead.display();
		redHead.performFly();
		rubber.performQuack();
		redHead.swim();
		System.out.println("——————我是分割线————————");
		
		
		Duck mallar=new MallardDuck();
		mallar.display();
		mallar.performFly();
		mallar.performQuack();
		mallar.swim();
	}

}
