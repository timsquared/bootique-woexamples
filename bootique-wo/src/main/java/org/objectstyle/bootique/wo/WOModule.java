package org.objectstyle.bootique.wo;

import com.google.inject.Binder;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.nhl.bootique.BQCoreModule;
import com.nhl.bootique.ConfigModule;
import com.webobjects.appserver.WOApplication;

import er.extensions.appserver.ERXApplication;

public class WOModule extends ConfigModule {

	@Override
	public void configure(Binder binder) {
		BQCoreModule.contributeCommands(binder).addBinding().to(WOStartCommand.class);
	}

	@Singleton
	@Provides
	Class<? extends WOApplication> provideApplicationType() {
		return ERXApplication.class;
	}

}
