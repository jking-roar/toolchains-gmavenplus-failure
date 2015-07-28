import spock.lang.Specification

class SomeClassTest extends Specification {
    def "some class will work"() {
        SomeClass someClass = new SomeClass()
        when:
            boolean outcome = someClass.work();
        then:
            assert outcome;

    }
}
