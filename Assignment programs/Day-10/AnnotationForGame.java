package com.onebill.corejava.java8features;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class AnnotationForGame {

	@Retention(RetentionPolicy.RUNTIME)
	public @interface Club {
		Play[] value() default {};
	}

	@Play("Pool")
	@Play("Darts")
	@Play("Shuffleboard")
	@Play("Foosball")
	@Play("Axe Throwing")
	@Play("Air Hockey")
	@Play("Pinball")
	public @interface Game {
		String value();
	}

	@Repeatable(value = Club.class)
	public @interface Play {
		String value();
	}

	public static void main(String[] args) {
		Club game = Game.class.getAnnotation(Club.class);
		for (Play pl : game.value()) {
			System.out.println(pl.value());
		}

	}

}
