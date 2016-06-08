package com.objectstyle.bq.wo;

import com.nhl.bootique.Bootique;

public class Application {

	public static void main(String[] argv) {
		Bootique.app(argv).autoLoadModules().run();
	}

}
