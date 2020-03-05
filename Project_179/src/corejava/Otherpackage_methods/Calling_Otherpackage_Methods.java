package corejava.Otherpackage_methods;

import corejava.ClassMethods.RobotB;
import corejava.InstantMethods.RobotA;

public class Calling_Otherpackage_Methods 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Note1:-->
		 * 		Inorder to call method from outside
		 * 		package, We must declare method with public modifier.
		 * 
		 * Note:-->
		 * 		We must import calling method packages to 
		 * 		current class.
		 */
		
		//calling Instant Methods
		new RobotA().ON();
		new RobotA().OFF();
		
		//Calling static methods
		RobotB.Start_walk();
		RobotB.Stop_Walk();
		
		
	}

}
