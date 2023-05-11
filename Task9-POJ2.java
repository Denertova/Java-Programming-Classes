class MyDate {
    private int month;
    private int day;
    private int year;
    
    public MyDate(int month, int day, int year) {
        setMonth(month);
        setDay(day);
        setYear(year);
    }
    
    public int getMonth() {
        return month;
    }
    
    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Miesiac musi byc w przedziale 1-12.");
        }
    }
    
    public int getDay() {
        return day;
    }
    
    public void setDay(int day) {
        if (day >= 1 && day <= 31) {
            this.day = day;
        } else {
            throw new IllegalArgumentException("Dzien musi byc w przedziale 1-31.");
        }
    }
    
    public int getYear() {
        return year;
    }
    
    public void setYear(int year) {
        if (year >= 1990 && year <= 2050) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Rok musi byc pomiedzy 1990 i 2050.");
        }
    }
    
    public void displayDate() {
        System.out.printf("%02d/%02d/%04d%n", month, day, year);
    }
}
class MyDateTest {
    public static void main(String[] args) {
        // Test poprawnej daty
        MyDate date = new MyDate(4, 12, 2000);
        date.displayDate(); 
        
        // Test daty z błędnym miesiącem
        try {
            date.setMonth(13);
        } catch (IllegalArgumentException e) {
            System.out.println("zly miesiac: " + e.getMessage());
        }
        
        // Test daty z błędnym dniem
        try {
            date.setDay(32);
        } catch (IllegalArgumentException e) {
            System.out.println("zly dzien: " + e.getMessage());
        }
        
        // Test daty z błędnym rokiem
        try {
            date.setYear(1980);
        } catch (IllegalArgumentException e) {
            System.out.println("zly rok: " + e.getMessage());
        }
    }
}