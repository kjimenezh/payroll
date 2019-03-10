
package data;

import java.util.Date;

/**
 * @author Kevin Jiménez
 */

public class PartialTime extends Professor{
    private String category;
    private int classHours;
    
    
    public PartialTime(String id, String name, Date hiringDate, String school, String department,String category,int classHours){
        super(id,name,hiringDate,school,department);
        this.category = category;
        this.classHours = classHours;
    }
    
    public float paySalary(){
        if(this.category=="A"){
            return this.classHours*60000;
        }else if(this.category=="B"){
            return this.classHours*80000;
        }else if(this.category=="C"){
            return this.classHours*100000;
        }
        return 0;
    }
}
