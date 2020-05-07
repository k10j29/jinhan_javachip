package test;

import box.ToolBox;
import tools.Driver;
import tools.Hammer;

public class ToolTest {

	public static void main(String[] args) {

		ToolBox<Driver, Hammer> toolbox = new ToolBox<Driver, Hammer>();
		toolbox.tool1 = new Driver();
		toolbox.tool2 = new Hammer();

		System.out.println(toolbox.tool1.name);
		System.out.println(toolbox.tool2.name);
	}

}
