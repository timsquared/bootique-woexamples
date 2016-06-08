package org.objectstyle.bootique.wo;

import java.net.URLClassLoader;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.nhl.bootique.annotation.Args;
import com.nhl.bootique.cli.Cli;
import com.nhl.bootique.command.Command;
import com.nhl.bootique.command.CommandOutcome;
import com.webobjects.appserver.WOApplication;
import com.webobjects.foundation.NSProperties;

import er.extensions.appserver.ERXApplication;

public class WOStartCommand implements Command {

	@Args
	@Inject
	private String[] argv;

	@Inject
	private Provider<ERXApplication> appProvider;

	@Override
	public CommandOutcome run(Cli cli) {

		NSProperties._setMainBundleName("myapp");

		ERXApplication.setup(argv);

		ERXApplication app = appProvider.get();

		// static initializers ... not sure how important each one of those
		WOApplication._classPathURLs = ((URLClassLoader) app.getClass().getClassLoader()).getURLs();

		app.run();

		return CommandOutcome.succeeded();
	}
}
