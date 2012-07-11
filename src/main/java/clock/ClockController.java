package clock;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 * Created with IntelliJ IDEA.
 * User: gradenko
 * Date: 10.7.12
 * Time: 11:25
 * To change this template use File | Settings | File Templates.
 */
@ApplicationScoped   // En kontroler za celotno aplikacijo.
@Named    // Bo dostopen za viever.

public class ClockController {


    private ClockModule model = new ClockModule();



    public ClockModule getModel() {
        return model;
    }

    public void incMinutes() {
        model.setMinutes(model.getMinutes()+1);
        if (model.getMinutes() == 60) model.setMinutes(0);
    }
    public void decMinutes() {
        model.setMinutes(model.getMinutes()-1);
        if (model.getMinutes() == -1) model.setMinutes(59);
    }
     public void incHour() {
        model.setHour(model.getHour()+1);
         if (model.getHour() == 24) model.setHour(00);
    }
    public void decHour() {
        model.setHour(model.getHour()-1);
        if (model.getHour() == -1) model.setHour(23);
    }
    public void incSeconds() {
        model.setSeconds(model.getSeconds()+1);
        if (model.getSeconds() == 60) model.setSeconds(00);
    }
    public void decSeconds() {
        model.setSeconds(model.getSeconds()-1);
        if (model.getSeconds() == -1) model.setSeconds(59);
    }
}
