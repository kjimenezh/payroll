
package data;

import java.util.Date;

/**
 * @author Kevin Jiménez
 */

public class Administrative extends Employee{
    private String category;
    private float salary;
    
    public Administrative(String id, String name, Date hiringDate,String category,float salary){
        super(id,name,hiringDate);
        this.category = category;
        this.salary = salary;
    }
    
    public float paySalary(){
        return this.salary;
    }
}
