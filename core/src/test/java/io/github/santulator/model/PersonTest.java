package io.github.santulator.model;

import io.github.santulator.test.core.AbstractBeanTest;
import io.github.santulator.test.model.TestRequirementsTool;

public class PersonTest extends AbstractBeanTest<Person> {

    @Override
    protected Person buildPrimary() {
        return TestRequirementsTool.EDITH;
    }

    @Override
    protected Person buildSecondary() {
        return new Person("Bob");
    }
}