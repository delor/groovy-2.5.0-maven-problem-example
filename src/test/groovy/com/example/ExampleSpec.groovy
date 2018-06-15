package com.example

import spock.lang.Specification

class ExampleSpec extends Specification {

    def "test"() {
        expect:
        1 == 1
    }

    def "mock class"() {
        when:
        CustomClass var = Mock()

        then:
        var
    }

    def "mock class without default ctor"() {
        when:
        ClassWithoutDefaultCtor var = Mock()

        then:
        var
    }
}
