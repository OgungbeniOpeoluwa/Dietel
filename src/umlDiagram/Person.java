package umlDiagram;

import java.util.ArrayList;
import java.util.List;

public class Person {

    private List<Problem> problem = new ArrayList<>();

    public void add(Problem type){
        problem.add(type);
    }
    public void solve(Problem isSolve){
        problem.remove(isSolve);
    }
    public List<Problem> tellUnSolvedProblem(){
        return problem;
    }
}
