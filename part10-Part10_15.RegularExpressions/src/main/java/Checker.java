

public class Checker {
    public boolean isDayOfWeek(String string){
        if(string.matches("mon|tue|wed|thu|fri|sat|sun")){
            return true;
        }
        return false;
    }
    
    public boolean allVowels(String string){
        if(string.matches("[aeiou]*")){
            return true;
        }
        return false;
    }
    
    public boolean timeOfDay(String string){
        //lifted from https://regexpattern.com/24-hour-time/
        if(string.matches("^(?:[01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d$")){
            return true;
        }
        return false;
    }
}
