package cumt.ec.DuckImpl;

import cumt.ec.BehaviorImpl.FlyNoWay;
import cumt.ec.BehaviorImpl.Squeak;
import cumt.ec.duck.Duck;
/**
 * 
 * @author Administrator
 *
 */

public class RubberDuck extends Duck {
	public RubberDuck() {
		setFlyBehavior(new FlyNoWay());
		setQuackBehavior(new Squeak());
	}
	@Override
	public void display() {
		System.out.println("RubberDuck:");
	}

}
