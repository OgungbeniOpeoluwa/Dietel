package umlDiagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    public void testProblem(){
        Problem problem = new Problem("Qudud",Type.EDUCATION);
        Problem problems = new Problem("Qudud",Type.FINANCIAL);
        Person person = new Person();
        person.add(problem);
        person.add(problems);
        person.solve(problem);
        System.out.println(person.tellUnSolvedProblem());

    }

}