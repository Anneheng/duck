package cumt.ec.DuckImpl;

import cumt.ec.BehaviorImpl.FlywithRocketImpl;
import cumt.ec.BehaviorImpl.Quack;
import cumt.ec.duck.Duck;
/**
 * 
 * @author Administrator
 *
 */
public class RedHeadDuck extends Duck {
public RedHeadDuck() {
	setFlyBehavior(new FlywithRocketImpl());
	setQuackBehavior(new Quack() );
}
	@Override
	public void display() {
		System.out.println("RedHeadDuck:");
	}

}
