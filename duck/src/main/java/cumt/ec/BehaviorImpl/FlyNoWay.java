package cumt.ec.BehaviorImpl;

import cumt.ec.IBehavior.IFlyBehavior;
/**
 * 
 * @author Administrator
 *
 */
public class FlyNoWay implements IFlyBehavior {

	@Override
	public void fly() {
		System.out.println("我是不会飞的鸭子");
	}

}
