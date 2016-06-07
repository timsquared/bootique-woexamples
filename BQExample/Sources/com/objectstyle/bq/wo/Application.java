package com.objectstyle.bq.wo;

import er.extensions.appserver.ERXApplication;

public class Application extends ERXApplication {

	public static void main(String[] argv) {
		ERXApplication.main(argv, Application.class);
	}

	public Application() {
		ERXApplication.log.info("Welcome to " + name() + " !");
        setPageRefreshOnBacktrackEnabled(true);
	}
}
