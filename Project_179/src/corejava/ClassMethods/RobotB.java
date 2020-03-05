package corejava.ClassMethods;

public class RobotB 
{
	
	//Public modifier allow method access outside package.
	public static void Start_walk()
	{
		System.out.println("Robot started walking");
	}
	
	public static void Stop_Walk()
	{
		System.out.println("Robot Stopped");
	}
	

	public static void main(String[] args) 
	{
        /*
         * Becase main method contains static access specifier
         * any static methods or variable we can call directly
         * without object creation.
         */
		Start_walk();
		Stop_Walk();

	}

}
