package com.pattern.structural.bridge.Movie;

import java.util.List;

public interface Formatter {
	
	String format(String header, List<Detail> details);

}
