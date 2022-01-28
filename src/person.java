import java.util.*;

public class person {
    /**
     * Use name to identify a single person. <br/>
     * In this system, as person is the smallest unit of simulation.
     */
    String name;

    /**
     * Use category to mark the status of he/she.                           <br/>
     * Under definition of SEIR model, we divide people into 4 groups as    <br/>
     * S - susceptible, E - exposed, I - infected, R - reduced              <br/>
     *                                                                      <br/>
     * Susceptible on contact with I, may transfer to E                     <br/>
     * Exposed will transfer to I, after incubation time                    <br/>
     * Infected will transfer to R, after treatment                         <br/>
     *                                                                      <br/>
     * The probability of transfer between statuses is under discussion
     */
    int category;
    static int S = 1;
    static int E = 2;
    static int I = 3;
    static int R = 4;

    public String getName(){
        return this.name;
    }

    public String setName(String name1){
        this.name = name1;
        return this.name;
    }

    /**
     * Default Constructor, Require no parameter. <br/>
     * This person has the name "anonymous", and is categorized as S.
     */
    public person(){
        this.name = "anonymous";
        this.category = S;
    }

    public person(String name1, int category1){
        this.name = name1;
        this.category = category1;
    }
}
