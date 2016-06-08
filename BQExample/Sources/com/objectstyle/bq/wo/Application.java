package com.objectstyle.bq.wo;

import org.objectstyle.bootique.wo.WOModule;

import com.google.inject.Module;
import com.nhl.bootique.Bootique;

import er.extensions.appserver.ERXApplication;

public class Application extends ERXApplication {

	public static void main(String[] argv) {
		Module appModule = binder -> WOModule.contributeApp(binder).to(Application.class);
		Bootique.app(argv).autoLoadModules().module(appModule).run();
	}

}
