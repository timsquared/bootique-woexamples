package org.objectstyle.bootique.wo;

import com.google.inject.Binder;
import com.google.inject.binder.AnnotatedBindingBuilder;
import com.nhl.bootique.BQCoreModule;
import com.nhl.bootique.ConfigModule;

import er.extensions.appserver.ERXApplication;

public class WOModule extends ConfigModule {

	public static void contributeApp(Binder binder, Class<? extends ERXApplication> appType) {
		contributeApp(binder).to(appType);
	}

	public static AnnotatedBindingBuilder<ERXApplication> contributeApp(Binder binder) {
		return binder.bind(ERXApplication.class);
	}

	@Override
	public void configure(Binder binder) {
		BQCoreModule.contributeCommands(binder).addBinding().to(WOStartCommand.class);
	}
}
