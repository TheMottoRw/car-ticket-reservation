package dto;

public class MonthDaysDTO {
    private int years;
    private int totalMonths;
    private int remainingMonths;
    private int remainingDays;
    private int totalDays;
    public MonthDaysDTO(int years, int totalMonths, int remainingMonths, int days, int totalDays) {
        this.years = years;
        this.totalMonths = totalMonths;
        this.remainingMonths = remainingMonths;
        this.remainingDays = days;
        this.totalDays = totalDays;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public int getTotalMonths() {
        return totalMonths;
    }

    public void setTotalMonths(int totalMonths) {
        this.totalMonths = totalMonths;
    }

    public int getRemainingMonths() {
        return remainingMonths;
    }

    public void setRemainingMonths(int remainingMonths) {
        this.remainingMonths = remainingMonths;
    }

    public int getRemainingDays() {
        return remainingDays;
    }

    public void setRemainingDays(int remainingDays) {
        this.remainingDays = remainingDays;
    }

    public int getTotalDays() {
        return totalDays;
    }

    public void setTotalDays(int totalDays) {
        this.totalDays = totalDays;
    }
}
