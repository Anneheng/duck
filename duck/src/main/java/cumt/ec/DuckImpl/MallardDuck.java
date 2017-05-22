package cumt.ec.DuckImpl;

import cumt.ec.BehaviorImpl.FlyWithWingsImpl;
import cumt.ec.BehaviorImpl.Quack;
import cumt.ec.duck.Duck;
/**
 * 
 * @author Administrator
 *
 */
public class MallardDuck extends Duck {
public MallardDuck() {
	setFlyBehavior(new FlyWithWingsImpl());
	setQuackBehavior(new Quack());
}
	@Override
	public void display() {
		System.out.println("MallarDuck:");
	}

}
