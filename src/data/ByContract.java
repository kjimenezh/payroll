
package data;

import java.util.Date;

/**
 * @author Kevin Jiménez
 */

public class ByContract extends Employee{
    private int months;
    private float value;
    
    public ByContract(String id, String name, Date hiringDate,int months,float value){
        super(id,name,hiringDate);
        this.months = months;
        this.value = value;
    }
    
    public float paySalary(){
        return this.value/this.months;
    }
}
