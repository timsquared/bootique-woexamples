package org.objectstyle.bootique.wo;

import com.google.inject.Module;
import com.nhl.bootique.BQModuleProvider;

public class WOModuleProvider implements BQModuleProvider {

	@Override
	public Module module() {
		return new WOModule();
	}
}
