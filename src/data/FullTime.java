
package data;

import java.util.Date;

/**
 * @author Kevin Jiménez
 */

public class FullTime extends Professor{
    private float salary;
    
    public FullTime(String id, String name, Date hiringDate, String school, String department, float salary){
        super(id,name,hiringDate,school,department);
        this.salary = salary;
    }
    
    public float paySalary(){
        return this.salary;
    }
}
