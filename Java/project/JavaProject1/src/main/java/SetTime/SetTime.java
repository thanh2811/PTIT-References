/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetTime;

class Time{
    private int hour,minute,second;
    public Time(int hour,int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setTime(int hour,int minute,int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public void setHour(int hour){
        this.hour = hour;
    }
    public void setMinute(int hour){
        this.minute = hour;
    }
    public void setSecond(int hour){
        this.second = hour;
    }
    public int getHour(){
        return this.hour;
    }
    public int getMinute(){
        return this.minute;
    }
    public int getSecond(){
        return this.second;
    }
    public void nextSecond(){
        if(second<59) this.second++;
        else{
            this.second = 0;
            if(minute <59) this.minute++;
            else{
                this.minute = 0;
                if(hour < 23) this.hour ++;
                else this.hour = 0;
            }
        }
    }
    public void previousSecond(){
        if(second>0) this.second--;
        else{
            this.second = 59;
            if(minute > 0) this.minute--;
            else{
                this.minute = 59;
                if(hour > 0) this.hour --;
                else this.hour = 23;
            }
        }
    }
    public void display(){
        String h = this.hour + "";
        String m = this.minute + "";
        String s = this.second + "";
        if(h.length() == 1) h = "0" + h;
        if(m.length() == 1) m = "0" + m;
        if(s.length() == 1) s = "0" + s;
        System.out.println(h + ':' + m + ':' + s);
    }
}

public class SetTime {
    public static void main(String[] args) {
        Time t = new Time(12, 1, 1);
	t.display();
	t.setTime(23, 59, 59);
	t.display();
	t.nextSecond();
	t.display();
	t.nextSecond();
	t.display();
	t.setTime(7, 0, 0);
	t.display();
	t.previousSecond();
	t.display();
    }
}
