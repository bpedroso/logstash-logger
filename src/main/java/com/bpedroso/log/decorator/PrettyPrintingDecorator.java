package com.bpedroso.log.decorator;

import com.fasterxml.jackson.core.JsonGenerator;

import net.logstash.logback.decorate.JsonGeneratorDecorator;

public class PrettyPrintingDecorator  implements JsonGeneratorDecorator {

	@Override
	public JsonGenerator decorate(final JsonGenerator generator) {
		return generator.useDefaultPrettyPrinter();
	}

}
