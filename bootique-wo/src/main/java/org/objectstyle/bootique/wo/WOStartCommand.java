package org.objectstyle.bootique.wo;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.nhl.bootique.annotation.Args;
import com.nhl.bootique.cli.Cli;
import com.nhl.bootique.command.Command;
import com.nhl.bootique.command.CommandOutcome;
import com.webobjects.appserver.WOApplication;

import er.extensions.appserver.ERXApplication;

public class WOStartCommand implements Command {

	@Args
	@Inject
	private String[] argv;
	
	@Inject
	private Provider<Class<? extends WOApplication>> appTypeProvider;

	@Override
	public CommandOutcome run(Cli cli) {
		
		Class<? extends WOApplication> appType = appTypeProvider.get();
		
		ERXApplication.main(argv, appType);
		
		return CommandOutcome.succeeded();
	}
}
