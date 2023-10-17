package com.capgemini.escuelita.mavenEjemplo2;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ AppTest.class, AutoTest.class, CalculadoraTest.class, GoogleSearchtest.class })

public class AllTests {

}
